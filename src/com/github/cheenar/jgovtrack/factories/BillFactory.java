package com.github.cheenar.jgovtrack.factories;

import com.github.cheenar.jgovtrack.JsonUtil;
import com.github.cheenar.jgovtrack.resources.Bill;
import com.github.cheenar.jgovtrack.resources.GenericObjects;

import java.util.List;

/**
 * Created by admin on 3/7/16.
 */
public class BillFactory
{

    public BillFactory()
    {

    }

    public static Bill newBill(int id)
    {
        String jsonResponse = JsonUtil.getJson(APIFactory.getBill(id));
        return JsonUtil.gson.fromJson(jsonResponse, Bill.class);
    }

    public static Bill newBill(String id)
    {
        return newBill(Integer.parseInt(id));
    }

    public static GenericObjects getBills(int limit)
    {
        String jsonResponse = JsonUtil.getJson(APIFactory.getBills(limit));
        return JsonUtil.gson.fromJson(jsonResponse, GenericObjects.class);
    }

}
