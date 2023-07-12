package oochess.app.facade.handlers;

import oochess.app.dominio.CatalogoDeUtilizadores;
import oochess.app.dominio.Utilizador;
/**
 * 
 * @author João Leitão, 50929
 * @author Pedro Correia, 54570
 *
 */
public class RegistarUtilizadorHandler {

	private CatalogoDeUtilizadores catUtilizadores;

	public RegistarUtilizadorHandler(CatalogoDeUtilizadores catUtilizadores) {
		this.catUtilizadores = catUtilizadores;
	}
	
	/**
	 * Regista um utilizador normal.
	 * 
	 * @param discordUsername	Nickname do discord do utilizador
	 * @param Username	Nome do utilizador
	 * @param Password	Palavra pass do utilizador
	 * @ensures existe um utilizador com esse username
	 */
	public void registarUtilizador(String username, String password, String discordUsername) {
		Utilizador utilizador = new Utilizador(username, password, discordUsername);
		catUtilizadores.novoUtilizador(utilizador);
		System.out.println(username + " : " + utilizador.getElo());
	}
}
