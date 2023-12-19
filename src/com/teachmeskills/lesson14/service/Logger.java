package com.teachmeskills.lesson14.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Date;

public class Logger {

    public static final String LOG_INFO = "C:\\Users\\Liisa\\Desktop\\уроки Java\\Homework\\TeachMeSkills_C26_Lesson_14_HW\\log\\execution\\execution_log.txt";
    public static final String LOG_ERROR_INFO = "C:\\Users\\Liisa\\Desktop\\уроки Java\\Homework\\TeachMeSkills_C26_Lesson_14_HW\\log\\error\\error_log.txt";

    public static void logInfo(Date date, String message){
        try {
            String log = date + message;
            Files.write(Paths.get(LOG_INFO), log.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            //do nothing
        }
    }

    public static void logErrorInfo(Date date, String message){
        try {
            String log = date + message;
            Files.write(Paths.get(LOG_ERROR_INFO), log.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            //do nothing
        }
    }

}
