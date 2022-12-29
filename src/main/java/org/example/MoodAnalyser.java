package org.example;

public class MoodAnalyser {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static String analyseMood(String str){
        if(str.equals("I am in Sad Mood")){
            return "SAD";
        } else return "HAPPY";
    }

}