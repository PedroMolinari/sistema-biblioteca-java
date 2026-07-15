import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

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
            System.out.println("7 - Buscar livro");
            System.out.println("0 - Sair");
            System.out.print("=============================");
            System.out.print("\nEscolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o Título: ");
                    String titulo = scanner.nextLine();
                    System.out.println("Digite o Autor: ");
                    String autor = scanner.nextLine();
                    System.out.println("Digite o Ano: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite o Identificador: ");
                    String identificador = scanner.nextLine();

                    Livro novoLivro = new Livro(
                            titulo,
                            autor,
                            ano,
                            identificador
                    );

                    biblioteca.cadastrarLivro(novoLivro);

                    System.out.println("Livro cadastrado com sucesso!");

                    break;
                case 2:
                    System.out.println("Digite o nome do usuário:");
                    String usurname = scanner.nextLine();
                    System.out.println("Digite um Id para o usuário:");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite uma senha para o usuário");
                    String senha = scanner.nextLine();

                    Usuario novoUsuario = new Usuario(
                            usurname,
                            id,
                            senha
                    );

                    biblioteca.cadastrarUsuario(novoUsuario);
                    System.out.println("Usuário cadastrado com sucesso!");

                    break;
                case 3:
                    biblioteca.listarLivros();
                    break;
                case 4:
                    System.out.println("Digite o ID do usuário: ");
                    int emprestarId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite o título do livro:");
                    String emprestarTitulo = scanner.nextLine();

                    biblioteca.emprestarLivro(
                            emprestarId,
                            emprestarTitulo
                    );

                    break;
                case 5:
                    System.out.println("Digite o ID do usuário: ");
                    int devolverId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite o título do livro:");
                    String devolverTitulo = scanner.nextLine();

                    biblioteca.devolverLivro(
                            devolverId,
                            devolverTitulo
                    );
                    break;
                case 6:
                    biblioteca.relatorio();
                    break;
                case 7:
                    System.out.println("Digite o título:");
                    String tituloBusca = scanner.nextLine();

                    Livro livroEncontrado = biblioteca.buscarLivro(
                            tituloBusca
                    );

                    if(livroEncontrado != null){
                        System.out.println("\nTítulo: " + livroEncontrado.getTitulo());
                        System.out.println("Autor: " + livroEncontrado.getAutor());
                        System.out.println("Ano: " + livroEncontrado.getAno());
                        System.out.println("Identificador: " + livroEncontrado.getIdentificador());
                        if(livroEncontrado.isDisponivel()){
                            System.out.println("Status: Disponível");
                        } else {
                            System.out.println("Status: Emprestado");
                        }
                        System.out.println();
                    } else {
                        System.out.println("Livro não encontrado!");
                    }
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