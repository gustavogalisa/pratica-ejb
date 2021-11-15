package com.gugawag.pdist.ejbs;

import com.gugawag.pdist.model.Mensagem;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class MensagemDAO {

    @PersistenceContext(unitName="default")
    private EntityManager entmngr;

    public void inserir(Mensagem mensagem) {
        entmngr.persist(mensagem);
    }

    public List<Mensagem> listar() {
        return entmngr.createQuery("FROM Mensagem").getResultList();
    }

    public Mensagem pesquisarPorId(long id) {
        return entmngr.find(Mensagem.class, id);
    }
}
