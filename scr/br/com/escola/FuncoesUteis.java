package scr.br.com.escola;

public class FuncoesUteis {

    // Método para validar CPF (simples, apenas com 11 dígitos)
    public static boolean verificarCpf(String cpf) {
        return cpf != null && cpf.matches("\\d{11}");
    }

    // Método para calcular o IMC
    public static double calcularImc(double peso, double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura deve ser maior que zero.");
        }
        return peso / (altura * altura);
    }

    // Método para avaliar se o aluno está aprovado
    public static String avaliarAluno(double nota, double percentualPresenca) {
        if (nota >= 5 && percentualPresenca >= 75) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}
