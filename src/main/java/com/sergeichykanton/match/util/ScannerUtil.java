package com.sergeichykanton.match.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ScannerUtil {

    private static Scanner SCANNER = new Scanner(System.in);

    public static Scanner get() {
        return SCANNER;
    }
}
