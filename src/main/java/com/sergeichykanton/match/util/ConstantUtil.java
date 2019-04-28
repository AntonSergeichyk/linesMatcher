package com.sergeichykanton.match.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ConstantUtil {

    public static final String FIRST_MODE = "Output all the lines from input.txt that match exactly any pattern in patterns.txt: 1";
    public static final String SECOND_MODE = "Output all the lines from input.txt that contain a match from patterns.txt somewhere in the line: 2";
    public static final String PROGRAM_EXIT = "Program exit: 4";
    public static final String PROGRAM_COMPLETED = "program completed";
    public static final String ANOTHER_ATTEMPT = "please try again!";
    public static final String INPUT_TXT = "input.txt";
    public static final String PATTERNS_TXT = "patterns.txt";

    public static final String RESOURCES = "resources";
    public static final String PATH = "files";
    public static final String MAIN = "main";
    public static final String SRC = "src";
    public static final String THIRD_MODEL = "Output all the lines from input.txt that contain a match with edit distance <= 1 patterns.txt: 3";
}
