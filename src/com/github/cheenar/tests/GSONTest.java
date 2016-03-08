package com.github.cheenar.tests;

import com.github.cheenar.jgovtrack.factories.BillFactory;
import com.github.cheenar.jgovtrack.resources.Bill;
import com.github.cheenar.jgovtrack.JsonUtil;
import com.github.cheenar.jgovtrack.resources.Committee;
import com.github.cheenar.jgovtrack.resources.GenericObjects;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

/**
 * @author Cheenar
 * @description GSON Testing to learn the GSON API
 */

public class GSONTest
{

    public static void main(String[] args) throws Exception
    {
        Bill o = BillFactory.newBill(127129);
        System.out.println(o.getBill_type_label());
        for(Committee c : o.getCommittees())
        {
            System.out.println(c.getName());
        }
        GenericObjects bills = BillFactory.getBills(100);
        for(Object obj : bills.getObjects())
        {
            Bill bill = (Bill) JsonUtil.objectFromGenericObjects(obj, Bill.class);
            System.out.println(bill.getId());
        }
    }

}
