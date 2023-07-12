package oochess.app.dominio;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author João Leitão, 50929
 * @author Pedro Correia, 54570
 *
 */
public class Utilizador {

	private String username;
	private String password;
	private double elo;
	private String discord;
	private List<Desafio> desafiosPendentes;

	public Utilizador(String nome, String password, String discordUsername) {
		this.username = nome;
		this.password = password;
		this.discord = discordUsername;
		this.elo = 5; //elo default que definimos pois não temos o Caso de Uso 6
		this.desafiosPendentes = new ArrayList<>();
	}

	/**
	 * Retorna o username do utilzador.
	 * 
	 * @return username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Retorna a password do utilizador.
	 * 
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Retorna o elo do utilizador
	 * 
	 * @return elo
	 */
	public double getElo() {
		return elo;
	}

	/**
	 * Retorna o username do discord do utilizador.
	 * 
	 * @return username do discord
	 */
	public String discordName() {
		return discord;
	}

	/**
	 * Retorna a lista dos desafios pendentes do utilzador.
	 * 
	 * @return lista de desafios pendentes
	 */
	public List<Desafio> desafiosPendentes() {
		return desafiosPendentes;
	}

	/**
	 * Retorna um desafio da lista dos desafios pendentes com o codigo dado.
	 * 
	 * @param codigo Codigo do desafio
	 * @return desafio com o codigo dado
	 */
	public Desafio desafioPendenteCodigo(String codigo) {
		for (int i = 0; i < desafiosPendentes.size(); i++) {
			if (desafiosPendentes.get(i).codigo().equals(codigo)) {
				return desafiosPendentes.get(i);
			}
		}
		return null;
	}
}
