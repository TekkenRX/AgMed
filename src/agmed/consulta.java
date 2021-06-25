/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agmed;


public class Consulta {
    
    private String data, paciente, cpf;
    
    public Consulta(String paciente, String cpf){
        this.paciente = paciente;
        this.cpf = cpf;
    }
    
    public boolean setData(int dia, int mes, int ano){
        String aux;
        
        if (ano > 2020 && ano < 2100){
            if(mes == 2){
                
                if(dia > 0 && dia <= 28){
                    aux = dia + "/" + mes + "/" + ano;
                    this.data = aux;
                    return true;
                }else{
                    System.out.println("Data inválida");
                    return false;
                }
                              
            }else{
                if (mes==1 | mes==3 | mes==5 | mes==7 | mes==8 | mes == 10 | mes==12){
                    if(dia > 0 && dia <= 28){
                        aux = dia + "/" + mes + "/" + ano;
                        this.data = aux;
                        return true;
                    }else{
                        System.out.println("Data inválida");
                        return false;
                    }
                }else{
                    if (mes==4 | mes==6 | mes==9 | mes == 11){
                        if(dia > 0 && dia <= 30){
                        aux = dia + "/" + mes + "/" + ano;
                        this.data = aux;
                        return true;
                    }else{
                        System.out.println("Data inválida");
                        return false;
                    }
                    }else{
                        System.out.println("Data inválida");
                        return false;
                    }
                }
            }
        }else{
            System.out.println("Data inválida");
                        
            return false;
        }
        
            
        
        
    }
    
    public boolean setPaciente(String paciente){
        if (!paciente.isEmpty()){
            this.paciente = paciente;
            return true;
        }else
            return false;
        
    }
    
    public boolean setCPF(String cpf){
        if (cpf.length() == 3){
            this.cpf = cpf;
            return true;
        }else
            return false;
        
    }
    
    public String getData (){
        return data;
    }
    
    public String getPaciente(){
        return paciente;
    }
    
        public String getCPF(){
        return cpf;
    }
    
}


