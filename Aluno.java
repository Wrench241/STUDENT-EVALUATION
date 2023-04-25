import java.util.Locale;
import java.util.Scanner;
public class Aluno {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        AlunoDados aluno = new AlunoDados();
        Scanner sc = new Scanner(System.in);
        System.out.println("_STUDENT EVALUATION_\n");
        System.out.print("Nome: ");
        aluno.name = sc.next();
        sc.nextLine();
        System.out.print("nota 1: ");
        aluno.nota = sc.nextDouble();
        System.out.print("nota 2: ");
        aluno.nota2 = sc.nextDouble();
        System.out.print("nota 3: ");
        aluno.nota3 = sc.nextDouble();
        aluno.calcule();
    }
}
