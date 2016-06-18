package com.havefn.civix;

import android.location.Location;
import android.util.Log;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by aufa on 18/06/2016.
 */
public class Quest {

    public int creatorID;
    public String description;
    public int imageID;
    public Location questLocation;
    public List<User> completedUser;
    private boolean status;
    public Date createdDate;
    public Date endDate;
    public int point;
    public QuestValidator validator;
    public String category;

    public static final String TAG = "QuestCreation";

    public Quest(int creatorID, Location questLocation, Date endDateString,String category ) throws Exception{
        this.creatorID = creatorID;
        this.questLocation = questLocation;
        this.category = category;
        Calendar c = Calendar.getInstance();
        createdDate = c.getTime();

        if(isDateOK(endDate)){
            this.endDate = endDate;
        }else{
            throw new Exception ("End date > cuurent date");
        }

        Log.d(TAG,"Quest creation OK");

        completedUser = new ArrayList<User>();

    }



    public void setStatus(boolean in) throws Exception{

        if(!isDateOK(endDate)){
            throw new Exception("currentDate > endDate");
        }else{
            this.status = in;
        }

    }

    public boolean getStatus(){
        if(status == false){
            return false;
        }else{
            return isDateOK(endDate);
        }
    }


    public static boolean isDateOK(Date in){
        Calendar c = Calendar.getInstance();
        Date currentDate = c.getTime();
        return currentDate.compareTo(in) < 0;
    }

    public boolean userTryQuest(User user){
        if(validator.succeed()){
            completedUser.add(user);
        }
       return validator.succeed();
    }

    public boolean userTryQuest(User user, String in){
        if(validator.succeed(in)){
            completedUser.add(user);
        }
        return validator.succeed(in);
    }
}
