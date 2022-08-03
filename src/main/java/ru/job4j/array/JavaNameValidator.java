package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = false;
        for (int i = 1; i < name.length(); i++) {
            int code = name.codePointAt(i);
            if (isUpperLatinLetter(code) || isLowerLatinLetter(code) || isSpecialSymbol(code)) {
                valid = true;
                break;
            }
        }
        if (isFirsCharNotLowerLatinLetterAndEmpty(name)) {
            valid = false;
        }
        return valid;
    }

    public static boolean isFirsCharNotLowerLatinLetterAndEmpty(String name) {
        return (name.isEmpty() || !isLowerLatinLetter(name.codePointAt(0)));
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code > 64 && code < 91;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code > 96 && code < 123;
    }
}
