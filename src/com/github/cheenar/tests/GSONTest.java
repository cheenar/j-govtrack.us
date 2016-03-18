package com.github.cheenar.tests;

import com.github.cheenar.jgovtrack.JsonUtil;
import com.github.cheenar.jgovtrack.request.Request;
import com.github.cheenar.jgovtrack.request.RequestFactory;
import com.github.cheenar.jgovtrack.request.RequestFormat;
import com.github.cheenar.jgovtrack.request.RequestType;
import com.github.cheenar.jgovtrack.resources.Bill;
import com.github.cheenar.jgovtrack.resources.GenericObjects;
import com.github.cheenar.jgovtrack.resources.Person;

/**
 * @author Cheenar
 * @description GSON Testing to learn the GSON API
 */

public class GSONTest
{

    public static void main(String[] args) throws Exception
    {
        /*Bill o = BillFactory.newBill(127129);
        System.out.println(o.getBill_type_label());
        for(Committee c : o.getCommittees())
        {
            System.out.println(c.getName());
        }*/

        /*GenericObjects bills = BillFactory.getBillsFromCongress(110, 100, 0);
        for(Object obj : bills.getData())
        {
            Bill bill = (Bill) JsonUtil.objectFromGenericObjects(obj, Bill.class);
            System.out.println(bill.getId());
        }*/

        simpleBillRequest();
        simplePersonRequest();
        simpleBillsRequest();
    }

    public static void simpleBillRequest() throws Exception
    {
        Request request = RequestFactory.createRequest();
        request.setLimit(100)
                .setOffset(0)
                .setFormat(RequestFormat.JSONP)
                .setType(RequestType.BILL)
                .setSearchableID(103053);
        Bill bill = (Bill) RequestFactory.processRequest(request);
        System.out.println(bill.getCurrent_status());
    }

    public static void simplePersonRequest() throws Exception
    {
        Request request = RequestFactory.createRequest();
        request.setLimit(100)
                .setOffset(0)
                .setFormat(RequestFormat.JSONP)
                .setType(RequestType.PERSON)
                .setSearchableID(300011);
        Person person = (Person) RequestFactory.processRequest(request);
        System.out.println(person.getName());
        System.out.println();
    }

    public static void simpleBillsRequest() throws Exception
    {
        Request request = RequestFactory.createRequest();
        request.setLimit(100)
                .setOffset(300000)
                .setFormat(RequestFormat.CSV)
                .setType(RequestType.BILL)
                .addField("congress")
                .addField("title")
                .addField("introduced_date")
                .setSort("introduced_date");
        GenericObjects bills = (GenericObjects) RequestFactory.processRequest(request);

        for(int i = 0; i < bills.getData().size(); i++)
        {
            Bill bill = (Bill) JsonUtil.objectFromGenericObjects(bills.getData().get(i), Bill.class);
            System.out.println(bill.getIntroduced_date() + ": " + bill.getTitle());
        }
    }

}
