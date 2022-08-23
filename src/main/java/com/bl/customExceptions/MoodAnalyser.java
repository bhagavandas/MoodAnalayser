package com.bl.customExceptions;

public class MoodAnalyser {

    public String analyseMood(String message) throws NullMoodAnalyseException {

        if (message.contains("Null")) {

            throw new NullMoodAnalyseException("Invalid mood");
        }

        return "HAPPY";
    }

}
