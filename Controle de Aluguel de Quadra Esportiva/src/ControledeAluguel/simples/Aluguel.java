package ControledeAluguel.simples;

public class Aluguel {
    public Cliente cliente;
    public String horario;
    public double valor;

    public Aluguel(Cliente cliente, String horario, double valor) {
        if (cliente == null) throw new IllegalArgumentException("Cliente inválido.");
        if (horario == null || horario.trim().isEmpty()) throw new IllegalArgumentException("Horário inválido.");
        if (valor < 0) throw new IllegalArgumentException("Valor não pode ser negativo.");

        this.cliente = cliente;
        this.horario = horario;
        this.valor = valor;
    }
}
