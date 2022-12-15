import java.util.Scanner;
import java.util.Calendar;
import Dados.Aluno;
import Dados.Data;
import Dados.Livro;

public class Emprestimo {
  
  public static void main( String [] args ) {

    Data dataEmprestimo;
    boolean estadoLivro;
    

    Scanner scanner = new Scanner( System.in );
    Calendar data =  Calendar.getInstance();

    Aluno aluno = new Aluno();
    Livro livro = new Livro();

    Emprestimo( Boolean estadoLivro , Data dataEmprestimo ) {

      this.estadoLivro = estadoLivro;
      this.dataEmprestimo = dataEmprestimo;

    }

    public void estadoLivro( boolean estadoLivro ) {

       this.estadoLivro = estadoLivro;

    }
    
    public boolean getEstadoLivro() {

      return estadoLivro;

    }

    System.out.println( "  EMPRESTIMO  \n Escolha uma opcão: \n" );
    System.out.println( " 1 - Novo " );
    System.out.println( " 2 - Renovar " );

    int opcao = scanner.nextInt();

    if( opcao == 1 ) {

     System.out.println( "Informe a matricula do aluno " );
     int idAluno = scanner.nextInt();
     scanner.nextLine();

      if ( idAluno == aluno.getMatricula() ) {

          //aluno nao estaa afastado -- pesquisa se o aluno existe
          System.out.println( "Informe o codigo de identificacao do livro :" );
          int idLivro = scanner.nextInt();
      
          if( idLivro == livro.getCodigIdentificacao() ) {

              dataEmprestimo.setDay(data.get(Calendar.DAY_OF_MONTH));
              dataEmprestimo.setMonth(data.get(Calendar.MONTH));
              dataEmprestimo.setYear(data.get(Calendar.YEAR));
              livro.setDataEmprestimo( dataEmprestimo );
              Emprestimo.getStatusLivro = false; // mudou o status para indisponivel
          
          } else {

              System.out.println( "Livro nao disponivel para emprestimo" );   
                
                 }
        } else {        
            System.out.println( "E preciso cadastrar o aluno no sistema" ); 
              } 

      }

      if( opcao == 2 ) {

        livro.getRenovacoes();

      } else
          System.out.println(" opcao invalida ");
     
    scanner.close();
}

}