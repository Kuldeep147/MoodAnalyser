package org.example;

public class MoodAnalyser {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    String msg ;
    public static String analyseMood(String str) {
        try {


            if (str.equals("I am in Sad Mood")) {
                return "SAD";
            } else if (str.equals("")) {
                try {
                    throw new MoodAnalysisException("Empty mood");
                } catch (MoodAnalysisException e) {
                    throw new RuntimeException(e);
                }
            } else return "HAPPY";
        }catch (NullPointerException ed){
            try {
                throw new MoodAnalysisException("Invalid Mood");
            } catch (MoodAnalysisException ex) {
                throw new RuntimeException(ex);
            }
        }
    }


    public MoodAnalyser(String msg) {
        this.msg = msg;
    }

    public MoodAnalyser() {
    }

    public String getMsg() {
        return msg;
    }
}