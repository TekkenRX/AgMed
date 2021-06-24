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
public class Medico extends PessoaFisica{
    
    public Medico(String nome, String cpf, String endereco,
                  String contato, String CRM, String espc,
                  String funcao){
    
        super(nome, cpf, endereco, contato);
        this.CRM = CRM;
        this.espc = espc;
        this.funcao = funcao;
        
    }
    
    private final String CRM;
    private String espc;
    private String funcao;
    
    public void setEspc(String espc){
        this.espc = espc;
    }
    public void setFuncao(String funcao){
        this.funcao = funcao;
    }
    public String getCRM(){
        return this.CRM;
    }
    public String getEspc(){
        return this.espc;
    }
    public String getFuncao(){
        return this.funcao;
    }
    
}
