package com.company;

import InputString.InputString;

public class Main {

    public static void main(String[] args) {
        InputString inputObj = new InputString();
        inputObj.inputLine();
        inputObj.inputChar();
        System.out.println(inputObj.getWordWithMaxSymbols());
    }
}
