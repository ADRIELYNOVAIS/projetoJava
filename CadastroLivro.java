public class CadastroLivro {
    private int codigIdentificacao, edicao, numeroPaginas;
    private String titulo, editora;

    public CadastroLivro(String tituloLivro, String editora, int codigo, int numeroP) {
        this.titulo = tituloLivro;
        this.editora = editora;
        this.codigIdentificacao = codigo;
        this.numeroPaginas = numeroP;
    }

    public CadastroLivro(String titulo, int codigo, int numeroP) {
        this.titulo = titulo;
        this.codigIdentificacao = codigo;
        this.numeroPaginas = numeroP;
    }

    public String toString() {
        String result;
        result = "INFORMACOES SOBRE O LIVRO"+ "\n" +"Titulo da obra: " + titulo + "\n" + "Edicao: " + edicao
                + "\n" + "Numero de paginas: " + numeroPaginas;
        if (editora != null) {
            result += "\n" + "Editora: " + editora;
        }
        return result;
    }
}