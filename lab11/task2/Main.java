package lab11.task2;

import lab3.task2.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Main {
    public static Object[] method(Object[] objects, Method methods, Object[] param) throws InvocationTargetException, IllegalAccessException {
        ArrayList<Object> result = new ArrayList<Object>();
        for (Object object: objects){
            if (param == null) {
                result.add(methods.invoke(object));
            }
            else {
                result.add(methods.invoke(object, param));
            }
        }
        return result.toArray();
    }

    public static Object[] secondMethod(Class myClass, String returnStr){
        ArrayList<Method> methods = new ArrayList<Method>();
        for (Method method: myClass.getDeclaredMethods()){
            if (method.getReturnType().getName().equals(returnStr)){
                methods.add(method);
            }
        }
        return methods.toArray();
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Object[] objects = new Object[5];
        objects[0] = new Train();
        objects[1] = new Wagon();
        objects[2] = new Passenger();
        objects[3] = new String("abc");
        objects[4] = new CashBox();

        System.out.println("2.1");
        for (Object res: method(objects, Object.class.getMethod("toString"), null)){
            System.out.println(res);
        }

        System.out.println("2.2");
        Ticket t = new Ticket();
        for (Object method: secondMethod(t.getClass(), "int")){
            System.out.println(method);
        }
        CashBox csh = new CashBox();
        for (Object method: secondMethod(csh.getClass(), "void")){
            System.out.println(method);
        }
    }
}
