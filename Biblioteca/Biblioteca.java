import java.util.ArrayList;
import java.util.List;
public class Biblioteca {
    private String nome;
    private Dono dono;
    private List<Livro> livro = new ArrayList<>();
    private List<Funcionario> funcionario = new ArrayList<>();

    public Biblioteca(String nome, Dono dono) {
        this.nome = nome;
        this.dono = dono;
    }
    public List<Livro> getLivros() {
        return livro;
    }
    public void setLivros(List<Livro> livro) {
        this.livro = livro;
    }
    public void addLivro(Livro livro){
        Livro.add(livro);
    }
    public List<Funcionario> getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(List<Funcionario> funcionario) {
        this.funcionario = funcionario;
    }
    public void addFuncionario(Funcionario funcionario){
        Funcionario.add(funcionario);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Dono getDono() {
        return dono;
    }
    public void setDono(Dono dono) {
        this.dono = dono;
    }
    public void mostrarLivros() {
        for(int i=0; i<livro.size(); i++) {
            System.out.println(livro.get(i).getNome());
            System.out.println(livro.get(i).getAutor());
            System.out.println(livro.get(i).getAno());
        }
    }
    public void mostrarFuncionarios() {
        for(int i=0; i<funcionario.size(); i++) {
            System.out.println(funcionario.get(i).getNome());
            System.out.println(funcionario.get(i).getCpf());
        }
    }
}