import java.util.Scanner;

public class notas_alunos {
    public static void main(String[] args) {

        int qtde_alunos,x;
        double nota,totalnotas,media;

        qtde_alunos = 0;
        x = 1;
        nota = totalnotas = media = 0;

        Scanner entrada_dados = new Scanner(System.in);
        System.out.println("Programa Notas dos Alunos");
        System.out.println("-------------------------");
        

        System.out.print("Digite a quantidade de alunos: ");
        qtde_alunos = entrada_dados.nextInt();

        while (x <= qtde_alunos) {
            System.out.print("Digite nota aluno " + x + ":");
            nota = entrada_dados.nextDouble();
            if (nota >= 6) {
                System.out.println("APROVADO");
            }else {
                System.out.println("REPROVADO");
            }
            totalnotas = totalnotas + nota;
            x ++ ;
        }
        media = totalnotas/qtde_alunos;
        System.out.println("A media da sala é " + media);
    }
}
