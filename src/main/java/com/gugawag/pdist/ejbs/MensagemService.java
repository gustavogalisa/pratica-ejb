package com.gugawag.pdist.ejbs;

import com.gugawag.pdist.model.Mensagem;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import java.util.List;

@Stateless(name="mensagemService")
@Remote
public class MensagemService {

    @EJB
    private MensagemDAO mensagemDAO;

    public List<Mensagem> listar() {
        return mensagemDAO.listar();
    }

    public void inserir(long id, String mensagem) {
        Mensagem novaMensagem = new Mensagem(id, mensagem);
        mensagemDAO.inserir(novaMensagem);
    }

    public Mensagem pesquisarPorId(long id) {
        return mensagemDAO.pesquisarPorId(id);
    }
}
