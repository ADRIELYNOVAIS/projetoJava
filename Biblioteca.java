import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.RunElement;

import Arvore.Tree;
import Arvore.TreeLivro;
import Dados.Aluno;
import Dados.Data;
import Dados.Livro;

public class Biblioteca {

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
            nome = scannerStrings.next();

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

    /*
     * public void cadastroLivro(Tree arv){
     * String titulo, editora;
     * int idLivro, numeroPagina, edicao;
     * 
     * System.out.println("Digite o titulo: ");
     * titulo = scanner.nextLine();
     * 
     * System.out.println("Digite a edicao: ");
     * edicao = scanner.nextInt();
     * 
     * System.out.println("Digite a editora: ");
     * editora = scanner.nextLine();
     * 
     * System.out.println("Digite o id do livro: ");
     * idLivro = scanner.nextInt();
     * 
     * System.out.println("Digite o numero de paginas: ");
     * numeroPagina = scanner.nextInt();
     * 
     * //Livro livro = new Livro(titulo, editora, idLivro, numeroPagina, edicao);
     * // System.out.println(livro);
     * }
     */

     public static void cadastroEmprestimo() {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();
        Livro livro = new Livro(endereco, email, telefone, buscaMatricula);

        System.out.println( "Informe a matricula do aluno " );
        int idAluno = scanner.nextInt();
        scanner.nextLine();

        if ( idAluno == aluno.getMatricula() ) {
            System.out.println( "Informe o codigo de identificacao do livro :" );
            int idLivro = scanner.nextInt();

            if( idLivro == livro.getCodigIdentificacao() ) {
                
                Emprestimo emprestimo = new Emprestimo();
                emprestimo.getEmprestimo();
                
            } else { 
                System.out.println( "Livro nao disponivel para emprestimo" ); 
                    }
        } else {        
             System.out.println( "E preciso cadastrar o aluno no sistema" ); 
                } 
    }

    public void cadastroEmprestimo() {

        Aluno aluno = new Aluno();
        Livro livro = new Livro(endereco, email, telefone, buscaMatricula);

        System.out.println( "Informe a matricula do aluno " );
        int idAluno = scanner.nextInt();
        scanner.nextLine();

        if ( idAluno == aluno.getMatricula() ) {
            System.out.println( "Informe o codigo de identificacao do livro :" );
            int idLivro = scanner.nextInt();

            if( idLivro == livro.getCodigIdentificacao() ) {
                
                Emprestimo emprestimo = new Emprestimo();
                emprestimo.getEmprestimo();
                
            } else { 
                System.out.println( "Livro nao disponivel para emprestimo" ); 
                    }
        } else {        
             System.out.println( "E preciso cadastrar o aluno no sistema" ); 
                } 
    }
}