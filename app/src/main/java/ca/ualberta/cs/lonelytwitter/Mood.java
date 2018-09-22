package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Mood {
    private Date date;

    //Empty argument constructor
    Mood(){
        this.date = new Date();
    }

    //Constructor with specified date
    Mood(Date date){
        this.date = date;
    }

    //Getter for date
    public Date getDate() {
        return this.date;
    }

    //Setter for date
    public void setDate(Date date){
        this.date = date;
    }

    //Left abstract so all moods must implement this function
    public abstract String getMood();
}
