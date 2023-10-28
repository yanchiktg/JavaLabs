package lab11.task1;

import lab3.task2.*;
import lab9.FileCollection;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Ticket ticket = new Ticket();

        System.out.println("-----------------------------");
        Field[] fieldsT = ticket.getClass().getDeclaredFields();
        for (Field field: fieldsT){
            System.out.println(field);
        }
        System.out.println("-----------------------------");









































        System.out.println("доступные методы класса");
//        int num = ticket.getPrice();
//        System.out.println(num);
        Method[] methods = ticket.getClass().getMethods();
        for (Method method: methods){
            System.out.println(method);
        }

        System.out.println("доступные поля класса");
        Field[] fields = ticket.getClass().getFields();
        for (Field field: fields){
            System.out.println(field);
        }
        System.out.println("заданные методы");
        Method[] setMethods = ticket.getClass().getDeclaredMethods();
        for (Method method: setMethods){
            System.out.println(method);
        }

        System.out.println("поля класса");
        Field[] declaredFields = ticket.getClass().getDeclaredFields();
        for (Field field: declaredFields){
            System.out.println(field);
        }

        Object[] objects = new Object[5];
        objects[0] = new Train();
        objects[1] = new Wagon();
        objects[2] = new Passenger();
        objects[3] = new String("abc");
        objects[4] = new CashBox();

        System.out.println("информация о классе каждого объекта в файл");
        FileWriter fileWriter = new FileWriter("file_11.txt");
//        Class[] classes = new Class[5];
//        for (int i = 0; i < 5; i++) {
//            classes[i] = objects[i].getClass();
//        }
        for (Object object: objects){
            fileWriter.write(String.valueOf(object.getClass().getName()));
            fileWriter.write("\n");
        }
        fileWriter.close();

        System.out.println("экземпляры данных классов");
        ArrayList<String> list = new ArrayList<String>();
        FileReader reader = new FileReader("file_11.txt");
        Scanner fileReader = new Scanner(reader);
        while (fileReader.hasNextLine()){
            list.add(fileReader.nextLine());
        }

        reader.close();

        Object[] massiv = new Object[list.size()];
        for (int i = 0; i < list.size(); i++){
            //System.out.println("list: " + list);
            massiv[i] = Class.forName(String.valueOf(list.get(i))).newInstance();
            System.out.println("mas: " + massiv[i]);
        }

    }
}
