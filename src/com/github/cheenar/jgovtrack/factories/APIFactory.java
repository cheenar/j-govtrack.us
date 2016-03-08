package com.github.cheenar.jgovtrack.factories;

/**
 * Created by admin on 3/7/16.
 */
public class APIFactory
{

    public static String getBill(int id)
    {
        return "https://www.govtrack.us/api/v2/bill/" + id + "?format=jsonp";
    }

    public static String getBills(int limit)
    {
        return "https://www.govtrack.us/api/v2/bill?format=jsonp&limit=" + limit;
    }

}
