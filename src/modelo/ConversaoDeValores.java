package modelo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import record.MoedaRecord;
import record.RespostaRecord;
import requisicao.Requisicao;

import java.util.Scanner;

public class ConversaoDeValores {

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


    /**
     * Método realiza a conversão de valores monetarios, recebendo como parametro
     * a moeda de origem, destino e o valor a ser convertido.
     * @param moedaDeOrigem
     * @param moedaDeDestino
     * @param valor
     */
    public void realizarConversao(String moedaDeOrigem,String moedaDeDestino,Double valor) {
        respostaJson = converter.getRequisicao(moedaDeOrigem,moedaDeDestino, valor);
        moeda = gson.fromJson(respostaJson, MoedaRecord.class);
        System.out.println("O valor de $" + String.format("%.2f", valor) + "[" + moeda.base_code() + "] " +
                           "corresponde ao valor de $" + String.format("%.2f", moeda.conversion_result()) + "[" + moeda.target_code() + "]\n");
        apresentarObjeto();

    }

    /**
     * Método realiza a apresentação do objeto em formato
     * Json e também pelo toString() do objeto convertido.
     */
    public void apresentarObjeto() {

        System.out.println("\nDados do objeto resumido:\n" + moeda);
        resposta = gson.fromJson(respostaJson, RespostaRecord.class);
        System.out.println("\nObjeto desserializado:\n" + resposta);

        String json = gson.toJson(resposta);
        System.out.println("\n***Dados completos no formato Json apartir do objeto***\n" + json + "\n");
    }


}
