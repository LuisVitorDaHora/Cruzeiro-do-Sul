import java.util.Scanner;

public class notas_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num_alunos = 20;
        int alunosAprovados = 0;
        int alunosExame = 0;
        int alunosReprovados = 0;
        double somaNotas = 0;

        for (int i = 0; i < num_alunos; i++){
            System.out.print("Digite a nota do aluno " + (i + 1) + " (0 a 10): ");
            double nota = scanner.nextDouble();

            System.out.print("Digite o número de faltas do aluno " + (i + 1) + ": ");
            int faltas = scanner.nextInt();

            somaNotas += nota;

            if (nota >= 6) {
                alunosAprovados++;
            } else if (nota >= 3) {
                alunosExame++;
            } else  if (faltas > 15) {
                alunosReprovados++;
            }
        }
        double media =somaNotas / num_alunos;

        System.out.println("Quantidade de alunos aprovados: " + alunosAprovados);
        System.out.println("Quantidade de alunos em exame: " + alunosExame);
        System.out.println("Quantidade de alunos reprovados: " + alunosReprovados);
        System.out.printf("Média das notas da turma: %.2f\n", media);

        scanner.close();
    }
}
