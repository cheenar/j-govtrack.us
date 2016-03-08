package com.github.cheenar.jgovtrack.resources;

import java.util.List;

/**
 * Created by admin on 3/7/16.
 */
public class Role
{

    private Object caucus;
    private List<Integer> congress_numbers;
    private boolean current;
    private String description;
    private int district;
    private String enddate;
    private Object extra;
    private int id;
    private Object leadership_title;
    private String party;
    private int person;
    private Object phone;
    private String role_type;
    private String role_type_label;
    private Object senator_class;
    private Object senator_rank;
    private String startdate;
    private String state;
    private String title;
    private String title_long;
    private String website;

    public Object getCaucus() {
        return caucus;
    }

    public List<Integer> getCongress_numbers() {
        return congress_numbers;
    }

    public boolean isCurrent() {
        return current;
    }

    public String getDescription() {
        return description;
    }

    public int getDistrict() {
        return district;
    }

    public String getEnddate() {
        return enddate;
    }

    public Object getExtra() {
        return extra;
    }

    public int getId() {
        return id;
    }

    public Object getLeadershipTitle() {
        return leadership_title;
    }

    public String getParty() {
        return party;
    }

    public int getPerson() {
        return person;
    }

    public Object getPhone() {
        return phone;
    }

    public String getRoleType() {
        return role_type;
    }

    public String getRoleTypeLabel() {
        return role_type_label;
    }

    public Object getSenatorClass() {
        return senator_class;
    }

    public Object getSenatorRank() {
        return senator_rank;
    }

    public String getStartdate() {
        return startdate;
    }

    public String getState() {
        return state;
    }

    public String getTitle() {
        return title;
    }

    public String getTitleLong() {
        return title_long;
    }

    public String getWebsite() {
        return website;
    }
}
