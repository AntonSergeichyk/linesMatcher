package com.sergeichykanton.match.formatter;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ContainRegexFormatter implements RegexFormatter<String> {

    private static final ContainRegexFormatter INSTANCE = new ContainRegexFormatter();

    @Override
    public List<String> format(List<String> patternLines) {
        return patternLines;
    }

    public static ContainRegexFormatter getInstance() {
        return INSTANCE;
    }
}
