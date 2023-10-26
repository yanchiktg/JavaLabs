package lab10;

import java.util.regex.Pattern;

/* Вариант 15
4: Написать регулярное выражение определяющее является ли данная строчка шестнадцатиричным идентификатором цвета в HTML.
Где #FFFFFF для белого, #000000 для черного, #FF0000 для красного и.т.д.
3: Написать регулярное выражение определяющее является ли заданная строка правильным MAC-адресом.
5: Написать регулярное выражение определяющее является ли данная строчка датой в формате dd/mm/yyyy.
Начиная с 1600 года до 9999 года
1: Написать регулярное выражение определяющее является ли данная строчка строкой "abcdefghijklmnopqrstuv18340" или нет.
8: Проверить является ли заданная строка шестизначным числом, записанным в десятичной системе счисления без нулей в старших разрядах.

доп: в строке должны идти 2 подряд маленькие и 2 подряд Большие буквы

 */

public class Regex {
    public static boolean colorHTML(String str){
        return Pattern.compile("^#([A-Fa-f0-9]{6})$").matcher(str).find();
    }

    public static boolean macAddress(String str){
        return Pattern.compile("^([A-Fa-f0-9]{2}[:]){5}([A-Fa-f0-9]{2})$").matcher(str).find();
    }

    public static boolean ddmmyy(String str){
        return Pattern.compile("^(((0[1-9]|[12][0-9]|3[01])[/](0[3578]|(1[02])))|((0[1-9]|[12][0-9]|30)" +
                "[/](0[1469]|(11)))|(0[1-9]|[1][0-9]|2[0-8])[/]02)[/]((?:1[6-9]|[2-9]\\d)\\d{2})$").matcher(str).find();
        //^(0[1-9]|[12][0-9]|3[01])[/](0[1-9]|1[012])[/]((?:1[6-9]|[2-9]\d)\d{2})$
    }

    public static boolean digitNumber(int num){
        return Pattern.compile("^[1-9]{3}[0-9]{3}$").matcher(Integer.toString(num)).find();
    }

    public static boolean twoLetters(String str){
        return Pattern.compile("([a-z]{2})([A-Z]{2})").matcher(str).find();
        //([a-z]{2})([A-Z]{2})
        //([a-z]{2}|[A-Z]{2}){2}
    }

    public static boolean w(String str){
        return Pattern.compile("\\W").matcher(str).find();
    }
}
