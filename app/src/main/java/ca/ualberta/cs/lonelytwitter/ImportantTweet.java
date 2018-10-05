/*
 * Copyright (c) Team X, CMPUT301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this
 * code under terms and conditions of the Code of Students Behavior at University of Alberta
 *
 */

package ca.ualberta.cs.lonelytwitter;

/**
 * Represents an important tweet
 *
 * @author Anders Johnson
 * @version 1.0
 * @see NormalTweet
 * @see Tweet
 * @since 1.0
 */
public class ImportantTweet extends Tweet {
    @Override

    public Boolean isImportant() {
        return true;
    }
}
