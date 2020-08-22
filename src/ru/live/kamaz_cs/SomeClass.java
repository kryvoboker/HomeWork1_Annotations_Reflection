package ru.live.kamaz_cs;

import java.lang.reflect.Method;

public class SomeClass {
    public static int test(Class<?>... ls) {
        final Class<?> cls = Tester.class;
        int b = 0;
        try {
            Method[] methods = cls.getDeclaredMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(Test.class)) {
                    Test t = method.getAnnotation(Test.class);
                    b = (int) method.invoke(null, t.a(), t.b());
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return 0;
        }
        return b;
    }

}


