public class Livro {
        private String autor;
        private int ano;
        private String titulo;
        private String identificador;
        private boolean disponivel = true;

        public Livro(
                String titulo,
                String autor,
                int ano,
                String identificador
        ) {
            this.titulo = titulo;
            this.autor = autor;
            this.ano = ano;
            this.identificador = identificador;
        }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}