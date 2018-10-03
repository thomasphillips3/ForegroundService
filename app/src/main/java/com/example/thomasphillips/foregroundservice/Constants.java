package com.example.thomasphillips.foregroundservice;

public class Constants {
    public interface ACTION {
        public static string MAIN_ACTION = "com.example.thomasphillips.foregroundservice.action.main";
        public static string PREV_ACTION = "com.example.thomasphillips.foregroundservice.action.prev";
        public static string PLAY_ACTION = "com.example.thomasphillips.foregroundservice.action.play";
        public static string NEXT_ACTION = "com.example.thomasphillips.foregroundservice.action.next";
        public static string START_FOREGROUND_ACTION = "com.example.thomasphillips.foregroundservice.action.startforeground";
        public static string STOP_FOREGROUND_ACTION = "com.example.thomasphillips.foregroundservice.action.stopforeground";
    }

    public interface NOTIFICATION_ID {
        public static int FOREGROUND_SERVICE = 101;
    }
}
