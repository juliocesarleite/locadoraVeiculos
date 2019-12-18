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
public class Veiculo {
    private String CodVeiculo;
    private String CorVeicu;
    private String MarcaVeicu;
    private String PrecoVeicu;
    private String ModeloVeicu;
    private String AnoVeicu;
    private String situacao;
    
    public void setCodVeiculo(String cod){
        this.CodVeiculo = cod;
    }
    
    public void setCorVeicu(String cor){
        this.CorVeicu = cor;
    }
    
    public void setMarcaVeicu(String marca){
        this.MarcaVeicu = marca;
    }
    
    public void setPrecoVeicu(String preco){
        this.PrecoVeicu = preco;
    }
    
    public void setModeloVeicu(String modelo){
        this.ModeloVeicu = modelo;
    }
    
    public void setAnoVeicu(String ano){
        this.AnoVeicu = ano;
    }
    
    public void setSituacao(String situ){
        this.situacao = situ;
    }
    
    public String getCodVeiculo(){
        return CodVeiculo;
    }
    
    public String getCorVeicu(){
        return CorVeicu;
    }
    
    public String getMarcaVeicu(){
        return MarcaVeicu;
    }
    
    public String getPrecoVeicu(){
        return PrecoVeicu;
    }
    
    public String getModeloVeicu(){
        return ModeloVeicu;
    }
    
    public String getAnoVeicu(){
        return AnoVeicu;
    }
    
    public String getSituacao(){
        return situacao;
    }
}
