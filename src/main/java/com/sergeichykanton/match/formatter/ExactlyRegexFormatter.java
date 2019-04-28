package com.sergeichykanton.match.formatter;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ExactlyRegexFormatter implements RegexFormatter<String> {

    private static final ExactlyRegexFormatter INSTANCE = new ExactlyRegexFormatter();

    private static final String START_OF_LINE_CHECKED = "^";
    private static final String FINISH_OF_LINE_CHECKED = "$";

    @Override
    public List<String> format(List<String> patternLines) {
        String format = "%s%s%s";
        return patternLines.stream()
                .map(line -> String.format(format, START_OF_LINE_CHECKED, line, FINISH_OF_LINE_CHECKED))
                .collect(Collectors.toList());
    }

    public static ExactlyRegexFormatter getINSTANCE() {
        return INSTANCE;
    }
}
