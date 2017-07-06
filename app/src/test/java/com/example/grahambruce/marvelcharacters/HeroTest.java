package com.example.grahambruce.marvelcharacters;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by grahambruce on 05/07/2017.
 */

public class HeroTest {

    Hero hero;

    @Before
    public void before() {
        hero = new Hero("Robin", "Teen Titans", "none, he is worse than Batman", "DC");
    }

    @Test
    public void getName() throws Exception {
        assertEquals("Robin", hero.getName());
    }

    @Test
    public void getTeam() throws Exception {
        assertEquals("Teen Titans", hero.getTeam());
    }

    @Test
    public void getPowers() throws Exception {
        assertEquals("none, he is worse than Batman", hero.getPowers());
    }

    @Test
    public void getPublisher() throws Exception {
        assertEquals("DC", hero.getPublisher());
    }
}
