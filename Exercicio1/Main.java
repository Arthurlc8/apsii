package Exercicio01;

import java.util.ArrayList;

public class Main {

   
    public static void main(String[] args) {
        
        
        MinhaAgendaDeAniversarios agenda = new MinhaAgendaDeAniversarios();
        
        System.out.println("Inserindo dados...");
     
        agenda.adicionarAniversariante("Arthur", 15, 4);
        agenda.adicionarAniversariante("Lucas", 15, 4);
        agenda.adicionarAniversariante("Maria", 20, 8);
        
        System.out.println("Aniversariantes adicionados com sucesso!\n");
        
        
        System.out.println("Consultando dados...");
       
        ArrayList<String> listaDoDia = agenda.obterAniversariantesDoDia(15, 4);
        System.out.println("Quem faz aniversário dia 15/4? " + listaDoDia);
        
        
        System.out.println("\nRemovendo Dados...");
        
        System.out.println("Removendo o Lucas da lista...");
        agenda.removerAniversariante("Lucas");
        
        
        System.out.println("\nRealizando nova consulta...");
        
        ArrayList<String> listaAtualizada = agenda.obterAniversariantesDoDia(15, 4);
        System.out.println("Quem faz aniversário dia 15/4 agora? " + listaAtualizada);
    }
}