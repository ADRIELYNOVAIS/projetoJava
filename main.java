import java.util.Calendar;

public class main {
    public static void main(String[] args) {
        Calendar hoje = Calendar.getInstance();
        Livro livro = new Livro("O conto do desesperado", null, 3235, 365, 1, null);
        Aluno aluno = new Aluno("Fulano de tal", "aquele@dominio.com", "rua dos bobos, nº 0", 20212222, 5553333, 07451,
                null);
        Data data = new Data(hoje.get(Calendar.DAY_OF_MONTH), hoje.get(Calendar.MONTH), hoje.get(Calendar.YEAR));

        EmprestimoLivro emprestimo = new EmprestimoLivro(data, livro, aluno);
        
    }
}
