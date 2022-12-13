import Dados.Aluno;

class Queue {
    private int inicio, fim, qtdeElementos;
    private static int TAMANHO = 4;
    private Aluno[] armazenado;

    public Queue() {
        inicio = fim = -1;
        armazenado = new Aluno[TAMANHO];
        qtdeElementos = 0;
    }

    private boolean isEmpty() {
        if (qtdeElementos == 0) {
            return true;
        }
        return false;
    }

    private boolean isFull(){
        if(qtdeElementos == TAMANHO)
            return true;
        return false;
    }

    public void remove() {
        if (!isEmpty()) {
            inicio++;
            qtdeElementos--;
        }
    }

    public void print() {
        for (int i = inicio; i <= fim; i++) {
            Aluno elementos = armazenado[i];
            System.out.println(elementos);
        }
    }

    public void insert(Aluno aluno){
        if(!isFull()){
            armazenado[fim] = aluno;
            qtdeElementos++;
            fim++;
        }
        System.out.println("CHEIO!!!");
    }

    public Aluno search(int matricula) {
        for (int i = 0; i < armazenado.length; i++) {
            if (armazenado[i].getMatricula() == matricula)
                return armazenado[i];
        }
        return null;
    }
}