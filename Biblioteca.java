import java.util.Scanner;
import Arvore.Tree;
import Arvore.TreeLivro;
import Dados.Aluno;
import Dados.Data;

public class Biblioteca {

    private int buscaMatricula;
    private Aluno aluno;
    protected Scanner scanner = new Scanner(System.in);
    protected Scanner scannerStrings = new Scanner(System.in);

    protected String nome, endereco, email;
    protected int telefone;
    protected long cpf;

    Tree arv = new Tree();
    TreeLivro arvLivro = new TreeLivro();

    public void cadatroAluno() {

        System.out.print("Digite matricula do aluno: ");
        buscaMatricula = scanner.nextInt();

        if (!jaExiste(buscaMatricula)) {
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

    public void excluirAluno() {
        System.out.print("\n Informe a matricula do aluno para remover -> ");
        buscaMatricula = scanner.nextInt();

        if (!arv.remover(buscaMatricula))
            System.out.print("\n Aluno nao encontrado!");
        else
            System.out.println("Aluno excluido com sucesso.");
    }

    public void alterarAluno() {
        Aluno auxAluno = new Aluno();

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

    public void buscarAluno() {
        Aluno auxAluno = new Aluno();

        System.out.print("\n Informe a matricula -> ");
        buscaMatricula = scanner.nextInt();

        if ((auxAluno = arv.buscar(buscaMatricula)) != null) {
            System.out.print("\n Aluno encontrado");
            System.out.println(auxAluno.toStringLong());
        } else
            System.out.print("\n Aluno nao encontrado!");
    }

    public void imprimirArvore() {
        arv.caminhar();
    }

    //verifica se ja tem alguem com a matricula passada por parametro.
    private boolean jaExiste(int buscaMatricula) {
        if (arv.buscar(buscaMatricula) != null) {
            return true;
        }
        return false;
    }

    public void cadastroLivro(){
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

        //Livro livro = new Livro(titulo, editora, idLivro, numeroPagina, edicao);
        // System.out.println(livro);
    }
}