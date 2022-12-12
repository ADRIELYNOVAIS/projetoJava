import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Queue alunosQueue = new Queue();
        int opcao = -1;

        while (opcao < 0){
            System.out.println("\n Escolha uma opcao no sistema da biblioteca: \n");
            System.out.println("1 - Cadastro de Aluno.");
            System.out.println("2 - Cadastro de Livro.");
            System.out.println("3 - Pesquisa Aluno.");
            System.out.println("4 - Pesquisa Livro.");
            System.out.println("5 - Emprestimo.");

            opcao = scanner.nextInt();

            if (opcao == 1) {

                String nome, endereco, email;
                int matricula, telefone;
                long cpf;

                System.out.println("Digite o nome do aluno: ");
                nome = scanner.nextLine();
                scanner.nextLine();

                System.out.println("Digite matricula do aluno: ");
                matricula = scanner.nextInt();

                System.out.println("Digite o email: ");
                email = scanner.nextLine();

                System.out.println("Digite o endereco: ");
                endereco = scanner.nextLine();
                scanner.nextLine();

                System.out.println("Digite o telefone: ");
                telefone = scanner.nextInt();
                scanner.nextInt();

                System.out.println("Digite o CPF: ");
                cpf = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Data de nacimento: ");
                Data nacimento = new Data(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

                Aluno aluno = new Aluno(nome, email, endereco, matricula, telefone, cpf, nacimento);
                System.out.println(aluno);

                //alunosQueue.insert(aluno);

            } else if (opcao == 2) {

                String titulo, editora;
                int idLivro, numeroPagina, edicao;

                System.out.println("Digite o titulo: ");
                titulo = scanner.nextLine();

                System.out.println("Digite a edicao: ");
                edicao = scanner.nextInt();

                System.out.println("Digite a editora: ");
                editora = scanner.nextLine();

                System.out.println("Digite o id do livro: ");
                idLivro = scanner.nextInt();

                System.out.println("Digite o numero de paginas: ");
                numeroPagina = scanner.nextInt();

                Livro livro = new Livro(titulo, editora, idLivro, numeroPagina, edicao);
                //System.out.println(livro);

            } else if (opcao == 3) {
                //System.out.println("Digite a matricula no aluno: ");
                //System.out.println(alunosQueue.search(scanner.nextInt()));
            } else if (opcao == 4) {
            } else if (opcao == 5) {
            } else {
                System.out.println("OPCAO INVALIDA.");
            }
        }
        scanner.close();
    }
}