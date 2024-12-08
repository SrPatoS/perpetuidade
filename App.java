public class App {
    public static double calcularPerpetuidade(double pagamento, double taxa) {
        if (taxa <= 0) {
            throw new IllegalArgumentException("A taxa de juros deve ser maior que zero.");
        }
        return pagamento / taxa;
    }

    public static void main(String[] args) {
        // Exemplo em sala
        double pagamentoExemplo = 200000.0;
        double taxaExemplo = 0.10;
        double vpExemplo = calcularPerpetuidade(pagamentoExemplo, taxaExemplo);
        System.out.printf("Exemplo em sala - Valor Presente: $%,.2f%n", vpExemplo); 

        // Teste para Atividade 04
        double pagamentoAtividade = 250000.0;
        double taxaAtividade = 0.08;
        double vpAtividade = calcularPerpetuidade(pagamentoAtividade, taxaAtividade);
        System.out.printf("Atividade 04 - Valor Presente: $%,.2f%n", vpAtividade); 
    }
}
