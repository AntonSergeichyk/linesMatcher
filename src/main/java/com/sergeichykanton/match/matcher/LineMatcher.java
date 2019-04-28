package com.sergeichykanton.match.matcher;

import com.sergeichykanton.match.parser.DistanceParser;
import com.sergeichykanton.match.parser.LineParser;
import com.sergeichykanton.match.util.StringUtil;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class LineMatcher {

    public static List<String> matchLineWithPattern(List<String> inputLines, List<String> patternLines) {
        ArrayList<String> resultMatch = new ArrayList<>();

        for (String inputLine : inputLines) {
            for (String patternLine : patternLines) {
                String result = LineParser.getINSTANCE().parse(inputLine, patternLine);
                if (!StringUtil.isEmpty(result)) {
                    resultMatch.add(result);
                }
            }
        }

        return resultMatch;
    }

    public static List<String> getLineWithMinEditDistance(List<String> inputLines, List<String> patternLines) {
        ArrayList<String> resultMatch = new ArrayList<>();

        for (String inputLine : inputLines) {
            for (String patternLine : patternLines) {
                int editDistance = DistanceParser.getINSTANCE().parse(inputLine, patternLine);
                if (editDistance <= 1) {
                    resultMatch.add(inputLine);
                }
            }
        }

        return resultMatch;
    }
}
