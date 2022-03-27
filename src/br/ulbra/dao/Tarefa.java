
package br.ulbra.dao;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Leon
 */
public class Tarefa {
    public ArrayList lista;
    
    public Tarefa(){
        lista = new ArrayList();
    }
    
    public void salvar(String elemento){
        lista.add(elemento);
        JOptionPane.showMessageDialog(null, "A tarefa "+elemento
        +" foi salva com sucesso!!");
    }
    public String toString(){
        String res = "";
        if(!lista.isEmpty()){
            for(int i=0; i < lista.size();i++){
                res += lista.get(i)+"\n";
            }
        }else{
        res = "A lista de tarefas encontra-se vazia!";    
        }
        return res;
    }
    public int pesquisar(String elemento){
        boolean achou = false; //flag
        int i=0,c = -1; //o valor -1 significa que não achou
        if(!lista.isEmpty()){
        while(i<lista.size() && !achou){
            if(lista.get(i).equals(elemento)){
                c = i;
                achou = true;
            }else{
                c = c;
            }
            i++;
        }
        }
        return c;
    }
    public String getTarefa(int i){
        String r = "";
        if(i==-1){
            r = "Valor não encontrado";
        }else{
            r = String.valueOf(lista.get(i));
        }
        return r;
    }
    public void remover(int i){ 
        JOptionPane.showMessageDialog(null, "A tarefa "+lista.get(i)+" foi removida com sucesso!");
        lista.remove(i);
       
    }
    public void alterar(String tarefa, int i){
         JOptionPane.showMessageDialog(null, "A tarefa "+lista.get(i)+" foi alterada com sucesso!");
        lista.set(i, tarefa);
        
    }
}
