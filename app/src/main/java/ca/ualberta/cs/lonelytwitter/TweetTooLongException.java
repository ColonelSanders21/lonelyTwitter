/*
 * Copyright (c) Team X, CMPUT301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this
 * code under terms and conditions of the Code of Students Behavior at University of Alberta
 *
 */

package ca.ualberta.cs.lonelytwitter;

/**
 * Exception thrown when tweet is too long
 *
 * @author Anders Johnson
 * @version 1.0
 * @see Tweet
 * @since 1.0
 */
public class TweetTooLongException extends Exception {

    /**
     * Instantiates a new Tweet too long exception.
     */
    TweetTooLongException() {
        super("The message is too long! Please keep your tweets within 140 characters.");
    }
}