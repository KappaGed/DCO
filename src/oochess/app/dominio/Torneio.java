package oochess.app.dominio;

public class Torneio {
	/**
	 * 
	 * @author João Leitão, 50929
	 * @author Pedro Correia, 54570
	 *
	 */
	private String id;

	public Torneio(String id) {
		this.id = id;
	}

	/**
	 * Retorna o id do torneio.
	 * 
	 * @return id do torneio
	 */
	public String getId() {
		return id;
	}

}
