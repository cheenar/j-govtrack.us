package com.github.cheenar.jgovtrack.request;

import java.util.Date;

/**
 * Created by admin on 3/15/16.
 */
public class RequestFactory
{

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

    public static Object processRequest(Request request) throws IllegalArgumentException
    {
        if(request.getType() != null && request.getFormat() != null)
        {
            
        }
        throw new IllegalArgumentException();
    }

}
