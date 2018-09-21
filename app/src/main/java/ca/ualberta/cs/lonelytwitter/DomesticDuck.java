package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

public class DomesticDuck extends Animal implements FlyingBehaviour{
    public DomesticDuck(String type, String food){
        super(type, food);
    }
    public void swim(){
        Log.d("cmput-301", "I am a duck so I love to swim ");
    }
    public void doesLikeFlying(){
        Log.d("cmput-301", "I like flying");
    }
}
