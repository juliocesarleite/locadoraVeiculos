/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadoraveiculos.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author julio
 */
@Entity
public class Cliente implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CodCliente;
    private String NomeCliente;
    private String EmailCliente;
    private int RGCliente;
    
    @OneToOne
    private Endereco endereco;
    
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Veiculo> veiculos = new ArrayList<>();

    public Cliente(String NomeCliente, String EmailCliente, int RGCliente, Endereco endereco, List<Veiculo> veiculos) {
        this.NomeCliente = NomeCliente;
        this.EmailCliente = EmailCliente;
        this.RGCliente = RGCliente;
        this.endereco = endereco;
        this.veiculos = veiculos;
    }

    public Cliente() {
    }
    
    public void setNomeCliente(String nome){
    this.NomeCliente = nome;
}
    public void setEmailCliente(String email){
    this.EmailCliente = email;
}
    public void setRGCliente(int rg){
    this.RGCliente = rg;
}
    public int getCodCliente(){
        return CodCliente;
    }
    
    public String getNomeCliente(){
        return NomeCliente;
}
    public String getEmailCliente(){
        return EmailCliente;
    }
    
    public int getRGCliente(){
        return RGCliente;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
    
   
   //public String ToString() {}

}
