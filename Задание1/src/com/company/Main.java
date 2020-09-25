package com.company;

import InputString.InputString;

public class Main {

    public static void main(String[] args) {
        //TODO необходимо поработать с именами переменных, задание зачтено,
        // но в следующий раз с такими переменными отправлю на доработку
        //TODO в следующий раз использовать maven и .gitignore - без них так же не приму
        InputString inputObj = new InputString();
        inputObj.inputLine();
        inputObj.inputChar();
        System.out.println(inputObj.getWordWithMaxSymbols());
    }
}
