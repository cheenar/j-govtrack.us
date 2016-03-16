package com.github.cheenar.jgovtrack.request;

import java.util.ArrayList;

/**
 * @author Cheenar
 * @date 3/15/16
 */

public abstract class Request
{
    private RequestType type;
    private RequestFormat format;
    private int limit;
    private int offest;

    private String query;

    private ArrayList<String> filter;

    //SearchableID - Bill, Committee, Person - Used to find specific *
    private int searchableID;

    public Request()
    {
        this.limit = 100;
        this.offest = 0;

        this.query = "!!!NONEXISTENT!!!";

        this.filter = new ArrayList<String>();

        this.searchableID = -1;
    }

    /** Abstract **/

    public abstract Object[] getMetadata();

    /** Getters **/

    public Object getMetadata(int index)
    {
        return this.getMetadata()[index];
    }

    public ArrayList<String> getFilter()
    {
        return this.filter;
    }

    public RequestType getType()
    {
        return this.type;
    }

    public RequestFormat getFormat()
    {
        return format;
    }

    public int getSearchableID()
    {
        return this.searchableID;
    }

    public int getLimit()
    {
        return this.limit;
    }

    public int getOffest()
    {
        return this.offest;
    }

    public String getQuery()
    {
        return this.query;
    }

    /** Setters **/

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

    public Request setSearchableID(int searchableID)
    {
        this.searchableID = searchableID;
        return this;
    }

    public Request setQuery(String query)
    {
        this.query = query;
        return this;
    }

}
