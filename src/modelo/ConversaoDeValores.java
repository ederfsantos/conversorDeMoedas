package modelo;

import requisicao.Conversao;

import java.util.Scanner;

/**
 * USD - DOLAR AMERICANO
 * BRL - REAL BRASILEIRO
 * ARS - PESO ARGENTINO
 * COP - PESO COLOMBIANO
 */
public class ConversaoDeValores {
    String dolar = "USD";
    String real = "BRL";
    String pesoArgentino = "ARS";
    String pesoColombiano = "COP";
    String respostaJson="";
    Scanner ler = new Scanner(System.in);
    Conversao converter = new Conversao();

    public Double lerValor() {
        System.out.println("Informe o valor a ser convertido:");
        return ler.nextDouble();
    }


    public void converteDolarParaPesoArgentino(Double valor) {
        respostaJson = converter.getConversao(dolar,pesoArgentino,valor);
        System.out.println(respostaJson);

    }

    public Double convertePesoArgentinoParaDolar(Double valor) {

        return null;

    }

    public Double converteDolarParaRealBrasileiro(Double valor) {

        return null;
    }

    public Double converteRealBrasileiroParaDolar(Double valor) {

        return null;
    }

    public Double converteDolarParaPesoColombiano(Double valor) {

        return null;
    }

    public Double convertePesoColombianoParaDolar(Double valor) {

        return null;
    }

}
