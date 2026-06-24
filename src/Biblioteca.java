import java.util.ArrayList;
import java.util.Objects;

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

    public void cadastrarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Ano: " + livro.getAno());
            System.out.println("Disponível: " + livro.isDisponivel());
        }
    }

    public Livro buscarLivro(String titulo){
        for(Livro livro : livros){
            if(livro.getTitulo().equals(titulo)){
                return livro;
            }
        }
        return null;
    }

    public Usuario buscarUsuario(int id) {
        for(Usuario usuario : usuarios){
            if(usuario.getId() == id){
                return usuario;
            }
        }
        return null;
    }

    public void empestrarLivro(int id, String titulo){
        Usuario usuario = buscarUsuario(id);
        Livro livro = buscarLivro(titulo);
                if(usuario != null && livro != null){
                    if (livro.isDisponivel()){
                        livro.setDisponivel(false);
                        System.out.println("Livro emprestado com sucesso!");
                    } else {
                        System.out.println("Livro já foi emprestado!");
                    }
                } else {
                    System.out.println("Usuario/Livro não encontrado.");
                }
            }
        }