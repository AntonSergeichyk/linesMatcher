package com.sergeichykanton.match.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;

import static java.util.Objects.isNull;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class StringUtil {

    private static final String EMPTY = "";

    public static void print(String string) {
        System.out.println(string);
    }

    public static void print(List<String> resultList) {
        System.out.println(resultList);
    }

    public static boolean isEmpty(String value) {
        return isNull(value) || EMPTY.equals(value);
    }
}
