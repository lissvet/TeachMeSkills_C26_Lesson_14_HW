package com.teachmeskills.lesson14.service;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Date;
import static com.teachmeskills.lesson14.utils.IConst.*;

public class ValidDocNumber {

    public static void checkDocNumber (String path) throws IOException {

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(path))) {

            String[] doc = Files.readString(Paths.get(path)).split("\n");

            for (String num : doc) {

                String toRep = "\r";
                num = num.replace(toRep, "");

                if (num.matches(REGEXP_DOC_NUMBER_1)) {
                    try {
                        Files.write(Paths.get(PATH_VALID_DOCNUM), (num + "\n").getBytes(), StandardOpenOption.APPEND);
                        Logger.logInfo(new Date(), " -> Valid document has been recorded.\n");
                    } catch (IOException e) {
                        Logger.logErrorInfo(new Date(), " -> Write error.\n");
                    }
                }

                if (num.matches(REGEXP_DOC_NUMBER_2)) {
                    try {
                        Files.write(Paths.get(PATH_VALID_CONTRACT), (num + "\n").getBytes(), StandardOpenOption.APPEND);
                        Logger.logInfo(new Date(), " -> valid contract has been written\n");
                    } catch (IOException e) {
                        Logger.logErrorInfo(new Date(), "Write error.\n");
                    }
                }

                if (num.length() > DOC_LENGTH) {
                    Files.write(Paths.get(PATH_INVALID_DOC), (num + " -> Invalid document length.\n").getBytes(), StandardOpenOption.APPEND);
                    Logger.logErrorInfo(new Date(), " -> Invalid document length.\n");
                }

                if (!num.startsWith(REGEXP_DOC_NUMBER_START_1) && !num.startsWith(REGEXP_DOC_NUMBER_START_2)) {
                    Files.write(Paths.get(PATH_INVALID_DOC), (num + " -> Invalid document start.\n").getBytes(), StandardOpenOption.APPEND);
                    Logger.logErrorInfo(new Date(), " -> Invalid document start.\n");
                }

                if (num.matches(REGEXP_INVALID_DOC_NUMBER_SYMBOL)) {
                    Files.write(Paths.get(PATH_INVALID_DOC), (num + " -> Contains invalid characters.\n").getBytes(), StandardOpenOption.APPEND);
                    Logger.logErrorInfo(new Date(), " -> Contains invalid characters.\n");
                }
            }
        } catch (IOException e){
            Logger.logErrorInfo(new Date()," -> Unexpected error.\n");
        }
    }

}
