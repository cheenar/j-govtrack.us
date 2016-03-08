package com.github.cheenar.jgovtrack.resources;

import java.util.List;

/**
 * Created by admin on 3/7/16.
 */
public class Person
{

    private String bioguideid;
    private String birthday;
    private List<CommitteeAssignment> committeeassignments;
    private int cspanid;
    private String firstname;
    private String gender;
    private String gender_label;
    private int id;
    private String lastname;
    private String link;
    private String middlename;
    private String name;
    private String namemod;
    private String nickname;
    private String osid;
    private String pvsid;
    private List<Role> roles;
    private String sortname;
    private String twitterid;
    private String youtubeid;

    public String getBioguideid() {
        return bioguideid;
    }

    public String getBirthday() {
        return birthday;
    }

    public List<CommitteeAssignment> getCommitteeassignments() {
        return committeeassignments;
    }

    public int getCspanid() {
        return cspanid;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getGender() {
        return gender;
    }

    public String getGender_label() {
        return gender_label;
    }

    public int getId() {
        return id;
    }

    public String getLastname() {
        return lastname;
    }

    public String getLink() {
        return link;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getName() {
        return name;
    }

    public String getNamemod() {
        return namemod;
    }

    public String getNickname() {
        return nickname;
    }

    public String getOsid() {
        return osid;
    }

    public String getPvsid() {
        return pvsid;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public String getSortname() {
        return sortname;
    }

    public String getTwitterid() {
        return twitterid;
    }

    public String getYoutubeid() {
        return youtubeid;
    }
}
