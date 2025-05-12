import java.util.*;
public class Projeto1Biblioteca {
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

            switch (opcao) {
                case 1:
                    //Listagem de Livros
                    scan.nextLine(); 
                    System.out.println("Listagem de Livros:");
                    if (livros.isEmpty()) {
                        System.out.println("Nenhum livro cadastrado.");
                    } else {
                        for (int i = 0; i < livros.size(); i++) {
                            System.out.println((i + 1) + " - " + livros.get(i));
                        }
                    }
                    break;

                case 2:    
                    //Adicionar um novo livro
                    scan.nextLine();     
                    System.out.print("Digite o nome do livro: ");
                    String livro = scan.nextLine();
                    livro = livro.toLowerCase();
                    if (livro.isEmpty()) {
                        System.out.println("Erro, Nenhum livro adicionado.");
                    } else {
                        livros.add(livro);
                        System.out.println("Livro adicionado com sucesso!");
                    }
                    break;

                case 3:
                    //Exibir a quantidade total de livros
                    scan.nextLine(); 
                    System.out.println("Quantidade total de livros: " + livros.size());
                    break;

                case 4:
                    //Pesquisar um livro através do título
                    scan.nextLine(); 
                    System.out.print("Digite o título do livro que deseja pesquisar: ");
                    String titulodolivro = scan.nextLine();
                    titulodolivro = titulodolivro.toLowerCase();
                    if (titulodolivro.isEmpty() || !livros.contains(titulodolivro) ) {
                        System.out.println("Erro, Nenhum livro encontrado.");
                    } else if (livros.contains(titulodolivro)) {
                        System.out.println("Título do livro encontrado com sucesso!: " + titulodolivro);
                    }
                    break;

                case 5:
                    //Excluir um livro pelo título
                    scan.nextLine(); 
                    System.out.println("Digite o título do livro que deseja excluir: ");
                    break;

                case 6:
                    //Sair do sistema
                    scan.nextLine(); 
                    System.out.println("Saindo do programa!");                   
                    break;

                default:
                    scan.nextLine(); 
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
                    
            }

        } while (opcao != 6);

scan.close();
}
}
