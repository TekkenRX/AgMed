
package agmed;
import java.util.*;

public class Cliente extends PessoaFisica{
    
    public Cliente(String nome, String cpf, String endereco, String contato){
    
        super(nome, cpf, endereco, contato);
        
    }
   
    private final Map<String, String> historicoMedico = new HashMap<>();
    
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
    
    @Override 
    public String toString(){
        
        if (!(historicoMedico.isEmpty())){
            return super.toString() + "historicoMedico="+ historicoMedico.toString();
        }
        
        return super.toString()+ "historicoMedico=null";
    }
    
}
