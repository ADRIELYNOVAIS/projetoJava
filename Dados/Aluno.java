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

    public Aluno (){
        this(null, null, null, 0, 0, 0, null);
    }

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
    
}