package Exercicio01;

import java.util.ArrayList;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios {
    
    private ArrayList<Aniversariante> lista;

    public MinhaAgendaDeAniversarios() {
        this.lista = new ArrayList<>();
    }

    @Override
    public void adicionarAniversariante(String nome, int dia, int mes) {
        Aniversariante a = new Aniversariante(nome, dia, mes);
        this.lista.add(a);
    }

    @Override
    public ArrayList<String> obterAniversariantesDoDia(int dia, int mes) {
    	
        ArrayList<String> encontrados = new ArrayList<>();
        DataAniversario dataBusca = new DataAniversario(dia, mes);
        
        for (int i = 0; i < this.lista.size(); i++) {
            Aniversariante atual = this.lista.get(i);
            
            if (atual.getDataAniversario().equals(dataBusca)) {
                encontrados.add(atual.getNome());
            }
        }
        
        return encontrados;
    }

    @Override
    public void removerAniversariante(String nomeAniversariante) {
    	
        for (int i = this.lista.size() - 1; i >= 0; i--) {
            if (this.lista.get(i).getNome().equals(nomeAniversariante)) {
                this.lista.remove(i);
                
            }
        }
    }
}