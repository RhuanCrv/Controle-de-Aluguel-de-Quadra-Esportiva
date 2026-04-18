package ControledeAluguel.mvc.view;

import ControledeAluguel.mvc.controller.AluguelController;
import ControledeAluguel.mvc.model.Aluguel;
import ControledeAluguel.mvc.model.Cliente;

import java.util.Scanner;

public class Main {
    private static Scanner leitor = new Scanner(System.in);
    private static AluguelController controller = new AluguelController();

    public static void main(String[] args) {
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n Arena Rhuan de Carvalho ");
            System.out.println("1. Novo Aluguel");
            System.out.println("2. Ver Faturamento Total");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");

            try {
                opcao = Integer.parseInt(leitor.nextLine());
                if (opcao == 1) realizarReserva();
                else if (opcao == 2) exibirFaturamento();
            } catch (Exception e) {
                System.out.println("Opção inválida!");
            }
        }
    }

    private static void realizarReserva() {
        String nome = lerTexto("Nome do Cliente: ");
        String tel = lerTexto("Telefone: ");
        String hora = lerTexto("Horário (ex: 19:00): ");
        double valor = lerValor("Valor: R$ ");

        Cliente cli = new Cliente(nome, tel);
        Aluguel aluguel = new Aluguel(cli, hora, valor);

        String resultado = controller.cadastrarAluguel(aluguel);
        System.out.println(resultado);
    }

    private static void exibirFaturamento() {
        System.out.println("Total arrecadado no dia: R$ " + controller.calcularTotalFaturado());
    }

    private static String lerTexto(String msg) {
        System.out.print(msg);
        String t = leitor.nextLine();
        return t.trim().isEmpty() ? lerTexto(msg) : t;
    }

    private static double lerValor(String msg) {
        System.out.print(msg);
        try {
            return Double.parseDouble(leitor.nextLine());
        } catch (Exception e) {
            return -1;
        }
    }
}
