package com.havefn.civix;


import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class User {

    public int id;
    public int profilePicID;
    public String name;
    public String city;
    public Date createdOn;
    public List<Quest> ownedQuest;
    public List<Quest> completedQuest;
    public List<Quest> friend;
    public String description;
    public int point;
    public int appreciated;
    public List<MessageRoom> messages;

    public User(int id, String name, String city, String description ){
        this.name = name;
        this.city = city;
        this.description = description;
        point = 0;
        Calendar c = Calendar.getInstance();
        createdOn = c.getTime();

    }

}
