package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class Angry extends Mood {

    private String mood = "Angry";

    Angry(){super();}

    Angry(Date date){super(date);}

    @Override
    public String getMood(){
        return this.mood;
    }
}
