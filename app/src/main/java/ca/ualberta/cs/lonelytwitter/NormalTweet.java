/*
 * Copyright (c) Team X, CMPUT301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this
 * code under terms and conditions of the Code of Students Behavior at University of Alberta
 *
 */

package ca.ualberta.cs.lonelytwitter;

/**
 * Represents a normal tweet
 *
 * @author Anders Johnson
 * @version 1.0
 * @see ImportantTweet
 * @see Tweet
 * @since 1.0
 */
public class NormalTweet extends Tweet {
    @Override
    public Boolean isImportant() {
        return false;
    }
}
