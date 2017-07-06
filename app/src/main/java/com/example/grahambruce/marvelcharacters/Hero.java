package com.example.grahambruce.marvelcharacters;

import android.graphics.drawable.Drawable;
import android.media.Image;

/**
 * Created by grahambruce on 05/07/2017.
 */

public class Hero {

    private String name;
    private String team;
    private String powers;
    private String publisher;
    private int profilepic;

    public Hero(String name, String team, String powers, String publisher, int profilepic){
        this.name = name;
        this.team = team;
        this.powers = powers;
        this.publisher = publisher;
        this.profilepic = profilepic;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public String getPowers() {
        return powers;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getProfilepic() {
        return profilepic;
    }
}
