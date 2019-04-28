package com.sergeichykanton.match;

import com.sergeichykanton.match.matcher.SelectMatcher;

public class MatchApplication {

    public static void main(String[] args) {
       SelectMatcher.getInstance().select();
    }
}
