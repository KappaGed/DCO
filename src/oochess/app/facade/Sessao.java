package oochess.app.facade;

import oochess.app.dominio.*;
import oochess.app.facade.handlers.DesafiarHandler;
import oochess.app.facade.handlers.ProcessarDesafiosHandler;
import oochess.app.facade.handlers.RegistarResultadoHandler;

/**
 * 
 * @author João Leitão, 50929
 * @author Pedro Correia, 54570
 *
 */
public class Sessao {

	private Utilizador utilizador;
	private CatalogoDePartidas catPartidas;
	private CatalogoDeTorneios catTorneios;
	private CatalogoDeUtilizadores catUtilizadores;
	private CatalogoDesafios catDesafios;

	public Sessao(Utilizador utilizador, CatalogoDePartidas catPartidas, CatalogoDeTorneios catTorneios,
			CatalogoDeUtilizadores catUtilizadores, CatalogoDesafios catDesafios) {
		this.utilizador = utilizador;
		this.catPartidas = catPartidas;
		this.catTorneios = catTorneios;
		this.catUtilizadores = catUtilizadores;
		this.catDesafios = catDesafios;
	}

	public DesafiarHandler getDesafioParaPartidaHandler() {
		return new DesafiarHandler(utilizador, catUtilizadores, catTorneios, catDesafios, catPartidas);
	}

	public RegistarResultadoHandler getRegistarResultadoDePartida() {
		return new RegistarResultadoHandler(); // TODO
	}

	public ProcessarDesafiosHandler getProcessarDesafios() {
		return new ProcessarDesafiosHandler(utilizador, catDesafios);
	}
}
