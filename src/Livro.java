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
    }