public class CadastroLivro {
    private int codigIdentificacao, edicao, numeroPaginas;
    private String titulo, editora;

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

    public CadastroLivro(String tituloLivro, int codigo, int numeroP, int edicao) {
        this(tituloLivro, null, codigo, numeroP, edicao);
    }

    public CadastroLivro(String tituloLivro, String editora,int codigo, int numeroP, int edicao){
        this.titulo = tituloLivro;
        this.editora = editora;
        this.codigIdentificacao = codigo;
        this.numeroPaginas = numeroP;
        this.edicao = edicao;
    }

    public String toString() {
        String result;
        result = "INFORMACOES SOBRE O LIVRO"+ "\n" +"Titulo da obra: " + titulo + "\n" + "Edicao: " + edicao
                + "\n" + "Numero de paginas: " + numeroPaginas + "\n" + "Codigo: " + codigIdentificacao;
        if (editora != null) {
            result += "\n" + "Editora: " + editora;
        }
        return result;
    }
}