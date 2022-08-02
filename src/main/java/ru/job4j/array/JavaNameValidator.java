package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean res = true;
        int symbol = name.codePointAt(0);
        if (symbol > 47 && symbol < 58) {
            res = false;
        }
        return res;
    }
}
