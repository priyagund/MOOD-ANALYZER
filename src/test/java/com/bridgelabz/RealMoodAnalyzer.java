package com.bridgelabz;

public class RealMoodAnalyzer {
    public String analyzeMood(String message)
    {  try {
        if (message.contains("SAD")) {
            return "SAD";
        }else{
        return "HAPPY";
    }
    }catch(NullPointerException e) {}

    return  "HAPPY";
    }
}
