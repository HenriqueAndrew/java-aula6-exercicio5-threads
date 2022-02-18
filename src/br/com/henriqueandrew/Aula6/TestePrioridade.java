package br.com.henriqueandrew.Aula6;

// @author Henrique Andrew da Silva

public class TestePrioridade {
    
    public static void main (String[] args){
        
        int i = 0;
        
        //Instanciando Thread com nível de prioridade padrão
        new Escrita("Prioridade Default", 5).start();
        
        //Instanciando Thread definindo prioridade 3 niveis de prioridade acima do normal
        new Escrita ("Prioridade 3 niveis acima", 8).start(); 
    }

}
