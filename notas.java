import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
       
        String [] nome = new String [5];
        double [] notas = new double[5];
        int x = 0;
        Scanner scanner = new Scanner(System.in);

        while (x < 5) {
            System.out.println("Dados do Aluno: " + (x + 1));

            System.out.println("Nome: ");
            nome[x] = scanner.nextLine();

            System.out.println("Nota: ");
            //notas [x] = scanner.nextDouble();
            notas [x] = Double.valueOf(scanner.nextLine());

            x++;
        }
        double somaNotas = 0, MediaGeral = 0;
        for (x = 0; x < 5; x++){
            System.out.println("Aluno: " + x + " : " + nome[x] + ", Nota: " + notas[x]);
            somaNotas += notas[x];
        }
        MediaGeral = somaNotas / 5;
        System.out.println("Media geral da turma: " + MediaGeral);
        
    }
    
}
