package InputString;

import java.util.Scanner;

public class InputString {
    String[] strArr;
    char ch;
    Scanner in = new Scanner(System.in);
    String str;

    public void inputLine() {
        System.out.print("Программа принимает строку и ищет в ней слово с символом, повторяющимся максимальное количество раз. Введите слова, разделяя их пробелами: ");
        strArr = in.nextLine().split(" ");
        if (strArr.length == 0) {
            throw new IllegalArgumentException("Вы должны ввести слова!");
        }
    }

    public void inputChar() {
        System.out.print("Введите символ, который хотите найти: ");
        ch = in.next().charAt(0);
    }

    public String getWordWithMaxSymbols() {
        int count = 0;
        int lastMax = 0;
        int max = 0;

        for (String s : strArr) {
            for (int b = 0; b < s.length(); b++) {
                if (s.charAt(b) == (ch)) {
                    count++;
                }
            }
            lastMax = count;
            if (lastMax > max) {
                max = lastMax;
                str = s;
            }
            count = 0;
        }
        return str;
    }
}
