/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agmed;
import java.util.*;

/**
 *
 * @author denis
 */
public class Cliente extends PessoaFisica{
    
    public Cliente(String nome, String cpf, String endereco, String contato){
    
        super(nome, cpf, endereco, contato);
        
    }
   
    private Map<String, String> historicoMedico = new HashMap<>();
    
    public void novaEntrada(String data, String desc){
        
        if (historicoMedico.containsKey(data)){
            desc = historicoMedico.get(data) + ", " + desc;
            historicoMedico.put(data, desc);
        }
        else{
            historicoMedico.put(data, desc);
        }
        
    }
    public void limparHistórico(){
        
        historicoMedico.clear();
        
    }
    public void limparEntrada(String data){
        
       historicoMedico.remove(data);
        
    }
       
    public String getHistoricoPD(String data){
        String dia = data.substring(0,2)+"/"+data.substring(2,4)+"/"+data.substring(4, 8);
        return dia + "\n" + historicoMedico.get(data) + "\n";
    }
    
    @Override public String toString(){
        
        if (!(historicoMedico.isEmpty())){
            return super.toString() + "historicoMedico="+ historicoMedico.toString();
        }
        
        return super.toString()+ "historicoMedico=null";
    }
    
}
