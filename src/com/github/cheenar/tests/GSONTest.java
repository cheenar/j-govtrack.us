package com.github.cheenar.tests;

import com.github.cheenar.jgovtrack.request.Request;
import com.github.cheenar.jgovtrack.request.RequestFactory;
import com.github.cheenar.jgovtrack.request.RequestFormat;
import com.github.cheenar.jgovtrack.request.RequestType;
import com.github.cheenar.jgovtrack.resources.Bill;

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

        Request request = RequestFactory.createRequest();
        request.setLimit(100)
                .setOffest(0)
                .setFormat(RequestFormat.JSONP)
                .setType(RequestType.BILL)
                .setSearchableID(103053);
        Bill bill = (Bill) RequestFactory.processRequest(request);
        System.out.print(bill.getCurrent_status());
    }

}
