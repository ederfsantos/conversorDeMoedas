package modelo;

import java.util.Scanner;

/**
 * USD - DOLAR AMERICANO
 * BRL - REAL BRASILEIRO
 * ARS - PESO ARGENTINO
 * COP - PESO COLOMBIANO
 * PYG - GUARANI PARAGUAIO
 * EUR - EURO UNIÃO EUROPÉIA
 */

public class Principal {
    public static void main(String[] args) {
        int opcao;
        Double valor;
        String dolar = "USD";
        String real = "BRL";
        String pesoArgentino = "ARS";
        String pesoColombiano = "COP";
        String guaraniParaguaio = "PYG";
        String euro = "EUR";
        ConversaoDeValores converte = new ConversaoDeValores();
        Scanner ler = new Scanner(System.in);
        System.out.println("*********************************************************************");
        System.out.println("Seja bem-vindo(a) ao Conversor de Moedas!\n");

        do {
            System.out.println("1 - Dólar para Peso Argentino\n2 - Peso Argentino para Dólar\n" +
                               "3 - Dólar para Real Brasileiro\n4 - Real Brasileiro para Dólar\n" +
                               "5 - Dólar para Peso Colombiano\n6 - Peso Colombiano para Dólar\n" +
                               "7 - Dólar para Guarani Paraguaio\n8 - Real Brasileiro para Euro\n" +
                               "9 - Euro para Real Brasileiro\n10 - Euro para Dolar \n" +
                               "11 - Dólar para Euro\n12 - Sair da aplicação");
            System.out.println("Escolha uma opção válida:");
            opcao = ler.nextInt();
            System.out.println("*********************************************************************");

            switch (opcao) {


                case 1: {
                    valor = converte.lerValor();
                    converte.realizarConversao(dolar, pesoArgentino, valor);
                    break;

                }
                case 2: {
                    valor = converte.lerValor();
                    converte.realizarConversao(pesoArgentino, dolar, valor);
                    break;
                }
                case 3: {
                    valor = converte.lerValor();
                    converte.realizarConversao(dolar, real, valor);
                    break;
                }
                case 4: {
                    valor = converte.lerValor();
                    converte.realizarConversao(real, dolar, valor);
                    break;
                }
                case 5: {
                    valor = converte.lerValor();
                    converte.realizarConversao(dolar, pesoColombiano, valor);
                    break;
                }
                case 6: {
                    valor = converte.lerValor();
                    converte.realizarConversao(pesoColombiano, dolar, valor);
                    break;
                }
                case 7: {
                    valor = converte.lerValor();
                    converte.realizarConversao(dolar, guaraniParaguaio, valor);
                    break;
                }

                case 8: {
                    valor = converte.lerValor();
                    converte.realizarConversao(real, euro, valor);
                    break;
                }
                case 9 :{
                    valor = converte.lerValor();
                    converte.realizarConversao(euro,real, valor);
                    break;
                }
                case 10 :{
                    valor = converte.lerValor();
                    converte.realizarConversao(euro,dolar, valor);
                    break;
                }
                case 11 :{
                    valor = converte.lerValor();
                    converte.realizarConversao(dolar,euro, valor);
                    break;
                }
                case 12: {
                    System.out.println("Saindo da aplicação!\nAté a próxima!");
                    break;
                }
                default: {
                    System.out.println("Opção inválida!\n");
                }
            }


        } while (opcao != 12);


    }
}






