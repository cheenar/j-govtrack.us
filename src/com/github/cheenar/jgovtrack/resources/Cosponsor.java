package com.github.cheenar.jgovtrack.resources;

/**
 * Created by admin on 3/7/16.
 */
public class Cosponsor
{

    private int bill;
    private int id;
    private String joined;
    private int person;
    private String role;
    private Object withdrawn;

    public int getBill() {
        return bill;
    }

    public int getId() {
        return id;
    }

    public String getJoined() {
        return joined;
    }

    public int getPerson() {
        return person;
    }

    public String getRole() {
        return role;
    }

    public Object getWithdrawn() {
        return withdrawn;
    }
}
