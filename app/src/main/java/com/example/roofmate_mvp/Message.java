package com.example.roofmate_mvp;

import java.sql.Timestamp;

public class Message {
    String content ;
    String senderid;
    Timestamp date ;
    public Message(String s, String c){
        content = c;
        senderid = s;


    }

}
