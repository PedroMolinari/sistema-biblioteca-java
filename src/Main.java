import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        System.out.println("===== LIVROS CADASTRADOS =====");
        Livro Hobbit = new Livro(
                "O Hobbit",
                "Tolkien",
                1937,
                "H001"
        );

        Livro livro2 = new Livro(
                "Clean Code",
                "Robert Martin",
                2008,
                "CC001"
        );

        Livro livro3 = new Livro(
                "Java Efetivo",
                "Joshua Bloch",
                2018,
                "JE001"
        );

        Usuario usuario = new Usuario(
                "Pedro",
                1,
                "001"
        );

        Usuario usuario2 = new Usuario(
                "Maria",
                2,
                "002"
        );
        biblioteca.cadastrarLivro(Hobbit);
        biblioteca.cadastrarLivro(livro2);
        biblioteca.cadastrarLivro(livro3);
        biblioteca.cadastrarUsuario(usuario);
        biblioteca.cadastrarUsuario(usuario2);

        biblioteca.empestrarLivro(1, "Java Efetivo");
        biblioteca.listarLivros();
        biblioteca.relatorio();

        // Scanner
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n===== SISTEMA BIBLIOTECA =====");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Cadastrar usuário");
            System.out.println("3 - Listar livros");
            System.out.println("4 - Emprestar livro");
            System.out.println("5 - Devolver livro");
            System.out.println("6 - Relatório");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Digite o autor: ");
                    String autor = scanner.nextLine();

                    System.out.print("Digite o ano: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Digite o identificador: ");
                    String identificador = scanner.nextLine();

                    Livro livro = new Livro(
                            titulo,
                            autor,
                            ano,
                            identificador
                    );
                    biblioteca.cadastrarLivro(livro);
                    System.out.println("Livro cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("Cadastrar usuário");
                    break;
                case 3:
                    biblioteca.listarLivros();
                    break;
                case 4:
                    System.out.println("Emprestar livro");
                    break;
                case 5:
                    System.out.println("Devolver livro");
                    break;
                case 6:
                    biblioteca.relatorio();
                    break;
                case 0:
                    System.out.println("Encerrando sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}