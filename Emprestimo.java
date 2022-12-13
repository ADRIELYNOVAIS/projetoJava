import java.util.Scanner;

import Dados.Aluno;

public class Emprestimo extends EmprestimoLivro{

  public static void main( String [] args ) throws Exception{

    Scanner scanner = new Scanner(System.in);

    System.out.println("\n Escolha uma opcao no sistema da biblioteca: \n");
    System.out.println("1 - Aluno.");
    System.out.println("2 - Livro. ");
    System.out.println("3 - Emprestimo. ");
    
    int opcao = scanner.nextInt();

    if ( opcao == 1 ){

      Aluno aluno = new Aluno();
      aluno.nome();
      aluno.matricula();

      System.out.println("Digite o nome do aluno: ");
      String nome = scanner.nextLine();
      aluno.nome( nome );
  
      System.out.println("Digite matriucla do aluno: ");
      int matricula = scanner.nextInt();
      aluno.matricula( matricula );
      System.out.println("O nome do aluno e: " + aluno.nome() + "\n A matricula do aluno e: " + aluno.matricula() );
    
    } else if ( opcao == 2 ){
     /*
      CadastroLivro livro = new CadastroLivro(null, null, 0, 0, 0);
      livro.getTitulo();
      livro.getEdicao();
      livro.getEditora();
      livro.getCodigIdentificacao();

      System.out.println("Digite o titulo do livro: ");
      String titulo = scanner.nextLine();
      livro.getTitulo( titulo );

      System.out.println("Digite a edicao do livro: ");
      String edicao = scanner.nextLine();
      livro.getEdicao( edicao );

      System.out.println("Digite a editora do livro: ");
      String editora = scanner.nextLine();
      livro.getEditora( editora );

      System.out.println("Digite o id do livro: ");
      String idLivro = scanner.nextLine();
      livro.getCodigIdentificacao()( idLivro );
      */

    } else if ( opcao == 3 ){

    }else{
      System.out.println(" Opcao invalida ");
    } 

    //STATUS DO LIVRO
        //DATA DO EMPRESTIMO
    //RENOVAÇÃO
    //EMPRESTIMO
  }
}