public class Livro {
    private int codigIdentificacao, edicao, numeroPaginas;
    private String titulo, editora;
    private Aluno aluno;

    //Construtores
    public Livro(String tituloLivro, int codigo, int numeroP, int edicao) {
        this(tituloLivro, null, codigo, numeroP, edicao, null);
    }

    public Livro(String tituloLivro, String editora,int codigo, int numeroP, int edicao, Aluno aluno){
        this.titulo = tituloLivro;
        this.editora = editora;
        this.codigIdentificacao = codigo;
        this.numeroPaginas = numeroP;
        this.edicao = edicao;
        this.aluno = aluno;
    }

    //Gette's
    public int getCodigIdentificacao() {
        return codigIdentificacao;
    }
    public int getEdicao() {
        return edicao;
    }
    public String getEditora() {
        return editora;
    }
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    public String getTitulo() {
        return titulo;
    }
    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    //Verificação
    public boolean isLent(){
        if (aluno == null) return false;
        return true;
    }

    //Impressao da informação
    public String toString(){
        String result;
        result = "INFORMACOES SOBRE O LIVRO"+ "\n" +"Titulo da obra: " + titulo + "\n" + "Edicao: " + edicao
                + "\n" + "Numero de paginas: " + numeroPaginas + "\n" + "Codigo: " + codigIdentificacao;
        if (editora != null) {
            result += "\n" + "Editora: " + editora;
        }
        return result;
    }
}