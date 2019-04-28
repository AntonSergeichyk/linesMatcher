package com.sergeichykanton.match.parser;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

import java.util.Arrays;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class DistanceParser implements Parser<String,Integer> {

    private static final DistanceParser INSTANCE = new DistanceParser();
    private static final int DEFAULT_VALUE = -1;
    private static final int INDEX_FIRST_SYMBOL = 0;

    @Override
    public Integer parse(String inputLine, String regex) {
        int[][] distances = new int[inputLine.length()][regex.length()];
        for (int[] distance : distances) {
            Arrays.fill(distance, DEFAULT_VALUE);
        }

        return calDistance(inputLine, regex, distances, inputLine.length() - 1, regex.length() - 1);
    }

    private int calDistance(String inputLine, String regex, int[][] distances, int currIndLine, int currIndRegex) {
        if (currIndLine < INDEX_FIRST_SYMBOL) {
            return currIndRegex + 1;
        } else if (currIndRegex < 0) {
            return currIndLine + 1;
        }

        if (distances[currIndLine][currIndRegex] != DEFAULT_VALUE) {
            return distances[currIndLine][currIndRegex];
        }

        if (inputLine.charAt(currIndLine) == regex.charAt(currIndRegex)) {
            distances[currIndLine][currIndRegex] = calDistance(inputLine, regex, distances, currIndLine - 1, currIndRegex - 1);
        } else {
            int prevMin = Math.min(calDistance(inputLine, regex, distances, currIndLine, currIndRegex - 1),
                    calDistance(inputLine, regex, distances, currIndLine - 1, currIndRegex));
            prevMin = Math.min(prevMin, calDistance(inputLine, regex, distances, currIndLine - 1, currIndRegex - 1));
            distances[currIndLine][currIndRegex] = 1 + prevMin;
        }

        return distances[currIndLine][currIndRegex];
    }

    public static DistanceParser getINSTANCE() {
        return INSTANCE;
    }
}
