package modelo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import record.MoedaRecord;
import record.RespostaRecord;
import requisicao.Requisicao;

import java.util.Scanner;

/**
 * USD - DOLAR AMERICANO
 * BRL - REAL BRASILEIRO
 * ARS - PESO ARGENTINO
 * COP - PESO COLOMBIANO
 * PYG - GUARANI PARAGUAIO
 */
public class ConversaoDeValores {
    String dolar = "USD";
    String real = "BRL";
    String pesoArgentino = "ARS";
    String pesoColombiano = "COP";
    String guaraniParaguaio = "PYG";
    String respostaJson = "";
    Scanner ler = new Scanner(System.in);
    Requisicao converter = new Requisicao();
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    MoedaRecord moeda;
    RespostaRecord resposta;


    public Double lerValor() {
        System.out.println("Informe o valor a ser convertido:");
        return ler.nextDouble();
    }


    public void converteDolarParaPesoArgentino(Double valor) {
        respostaJson = converter.getRequisicao(dolar, pesoArgentino, valor);
        moeda = gson.fromJson(respostaJson, MoedaRecord.class);
        System.out.println("O valor de $" + String.format("%.2f", valor) + "[" + moeda.base_code() + "] " +
                           "corresponde ao valor de $" + String.format("%.2f", moeda.conversion_result()) + "[" + moeda.target_code() + "]\n");
        apresentarObjeto();
    }

    public void convertePesoArgentinoParaDolar(Double valor) {
        respostaJson = converter.getRequisicao(pesoArgentino, dolar, valor);
        moeda = gson.fromJson(respostaJson, MoedaRecord.class);
        System.out.println(moeda);
        System.out.println("O valor de $" + String.format("%.2f", valor) + "[" + moeda.base_code() + "] " +
                           "corresponde ao valor de $" + String.format("%.2f", moeda.conversion_result()) + "[" + moeda.target_code() + "]\n");
        apresentarObjeto();
    }

    public void converteDolarParaRealBrasileiro(Double valor) {
        respostaJson = converter.getRequisicao(dolar, real, valor);
        moeda = gson.fromJson(respostaJson, MoedaRecord.class);
        System.out.println(moeda);
        System.out.println("O valor de $" + String.format("%.2f", valor) + "[" + moeda.base_code() + "] " +
                           "corresponde ao valor de $" + String.format("%.2f", moeda.conversion_result()) + "[" + moeda.target_code() + "]\n");
        apresentarObjeto();

    }

    public void converteRealBrasileiroParaDolar(Double valor) {
        respostaJson = converter.getRequisicao(real, dolar, valor);
        moeda = gson.fromJson(respostaJson, MoedaRecord.class);
        System.out.println(moeda);
        System.out.println("O valor de $" + String.format("%.2f", valor) + "[" + moeda.base_code() + "] " +
                           "corresponde ao valor de $" + String.format("%.2f", moeda.conversion_result()) + "[" + moeda.target_code() + "]\n");
        apresentarObjeto();

    }

    public void converteDolarParaPesoColombiano(Double valor) {
        respostaJson = converter.getRequisicao(dolar, pesoColombiano, valor);
        moeda = gson.fromJson(respostaJson, MoedaRecord.class);
        System.out.println(moeda);
        System.out.println("O valor de $" + String.format("%.2f", valor) + "[" + moeda.base_code() + "] " +
                           "corresponde ao valor de $" + String.format("%.2f", moeda.conversion_result()) + "[" + moeda.target_code() + "]\n");
        apresentarObjeto();
    }

    public void convertePesoColombianoParaDolar(Double valor) {
        respostaJson = converter.getRequisicao(pesoColombiano, dolar, valor);
        moeda = gson.fromJson(respostaJson, MoedaRecord.class);
        System.out.println(moeda);
        System.out.println("O valor de $" + String.format("%.2f", valor) + "[" + moeda.base_code() + "] " +
                           "corresponde ao valor de $" + String.format("%.2f", moeda.conversion_result()) + "[" + moeda.target_code() + "]\n");
        apresentarObjeto();

    }

    public void converteDolarParaGuaraniParaguaio(Double valor) {
        respostaJson = converter.getRequisicao(dolar, guaraniParaguaio, valor);
        moeda = gson.fromJson(respostaJson, MoedaRecord.class);
        System.out.println(moeda);

        System.out.println("O valor de $" + String.format("%.2f", valor) + "[" + moeda.base_code() + "] " +
                           "corresponde ao valor de $" + String.format("%.2f", moeda.conversion_result()) + "[" + moeda.target_code() + "]\n");

        apresentarObjeto();
    }

    public void apresentarObjeto() {
        System.out.println("\nDados do objeto resumido:\n" + moeda);
        resposta = gson.fromJson(respostaJson, RespostaRecord.class);
        System.out.println("\nObjeto desserializado:\n" + resposta);

        String json = gson.toJson(resposta);
        System.out.println("\n***Dados completos no formato Json apartir do objeto***\n" + json + "\n");
    }
}
