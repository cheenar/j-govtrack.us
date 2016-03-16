package com.github.cheenar.jgovtrack.request;

import java.util.ArrayList;

/**
 * Created by admin on 3/15/16.
 */
public abstract class Request
{
    private RequestType type;
    private RequestFormat format;
    private int limit;
    private int offest;

    private ArrayList<String> queries;
    private ArrayList<String> filter;

    private int billID;

    private String requestURL;

    public Request()
    {
        this.requestURL = "https://www.govtrack.us/api/v2/"; //base URL
        this.limit = 100;
        this.offest = 0;

        this.queries = new ArrayList<String>();
        this.filter = new ArrayList<String>();

        this.billID = -1;
    }

    /** Abstract **/

    public abstract Object[] getMetadata();

    /** Getters **/

    public Object getMetadata(int index)
    {
        return this.getMetadata()[index];
    }

    public String getRequestURL()
    {
        return this.requestURL;
    }

    public RequestType getType()
    {
        return this.type;
    }

    public RequestFormat getFormat()
    {
        return format;
    }

    public int getBillID()
    {
        return this.billID;
    }

    public int getLimit()
    {
        return this.limit;
    }

    public ArrayList<String> getQueries()
    {
        return this.queries;
    }

    public ArrayList<String> getFilter()
    {
        return this.filter;
    }

    /** Setters **/

    public int getOffest()
    {
        return this.offest;
    }

    public Request setType(RequestType type)
    {
        this.type = type;
        return this;
    }

    public Request setFormat(RequestFormat format)
    {
        this.format = format;
        return this;
    }

    public Request setLimit(int limit)
    {
        this.limit = limit;
        return this;
    }

    public Request setOffest(int offest)
    {
        this.offest = offest;
        return this;
    }

    public Request setBillID(int billID)
    {
        this.billID = billID;
        return this;
    }

}
