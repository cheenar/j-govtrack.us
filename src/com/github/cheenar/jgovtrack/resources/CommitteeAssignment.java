package com.github.cheenar.jgovtrack.resources;

/**
 * Created by admin on 3/7/16.
 */
public class CommitteeAssignment
{

    private int committee;
    private int id;
    private int person;
    private String role;
    private String role_label;

    public int getCommittee() {
        return committee;
    }

    public int getId() {
        return id;
    }

    public int getPerson() {
        return person;
    }

    public String getRole() {
        return role;
    }

    public String getRoleLabel() {
        return role_label;
    }
}
