Em um portal de cursos online, cada usuário possui um código único, representado por
um número inteiro.
Cada instrutor do portal pode ter vários cursos, sendo que um mesmo aluno pode se
matricular em quantos cursos quiser. Assim, o número total de alunos de um instrutor não
é simplesmente a soma dos alunos de todos os cursos que ele possui, pois pode haver
alunos repetidos em mais de um curso.
O instrutor Alex possui três cursos A, B e C, e deseja saber seu número total de alunos.
Seu programa deve ler os alunos dos cursos A, B e C do instrutor Alex, depois mostrar a
quantidade total e alunos dele, conforme exemplo.
```
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
```
