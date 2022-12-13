import java.util.Scanner;

import Arvore.Tree;
import Dados.Aluno;
import Dados.Data;

public class Biblioteca {
    public static void main(String[] sqrt) {

        Scanner scanner = new Scanner(System.in);
        Tree arv = new Tree();
        int opcao;
        Aluno aluno;

        do {
            System.out.print("\n**********************************");
            System.out.print("\nEntre com a opcao:");
            System.out.print("\n ----1: Inserir");
            System.out.print("\n ----2: Excluir");
            System.out.print("\n ----3: Pesquisar");
            System.out.print("\n ----4: Exibir");
            System.out.print("\n ----5: Sair do programa");
            System.out.print("\n***********************************");
            System.out.print("\n-> ");

            opcao = scanner.nextInt();
            switch (opcao) {
                case 1: {

                    String nome, endereco, email;
                    int matricula, telefone;
                    long cpf;

                    System.out.print("Digite o nome do aluno -> ");
                    nome = scanner.next();

                    System.out.print("Digite matricula do aluno: ");
                    matricula = scanner.nextInt();

                    System.out.print("Digite o email: ");
                    email = scanner.next();

                    System.out.print("Digite o endereco: ");
                    endereco = scanner.next();

                    System.out.print("Digite o telefone: ");
                    telefone = scanner.nextInt();

                    System.out.print("Digite o CPF: ");
                    cpf = scanner.nextLong();

                    System.out.print("Data de nacimento (no formato xx xx xxxx) ");
                    Data nacimento = new Data(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

                    aluno = new Aluno(nome, email, endereco, matricula, telefone, cpf, nacimento);
                    arv.inserir(aluno);
                    System.out.println(aluno.toStringLong());
                    break;
                }
                case 2: {
                    /*
                     * System.out.print("\n Informe o valor (long) -> ");
                     * x = scanner.nextLong();
                     * if (!arv.remover(x))
                     * System.out.print("\n Valor nao encontrado!");
                     * ;
                     * //
                     */
                    break;
                }
                case 3: {
                    Aluno auxAluno = new Aluno();

                    System.out.print("\n Informe a matricula -> ");
                    auxAluno.setMatricula(scanner.nextInt());
                    if ((auxAluno = arv.buscar(auxAluno.getMatricula())) != null) {
                        System.out.print("\n Valor Encontrado");
                        System.out.println(auxAluno.toStringLong());
                    } else
                        System.out.print("\n Valor nao encontrado!");

                    break;
                }
                case 4: {
                    arv.caminhar();
                    break;
                }
            } // fim switch
        } while (opcao != 5);

        scanner.close();
    }
}