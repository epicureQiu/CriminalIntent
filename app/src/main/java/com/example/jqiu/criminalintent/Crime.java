package com.example.jqiu.criminalintent;

import java.util.UUID;
/**
 * Created by jqiu on 6/18/15.
 */
public class Crime {
    private UUID mId;
    private String mTitle;
    public Crime() {
        // Generate unique identifier
        mId = UUID.randomUUID();
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }


    public UUID getId() {
        return mId;
    }

}
