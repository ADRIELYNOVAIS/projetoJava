import java.util.Date;

public class EmprestimoLivro{
    
    private boolean estadoEmprestimo
    private boolean renovacao;
    private Date dataEmprestimo;
    private Date dataDevolucao;

    public void estadoEmprestimo( boolean estadoEmprestimoLivro ){
        this.estadoEmprestimo = estadoEmprestimoLivro;
    }

    public void renovacao( boolean renovacaoLivro ){
        this.renovacao = renovacaoLivro;
    }

    public void dataEmprestimo ( Date dataEmprestimoLivro ){
        this.dataEmprestimo = dataEmprestimoLivro;
    }

    public void dataDevolucao ( Date dataDevolucaoLivro ){
        this.dataDevolucao = dataDevolucaoLivro;
    }

    public boolean estadoEmprestimo(){
        return estadoEmprestimo;
    }

    public boolean renovacao(){
        return renovacao;
    }

    public Date dataEmprestimo(){
        return dataEmprestimo;
    }

    public Date dataDevolucao(){
        return dataDevolucao;
    }

    /* public String imprimeSituacaoLivro(){
        String texto;

        texto = "Estado do emprestimo: " + estadoEmprestimo + "\n Tem renovação? " + renovacao + "\n Data emprestimo: " + dataEmprestimo + "\n Data devolução: " + dataDevolucao;
        return texto;
    } */

}