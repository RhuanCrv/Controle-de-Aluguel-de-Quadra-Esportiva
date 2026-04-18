package ControledeAluguel.simples;

public class Cliente {
    public String nome;
    public String telefone;

    public Cliente(String nome, String telefone) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }
        if (telefone == null || telefone.trim().isEmpty()) {
            throw new IllegalArgumentException("Telefone não pode ser vazio.");
        }
        this.nome = nome;
        this.telefone = telefone;
    }
}
