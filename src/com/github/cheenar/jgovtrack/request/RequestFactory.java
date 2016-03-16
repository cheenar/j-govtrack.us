package com.github.cheenar.jgovtrack.request;

import com.github.cheenar.jgovtrack.JsonUtil;
import com.github.cheenar.jgovtrack.resources.Bill;
import com.github.cheenar.jgovtrack.resources.Committee;
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

            url = url.concat("format=").concat(request.getFormat().name().toLowerCase());

            if(request.getType().equals(RequestType.BILL) && !request.getQuery().equals("!!!NONEXISTENT!!!"))
                url = url.concat("q=").concat(request.getQuery()).concat("&");

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
                Exception e = new Exception("not yet implemented");
                throw e;
            }

        }
        throw new IllegalArgumentException("Missing type and/or format");
    }

}
