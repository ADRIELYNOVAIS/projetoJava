import java.util.Calendar;

public class EmprestimoLivro extends Livro {
    private Data dataEmprestimo;
    private static int RENOVACAO;

    public EmprestimoLivro(String tituloLivro, String editora, int codigo, int numeroP, int edicao, Aluno aluno,
            Data devolucao, Data emprestimo) {
        super(tituloLivro, editora, codigo, numeroP, edicao, aluno);
    }

    public EmprestimoLivro(Data a, Livro b, Aluno c){
        super(b.getTitulo(), b.getEditora(), b.getCodigIdentificacao(), b.getNumeroPaginas(), b.getEdicao(), c);
        dataEmprestimo = a;
    }

    private boolean isRigth() {
        if (RENOVACAO > 2) {
            return false;
        }
        return true;
    }

    public void devolucao() {
        dataEmprestimo.moreDays(30);
        dataEmprestimo.infoDateExt();
    }

    public void emprestimo() {
        if (super.isLent()) {
            System.out.println("LIVRO INDISPONIVEL");
            System.out.println(super.getAluno());
        }
    }

}