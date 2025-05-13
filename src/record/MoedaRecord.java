package record;

public record MoedaRecord(String base_code,String target_code,Double conversion_result ) {

    @Override
    public String toString() {
        return String.format("***Dados da conversão***\nMoeda de origem: %s\nMoeda de destino: %s\nValor convertido $: %.2f",
                this.base_code,this.target_code,this.conversion_result);
    }
}
