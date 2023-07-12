package oochess.app.dominio;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author João Leitão, 50929
 * @author Pedro Correi, 54570
 *
 */
public class CatalogoDesafios {

	private List<Desafio> ctlgDesafios = new ArrayList<>();

	/**
	 * Devolve o catálogo com todos os desafios existentes.
	 * 
	 * @return o catálogo de todos os desafios
	 */
	public List<Desafio> catalogDesafios() {
		return ctlgDesafios;
	}

	/**
	 * Retorna um desafio com um codigo dado.
	 * 
	 * @param codigo Codigo do desafio
	 * @return um desafio com um codigo dado
	 */
	public Desafio getDesafioCode(String codigo) {
		for (int i = 0; i < ctlgDesafios.size(); i++) {
			if ((ctlgDesafios.get(i).codigo().equals(codigo))) {
				return ctlgDesafios.get(i);
			}
		}
		return null;
	}

	/**
	 * Adiciona um desafio ao catálogo de desafios.
	 * 
	 * @param desafio
	 */
	public void desafioAdd(Desafio desafio) {
		ctlgDesafios.add(desafio);
	}

	/**
	 * Calcula o número de desafios existentes.
	 * 
	 * @return o tamanho do catálogo
	 */
	public int numeroDeDesafios() {
		return ctlgDesafios.size();
	}
}
