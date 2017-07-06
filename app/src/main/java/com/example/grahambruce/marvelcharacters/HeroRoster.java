package com.example.grahambruce.marvelcharacters;

import java.util.ArrayList;

/**
 * Created by grahambruce on 05/07/2017.
 */

public class HeroRoster {

    private ArrayList<Hero> roster;

    public HeroRoster(){
        roster = new ArrayList<Hero>();
        roster.add(new Hero( "Superman", "Justice League", "Strength, flight, heat vision", "DC", R.drawable.Superman));
        roster.add(new Hero("Captain America", "Avengers", "Strength, Reflexes, Stamina", "Marvel", R.drawable.captainamerica));
        roster.add(new Hero("Cyclops", "X-Men", "Optic Blast, Strength, Energy Resistance", "Marvel", R.drawable.cyclops));
        roster.add(new Hero("Wonder Woman", "Justice League", "Strength, flight, invulnerability", "DC", R.drawable.Wonder_Woman));
        roster.add(new Hero("Spiderman", "No Affiliation", "Wall Crawling, Strength, spider-sense", "Marvel", R.drawable.spiderman));
        roster.add(new Hero("Starlord", "Guardians of the Galaxy", "Longevity, Expert Marksman, Master Tactician", "Marvel", R.drawable.starlord));
        roster.add(new Hero("Flash", "Justice League", "Super Speed, Agility, Time Manipulation", "DC", R.drawable.flash));
        roster.add(new Hero("Wolverine", "X-Men", "Bone Claws, Super senses, Super Healing", "Marvel", R.drawable.wolverine));
        roster.add(new Hero("Colossus", "X-Men", "Organic Steel Form, Strength, Durability", "Marvel", R.drawable.Colossus));
        roster.add(new Hero("Batman", "Justice League", "WHo cares?", "DC", R.drawable.Batman));
        roster.add(new Hero("Deadpool", "No Affiliation", "Immortality, Strength, Martial Arts", "Marvel", R.drawable.deadpool));
        roster.add(new Hero("Hulk", "Avengers", "Unlimited Strength, Durability, Unlimited Stamina", "Marvel", R.drawable.hulk));
    }

    public ArrayList<Hero> getRoster() {
        return new ArrayList<Hero>(roster);
    }
}
