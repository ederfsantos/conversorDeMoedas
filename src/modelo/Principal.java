package modelo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcao;
        Double valor;
        ConversaoDeValores converte = new ConversaoDeValores();

        Scanner ler = new Scanner(System.in);
        System.out.println("*********************************************************************");
        System.out.println("Seja bem-vindo(a) ao Conversor de Moedas!\n");

        do {
            System.out.println("1 - Dólar para Peso Argentino\n2 - Peso Argentino para Dólar\n" +
                               "3 - Dólar para Real Brasileiro\n4 - Real Brasileiro para Dólar\n" +
                               "5 - Dólar para Peso Colombiano\n6 - Peso Colombiano para Dólar\n" +
                               "7 - Dólar para Guarani Paraguaio\n8 - Sair da aplicação");
            System.out.println("Escolha uma opção válida:");
            opcao = ler.nextInt();
            System.out.println("*********************************************************************");

            switch (opcao) {
                /**
                 * USD - DOLAR AMERICANO
                 * BRL - REAL BRASILEIRO
                 * ARS - PESO ARGENTINO
                 * COP - PESO COLOMBIANO
                 * PYG - GUARANI PARAGUAIO
                 */

                case 1: {
                    valor = converte.lerValor();
                    converte.converteDolarParaPesoArgentino(valor);
                    break;

                }
                case 2: {
                    valor = converte.lerValor();
                    converte.convertePesoArgentinoParaDolar(valor);
                    break;
                }
                case 3: {
                    valor = converte.lerValor();
                    converte.converteDolarParaRealBrasileiro(valor);
                    break;
                }
                case 4: {
                    valor = converte.lerValor();
                    converte.converteRealBrasileiroParaDolar(valor);
                    break;
                }
                case 5: {
                    valor = converte.lerValor();
                    converte.converteDolarParaPesoColombiano(valor);
                    break;
                }
                case 6: {
                    valor = converte.lerValor();
                    converte.convertePesoColombianoParaDolar(valor);
                    break;
                }
                case 7: {
                    valor = converte.lerValor();
                    converte.converteDolarParaGuaraniParaguaio(valor);
                    break;
                }

                case 8:
                {
                    System.out.println("Saindo da aplicação!\nAté a próxima!");
                    break;
                }
                default: {
                    System.out.println("Opção inválida!\n");
                }
            }


        } while (opcao != 8 );


    }
}






