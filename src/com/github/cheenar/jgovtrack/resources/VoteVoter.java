package com.github.cheenar.jgovtrack.resources;

import com.google.gson.annotations.SerializedName;

/**
 * Created by admin on 3/7/16.
 */
public class VoteVoter
{

    private String created;
    private int id;
    private Option option;
    private Person person;
    @SerializedName("person_role")
    private Role personRole;
    private Vote vote;
    private String voter_type;
    private String voter_type_label;
    private String voteview_extra_code;

    public String getCreated() {
        return created;
    }

    public int getId() {
        return id;
    }

    public Option getOption() {
        return option;
    }

    public Person getPerson() {
        return person;
    }

    public Role getPersonRole() {
        return personRole;
    }

    public Vote getVote() {
        return vote;
    }

    public String getVoter_type() {
        return voter_type;
    }

    public String getVoter_type_label() {
        return voter_type_label;
    }

    public String getVoteview_extra_code() {
        return voteview_extra_code;
    }
}
