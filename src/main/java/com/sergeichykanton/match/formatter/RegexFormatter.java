package com.sergeichykanton.match.formatter;

import java.util.List;

public interface RegexFormatter<T> {

    List<T> format(List<T> patternLines);
}
