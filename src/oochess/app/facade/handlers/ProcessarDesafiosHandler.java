package oochess.app.facade.handlers;

import java.time.LocalDateTime;
import java.util.List;

import oochess.app.dominio.CatalogoDesafios;
import oochess.app.dominio.Desafio;
import oochess.app.dominio.Utilizador;

/**
 * 
 * @author Pedro Correia, 54570
 *
 */
public class ProcessarDesafiosHandler {
	private Utilizador u;
	private CatalogoDesafios catalogoDesafios;
	private Desafio desafio;

	public ProcessarDesafiosHandler(Utilizador utilizador, CatalogoDesafios catalogoDesafios) {
		this.u = utilizador;
		this.catalogoDesafios = catalogoDesafios;
	}

	/**
	 * Retorna uma lista de desafios pendentes do utilizador autenticado.
	 * 
	 * @return lista de desafios pendentes
	 */
	public List<Desafio> consultarDesafiosPendentes() {
		for (int i = 0; i < catalogoDesafios.numeroDeDesafios(); i++) {
			if (catalogoDesafios.catalogDesafios().get(i).convidado().equals(u)) {
				u.desafiosPendentes().add(catalogoDesafios.catalogDesafios().get(i));
			}
		}
		return u.desafiosPendentes();
	}

	/**
	 * Responder a um desafio da lista de desafios pendendes indicado o codigo do
	 * desafio e a resposta.
	 * 
	 * @param codigo	Codigo do desafio
	 * @param resposta	Resposta ao desafio
	 * @ensures o desafio com o codigo referido obteve uma resposta
	 */
	public void respondeADesafio(String codigo, boolean resposta) {
		u.desafioPendenteCodigo(codigo).setResposta(resposta);
		desafio = u.desafioPendenteCodigo(codigo);
	}

	/**
	 * Indica nova data para um desafio.
	 * 
	 * @param datahora	Data e hora do desafio
	 * @ensures uma nova data para o desafio
	 */
	public void indicaNovaData(LocalDateTime datahora) {
		u.desafioPendenteCodigo(desafio.codigo()).setNovaData(datahora);
	}
}
