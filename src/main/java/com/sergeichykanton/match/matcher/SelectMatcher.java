package com.sergeichykanton.match.matcher;

import com.sergeichykanton.match.formatter.ContainRegexFormatter;
import com.sergeichykanton.match.formatter.ExactlyRegexFormatter;
import com.sergeichykanton.match.util.ConstantUtil;
import com.sergeichykanton.match.util.FilesReader;
import com.sergeichykanton.match.util.ScannerUtil;
import com.sergeichykanton.match.util.StringUtil;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class SelectMatcher {

    private static final SelectMatcher INSTANCE = new SelectMatcher();

    public void select() {
        StringUtil.print(ConstantUtil.FIRST_MODE);
        StringUtil.print(ConstantUtil.SECOND_MODE);
        StringUtil.print(ConstantUtil.THIRD_MODEL);
        StringUtil.print(ConstantUtil.PROGRAM_EXIT);

        while (ScannerUtil.get().hasNext()) {
            switch (ScannerUtil.get().nextInt()) {
                case 1:
                    StringUtil.print(LineMatcher.matchLineWithPattern(FilesReader.read(ConstantUtil.INPUT_TXT),
                            ExactlyRegexFormatter.getINSTANCE().format(FilesReader.read(ConstantUtil.PATTERNS_TXT))));
                    break;
                case 2:
                    StringUtil.print(LineMatcher.matchLineWithPattern(FilesReader.read(ConstantUtil.INPUT_TXT),
                            ContainRegexFormatter.getInstance().format(FilesReader.read(ConstantUtil.PATTERNS_TXT))));
                    break;
                case 3:
                    StringUtil.print(LineMatcher.getLineWithMinEditDistance(FilesReader.read(ConstantUtil.INPUT_TXT),
                            FilesReader.read(ConstantUtil.PATTERNS_TXT)));
                    break;
                case 4:
                    return;
                default:
                    StringUtil.print(ConstantUtil.ANOTHER_ATTEMPT);
            }
        }
    }

    public static SelectMatcher getInstance() {
        return INSTANCE;
    }
}
