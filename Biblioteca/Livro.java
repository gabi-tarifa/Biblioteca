public class Livro {
    private String nome;
    private String autor;
    private int ano;

    Livro(String nome, String autor, int ano){
        this.nome = nome;
        this.autor = autor;
        this.ano = ano;
    }     

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAutor() {
        return autor;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getAno() {
        return ano;
    }

    public static void add(Livro livro) {
    }
}