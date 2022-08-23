package com.bl.customExceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class MoodAnalyserTest {
    //analysing the mood for sad
    @Test
    public void analyseSadMood(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I'm in Sad Mood");
        Assertions.assertEquals(mood, "SAD");
    }

    @Test
    public void analyseHappyMood(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I'm in Happy Mood");
        Assertions.assertEquals(mood, "HAPPY");
    }





}