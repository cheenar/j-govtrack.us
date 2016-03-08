package com.github.cheenar.jgovtrack.resources;

/**
 * Created by admin on 3/7/16.
 */
public class CommitteeMember
{

    private Committee committee;
    private int id;
    private Person person;
    private Role role;

    public Committee getCommittee() {
        return committee;
    }

    public int getId() {
        return id;
    }

    public Person getPerson() {
        return person;
    }

    public Role getRole() {
        return role;
    }
}
