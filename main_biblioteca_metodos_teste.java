import java.util.*;
public class Projeto1BibliotecaMetodos {
	public static void main(String[] args) {
	

// •🔍Listagem de todos os livros registrados;

// •➕Adicionar uma novo livro e armazená-lo no sistema;

// •📊Exibir a quantidade total de livros registradas;

// •🔎Pesquisar um livro específico através do título;

// •🗑️Excluir um livro pelo título;

// •🚪Sair do sistema de gerenciamento de biblioteca de forma segura.
	
//System.out.println("Selecione uma das opções abaixo:\n 1) 🔍 Listagem de Livros\n 2) ➕ Adicionar uma novo livro\n 3) 📊 Exibir a quantidade total de livros\n 4) 🔎 Pesquisar um livro através do título\n 5) 🗑️ Excluir um livro pelo título\n 6) 🚪 Sair do sistema\n");

int opcao;
Scanner scan = new Scanner(System.in);
ArrayList<String> livros = new ArrayList<String>();

do {
            System.out.println("\nSelecione uma das opções abaixo:");
            System.out.println("1 - 🔍 Listagem de Livros");
            System.out.println("2 - ➕ Adicionar um novo livro");
            System.out.println("3 - 📊 Exibir a quantidade total de livros");
            System.out.println("4 - 🔎 Pesquisar um livro através do título");
            System.out.println("5 - 🗑️ Excluir um livro pelo título");
            System.out.println("6 - 🚪 Sair do sistema\n");

            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    //1Listagem de Livros
                    listarLivros(livros);
                    break;
                case 2:
                    //2Adicionar um novo livro
                    adicionarLivro(scan, livros);
                    break;
                case 3:
                    //3Exibir a quantidade total de livros
                    exibirQuantidade(livros);
                    break;
                case 4:
                    //4Pesquisar um livro através do título
                    pesquisarLivro(scan, livros);
                    break;
                case 5:
                    //5Excluir um livro pelo título
                    excluirLivro(scan, livros);
                    break;
                case 6:
                    //6Sair do sistema
                    System.out.println("Saindo do programa!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 6);

        scan.close();
    }

    // • Métodos para cada opção do sistema
    
    //1Listagem de Livros
    public static void listarLivros(ArrayList<String> livros) {
        System.out.println("Listagem de Livros:");
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            for (int i = 0; i < livros.size(); i++) {
                System.out.println((i + 1) + " - " + livros.get(i));
            }
        }
    }
    
    //2Adicionar um novo livro
    public static void adicionarLivro(Scanner scan, ArrayList<String> livros) {
        System.out.print("Digite o nome do livro: ");
        String livro = scan.nextLine();
        livro = livro.toLowerCase();
        if (livro.isEmpty()) {
            System.out.println("Erro, Nenhum livro adicionado.");
        } else {
            livros.add(livro);
            System.out.println("Livro adicionado com sucesso!");
        }
    }

    //3Exibir a quantidade total de livros
    public static void exibirQuantidade(ArrayList<String> livros) {
        System.out.println("Quantidade total de livros: " + livros.size());
    }

    //4Pesquisar um livro através do título
    public static void pesquisarLivro(Scanner scan, ArrayList<String> livros) {
        System.out.print("Digite o título do livro que deseja pesquisar: ");
        String tituloDoLivro = scan.nextLine();
        tituloDoLivro = tituloDoLivro.toLowerCase();
        if (tituloDoLivro.isEmpty() || !livros.contains(tituloDoLivro)) {
            System.out.println("Erro, Nenhum livro encontrado.");
        } else if (livros.contains(tituloDoLivro)) {
            System.out.println("Título do livro encontrado com sucesso!: " + tituloDoLivro);
        }
    }

    //5Excluir um livro pelo título
    public static void excluirLivro(Scanner scan, ArrayList<String> livros) {
        System.out.println("Digite o título do livro que deseja excluir: ");
        
        
    }  
}
        






