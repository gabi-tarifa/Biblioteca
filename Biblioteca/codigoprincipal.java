public class codigoprincipal {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("A culturada", new Dono("Carlos Moraes ", "423-937-048-03"));
        System.out.println(biblioteca.getDono().getNome() + biblioteca.getDono.getCpf());

        biblioteca.addLivro(new Livro("A Lista Negra", "Jennifer Brown", 2006));
        biblioteca.addLivro(new Livro("Diário de um suicída", "Stephan Townie", 2015));
        biblioteca.mostrarLivros();

        biblioteca.addFuncionario(new Funcionario("Carlos Endrique", "549-284-634-56"));
        biblioteca.addFuncionario(new Funcionario("Gabriel", "538-735-128-58"));
        biblioteca.mostrarFuncionarios();
    }
}
