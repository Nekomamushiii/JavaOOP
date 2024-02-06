package ReflectionAnnotationLab;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Reflection> reflection = Reflection.class;
        System.out.println(reflection);
        Class<? super Reflection> superClass = reflection.getSuperclass();
        System.out.println(superClass);
        Class[] interfaces = reflection.getInterfaces();
        for(Class anInterface: interfaces)
            System.out.println(anInterface);
        Object reflectionObject = reflection.getDeclaredConstructor().newInstance();
        System.out.println(reflectionObject);

        Method[] methods = reflection.getDeclaredMethods();
        Arrays.stream(methods).filter(e->e.getName().startsWith("get") && e.getParameterCount()==0)
                .sorted(Comparator.comparing(Method::getName)).forEach(e-> System.out.printf("%s will return class %s\n",e.getName(),e.getReturnType().getName()));

        Arrays.stream(methods).filter(e->e.getName().startsWith("set") && e.getParameterCount()==1)
                .sorted(Comparator.comparing(Method::getName)).forEach(e-> System.out.printf("%s and will set field of class %s\n",e.getName(), e.getParameterTypes()[0].getName()));

        Field[] fields = reflection.getDeclaredFields();
        Arrays.stream(fields).filter(e->!Modifier.isPrivate(e.getModifiers())).sorted(Comparator.comparing(Field::getName))
                .forEach(e-> System.out.printf("%s must be private!\n",e.getName()));

        Method[] getters = Arrays.stream(methods).filter(e->e.getName().startsWith("get") && e.getParameterCount()==0)
                .toArray(Method[]::new);
        Method[] setters = Arrays.stream(methods).filter(e->e.getName().startsWith("set")&&e.getParameterCount()==1)
                .toArray(Method[]::new);

        Arrays.stream(getters).filter(e->!Modifier.isPublic(e.getModifiers())).sorted(Comparator.comparing(Method::getName))
                .forEach(e-> System.out.printf("%s have to be public!\n",e.getName()));

        Arrays.stream(setters).filter(e->!Modifier.isPrivate(e.getModifiers())).sorted(Comparator.comparing(Method::getName))
                .forEach(e-> System.out.printf("%s have to be private!",e.getName()));
    }
}
