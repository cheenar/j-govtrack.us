package com.github.cheenar.jgovtrack.request;

import com.github.cheenar.jgovtrack.JsonUtil;
import com.github.cheenar.jgovtrack.resources.Bill;
import com.github.cheenar.jgovtrack.resources.Committee;
import com.github.cheenar.jgovtrack.resources.GenericObjects;
import com.github.cheenar.jgovtrack.resources.Person;

import java.util.Date;

/**
 * Created by admin on 3/15/16.
 */
public class RequestFactory
{

    public final static String requestURL = "https://www.govtrack.us/api/v2/";

    public static Request createRequest()
    {
        Request request = new Request()
        {
            @Override
            public Object[] getMetadata()
            {
                /*
                    metadata
                        * current date
                 */
                return new Object[] {
                        new Date()
                };
            }
        };
        return request;
    }

    public static Object processRequest(Request request) throws Exception
    {
        if(request.getType() != null && request.getFormat() != null)
        {

            String url = requestURL;
            url = url.concat(request.getType().name().toLowerCase());

            boolean _shouldAppendID = false;
            switch(request.getType())
            {
                case BILL:
                    _shouldAppendID = true;
                    break;
                case PERSON:
                    _shouldAppendID = true;
                    break;
                case COMMITTEE:
                    _shouldAppendID = true;
                    break;

                default:
                    break;
            }

            if(_shouldAppendID && request.getSearchableID() != -1)
                url = url.concat("/" + request.getSearchableID());

            url = url.concat("?");

            url = addArgument(url, "format", request.getFormat().name().toLowerCase());
            url = addArgument(url, "limit", Integer.toString(request.getLimit()));
            url = addArgument(url, "offset", Integer.toString(request.getOffset()));

            if(request.getType().equals(RequestType.BILL) && !request.getQuery().equals("!!!NONEXISTENT!!!"))
                url = addArgument(url, "q", request.getQuery());

            if(!request.getSort().equals("!!!NONEXISTENT!!!"))
                url = addArgument(url, "sort", request.getSortOrder().equals(Request.SortOrder.DECSENDING) ? "-".concat(request.getSort()) : request.getSort());

            if(request.getFilter().size() != 0)
            {
                for(String filter : request.getFilter().keySet())
                {
                    addArgument(url, filter, request.getFilter().get(filter));
                }
            }

            if(request.getFields().size() != 0)
            {
                String _fields = "";
                for(int i = 0; i < request.getFields().size(); i++)
                {
                    String _field = request.getFields().get(i);
                    _fields = _fields.concat(_field);
                    if(i != request.getFields().size() - 1)
                    {
                        _fields = _fields.concat(",");
                    }
                }
            }

            //Grab the JOSN
            String json = JsonUtil.getJson(url);

            if(request.getSearchableID() != -1)
            {
                //if I search for an individual object
                switch(request.getType())
                {
                    case BILL:
                        return (Bill) JsonUtil.gson.fromJson(json, Bill.class);
                    case PERSON:
                        return (Person) JsonUtil.gson.fromJson(json, Person.class);
                    case COMMITTEE:
                        return (Committee) JsonUtil.gson.fromJson(json, Committee.class);

                    default:
                        break;
                }
            }
            else
            {
                return (GenericObjects)JsonUtil.gson.fromJson(json, GenericObjects.class);
                //Exception e = new Exception("not yet implemented");
                //throw e;
            }

        }
        throw new IllegalArgumentException("Missing type and/or format");
    }

    private static String addArgument(String str, String name, String value)
    {
        return str.concat(name).concat("=").concat(value).concat("&");
    }

}
