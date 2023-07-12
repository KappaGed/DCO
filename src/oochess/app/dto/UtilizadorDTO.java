package oochess.app.dto;

/**
 * 
 * @author João Leitão, 50929
 * @author Pedro Correia, 54570
 *
 */
public class UtilizadorDTO {

	private String username;

	public UtilizadorDTO(String username) {
		this.username = username;
	}

	/**
	 * Devolve o nome do UtilizadorDTO
	 * 
	 * @return	username do UtilizadorDTO
	 */
	public String getUsername() {
		return username;
	}
}
