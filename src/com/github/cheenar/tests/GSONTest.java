package com.github.cheenar.tests;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * @author Cheenar
 * @description GSON Testing to learn the GSON API
 */

public class GSONTest
{

    private static String getXML(String urlStr)
    {
        StringBuilder json = new StringBuilder();
        try
        {
            URL url = new URL(urlStr);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = "";
            while((line = in.readLine()) != null)
            {
                json.append(line);
                json.append("\n");
            }
            in.close();
            return json.toString();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return "-1";
    }

    public static void main(String[] args)
    {
        String xml = getXML("https://www.govtrack.us/api/v2/bill/127129?format=xml");
        System.out.println(xml);
    }

}
