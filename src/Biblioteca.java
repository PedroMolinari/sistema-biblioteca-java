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

    public void cadastrarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println("\nTítulo: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Ano: " + livro.getAno());
            System.out.println("Identificador: " + livro.getIdentificador());
            if(livro.isDisponivel()){
                System.out.println("Status: Disponível");
            } else {
                System.out.println("Status: Emprestado");
            }
            System.out.println();
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

    public void emprestarLivro(int id, String titulo){
        Usuario usuario = buscarUsuario(id);
        Livro livro = buscarLivro(titulo);
                if(usuario != null && livro != null){
                    if (livro.isDisponivel()){
                        livro.setDisponivel(false);
                        System.out.println("Livro emprestado com sucesso!");
                    }
                } else if (usuario != null && livro == null) {
                    System.out.println("Livro não encontrado!");
        } else if(usuario == null && livro != null){
                    System.out.println("Usuário não encontrado.");
                } else {
                    System.out.println("Usuário e Livro não encontrado");
                }
            }

    public void devolverLivro(int id, String titulo){
        Usuario usuario = buscarUsuario(id);
        Livro livro = buscarLivro(titulo);
            if (livro == null) {
                System.out.println("Livro não encontrado!");
                return;
            } if (usuario == null) {
                System.out.println("Usuário não encontrado.");
                return;
            }
            if (!livro.isDisponivel()) {
                livro.setDisponivel(true);
                System.out.println("Livro devolvido com sucesso!");
            } else if (livro.isDisponivel()) {
                System.out.println("Livro ja está disponível na biblioteca.");
            }
        }

    public void relatorio(){
        int disponiveis = 0;
        int emprestados = 0;
        System.out.println();
        System.out.println("===== RELATORIO =====");
        System.out.println("Existem " + livros.size() + " Livros" );
        System.out.println("Existem " + usuarios.size() + " Usuários");
        for (Livro livro : livros){
            if(livro.isDisponivel()){
                disponiveis++;
            } else {
                emprestados++;
            }
        }
        System.out.println("Livros Disponíveis: " + disponiveis);
        System.out.println("Livros Emprestados: " + emprestados);
        System.out.println("==================================");
    }
        }