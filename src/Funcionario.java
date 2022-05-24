public class Funcionario{

    private String nome;
    private String cpf;
    private String dataNascimento;
    private int idFuncionario;

//-----------------------------------------------

    public Funcionario(){
        nome = "";
        cpf = "";
        dataNascimento = "";
        idFuncionario = 0;
    }
//-----------------------------------------------

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public String getDataNascimento(){
        return dataNascimento;
    }

    public int getIdFuncionario(){
        return idFuncionario;
    }

//-----------------------------------------------

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public void setIdFuncionario(int idFuncionario){
        this.idFuncionario = idFuncionario;
    }

}

