package somepackage;

public class Main {

    public static void main(String[] args)  {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        boolean ressourceIsFound = classLoader.getResource("file.txt") != null;
        if(ressourceIsFound) {
            System.out.println("La ressource existe");
        }else{
            System.out.println("La ressource n'a pas été trouvée");
        }
    }
}
