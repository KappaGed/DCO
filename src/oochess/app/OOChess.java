package oochess.app;

import java.util.Optional;

import oochess.app.dominio.CatalogoDePartidas;
import oochess.app.dominio.CatalogoDeTorneios;
import oochess.app.dominio.CatalogoDeUtilizadores;
import oochess.app.dominio.CatalogoDesafios;
import oochess.app.facade.Sessao;
import oochess.app.facade.handlers.RegistarUtilizadorHandler;

/**
 * Esta é a classe do sistema!
 */
public class OOChess {

	private CatalogoDeUtilizadores catUtilizadores = new CatalogoDeUtilizadores();
	private CatalogoDePartidas catPartidas = new CatalogoDePartidas();
	private CatalogoDeTorneios catTorneios = new CatalogoDeTorneios();
	private CatalogoDesafios catDesafios = new CatalogoDesafios();

	public RegistarUtilizadorHandler getRegistarUtilizadorHandler() {
		return new RegistarUtilizadorHandler(catUtilizadores);
	}

	/**
	 * Returns an optional Session representing the authenticated user.
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	public Optional<Sessao> autenticar(String username, String password) {
		if (catUtilizadores.getUtilizadorByNome(username).getPassword().equals(password)) {
			return Optional.of(new Sessao(catUtilizadores.getUtilizadorByNome(username), catPartidas, catTorneios,
					catUtilizadores, catDesafios));
		}
		return Optional.empty();
	}
}
