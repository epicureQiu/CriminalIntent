package com.example.jqiu.criminalintent;

import java.util.Date;
import java.util.UUID;
/**
 * Created by jqiu on 6/18/15.
 */
public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime() {
        // Generate unique identifier
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate( Date date ){
        mDate = date;
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

    /*
    * The default implementation of ArrayAdapter<T>.getView(…) relies on toString().
    * It inflates the layout, finds the correct Crime object,
    * and then calls toString() on the object to populate the TextView.
    * */
    @Override
    public String toString() {
        return mTitle;
    }

}
