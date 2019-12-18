/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadoraveiculos.infra;

import java.util.List;
import javax.persistence.EntityManager;
import locadoraveiculos.model.Cliente;

/**
 *
 * @author julio
 */
public class ClienteDAO implements IClienteDAO{

    @Override
    public void salvar(Cliente c) {
        //cria um gerenciador de entidades
        EntityManager em = ConnectionFactoryHibernate.getEntityManager();

        try {
            //abrir uma transacao
            em.getTransaction().begin();
            //solicita ao gerenciador que salve a entidade

            EnderecoDAO edao = new EnderecoDAO();
            edao.salvar(c.getEndereco());

            em.persist(c);
            //fechar a transacao
            em.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //encerra o gerenciador de entidades
            em.close();
        }
    }

    @Override
    public List<Cliente> recuperaByNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
