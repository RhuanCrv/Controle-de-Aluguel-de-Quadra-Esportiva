package ControledeAluguel.mvc.controller;

import ControledeAluguel.mvc.model.Aluguel;

import java.util.ArrayList;
import java.util.List;

public class AluguelController {
    private List<Aluguel> listaDeAlugueis = new ArrayList<>();

    public String cadastrarAluguel(Aluguel novoAluguel) {
        // Regra: Não permitir reservar o mesmo horário
        for (Aluguel a : listaDeAlugueis) {
            if (a.getHorario().equals(novoAluguel.getHorario())) {
                return "ERRO: Este horário já está ocupado!";
            }
        }

        listaDeAlugueis.add(novoAluguel);
        return "Sucesso: Aluguel registrado!";
    }

    public double calcularTotalFaturado() {
        double total = 0;
        for (Aluguel a : listaDeAlugueis) {
            total += a.getValor();
        }
        return total;
    }

    public List<Aluguel> getListaDeAlugueis() {
        return listaDeAlugueis;
    }
}
