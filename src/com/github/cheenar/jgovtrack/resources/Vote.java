package com.github.cheenar.jgovtrack.resources;

import java.util.List;

/**
 * Created by admin on 3/7/16.
 */
public class Vote
{

    private String category;
    private String category_label;
    private String chamber;
    private String chamber_label;
    private int congress;
    private String created;
    private int id;
    private String link;
    private double margin;
    private boolean missing_data;
    private int number;
    private List<Option> options;
    private double percent_plus;
    private String question;
    private String related_amendment;
    private Bill related_bill;
    private String required;
    private String result;
    private String session;
    private String source;
    private String source_label;
    private int total_minus;
    private int total_other;
    private int total_plus;
    private String vote_type;

    public String getCategory() {
        return category;
    }

    public String getCategory_label() {
        return category_label;
    }

    public String getChamber() {
        return chamber;
    }

    public String getChamber_label() {
        return chamber_label;
    }

    public int getCongress() {
        return congress;
    }

    public String getCreated() {
        return created;
    }

    public int getId() {
        return id;
    }

    public String getLink() {
        return link;
    }

    public double getMargin() {
        return margin;
    }

    public boolean isMissing_data() {
        return missing_data;
    }

    public int getNumber() {
        return number;
    }

    public List<Option> getOptions() {
        return options;
    }

    public double getPercent_plus() {
        return percent_plus;
    }

    public String getQuestion() {
        return question;
    }

    public String getRelated_amendment() {
        return related_amendment;
    }

    public Bill getRelated_bill() {
        return related_bill;
    }

    public String getRequired() {
        return required;
    }

    public String getResult() {
        return result;
    }

    public String getSession() {
        return session;
    }

    public String getSource() {
        return source;
    }

    public String getSource_label() {
        return source_label;
    }

    public int getTotal_minus() {
        return total_minus;
    }

    public int getTotal_other() {
        return total_other;
    }

    public int getTotal_plus() {
        return total_plus;
    }

    public String getVote_type() {
        return vote_type;
    }
}
