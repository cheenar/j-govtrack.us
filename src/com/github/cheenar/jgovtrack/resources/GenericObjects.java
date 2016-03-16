package com.github.cheenar.jgovtrack.resources;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by admin on 3/7/16.
 */
public class GenericObjects
{

    @SerializedName("objects")
    private List<Object> data;

    public List<Object> getData()
    {
        return this.data;
    }

}
