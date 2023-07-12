package oochess.app.dominio;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author João Leitão, 50929
 * @author Pedro Correia, 54570
 *
 */
public class CatalogoDeTorneios {

	private List<Torneio> listaTorneio = new ArrayList<>();

	/**
	 * Devolve um torneio com id dado se esse torneio existir no catálogo,
	 * se não, é criado um novo torneio com o id dado.
	 * 
	 * @param id Id do torneio
	 * @return um torneio com o id dado
	 */
	public Torneio getTorneio(String id) {
		for (int i = 0; i < listaTorneio.size(); i++) {
			if ((listaTorneio.get(i).getId()).equals(id)) {
				return listaTorneio.get(i);
			}
		}
		Torneio novoTorn = new Torneio(id);
		listaTorneio.add(novoTorn);
		return novoTorn;
	}

}
