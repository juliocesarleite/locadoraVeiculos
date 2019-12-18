/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadoraveiculos.infra;

import java.util.List;
import locadoraveiculos.model.Cliente;

/**
 *
 * @author julio
 */
public interface IClienteDAO {
    public void salvar(Cliente c);
    public List<Cliente> recuperaByNome(String nome);
}
