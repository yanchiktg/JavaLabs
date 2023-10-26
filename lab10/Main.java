package lab10;

import java.util.regex.Pattern;

import static lab10.Regex.*;


public class Main {
    public static void main(String[] args){

        String str45 = "_";
        if (w(str45))
            System.out.println("Нет заданный символ");
        else
            System.out.println("Есть заданный символ");

        System.out.println("---------------colorHTML----------------");
        System.out.println(colorHTML("#FFFFFF"));
        System.out.println(colorHTML("7FF3421"));
        System.out.println(colorHTML("#00ff00"));
        System.out.println(colorHTML("#000000"));
        System.out.println(colorHTML("232323"));
        System.out.println(colorHTML("f#fddee"));
        System.out.println(colorHTML("#fd2"));
        System.out.println(colorHTML("1235#+)"));

        System.out.println("-----------------macAddress--------------");
        System.out.println(macAddress("01342:54:67:89:AB"));
        System.out.println(macAddress("aE:dC:cA:56:76:54"));
        System.out.println(macAddress("00:50:B6:5B:CA:6A"));
        System.out.println(macAddress("a0:11:cA:56:26:22"));
        System.out.println(macAddress("01:33:47:65:89:ab:cd"));
        System.out.println(macAddress("01:23:45:67:89:Az"));
        System.out.println(macAddress("01:23:45:67:89:"));
        System.out.println(macAddress(":23:45:67:89:Az"));

        System.out.println("--------------Str-----------------");
        String s1 = "abcdefghijklmnopqrstuv18340";
        String s2 = "abcdefghtuv18340";
        String s3 = "abcdefghijklmnoprstuv18340";
        String s4 = "abcdefghijklmnopqrstuv1834";
        System.out.println(s1.matches("abcdefghijklmnopqrstuv18340"));
        System.out.println(s2.matches("abcdefghijklmnopqrstuv18340"));
        System.out.println(s3.matches("abcdefghijklmnopqrstuv18340"));
        System.out.println(s4.matches("abcdefghijklmnopqrstuv18340"));

        System.out.println("---------------digitNumber----------------");
        int num = 123_450;
        System.out.println(digitNumber(num));
        num = 003_450;
        System.out.println(digitNumber(num));
        num = 123;
        System.out.println(digitNumber(num));
        num = 111_1111;
        System.out.println(digitNumber(num));
        num = 652_123;
        System.out.println(digitNumber(num));

        System.out.println("---------------Date----------------");
        String date = "03/02/1111";
        System.out.println(date.matches("^(((0[1-9]|[12][0-9]|3[01])[/](0[13578]|(1[02])))|((0[1-9]|[12][0-9]|30)[/]" +
                "(0[1469]|(11)))|(0[1-9]|[1][0-9]|2[0-8])[/]02)[/]((?:1[6-9]|[2-9]\\d)\\d{2})$"));
        date = "13-08-1999";
        System.out.println(date.matches("^(((0[1-9]|[12][0-9]|3[01])[/](0[3578]|(1[02])))|((0[1-9]|[12][0-9]|30)[/]" +
                "(0[1469]|(11)))|(0[1-9]|[1][0-9]|2[0-8])[/]02)[/]((?:1[6-9]|[2-9]\\d)\\d{2})$"));

        System.out.println(ddmmyy("31/11/2022"));
        System.out.println(ddmmyy("30/11/2022"));
        System.out.println(ddmmyy("28/02/2022"));
        System.out.println(ddmmyy("45/11/2022"));


        System.out.println("---------------Доп----------------");
        System.out.println(twoLetters("aaBB"));
        System.out.println(twoLetters("FscsacASCCSaaBBscdSCDCA"));
        System.out.println(twoLetters("FscsacCddCSaBBscdSCDCA"));
        System.out.println(twoLetters("aAaAaAAbBbBbBBn"));
        System.out.println(twoLetters("a"));
        System.out.println(twoLetters("aaaaaaaaaaaa"));
    }
}
