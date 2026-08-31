package aplicacao;

import arvores.AbbInt;

import java.util.Scanner;

public class MenuAbb {

    static void main() {
        Scanner le = new Scanner(System.in);
        AbbInt abb = new AbbInt();
        int opcao = 0;
        do{
            System.out.println("MENU DE ESCOLHA\n" +
                                "0  - Sair do programa\n" +
                                "1  - Insere 1 valor na ABB\n" +
                                "2  - Apresenta em ordem os elementos da ABB\n" +
                                "3  - Conta quantidade de nós presentes na ABB\n" +
                                "4  - Consulta se um valor está presente na ABB\n" +
                                "5  - Apresente o número de comparações para pesquisar um valor na ABB");
            System.out.println("Opção: ");
            opcao = le.nextInt();


            switch (opcao){
                case 0:
                    System.out.println("Encerrada a execução!");
                    break;

                case 1:
                    System.out.println("Informe valor a ser inserido: ");
                    int valor = le.nextInt();
                    abb.root = abb.inserir(abb.root, valor); ///para mudar
                    break;

                case 2:
                    System.out.println("Apresentando em ordem os valores da ABB:");
                    abb.mostrarEmOrdem(abb.root);
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Quantidade de nós: " + abb.contaNos(abb.root, 0));
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

}
