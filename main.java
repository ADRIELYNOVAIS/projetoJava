public class main {
    public static void main(String[] args){
        Data hoje = new Data(11,12,2022);
        Aluno aluno = new Aluno("israel", "algumacoisa.com", "rua dos bobos", 3, 88, 074, hoje);
        Livro livro = new Livro("Coisas de nerd", "flamingos",3233, 300, 1);

        //livro.setAluno(null);
        System.out.println("Antes do emprestimo: " + livro.getAluno());
        livro.setAluno(aluno);
        System.out.println("Depois do emprestimo: " + livro.getAluno());

    }
}
