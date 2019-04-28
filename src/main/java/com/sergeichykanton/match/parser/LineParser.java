package com.sergeichykanton.match.parser;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

import java.util.regex.Pattern;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class LineParser implements Parser<String, String> {

    private static final LineParser INSTANCE = new LineParser();

    @Override
    public String parse(String inputLine, String regex) {
        String result = null;
        if (Pattern.compile(regex).matcher(inputLine).find()) {
            result = inputLine;
        }

        return result;
    }

    public static LineParser getINSTANCE() {
        return INSTANCE;
    }
}
