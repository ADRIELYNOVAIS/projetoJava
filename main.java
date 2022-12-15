import java.util.Scanner;

public class main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        // Queue alunosQueue = new Queue();
        int opcao = -1;

        do {
            System.out.println("\n Escolha uma opcao no sistema da biblioteca: \n");
            System.out.println("1 - Aluno.");
            System.out.println("2 - Cadastro de Livro.");
            System.out.println("3 - Pesquisa Aluno.");
            System.out.println("4 - Pesquisa Livro.");
            System.out.println("5 - Emprestimo.");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: {

                    System.out.print("\n**********************************");
                    System.out.print("\nEntre com a opcao:");
                    System.out.print("\n ----1: Inserir aluno");
                    System.out.print("\n ----2: Excluir aluno");
                    System.out.print("\n ----3: Pesquisar aluno");
                    System.out.print("\n ----4: Exibir alunos");
                    System.out.print("\n ----5: Atualizar aluno");
                    System.out.print("\n ----6: Sair do programa");
                    System.out.print("\n***********************************");
                    System.out.print("\n-> ");

                    opcao = scanner.nextInt();

                    if(opcao == 1){
                        biblioteca.cadatroAluno();
                    }
                    break;
                }
                case 2: {
                    break;
                }
            }
        } while (opcao < 0);
        scanner.close();
    }
}