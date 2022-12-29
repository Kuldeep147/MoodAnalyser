package org.example;

public class MoodAnalyser {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    String msg ;
    public static String analyseMood(String str){
        if(str.equals("I am in Sad Mood")){
            return "SAD";
        } else return "HAPPY";
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