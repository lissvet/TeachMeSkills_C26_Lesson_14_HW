package com.teachmeskills.lesson14.utils;

public interface IConst {
    int DOC_LENGTH = 15;
    String REGEXP_DOC_NUMBER_1 = "docnum[0-9a-zA-Z&&[^\\r]]{9}";
    String REGEXP_DOC_NUMBER_2 = "contract[0-9a-zA-Z&&[^\\r]]{7}";
    String REGEXP_INVALID_DOC_NUMBER_SYMBOL = ".*[\\p{P}\\p{S}].*";
    String REGEXP_DOC_NUMBER_START_1 ="docnum";
    String REGEXP_DOC_NUMBER_START_2 ="contract";
    String PATH_VALID_DOCNUM = "C:\\Users\\Liisa\\Desktop\\уроки Java\\Homework\\TeachMeSkills_C26_Lesson_14_HW\\result\\valid\\valid_docnum.txt";
    String PATH_VALID_CONTRACT = "C:\\Users\\Liisa\\Desktop\\уроки Java\\Homework\\TeachMeSkills_C26_Lesson_14_HW\\result\\valid\\valid_сontract.txt";
    String PATH_INVALID_DOC = "C:\\Users\\Liisa\\Desktop\\уроки Java\\Homework\\TeachMeSkills_C26_Lesson_14_HW\\result\\invalid\\invalid_docnum.txt";

}
