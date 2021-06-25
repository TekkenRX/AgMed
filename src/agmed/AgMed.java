
package agmed;


public class AgMed {

    

    public static void main(String[] args) {
        /**
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
       **/
       
        Consulta cons = new Consulta("anderson", "123");
        
        cons.setData(28, 2, 2021);
        
        
        System.out.println(cons.getData());
        System.out.println(cons.getPaciente());
        System.out.println(cons.getCPF());
        
        
        System.out.println();
        cons.setCPF("456");
        cons.setPaciente("Bruno");
        
        cons.setData(29, 2, 2021);
        
        
        
        System.out.println(cons.getData());
        System.out.println(cons.getPaciente());
        System.out.println(cons.getCPF());
        
    }
   
}
