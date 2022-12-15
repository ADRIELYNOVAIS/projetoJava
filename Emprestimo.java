import java.util.Scanner;
import java.util.Calendar;
import Dados.Aluno;
import Dados.Data;
import Dados.Livro;

public class Emprestimo extends Livro {

    Calendar data = Calendar.getInstance();
    public Data dataEmprestimo = new Data(data.get(Calendar.DAY_OF_MONTH), data.get(Calendar.MONTH), data.get(Calendar.YEAR));
    private boolean estadoLivro;

    public Emprestimo(String tituloLivro, String editora, int codigo, int numeroP, int edicao, Data dataEmprestimo) {
        super(tituloLivro, editora, codigo, numeroP, edicao, dataEmprestimo);
    }

    public Emprestimo (){
        super(null, null, 0, 0, 0, null);
    }

    
    //Livro livro = new Livro();

    /*public void getEmprestimo() {

        super.dataEmprestimo
        .setDay(data.get(Calendar.DAY_OF_MONTH));
        dataEmprestimo.setMonth(data.get(Calendar.MONTH));
        dataEmprestimo.setYear(data.get(Calendar.YEAR));
        livro.setDataEmprestimo(dataEmprestimo);
        estadoLivro = false;

    }*/
}