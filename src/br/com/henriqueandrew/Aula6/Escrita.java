package br.com.henriqueandrew.Aula6;

// @author Henrique Andrew da Silva
public class Escrita extends Thread {

    private int i;

    Escrita(String nome) {
        super(nome);
    }

    Escrita(String nome, int prioridade) {
        super(nome);
        setPriority(prioridade); //método de definição de prioridade
    }

    public void run() {

        while (true) {
            System.out.println(getName() + i++);
            yield();
        }

    }
}
