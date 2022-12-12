public class Emprestimo extends Biblioteca{
    private Livro livro;
    private Aluno aluno;

    public Emprestimo(Livro livro, int matricula){
        this.livro = livro;
        this.aluno = 
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Aluno getAluno() {
        return aluno;
    }
    public Livro getLivro() {
        return livro;
    }
}
