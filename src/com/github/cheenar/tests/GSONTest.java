package com.github.cheenar.tests;

import com.github.cheenar.jgovtrack.JsonUtil;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * @author Cheenar
 * @description GSON Testing to learn the GSON API
 */

public class GSONTest
{

    public static void main(String[] args) throws Exception
    {
        String json = JsonUtil.getJson("https://www.govtrack.us/api/v2/bill/127129?format=jsonp");
        System.out.println(json);
        Gson gson = new Gson();
        DataObject o = gson.fromJson(json, DataObject.class);
        System.out.println(o.bill_resolution_type);
    }

    static class DataObject
    {
        String bill_resolution_type;
        String bill_type;
        String bill_type_label;
    }

}
