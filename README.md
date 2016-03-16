![logo](https://i.imgur.com/N3ynmpm.png)

This is an un-official Java API for govtrack.us JSON API. Currently only has all the base files needed for the API, however there is no easy-to-use system of building the resource objects.

New API documentation. The previous documentation that existed here was for an older version of the API.

###API How-To-Use 

Basically there is a `Request` class that contains the building blocks for requesting information from the GovTrack API. 

Now to <i>craft</i> a request, you need to just create a new `Request` object and then use the `RequestFactory` to call `createRequest()`. After creating a basic request, you use the various methods to setup the `Request`. The only information that is needed to create a valid request is the `RequestFormat` and `RequestType` information. Below is a basic `Request` that grabs a collection of `Bill` objects and gives you the bill title and introduction date along with sorting it by the introduction date.

	Request request = RequestFactory.createRequest();
        request.setLimit(100)
                .setOffset(300000)
                .setFormat(RequestFormat.JSONP)
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

Another example of crafting a request however this time its creating a single request using a Searchable ID.

	Request request = RequestFactory.createRequest();
        request.setLimit(100)
                .setOffset(0)
                .setFormat(RequestFormat.JSONP)
                .setType(RequestType.BILL)
                .setSearchableID(103053);
        Bill bill = (Bill) RequestFactory.processRequest(request);
        System.out.println(bill.getCurrent_status());
        
A quick overview the `Request` arguments:

* `type`: this is the `RequestType`
* `format`: this is the `RequestFormat`
* `limit`: this the limit to how many objects are returned by the API (capped at 5999, if you want more results, you'll have to use offest OR use Bulk Data)
* `offset`: this is offsetting your results page, this only applies if you haven't specified a `searchableID`
* `sort`: this lets you sort your content
* `query`: if you set the `RequestType` to a bill you can query the bill for a search
* `filter`: lets you filter on certain arguments, you can filter multiple arguments using the pipe (|) character (e.g. filter=key1|key2|key3)
* `fields`: lets you return only a set amount of fields, lets you choose what data you want to return. Look on either the API page OR through the fields that exist in each class. Remember, returning only a certain number of fields will limit you when trying to access the other fields (i.e. will return null)
* `searchableID`: When you want to search a Bill, Person, or Committee, for a certain ID, use the searchable ID to find them
* `sortOrder`: primarily will let you change the sortOrder from acsending or decsending
 
###License Information
Currently the license is GNU GPL v3. 
