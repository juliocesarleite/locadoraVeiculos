/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadoraveiculos.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author julio
 */
@Entity
public class Veiculo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codVeiculo;
    private String corVeiculo;
    private String marcaVeiculo;
    private double precoVeiculo;
    private String modeloVeiculo;
    private int anoVeiculo;
    private String situacao;

    public Veiculo(int codVeiculo, String corVeiculo, String marcaVeiculo, double precoVeiculo, String modeloVeiculo, int anoVeiculo, String situacao) {
        this.codVeiculo = codVeiculo;
        this.corVeiculo = corVeiculo;
        this.marcaVeiculo = marcaVeiculo;
        this.precoVeiculo = precoVeiculo;
        this.modeloVeiculo = modeloVeiculo;
        this.anoVeiculo = anoVeiculo;
        this.situacao = situacao;
    }

    
    public int getCodVeiculo() {
        return codVeiculo;
    }

    public void setCodVeiculo(int codVeiculo) {
        this.codVeiculo = codVeiculo;
    }

    public String getCorVeiculo() {
        return corVeiculo;
    }

    public void setCorVeiculo(String corVeiculo) {
        this.corVeiculo = corVeiculo;
    }

    public String getMarcaVeiculo() {
        return marcaVeiculo;
    }

    public void setMarcaVeiculo(String marcaVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
    }

    public double getPrecoVeiculo() {
        return precoVeiculo;
    }

    public void setPrecoVeiculo(double precoVeiculo) {
        this.precoVeiculo = precoVeiculo;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public int getAnoVeiculo() {
        return anoVeiculo;
    }

    public void setAnoVeiculo(int anoVeiculo) {
        this.anoVeiculo = anoVeiculo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    public String ToString(){
        return "Veiculo { id: " + codVeiculo +", modelo: " + modeloVeiculo + ", fabricante: " + marcaVeiculo + ", ano: " + anoVeiculo + ", cor: " + corVeiculo + ", preço: " + precoVeiculo + ", status: " + situacao + "}";
    }
}
