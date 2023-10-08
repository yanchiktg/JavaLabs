package lab4;

/* Вариант 15
Задачи А:
11. Строка состоит из слов, разделенных одним или несколькими пробелами. Поменяйте местами наибольшее
по длине слово и наименьшее.
15. Для встречающихся в заданном тексте пар рядом расположенных символов указать, сколько раз встречается
в тексте каждое из таких двухбуквенных сочетаний.
19. Из текста удалить все слова заданной длины, начинающиеся на согласную букву.

Задача B:
14. Осуществлено сжатие английского текста путем замены каждой группу из двух или более рядом стоящих символов,
на один символ, за которым следует количество его вхождений в группу. К примеру,
строка hellowoooorld выглядит hel2owo4rld. Осуществить распаковку текста.
* */

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //11
        StringBuilder s1 = new StringBuilder(" asfas11111 222 33333 44444");
        task11(s1);
        System.out.println("task11: " + s1);
        System.out.println("__________________________________");
        StringBuilder s2 = new StringBuilder("aaaaasdffgh ssff zxaaacssvfff ddjhgdd oo oo oo nn");
        System.out.println("task15: " + s2);
        task15(s2);

        //19
        System.out.println("\n__________________________________");
        StringBuilder s3 = new StringBuilder("qsd sddsfds skdkd axzdfgx dgggggg qwe aa");
        task19(s3, 7);
        System.out.println("task19: " + s3);

        //B14
        System.out.println("\n__________________________________");
        StringBuilder b = new StringBuilder("heeeeeeeeeeeeeeeeeellooooowoooorld");
        taskB1(b);
        System.out.println("taskB1: " + b);

        System.out.println("__________________________________");
        StringBuilder b2 = new StringBuilder("h3e20l2o5wo4rld");
        taskB2(b2);
        System.out.println("taskB2: " + b2);
    }

    public static void taskB1(StringBuilder str){
        int j = 0, k = 0, kol = 0;
        for (int i = 0; i < str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)) {
                k = i;
                kol = 0;
                while (str.charAt(k) == str.charAt(i)){
                    i++;
                    kol++;
                    System.out.println(kol);
                }
                str.replace(k+1, k+kol, String.valueOf(kol));
                i -= kol;
            }
        }
    }

    //"h4el2o5wo4rld"
    public static void taskB2(StringBuilder str){
        for (int i = 0; i < str.length(); i++){
            int kol = 0;
            StringBuilder strChar = new StringBuilder();
            if(str.charAt(i) > 48 && str.charAt(i) < 57){
                kol = str.charAt(i) - '0';
                for (int j = 0; j < kol; j++) {
                    strChar.append(str.charAt(i-1));
                }
                System.out.println("char = " + strChar);
                str.replace(i-1, i+1, String.valueOf(strChar));
                i += kol-2;
            }
        }
    }



    public static void task15(StringBuilder str){
        int k = 0, kol = 0;
        StringBuilder letters = new StringBuilder();
        StringBuilder charPar = new StringBuilder();
        int[] kolArray = new int[str.length()];
        for (int i = 0; i < str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                letters.setLength(0);
                letters.append(str.charAt(i));
                letters.append(str.charAt(i+1));
                k = charPar.indexOf(String.valueOf(letters), 0);
                if(k >= 0){
                    kolArray[k] += 1;
                }
                else {
                    charPar.append(letters);
                    charPar.append(" ");
                    kolArray[charPar.indexOf(String.valueOf(letters))] += 1;
                    kol++;
                }
            }
        }
        System.out.println(kol);
        System.out.println("letters: " + charPar);
        for (int i = 0; i < kol*3; i += 3){
            System.out.print(kolArray[i] + " ");
        }
    }

    //1 1 2 3

    //"qsd sddsfds skdkd axzdfgx dgggggg qwe aa"
    public static void task19(StringBuilder str, int dlina){
        String copyStr = String.valueOf(str);
        String[] words = copyStr.split(" ");
        int index = -2;

        for(String w : words){
            if((w.charAt(0) != 'e' && w.charAt(0) != 'y' && w.charAt(0) != 'u' && w.charAt(0) != 'i' && w.charAt(0) != 'o' && w.charAt(0) != 'a')
                    && w.length() == dlina){
                index = str.indexOf(w);
                str.delete(index, index+w.length());
            }
        }
    }

    //"asd     dddsfds 43534 skdkd  dgggggggggggggg qwe aa\0"
    public static void task11(StringBuilder str){
        int indexFirst = 0, indexSecond = 0, lengthmax = 0, lengthmin = 1000, indexMax = 0, indexMin = 0;
        while(indexSecond != -1){

            if(indexSecond >= 0)
                indexSecond = str.indexOf(" ", indexSecond+1);
            else
                indexSecond = str.indexOf(" ", indexSecond);

            if(indexSecond == -1 && indexFirst < str.length())
                indexSecond = str.length();

            if(indexSecond - indexFirst > lengthmax) {
                if(indexFirst != 0) {
                    lengthmax = indexSecond - indexFirst - 1;
                    indexMax = indexFirst + 1;
                }
                else{
                    lengthmax = indexSecond - indexFirst;
                    indexMax = indexFirst;
                }
            }

            if((indexSecond - indexFirst - 1) < lengthmin && indexSecond - indexFirst > 1) {
                if(indexFirst != 0) {
                    lengthmin = indexSecond - indexFirst - 1;
                    indexMin = indexFirst + 1;
                }
                else {
                    lengthmin = indexSecond - indexFirst;
                    indexMin = indexFirst;
                }
            }

            indexFirst = indexSecond;
        }

        String minWord = str.substring(indexMin, indexMin+lengthmin);
        System.out.println(minWord);

        String maxWord = str.substring(indexMax, indexMax+lengthmax);
        System.out.println(maxWord);

        str.replace(indexMin, indexMin+lengthmin, maxWord);
        if(indexMax != 0 && indexMax > indexMin)        //если max меняется(сдвигается), то индекс тоже меняется
            indexMax += lengthmax - lengthmin;
        str.replace(indexMax, indexMax+lengthmax, minWord);

        System.out.println("Imin = " + indexMin);
        System.out.println("Minlength = " + lengthmin);
        System.out.println("Imax = " + indexMax);
        System.out.println("Mlength = " + lengthmax);
    }
}

