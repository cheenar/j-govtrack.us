![logo](https://i.imgur.com/N3ynmpm.png)

This is an un-official Java API for govtrack.us JSON API. Currently only has all the base files needed for the API, however there is no easy-to-use system of building the resource objects.

Currently the only object that the "hacked" factory system can build is the ```Bill``` class. To build a bill, use the following syntax:

	Bill o = BillFactory.newBill(127129);
	
When trying to grab multiple bills using the automatic searching feature of the govtrack.us API, the current syntax is employed:

	GenericObjects bills = BillFactory.getBills(100);
    for(Object obj : bills.getObjects())
    {
    	Bill bill = (Bill) JsonUtil.objectFromGenericObjects(obj, Bill.class);
        System.out.println(bill.getId());
    }
 
This current syntax is going to change rapidly and will be replaced hopefully with a syntax similar to this
 
 ```Bill bill = Request.request(Bill.class, new Object[] { 1414141 });```
 
Probably not that at all but something where you have a request builder to take full advantage of the web API and then the "smart" Java API can efficiently partition the data for ease-of-use.

 
###License Information
Currently the license is GNU GPL v3. 
