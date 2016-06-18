package com.havefn.civix;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aufa on 18/06/2016.
 */
public class MessageRoom {
    public int userId;
    public int user2Id;
    public List<Msg> messages;

    public MessageRoom(int userId, int user2Id){
        this.userId = userId;
        this.user2Id = user2Id;
        messages = new ArrayList<Msg>();
    }
}
