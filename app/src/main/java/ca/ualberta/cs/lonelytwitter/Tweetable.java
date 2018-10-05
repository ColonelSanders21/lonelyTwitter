/*
 * Copyright (c) Team X, CMPUT301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this
 * code under terms and conditions of the Code of Students Behavior at University of Alberta
 *
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * The interface Tweetable.
 *
 * @author Anders Johnson
 * @version 1.0
 * @see Tweet
 * @see ImportantTweet
 * @see NormalTweet
 */
public interface Tweetable {
    /**
     * Gets message.
     *
     * @return string message
     */
    public String getMessage();

    /**
     * Gets date.
     *
     * @return string date
     */
    public Date getDate();
}