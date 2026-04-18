package ControledeAluguel.simples;

import java.util.Scanner;

public class Main {
    private static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("--Arena Rhuan de Carvalho: Aluguel de Quadras--");

        String nome = lerTexto("Digite o nome do cliente: ");
        String telefone = lerTexto("Digite o telefone do cliente: ");
        Cliente cli = new Cliente(nome, telefone);

        String horario = lerTexto("Digite o horário (ex: 19:00): ");
        double valor = lerValor("Digite o valor do aluguel: R$ ");

        Aluguel reserva = new Aluguel(cli, horario, valor);

        exibirResumo(reserva);

    }

    private static String lerTexto(String mensagem) {
        String texto = "";
        while (texto.trim().isEmpty()) {
            System.out.print(mensagem);
            texto = leitor.nextLine();
            if (texto.trim().isEmpty()) {
                System.out.println("Erro: Este campo é obrigatório.");
            }
        }
        return texto;
    }

    private static double lerValor(String mensagem) {
        double valor = -1;
        while (valor < 0) {
            System.out.print(mensagem);
            try {
                valor = Double.parseDouble(leitor.nextLine());
                if (valor < 0) System.out.println("Erro: O valor não pode ser negativo.");
            } catch (Exception e) {
                System.out.println("Erro: Digite um número válido.");
            }
        }
        return valor;
    }

    private static void exibirResumo(Aluguel reserva) {
        System.out.println("\n-------------------------------");
        System.out.println("reserva confirmada no sistema!");
        System.out.println("-------------------------------");
        System.out.println("Cliente: " + reserva.cliente.nome);
        System.out.println("Horário: " + reserva.horario);
        System.out.println("Valor: R$ " + reserva.valor);
        System.out.println("-------------------------------");
    }
}
