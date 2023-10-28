package lab11.task3;

import lab3.task2.CashBox;
import lab3.task2.Passenger;
import lab3.task2.Stations;
import lab3.task2.Ticket;

import java.lang.reflect.*;

public class Main {
    public static String methodToString(Class myClass){
        StringBuilder str = new StringBuilder();

        str.append(Modifier.toString(myClass.getModifiers()));
        str.append(" class ");
        str.append(myClass.getSimpleName());
        if (myClass.getInterfaces().length != 0) {
            str.append(" implements ");
            for (Class interf: myClass.getInterfaces()){
                str.append(interf.getSimpleName());
                if (myClass.getInterfaces().length > 1){
                    str.append(", ");
                }
            }
        }
        str.append(" {\n");

        for (Field field: myClass.getDeclaredFields()){
            str.append("    " + Modifier.toString(field.getModifiers()) + " ");
            str.append(field.getType().getSimpleName() + " ");
            str.append(field.getName() + ";");
            str.append("\n");
        }
        str.append("\n");

        for (Method method: myClass.getDeclaredMethods()){
            str.append("    " + Modifier.toString(method.getModifiers()) + " ");
            str.append(method.getReturnType().getSimpleName() + " ");
            str.append(method.getName() + "(");

            Parameter[] parameters = method.getParameters();
            for (int i = 0; i < parameters.length; i++){
                str.append(parameters[i].getType().getSimpleName() + " " + parameters[i].getName());
                if (i < parameters.length - 1) {
                    str.append(", ");
                }
            }
            str.append("){\n");
            switch (method.getReturnType().getSimpleName()){
                case "void":
                    break;
                case "int":
                    str.append("        return 0;\n");
                    break;
                default:
                    str.append("        return null;\n");
            }
            str.append("    }\n");
        }

        str.append("\n}");

        return str.toString();
    }

    public static void main(String[] args){
        Passenger p = new Passenger();
        CashBox c = new CashBox();
        System.out.println(methodToString(c.getClass()));
        System.out.println("--------------------------");
        Stations s;
        s = Stations.GOMEL;
        System.out.println(methodToString(s.getClass()));
        System.out.println("--------------------------");
        Ticket t = new Ticket();
        System.out.println(methodToString(t.getClass()));
    }
}
