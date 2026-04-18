package ControledeAluguel.mvc.model;

public class Aluguel {
    private Cliente cliente;
    private String horario;
    private double valor;

    public Aluguel(Cliente cliente, String horario, double valor) {
        this.cliente = cliente;
        this.horario = horario;
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getHorario() {
        return horario;
    }

    public double getValor() {
        return valor;
    }
}
