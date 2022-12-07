class Queue {
    private int inicio, fim, qtdeElementos;
    private static int TAMANHO = 4;
    private Livro[] livroArmazenado;

    public Queue() {
        inicio = fim = -1;
        livroArmazenado = new Livro[TAMANHO];
        qtdeElementos = 0;
    }

    private boolean isEmpty() {
        if (qtdeElementos == 0) {
            return true;
        }
        return false;
    }

    private boolean isFull() {
        if (qtdeElementos == TAMANHO - 1) {
            return true;
        }
        return false;
    }

    public void insert(Livro elementLivro) {
        if (!isFull()) {
            if (inicio == -1) {
                inicio = 0;
            }
            //Verificar se o livro que quero emprestar ja foi emprestado :)
            if (!elementLivro.isLent()) {
                fim++;
                livroArmazenado[fim] = elementLivro;
                qtdeElementos++;
            }
        } else
            System.out.println("ALUNO ATINGIU O NUMERO MAXIMO DE LIVROS");
    }

    public void remove() {
        if (!isEmpty()) {
            inicio++;
            qtdeElementos--;
        }
    }

    public void print() {
        for (int i = inicio; i <= fim; i++) {
            Livro elementos = livroArmazenado[i];
            System.out.println(elementos);
        }
    }
}