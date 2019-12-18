/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadoraveiculos.model;

/**
 *
 * @author julio
 */
public class Cliente {
    private String CodCliente;
    private String NomeCliente;
    private String EmailCliente;
    private String RGCliente;
    private String EnderecoCliente;
    
    public void setCodCliente(String cod){
    this.CodCliente = cod;
}
    public void setNomeCliente(String nome){
    this.NomeCliente = nome;
}
    public void setEmailCliente(String email){
    this.EmailCliente = email;
}
    public void setRGCliente(String rg){
    this.RGCliente = rg;
}
    public void setEnderecoCliente(String endereco){
    this.EnderecoCliente = endereco;
}
    public String getCodCliente(){
        return CodCliente;
    }
    
    public String getNomeCliente(){
        return NomeCliente;
}
    public String getEmailCliente(){
        return EmailCliente;
    }
    
    public String getRGCliente(){
        return RGCliente;
    }
    
    public String getEnderecoCliente(){
        return EnderecoCliente;
    }

}
