/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agmed;

/**
 *
 * @author denis
 */
public class AgMed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente joao = new Cliente("João", "095.123.309-41", "Rua verde, 96" , "tel: 9994155515");
       
        
       joao.novaEntrada("12022002", "internado em estado grave com cancêr no pancreas");
       joao.novaEntrada("12022002", "internado em estado grave com cancêr no pulmão");
       joao.novaEntrada("12022002", "morreu");
       joao.novaEntrada("13022002", "recussitou");
       
       System.out.println(joao.getHistoricoPD("12022002")); 
       System.out.println(joao.getHistoricoPD("13022002"));
       
       System.out.println(joao.toString());
       
       joao.limparEntrada("12022002");
       
       System.out.println(joao.toString());
       
    }
   
}
