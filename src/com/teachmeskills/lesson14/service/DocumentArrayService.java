package com.teachmeskills.lesson14.service;
import com.teachmeskills.lesson14.castom_exception.WrongDocNameException;
import com.teachmeskills.lesson14.tools.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;


public class DocumentArrayService {

    public static void checkDocNumber (String path) throws IOException {

        String[] doc = Files.readString(Paths.get(path)).split("\n");

        for (String num : doc) {
            try {
                DocumentNameValidationService.checkDocNumber(num);
            } catch (WrongDocNameException e) {
                Logger.logErrorInfo(new Date(), e.getMessage());
            } catch (IOException e) {
                Logger.logErrorInfo(new Date(), " -> Unexpected error.\n");
            }
        }
    }

}
