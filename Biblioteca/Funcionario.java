public class Funcionario {
    private String nome;
    private String cpf;
    

    Funcionario(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }      
    public void setNome(String nome){
        this.nome = nome;
    }
    public getNome(){
        return nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public getCpf() {
        return cpf;
    }

}