package somepackage;

import java.lang.reflect.Method;

public class Main {

    static {
        // use of static initialisation :
        System.out.println("End of static initialisation");
    }

    public static void main(String[] args) throws Exception {
        // use of reflection :
        String className = "somepackage.OtherClass";
        Class clazz = Class.forName(className);
        Method method = clazz.getMethod("someMethod");
        System.out.println(method.invoke(clazz.newInstance()));

        // use of resources :
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        boolean ressourceIsFound = classLoader.getResource("file.txt") != null;
        if(ressourceIsFound) {
            System.out.println("La ressource existe");
        }else{
            System.out.println("La ressource n'a pas été trouvée");
        }
    }
}



