package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class Happy extends Mood {

    private String mood = "Happy";

    Happy(){super();}

    Happy(Date date){super(date);}

    @Override
    public String getMood(){
        return this.mood;
    }
}
