package modelo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcao;

        Scanner ler = new Scanner(System.in);
        System.out.println("*********************************************************************");
        System.out.println("Seja bem-vindo/a ao Conversor de Moedas!\n");

        do {
            System.out.println("1 - Dólar para Peso Argentino\n2 - Peso Argentino para Dólar\n" +
                               "3 - Dólar para Real Brasileiro\n4 - Real Brasileiro para Dólar\n" +
                               "5 - Dólar para Peso Colombiano\n6 - Peso Colombiano para Dólar\n" +
                               "7 - Sair da aplicação");
            System.out.println("Escolha uma opção válida:");
            opcao = ler.nextInt();
            System.out.println("*********************************************************************");

            switch (opcao){


                case 1:
                {

                }
            }


        } while (opcao != 7 || opcao > 7);


    }
}
