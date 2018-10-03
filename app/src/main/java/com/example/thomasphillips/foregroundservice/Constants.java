package com.example.thomasphillips.foregroundservice;

public class Constants {
    public interface ACTION {
        public static String MAIN_ACTION = "com.example.thomasphillips.foregroundservice.action.main";
        public static String PREV_ACTION = "com.example.thomasphillips.foregroundservice.action.prev";
        public static String PLAY_ACTION = "com.example.thomasphillips.foregroundservice.action.play";
        public static String NEXT_ACTION = "com.example.thomasphillips.foregroundservice.action.next";
        public static String START_FOREGROUND_ACTION = "com.example.thomasphillips.foregroundservice.action.startforeground";
        public static String STOP_FOREGROUND_ACTION = "com.example.thomasphillips.foregroundservice.action.stopforeground";
    }

    public interface NOTIFICATION_ID {
        public static int FOREGROUND_SERVICE = 101;
    }
}
