import java.util.Scanner;
import Dados.Aluno;
import Dados.Livro;

public class main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Queue alunosQueue = new Queue();
        int opcao = -1;

        do {
            System.out.println("\n Escolha uma opcao no sistema da biblioteca: \n");
            System.out.println("1 - Aluno.");
            System.out.println("2 - Livro.");
            System.out.println("3 - Emprestimo.");
            System.out.println("0 - Sair");

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
                    System.out.print("\n***********************************");
                    System.out.print("\n-> ");
                }
                case 2: {
                    System.out.print("\n**********************************");
                    System.out.print("\nEntre com a opcao:");
                    System.out.print("\n ----1: Inserir livro");
                    System.out.print("\n ----2: Excluir livro");
                    System.out.print("\n ----3: Pesquisar livro");
                    System.out.print("\n ----4: Exibir livro");
                    System.out.print("\n ----5: Atualizar livro");
                    System.out.print("\n***********************************");
                    System.out.print("\n-> ");
                    break;
                }
                case 3: {
                    System.out.print("\n**********************************");
                    System.out.print("\nEntre com a opcao:");
                    System.out.print("\n ----1: Fazer emprestimo");
                    System.out.print("\n ----2: Renovar");
                    System.out.print("\n ----3: Excluir emprestimo");
                    System.out.print("\n***********************************");
                    System.out.print("\n-> ");

                    opcao = scanner.nextInt();

                        if( opcao == 1 ) {

                            Biblioteca biblioteca = new Biblioteca();
                            biblioteca.cadastroEmprestimo();
                            break;
                                            } 

                        else if( opcao == 2 ) {

                             Livro livro = new Livro(null, null, opcao, opcao);
                             livro.renovar();
                             break;
                                               }
                         else {
                            System.out.println(" Opcao invalida ");
                              }
                        }
                              }
                              
            } while (opcao < 0);
                scanner.close();  
            
                                            }
    
}