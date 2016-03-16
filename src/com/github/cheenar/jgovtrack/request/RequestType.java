package com.github.cheenar.jgovtrack.request;

/**
 * Created by admin on 3/15/16.
 */
public enum RequestType
{

    BILL,
    COSPONSORSHIP,
    PERSON,
    ROLE,
    VOTE,
    VOTE_VOTER,
    COMMITTEE,
    COMMITTEE_MEMBER;

    public RequestType getTypeFromName(String name)
    {
        for(Enum<?> t : this.values())
        {
            if(t.name().equals(name))
            {
                return (RequestType)t;
            }
        }
        return BILL;
    }

}
