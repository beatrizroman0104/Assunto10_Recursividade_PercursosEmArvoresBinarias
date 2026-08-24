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
                                "2  - Apresenta em ordem os elementos da ABB\n");
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

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

}
