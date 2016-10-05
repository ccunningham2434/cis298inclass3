package edu.kvcc.cis298.criminalintent;

import java.util.UUID;

/**
 * Created by ccunn on 05-Oct-16.
 */

public class Crime {

    private UUID mId;
    private String mTitle;

    // >Constructors
    //
    public Crime() {
        // >Generate id.
        mId = UUID.randomUUID();
    }

    // >Properties
    //
    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }
    public void setTitle(String title) {
        mTitle = title;
    }


}
