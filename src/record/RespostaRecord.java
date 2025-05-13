package record;



public record RespostaRecord(String result, String documentation,
                             String terms_of_use, Integer time_last_update_unix,
                             String time_last_update_utc, Integer time_next_update_unix,
                             String time_next_update_utc, String base_code, String target_code,
                             Double conversion_rate, Double conversion_result) {

    @Override
    public String toString() {

        return String.format("\n***Dados do JSON convertido em Objeto***\n" +
                             "Resultado: %s\nDocumentação: %s\nTermos de uso: %s\nHorário da última atualização unix: %d\n" +
                             "Horário da última atualização: %s\nHorário da próxima atualização unix: %d\n" +
                             "Horário da próxima atualização: %s\nMoeda de origem: %s\nMoeda convertida: %s\n" +
                             "Taxa de conversão: %f\nResultado da conversão: %.2f", this.result, this.documentation, this.terms_of_use,
                this.time_last_update_unix, this.time_last_update_utc, this.time_next_update_unix, this.time_next_update_utc,
                this.base_code, this.target_code, this.conversion_rate, this.conversion_result);
    }
}
