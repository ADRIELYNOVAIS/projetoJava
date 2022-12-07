import java.util.Date;

public class EmprestimoLivro extends Livro{
    private Data dataEmprestimo, dataDevolucao;

    public EmprestimoLivro(String tituloLivro, String editora, int codigo, int numeroP, int edicao, Aluno aluno, Data devolucao, Data emprestimo) {
        super(tituloLivro, editora, codigo, numeroP, edicao, aluno);
    }
    
}