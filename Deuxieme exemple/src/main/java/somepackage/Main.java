package somepackage;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        String packageName = "some";
        packageName += "package";
        Class clazz = Class.forName(packageName + ".OtherClass");
        Method method = clazz.getMethod("someMethod");
        System.out.println(method.invoke(clazz.newInstance()));
    }
}
