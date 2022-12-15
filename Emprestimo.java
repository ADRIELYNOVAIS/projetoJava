import java.util.Scanner;
import java.util.Calendar;
import Dados.Aluno;
import Dados.Data;
import Dados.Livro;

public class Emprestimo {

    Data dataEmprestimo;
    boolean estadoLivro;

    Calendar data =  Calendar.getInstance();
    Livro livro = new Livro();

        public Emprestimo getEmprestimo(){

              dataEmprestimo.setDay(data.get(Calendar.DAY_OF_MONTH));
              dataEmprestimo.setMonth(data.get(Calendar.MONTH));
              dataEmprestimo.setYear(data.get(Calendar.YEAR));
              livro.setDataEmprestimo( dataEmprestimo );
              estadoLivro = false; 
              
              return getEmprestimo();
          
          } 
        
}