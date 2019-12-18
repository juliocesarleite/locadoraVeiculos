/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadoraveiculos.infra;

import java.util.List;
import locadoraveiculos.model.Veiculo;

/**
 *
 * @author julio
 */
public interface IVeiculoDAO {
    public void salvar(Veiculo v);
    public List<Veiculo> recuperarTodos();
    public Veiculo recuperarPorModelo(String modelo);
    public Veiculo recuperarPorID(int id);
}
