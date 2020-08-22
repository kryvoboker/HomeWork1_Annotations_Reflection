package ru.live.kamaz_cs;

import java.lang.reflect.Method;

public class SomeClass {
    public static int test(Class<?>... ls) {
        int b = 0;
        try {
            for (Class<?> cls : ls) {
                Method[] methods = cls.getDeclaredMethods();
                for (Method method : methods) {
                    if (method.isAnnotationPresent(Test.class)) {
                        b = (int) method.invoke(null, new Object[]{});
                    }
                }
            }
            return b;
        } catch (Exception ex) {
            ex.printStackTrace();
            return 0;
        }
    }

}


