package src.br.com.escola;

import scr.br.com.escola.Aluno;
import static scr.br.com.escola.FuncoesUteis.avaliarAluno;
import static scr.br.com.escola.FuncoesUteis.calcularImc;
import static scr.br.com.escola.FuncoesUteis.verificarCpf;

public class Main {
    public static void main(String[] args) {
        // Criação de um objeto Aluno
        Aluno aluno = new Aluno("João", "12345678901", 70.0, 1.75, 7.5, 80.0);

        // Exibir todas as informações do aluno
        System.out.println("Informações do Aluno:");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("CPF: " + aluno.getCpf());
        System.out.println("Peso: " + aluno.getPeso() + " kg");
        System.out.println("Altura: " + aluno.getAltura() + " m");
        System.out.println("Nota: " + aluno.getNota());
        System.out.println("Percentual de Presença: " + aluno.getPercentualPresenca() + "%");

        // Teste da validação de CPF
        boolean cpfValido = verificarCpf(aluno.getCpf());
        System.out.println("CPF válido: " + cpfValido);

        // Cálculo do IMC
        double imc = calcularImc(aluno.getPeso(), aluno.getAltura());
        System.out.printf("IMC: %.2f\n", imc);

        // Avaliação do aluno
        String resultadoAvaliacao = avaliarAluno(aluno.getNota(), aluno.getPercentualPresenca());
        System.out.println("Resultado da avaliação: " + resultadoAvaliacao);
    }
}
