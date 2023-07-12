package oochess.app.dominio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author João Leitão, 50929
 * @author Pedro Correia, 54570
 *
 */
public class CatalogoDePartidas {

	private List<Partida> listaPartidas = new ArrayList<>();

	/**
	 * Devolve uma partida com a data dada.
	 * 
	 * @param datahora Data e hora da partida
	 * @return uma partida com data dada
	 */
	public Partida getPartida(LocalDateTime datahora) {
		for (int i = 0; i < listaPartidas.size(); i++) {
			if ((listaPartidas.get(i).getDataHora().equals(datahora))) {
				return listaPartidas.get(i);
			}
		}
		return null;
	}

	/**
	 * Adiciona uma partida ao catálogo de partidas.
	 * 
	 * @param partida Partida para ser adicionada ao catálogo.
	 */
	public void addPartida(Partida partida) {
		listaPartidas.add(partida);
	}
}
