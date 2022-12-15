package Dados;
public class Aluno{

    private String nome, email, endereco;
    private int matricula, telefone;
    private long cpf;
    private Data dataNascimento;
    //private Livro livro;
    
    //Construtor
    public Aluno(String nome, String email, String endereco, int matricula, int telefone, long cpf,
            Data dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.matricula = matricula;
        this.telefone = telefone;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }
    //Construtor para cadastro do aluno
    public Aluno(String nomeString, String emailString, int matriculaInt, int telefoneInt, Long cpfLong, Data dataNascimento){
        this(nomeString, emailString, emailString, matriculaInt, telefoneInt, telefoneInt, dataNascimento);
    }

    //public Aluno (){}

    //Getter's
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getTelefone() {
        return telefone;
    }

    public long getCpf() {
        return cpf;
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }

    //Setter's
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public boolean equals(Aluno obj){
        if(this == obj){
            return true;
        }else if (this.matricula == obj.matricula){
            return true;
        }
        return false;
    }
    //Impressão
    public String toString(){
        return "Nome: " + nome + "\n" + "Matricula: " + matricula;
    }
    
    public String toStringLong(){
        return "Nome: " + nome + "\n" + "CPF: " + cpf + "\n" + "Data de nascimento: " 
        + dataNascimento.infoDateExt() + "\n" + "Matricula: " + matricula + "\n" + "Telefone: " + telefone + "\n" + 
        "Endereco: " + endereco + "\n" + "E-mail: " + email;
    }
    

    /*RFU3.1- O Deve ser possível incluir, visualizar, alterar e excluir um aluno no
cadastro da biblioteca. E para realizar o cadastro de um aluno, o aluno deve
informar o seu nome completo, CPF, fone, data de nascimento, e-mail, endereço,
turma, número de matrícula e senha.
RGN3.1.1- Deve ser possível pesquisar um aluno através do seu nome ou de
sua turma.
RFU3.2.1- A O vínculo do aluno com a turma será feito a partir do número de
matrícula, pois assim não precisará renovar o cadastro dele na biblioteca*/


}