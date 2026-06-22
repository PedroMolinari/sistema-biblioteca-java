public class Usuario {
    private int id;
    private String nome;
    private String senha;

    public Usuario(
            String nome,
            int id,
            String senha
    ) {
        this.nome = nome;
        this.id = id;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public int getId() {
        return id;
    }
}
