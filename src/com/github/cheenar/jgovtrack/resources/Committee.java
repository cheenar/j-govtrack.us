package com.github.cheenar.jgovtrack.resources;

/**
 * Created by admin on 3/7/16.
 */
public class Committee
{

    private String abbrev;
    private String code;
    private Object committee;
    private String committee_type;
    private String committee_type_label;
    private int id;
    private Object jurisdiction;
    private Object jurisdiction_link;
    private String name;
    private boolean obsolete;
    private String url;

    public String getAbbrev() {
        return abbrev;
    }

    public String getCode() {
        return code;
    }

    public Object getCommittee() {
        return committee;
    }

    public String getCommittee_type() {
        return committee_type;
    }

    public String getCommittee_type_label() {
        return committee_type_label;
    }

    public int getId() {
        return id;
    }

    public Object getJurisdiction() {
        return jurisdiction;
    }

    public Object getJurisdiction_link() {
        return jurisdiction_link;
    }

    public String getName() {
        return name;
    }

    public boolean isObsolete() {
        return obsolete;
    }

    public String getUrl() {
        return url;
    }
}
