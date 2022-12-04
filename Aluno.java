import java.util.Date;

public class Aluno{

    private String nome, email, endereco;
    private int matricula, telefone,cpf;
    private Date dataNascimento;
    
    public void nome( String nomeAluno){
        this.nome = nomeAluno;
    }

    public void matricula( int matriculaAluno ){
        this.matricula = matriculaAluno;
    }

    public void dataNascimento( Date dataNascimentoAluno ){
        this.dataNascimento = dataNascimentoAluno;
    }

    public void email( String emailAluno ){
        this.email = emailAluno;
    }

    public void endereco( String enderecoAluno ){
        this.endereco = enderecoAluno;
    }

    public void telefone( int telefoneAluno ){
        this.telefone = telefoneAluno;
    }

    public void cpf( int cpfAluno ){
        this.cpf = cpfAluno;
    }

    public String nome(){
        return nome;
    }

    public String email(){
        return email;
    }

    public String endereco(){
        return endereco;
    }

    public int matricula(){
        return matricula;
    }

    public int telefone(){
        return telefone;
    }

    public int cpf(){
        return cpf;
    }

    public Date data(){
        return dataNascimento;
    }

    /*public String imprimeAluno(){
        String imprimir;

        imprimir = "Nome do aluno: " + nome + "\n Matricula do aluno: " + matricula + "\n Data de NAscimento do aluno" + dataNascimento + "CPF do aluno: " + cpf + "\n Telefone do aluno: " + telefone + "\n Endereco do aluno : " + endereco + "\nEmail do aluno: " + email;

        return imprimir;
    }*/

    

    /*RFU3.1- O Deve ser possível incluir, visualizar, alterar e excluir um aluno no
cadastro da biblioteca. E para realizar o cadastro de um aluno, o aluno deve
informar o seu nome completo, CPF, fone, data de nascimento, e-mail, endereço,
turma, número de matrícula e senha.
RGN3.1.1- Deve ser possível pesquisar um aluno através do seu nome ou de
sua turma.
RFU3.2.1- A O vínculo do aluno com a turma será feito a partir do número de
matrícula, pois assim não precisará renovar o cadastro dele na biblioteca*/


}