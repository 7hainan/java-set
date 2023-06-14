import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("How many students for course A? ");
        int courseAQuantity = sc.nextInt();
        Set<Integer> setStudents = new HashSet<>();
        int count = 1;

        do{
            setStudents.add(sc.nextInt());
            count++;
        }while( count <= courseAQuantity);

        System.out.print("How many students for course B? ");
        int courseBQuantity = sc.nextInt();
        count = 1;
        do{
            setStudents.add(sc.nextInt());
            count++;
        }while( count <= courseBQuantity);

        System.out.print("How many students for course C? ");
        int courseCQuantity = sc.nextInt();
        count = 1;
        do{
            setStudents.add(sc.nextInt());
            count++;
        }while( count <= courseCQuantity);

        System.out.println("Total students: " + setStudents.size());

        
        sc.close();
    }
}
