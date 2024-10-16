package scr.br.com.escola;

public class Aluno extends Pessoa {
    private final double nota;
    private final double percentualPresenca;

    public Aluno(String nome, String cpf, double peso, double altura, double nota, double percentualPresenca) {
        super(nome, cpf, peso, altura);
        this.nota = nota;
        this.percentualPresenca = percentualPresenca;
    }

    public double getNota() {
        return nota;
    }

    public double getPercentualPresenca() {
        return percentualPresenca;
    }
}
