package com.sergeichykanton.match.parser;

public interface Parser<T,V> {

    V parse(T inputLine, T regex);
}
