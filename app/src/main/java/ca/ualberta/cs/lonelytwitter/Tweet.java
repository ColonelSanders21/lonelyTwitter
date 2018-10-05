/*
 * Copyright (c) Team X, CMPUT301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this
 * code under terms and conditions of the Code of Students Behavior at University of Alberta
 *
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a Tweet
 *
 * @author Anders Johnson
 * @version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */
public abstract class Tweet implements Tweetable {


    private Date date;
    private String message;
    private static final Integer MAX_CHARS = 140;

    /**
     * Returns tweet messages
     *
     * @return message Tweet message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Sets tweet messages
     *
     * @param message Tweet messasge
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() <= this.MAX_CHARS ) {
            this.message = message;
        } else {
            throw new TweetTooLongException();
        }
    }

    /**
     * Returns tweet date
     *
     * @return date Tweet date
     */
    public Date getDate() { return this.date; }

    /** Sets tweet date
     *
     * @param date Tweet date
     */
    public void setDate(Date date){
        this.date = date;
    }

    /**
     * Returns whether or not a tweet is important
     * @return boolean isImportant boolean
     */
    public abstract Boolean isImportant();

    /**
     * Returns a string when the object is converted
     * @return string Tweet string
     */
    @Override
    public String toString(){
        return this.date.toString() + " | " + this.message;

    }
}
