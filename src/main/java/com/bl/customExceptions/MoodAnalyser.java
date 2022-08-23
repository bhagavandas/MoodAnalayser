package com.bl.customExceptions;

public class MoodAnalyser {


    public String analyseMood(){

            return "SAD";

    }

    public String analyseMood(String message){
       if(message.contains("Sad"))
           return "SAD";
       else
        return "HAPPY";
    }


}
