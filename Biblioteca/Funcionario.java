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
    public String getNome(){
        return nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }
    public static void add(Funcionario funcionario) {
    }

}