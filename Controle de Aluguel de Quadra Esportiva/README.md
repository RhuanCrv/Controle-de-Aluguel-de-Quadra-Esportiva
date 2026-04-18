# Planejamento do meu projeto - Aluguel de Quadra

Neste arquivo, eu listei como organizei as informações e quais regras eu criei para o sistema não dar erro e funcionar direito, conforme o que foi pedido.

---

## Exercício da Quadra Esportiva
Aqui eu pensei em como guardar os dados de quem vai jogar.

**O que o sistema guarda (Tabelas):**
* **Cliente:** Nome e o telefone da pessoa.
* **Aluguel:** Quem é o cliente, o horário que ele marcou e quanto vai pagar.

**Regras que eu criei:**
* O sistema não deixa salvar se o nome estiver em branco.
* O valor do aluguel não pode ser um número negativo (o sistema avisa e pede para digitar de novo).

---

## Como eu organizei o código
Eu usei o padrão **MVC** para deixar as pastas separadas:
* **Model:** Onde ficam as informações dos produtos, livros e clientes.
* **Controller:** Onde fica a "mágica" de fazer as contas e procurar os itens nas listas.
* **View:** Onde eu usei o Scanner para conversar com quem está usando o programa.

---

## 👤 Autor
* **Rhuan de Carvalho** - *Desenvolvedor do Projeto*
* Disciplina: Estrutura de Sistemas e Aplicações