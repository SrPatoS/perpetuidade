import java.text.DecimalFormat;

public class AmortizacaoEmprestimo {
    public static void main(String[] args) {
        double valorPresente = 2000.0; // PV
        double taxaJuros = 0.08;       // 8% ao ano
        int totalAnos = 9;             // Duração do empréstimo

        DecimalFormat df = new DecimalFormat("#,##0.00");

        System.out.printf("%-4s %-20s %-20s %-20s%n", "Ano", "Saldo Inicial (R$)", "Juros do Período (R$)", "Saldo Final (R$)");

        for (int ano = 1; ano <= totalAnos; ano++) {
            double saldoInicial = valorPresente * Math.pow(1 + taxaJuros, ano - 1);
            double juros = saldoInicial * taxaJuros;
            double saldoFinal = saldoInicial + juros;

            System.out.printf("%-4d %-20s %-20s %-20s%n", 
                ano, 
                df.format(saldoInicial), 
                df.format(juros), 
                df.format(saldoFinal)
            );
        }
    }
}
