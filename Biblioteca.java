import java.util.Scanner;
import java.util.concurrent.CancellationException;

import javax.swing.text.html.HTMLDocument.RunElement;

import Arvore.Tree;
import Arvore.TreeLivro;
import Dados.Aluno;
import Dados.Data;
import Dados.Livro;

public class Biblioteca {

    /////////////////////////// ALUNO//////////////////////////////////
    public static void cadatroAluno(Tree arv) {
        Aluno aluno;

        String nome, endereco, email;
        int telefone, buscaMatricula;
        long cpf;

        Scanner scanner = new Scanner(System.in);
        Scanner scannerStrings = new Scanner(System.in);

        System.out.print("Digite matricula do aluno: ");
        buscaMatricula = scanner.nextInt();

        if (!jaExiste(buscaMatricula, arv)) {
            System.out.print("Digite o nome do aluno -> ");
            nome = scannerStrings.nextLine();

            System.out.print("Digite o email: ");
            email = scanner.next();

            System.out.print("Digite o endereco: ");
            endereco = scannerStrings.next();

            System.out.print("Digite o telefone: ");
            telefone = scanner.nextInt();

            System.out.print("Digite o CPF: ");
            cpf = scanner.nextLong();

            System.out.print("Data de nacimento (no formato xx xx xxxx) ");
            Data nacimento = new Data(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

            aluno = new Aluno(nome, email, endereco, buscaMatricula, telefone, cpf, nacimento);
            arv.inserir(aluno);
            System.out.println(aluno.toStringLong());
        }
        System.out.println("Aluno ja tem cadastro.");
    }

    public static void excluirAluno(Tree arv) {
        int buscaMatricula;
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n Informe a matricula do aluno para remover -> ");
        buscaMatricula = scanner.nextInt();

        if (!arv.remover(buscaMatricula))
            System.out.print("\n Aluno nao encontrado!");
        else
            System.out.println("Aluno excluido com sucesso.");
    }

    public static void alterarAluno(Tree arv) {
        Aluno auxAluno = new Aluno();
        Scanner scanner = new Scanner(System.in);
        Scanner scannerStrings = new Scanner(System.in);
        int buscaMatricula;

        System.out.print("\n Informe a matricula -> ");
        buscaMatricula = scanner.nextInt();

        if ((auxAluno = arv.buscar(buscaMatricula)) != null) {
            arv.remover(buscaMatricula);// remove o aluno pra não ter duplicidade

            /*
             * Altera os dados porem, com a mesma matricula, note que
             * eu não tenho um Set pra atualizar matricula porque MATRICULA NÃO MUDA
             * (OBVIAMENTE)
             */
            System.out.println("\nDADOS ATUAIS DO ALUNO\n" + auxAluno.toStringLong());

            System.out.print("Digite o nome do aluno -> ");
            auxAluno.setNome(scannerStrings.next());

            System.out.print("Digite o email: ");
            auxAluno.setEmail(scanner.next());

            System.out.print("Digite o endereco: ");
            auxAluno.setEndereco(scannerStrings.next());

            System.out.print("Digite o telefone: ");
            auxAluno.setTelefone(scanner.nextInt());

            System.out.print("Digite o CPF: ");
            auxAluno.setCpf(scanner.nextLong());

            System.out.print("Data de nacimento (no formato xx xx xxxx) ");
            Data nacimento = new Data(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
            auxAluno.setDataNascimento(nacimento);

            arv.inserir(auxAluno);

        } else
            System.out.print("\n Aluno nao encontrado!");
    }

    public static String buscarAluno(Tree arv) {
        Aluno auxAluno = new Aluno();
        Scanner scanner = new Scanner(System.in);
        int buscaMatricula;

        System.out.print("\n Informe a matricula -> ");
        buscaMatricula = scanner.nextInt();

        if ((auxAluno = arv.buscar(buscaMatricula)) != null) {
            System.out.print("\n Aluno encontrado");
            return auxAluno.toStringLong();
        } else
            return "\n Aluno nao encontrado!";

    }

    public static void imprimirArvore(Tree arv) {
        arv.caminhar();
    }

    // verifica se ja tem alguem com a matricula passada por parametro.
    private static boolean jaExiste(int buscaMatricula, Tree arv) {
        if (arv.buscar(buscaMatricula) != null) {
            return true;
        }
        return false;
    }

    /////////////////////////// LIVRO//////////////////////////////////
    public static void cadastroLivro(TreeLivro arv) {
        String titulo, editora;
        int idLivro, numeroPagina, edicao;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o id do livro: ");
        idLivro = scanner.nextInt();

        if (!jaExiste(idLivro, arv)) {
            System.out.print("Digite a editora: ");
            editora = scanner.next();
            
            System.out.print("Digite o titulo: ");
            titulo = scanner.nextLine();

            System.out.print("Digite a edicao: ");
            edicao = scanner.nextInt();

            System.out.print("Digite o numero de paginas: ");
            numeroPagina = scanner.nextInt();

            Livro livro = new Livro(titulo, editora, idLivro, numeroPagina, edicao);
            arv.inserir(livro);
            System.out.println(livro);
        } else
            System.out.println("Livro ja cadastrado.");

    }

    public static void excluirLivro(TreeLivro arv) {
        int buscaMatricula;
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n Informe o codigo do livro para remover -> ");
        buscaMatricula = scanner.nextInt();

        if (!arv.remover(buscaMatricula))
            System.out.print("\n Livro nao encontrado!");
        else
            System.out.println("Livro excluido com sucesso.");
    }

    public static void alterarLivro(TreeLivro arv) {
        Livro auxLivro = new Livro();
        Scanner scanner = new Scanner(System.in);
        Scanner scannerStrings = new Scanner(System.in);
        int buscaId;

        System.out.print("\n Informe o codigo do livro -> ");
        buscaId = scanner.nextInt();

        if ((auxLivro = arv.buscar(buscaId)) != null) {
            arv.remover(buscaId);// remove o livro pra não ter duplicidade

            /*
             * Altera os dados porem, com o mesmo codigo, note que
             * eu não tenho um Set pra atualizar codigo porque NÃO MUDA
             */

            System.out.println("\nDADOS ATUAIS DO ALUNO\n" + auxLivro);

            System.out.print("Digite o nome do livro -> ");
            auxLivro.setTitulo(scannerStrings.next());

            System.out.print("Digite o numero da edicao ");
            auxLivro.setEdicao(scanner.nextInt());

            System.out.print("Digite o nome da editora: ");
            auxLivro.setEditora(scannerStrings.nextLine());

            System.out.print("Quantas paginas tem o livro: ");
            auxLivro.setNumeroPaginas(scanner.nextInt());

            arv.inserir(auxLivro);

        } else
            System.out.print("\n Livro nao encontrado!");
    }

    public static String buscarLivro(TreeLivro arv) {
        Livro auxLivro = new Livro();
        Scanner scanner = new Scanner(System.in);
        int buscaMatricula;

        System.out.print("\n Informe a matricula -> ");
        buscaMatricula = scanner.nextInt();

        if ((auxLivro = arv.buscar(buscaMatricula)) != null) {
            System.out.print("\n Aluno encontrado");
            return auxLivro.toString();
        } else
            return "\n Aluno nao encontrado!";

    }

    public static void imprimirArvore(TreeLivro arv) {
        arv.caminhar();
    }

    private static boolean jaExiste(int buscaMatricula, TreeLivro arv) {
        if (arv.buscar(buscaMatricula) != null) {
            return true;
        }
        return false;
    }

    /*
     * public static void cadastroEmprestimo() {
     * Scanner scanner = new Scanner(System.in);
     * Aluno aluno = new Aluno();
     * Livro livro = new Livro(endereco, email, telefone, buscaMatricula);
     * 
     * System.out.println( "Informe a matricula do aluno " );
     * int idAluno = scanner.nextInt();
     * scanner.nextLine();
     * 
     * if ( idAluno == aluno.getMatricula() ) {
     * System.out.println( "Informe o codigo de identificacao do livro :" );
     * int idLivro = scanner.nextInt();
     * 
     * if( idLivro == livro.getCodigIdentificacao() ) {
     * 
     * Emprestimo emprestimo = new Emprestimo();
     * emprestimo.getEmprestimo();
     * 
     * } else {
     * System.out.println( "Livro nao disponivel para emprestimo" );
     * }
     * } else {
     * System.out.println( "E preciso cadastrar o aluno no sistema" );
     * }
     * }
     * 
     * public static void cadastroEmprestimo() {
     * 
     * Scanner scanner = new Scanner(System.in);
     * Aluno aluno = new Aluno();
     * Livro livro = new Livro(endereco, email, telefone, buscaMatricula);
     * 
     * System.out.println( "Informe a matricula do aluno " );
     * int idAluno = scanner.nextInt();
     * scanner.nextLine();
     * 
     * if ( idAluno == aluno.getMatricula() ) {
     * System.out.println( "Informe o codigo de identificacao do livro :" );
     * int idLivro = scanner.nextInt();
     * 
     * if( idLivro == livro.getCodigIdentificacao() ) {
     * 
     * Emprestimo emprestimo = new Emprestimo();
     * emprestimo.getEmprestimo();
     * 
     * } else {
     * System.out.println( "Livro nao disponivel para emprestimo" );
     * }
     * } else {
     * System.out.println( "E preciso cadastrar o aluno no sistema" );
     * }
     * }
     */
}