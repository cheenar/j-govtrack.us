package com.github.cheenar.jgovtrack.request;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Cheenar
 * @date 3/15/16
 */

public abstract class Request
{
    private RequestType type;
    private RequestFormat format;
    private int limit;
    private int offset;

    private String sort;
    private String query;

    private HashMap<String, String> filter;
    private ArrayList<String> fields;

    //SearchableID - Bill, Committee, Person - Used to find specific *
    private int searchableID;

    private SortOrder sortOrder;

    public Request()
    {
        this.limit = 100;
        this.offset = 0;

        this.query = "!!!NONEXISTENT!!!";
        this.sort = "!!!NONEXISTENT!!!";

        this.filter = new HashMap<String, String>();
        this.fields = new ArrayList<String>();

        this.searchableID = -1;

        this.sortOrder = SortOrder.ACSENDING;
    }

    /** Abstract **/

    public abstract Object[] getMetadata();

    /** Getters **/

    public Object getMetadata(int index)
    {
        return this.getMetadata()[index];
    }

    public HashMap<String, String> getFilter()
    {
        return this.filter;
    }

    public ArrayList<String> getFields()
    {
        return this.fields;
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

    public int getOffset()
    {
        return this.offset;
    }

    public String getQuery()
    {
        return this.query;
    }

    public String getSort()
    {
        return this.sort;
    }

    public SortOrder getSortOrder()
    {
        return sortOrder;
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
        if(limit > 5999)
            this.limit = 5999;
        else
            this.limit = limit;

        return this;
    }

    public Request setOffset(int offset)
    {
        this.offset = offset;
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

    public Request addFilter(String filter, String key)
    {
        this.filter.put(filter, key);
        return this;
    }

    public Request removeFilter(String filter)
    {
        this.filter.remove(filter);
        return this;
    }

    public Request addField(String fieldName)
    {
        this.fields.add(fieldName);
        return this;
    }

    public Request removeField(String fieldName)
    {
        this.fields.remove(fieldName);
        return this;
    }

    public Request setSort(String field)
    {
        this.sort = field;
        return this;
    }

    public Request setSortOrder(SortOrder sortOrder)
    {
        this.sortOrder = sortOrder;
        return this;
    }

    public enum SortOrder
    {
        ACSENDING,
        DECSENDING;
    }

}
