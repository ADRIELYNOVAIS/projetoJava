public class Livro{
    private int codigIdentificacao, edicao, numeroPaginas;
    private String titulo, editora;
    private Data dataEmprestimo;
    private Aluno aluno;
    private static int renovacoes;

    //Construtores
    public Livro (String tituloLivro, String editora, int codigo, int numeroP, int edicao, Data dataEmprestimo){
        this.titulo = tituloLivro;
        this.editora = editora;
        this.codigIdentificacao = codigo;
        this.numeroPaginas = numeroP;
        this.dataEmprestimo = dataEmprestimo;
    }

    public Livro (String tituloLivro, String editora, int codigo, int numeroP, int edicao){
        this(tituloLivro, codigo, numeroP, edicao);
    }

    public Livro(String tituloLivro, int codigo, int numeroP, int edicao) {
        this(tituloLivro, null, codigo, numeroP, edicao, null);
    }

    public Livro(String tituloLivro, String editora,int codigo, int numeroP){
        this(tituloLivro, codigo, numeroP, 0);
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
    public Data getData(){
        return dataEmprestimo;
    }
    public int getRenovacoes() {
        return renovacoes;
    }
    public Aluno getAluno() {
        return aluno;
    }

    //Setter's
    public void setCodigIdentificacao(int codigIdentificacao) {
        this.codigIdentificacao = codigIdentificacao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
    public void setDataEmprestimo(Data dataEmprestimo){
        this.dataEmprestimo = dataEmprestimo;
    }
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public boolean renovar(){
        if(renovacoes < 1){
            renovacoes++;
            dataEmprestimo.moreDays(10);
            return true;
        }
        return false;
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