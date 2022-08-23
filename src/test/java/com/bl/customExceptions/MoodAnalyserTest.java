package com.bl.customExceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class MoodAnalyserTest {
    //analysing the mood for sad
    @Test
    public void analyseSadMood() throws NullMoodAnalyseException {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I'm in Sad Mood");
        Assertions.assertEquals(mood, "SAD");
    }

    @Test
    public void analyseHappyMood(String aNull) throws NullMoodAnalyseException{
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("Null");
        Assertions.assertEquals(mood, "HAPPY");

        
    }

    @Test
    public void testmoodAnalyseException(){
        try{
            analyseHappyMood("Null");
        }
        catch(NullMoodAnalyseException e){
            System.out.println("Invalid mood");
            
        }
    }




}