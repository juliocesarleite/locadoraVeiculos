/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadoraveiculos.infra;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import locadoraveiculos.model.Veiculo;

/**
 *
 * @author julio
 */

public class VeiculoDAO implements IVeiculoDAO{

    EntityManager em = ConnectionFactoryHibernate.getEntityManager();
    
    @Override
    public void salvar(Veiculo v) {
        try {
            //abrir uma transacao
            em.getTransaction().begin();
            //solicita ao gerenciador que salve a entidade
            em.persist(v);
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
    public List<Veiculo> recuperarTodos() {
        List<Veiculo> veiculos = new ArrayList();

        try {
            //cria um gerenciador de entidades
            EntityManager em = ConnectionFactoryHibernate.getEntityManager();
            
            //solicita ao gerenciador todas a instância da classe Pessoa dado um cpf
            Query query = em.createQuery("from Veiculo");
            
            veiculos = query.getResultList();
            
            //encerra o gerenciador de entidades
            em.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return veiculos;
    }

    @Override
    public List<Veiculo> recuperarPorModelo(String modelo) {
        List<Veiculo> veiculos = new ArrayList();

        try {
            //cria um gerenciador de entidades
            EntityManager em = ConnectionFactoryHibernate.getEntityManager();
            
            //solicita ao gerenciador todas a instância da classe Pessoa dado um cpf
            Query query = em.createQuery("from Veiculo v where v.modeloVeiculo = :modelo")
                    .setParameter("modelo", modelo);
            
            veiculos = query.getResultList();
            
            //encerra o gerenciador de entidades
            em.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return veiculos;
    }

    @Override
    public Veiculo recuperarPorID(int id) {
        Veiculo veiculo = new Veiculo();

        try {
            //cria um gerenciador de entidades
            EntityManager em = ConnectionFactoryHibernate.getEntityManager();
            
            //solicita ao gerenciador todas a instância da classe Pessoa dado um cpf
            Query query = em.createQuery("from Veiculo v where v.codVeiculo = :id")
                    .setParameter("id", id);
            
            veiculo = (Veiculo) query.getSingleResult();
            
            //encerra o gerenciador de entidades
            em.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return veiculo;
    }
    
}
