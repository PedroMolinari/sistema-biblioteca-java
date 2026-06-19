import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;

    public Biblioteca() {
        this.livros = new ArrayList<Livro>();
        this.usuarios = new ArrayList<Usuario>();
    }

    public void cadastrarLivro(Livro livro) {
        this.livros.add(livro);
    }
}
