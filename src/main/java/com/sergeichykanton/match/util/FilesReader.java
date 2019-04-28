package com.sergeichykanton.match.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class FilesReader {

    public static List<String> read(String fileName) {
        List<String> lines = null;
        try {
            lines = Files.readAllLines(Paths.get(ConstantUtil.SRC, ConstantUtil.MAIN, ConstantUtil.RESOURCES,
                    ConstantUtil.PATH, fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lines;
    }
}
