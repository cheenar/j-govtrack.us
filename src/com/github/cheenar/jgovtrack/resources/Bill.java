package com.github.cheenar.jgovtrack.resources;

import java.util.List;

/**
 * Created by admin on 3/7/16.
 */
public class Bill
{

    public class Term
    {
        private int id;
        private String name;
        private String term_type;
        private String term_type_label;

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getTerm_type() {
            return term_type;
        }

        public String getTerm_type_label() {
            return term_type_label;
        }
    }

    private String bill_resolution_type;
    private String bill_type;
    private String bill_type_label;
    private List<Committee> committees;
    private int congress;
    private List<Cosponsor> cosponsors;
    private String current_status;
    private String current_status_date;
    private String current_status_description;
    private String current_status_label;
    private String display_number;
    private Object docs_house_gov_postdate;
    private int id;
    private String introduced_date;
    private boolean is_alive;
    private boolean is_current;
    private String link;
    private boolean lock_title;
    private String noun;
    private int number;
    private Object senate_floor_schedule_postdate;
    private Object sliplawnum;
    private Object sliplawnpubpriv;
    private String source;
    private Object source_link;
    private Person sponsor;
    private Role sponsor_role;
    private List<Term> terms;
    private String thomas_link;
    private String title;
    private String title_without_number;
    private List<List<String>> titles;

    public String getBill_resolution_type() {
        return bill_resolution_type;
    }

    public String getBill_type() {
        return bill_type;
    }

    public String getBill_type_label() {
        return bill_type_label;
    }

    public List<Committee> getCommittees() {
        return committees;
    }

    public int getCongress() {
        return congress;
    }

    public List<Cosponsor> getCosponsors() {
        return cosponsors;
    }

    public String getCurrent_status() {
        return current_status;
    }

    public String getCurrent_status_date() {
        return current_status_date;
    }

    public String getCurrent_status_description() {
        return current_status_description;
    }

    public String getCurrent_status_label() {
        return current_status_label;
    }

    public String getDisplay_number() {
        return display_number;
    }

    public Object getDocs_house_gov_postdate() {
        return docs_house_gov_postdate;
    }

    public int getId() {
        return id;
    }

    public String getIntroduced_date() {
        return introduced_date;
    }

    public boolean is_alive() {
        return is_alive;
    }

    public boolean is_current() {
        return is_current;
    }

    public String getLink() {
        return link;
    }

    public boolean isLock_title() {
        return lock_title;
    }

    public String getNoun() {
        return noun;
    }

    public int getNumber() {
        return number;
    }

    public Object getSenate_floor_schedule_postdate() {
        return senate_floor_schedule_postdate;
    }

    public Object getSliplawnum() {
        return sliplawnum;
    }

    public Object getSliplawnpubpriv() {
        return sliplawnpubpriv;
    }

    public String getSource() {
        return source;
    }

    public Object getSource_link() {
        return source_link;
    }

    public Person getSponsor() {
        return sponsor;
    }

    public Role getSponsor_role() {
        return sponsor_role;
    }

    public List<Term> getTerms() {
        return terms;
    }

    public String getThomas_link() {
        return thomas_link;
    }

    public String getTitle() {
        return title;
    }

    public String getTitle_without_number() {
        return title_without_number;
    }

    public List<List<String>> getTitles() {
        return titles;
    }
}
