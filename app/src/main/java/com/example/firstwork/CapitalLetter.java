package com.example.firstwork;

import android.text.method.ReplacementTransformationMethod;

/**
 * 改变EditText字母大小写
 */
public class CapitalLetter extends ReplacementTransformationMethod {
    char[] lower = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    char[] upper = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private boolean choose;

    public CapitalLetter(boolean b) {
        this.choose = b;
    }

    @Override
    protected char[] getOriginal() {
        if (choose) {
            return lower;
        } else {
            return upper;
        }
    }

    @Override
    protected char[] getReplacement() {
        if (choose) {
            return upper;
        } else {
            return lower;
        }
    }
}
