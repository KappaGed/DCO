package oochess.app.dominio;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author João Leitão, 50929
 * @author Pedro Correia, 54570
 *
 */
public class CatalogoDeUtilizadores {

	private List<Utilizador> listaUtilizadores = new ArrayList<>();

	/**
	 * Devolve uma lista de utilizadores com elo entre minElo e maxElo dados.
	 * 
	 * @param minElo Mínimo de elo
	 * @param maxElo Máximo de elo
	 * @return lista de utilizadores com elo entre minElo e maxElo dados
	 */
	public List<Utilizador> getUtilizadorByElo(double minElo, double maxElo) {
		List<Utilizador> listaEloRespectivo = new ArrayList<>();
		for (int i = 0; i < listaUtilizadores.size(); i++) {
			if (listaUtilizadores.get(i).getElo() <= maxElo && listaUtilizadores.get(i).getElo() >= minElo) {
				listaEloRespectivo.add(listaUtilizadores.get(i));
			}
		}
		return listaEloRespectivo;
	}

	/**
	 * Verifica se existe um utilizador com nome dado no catálogo de utilizadores e
	 * retorna-o casa exista.
	 * 
	 * @param nome Nome do utilizador
	 * @return Utilizador com nome dado
	 */
	public Utilizador getUtilizadorByNome(String nome) {
		for (int i = 0; i < listaUtilizadores.size(); i++) {
			if (listaUtilizadores.get(i).getUsername().equals(nome)) {
				return listaUtilizadores.get(i);
			}
		}
		return null;
	}

	/**
	 * Devolte o catálogo de utilizadores.
	 * 
	 * @return catálogo de utilizadores
	 */
	public List<Utilizador> listaUtilizadors() {
		return listaUtilizadores;
	}

	/**
	 * Adiciona um utilzador ao catálogo de utilizadores.
	 * 
	 * @param utilizador
	 */
	public void novoUtilizador(Utilizador utilizador) {
		listaUtilizadores.add(utilizador);
	}
}
