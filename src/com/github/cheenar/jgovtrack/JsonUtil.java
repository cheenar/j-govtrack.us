package com.github.cheenar.jgovtrack;

import com.github.cheenar.jgovtrack.resources.GenericObjects;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by admin on 3/7/16.
 */
public class JsonUtil
{

    public static Gson gson = new Gson();

    public static Object objectFromGenericObjects(Object o, Class c)
    {
        return gson.fromJson(gson.toJson(o), c);
    }

    public static String getJson(String urlStr)
    {
        StringBuilder json = new StringBuilder();
        try
        {
            URL url = new URL(urlStr);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = "";
            while(true)
            {
                line = in.readLine();
                if(line == null)
                {
                    break;
                }
                if(line.startsWith("callback("))
                {
                    line = line.replace("callback(", "");
                }
                if(line.startsWith("});"))
                {
                    line = line.replace("});", "}");
                }
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

}
