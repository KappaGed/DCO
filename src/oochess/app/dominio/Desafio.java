package oochess.app.dominio;

import java.time.LocalDateTime;

/**
 * 
 * @author João Leitão 50929
 * @author Pedro Correia 54570
 *
 */

public class Desafio {

	private Utilizador u;
	private Utilizador convidado;
	private String codigoDesafio;
	private LocalDateTime datahora;
	private boolean resposta;

	public Desafio(Utilizador utilizador, Utilizador convidado, String codigo, LocalDateTime datahora) {
		u = utilizador;
		this.convidado = convidado;
		codigoDesafio = codigo;
		this.datahora = datahora;
		resposta = false;
	}

	/**
	 * Retorna o utilizador que convida.
	 * 
	 * @return utilizador que convida
	 */
	public Utilizador utilizador() {
		return u;
	}

	/**
	 * Retorna o covidado.
	 * 
	 * @return covidado
	 */
	public Utilizador convidado() {
		return convidado;
	}

	/**
	 * Devolve o codigo do desafio.
	 * 
	 * @return codigo do desafio
	 */
	public String codigo() {
		return codigoDesafio;
	}

	/**
	 * Devolve a data do desafio.
	 * 
	 * @return data do desafio
	 */
	public LocalDateTime dataHora() {
		return datahora;
	}

	/**
	 * Devolve a resposta ao desafio.
	 * 
	 * @return resposta ao desafio
	 */
	public boolean resposta() {
		return resposta;
	}

	/**
	 * Responde a um desafio com a resposta dada.
	 * 
	 * @param resposta
	 */
	public void setResposta(boolean resposta) {
		this.resposta = resposta;
	}

	/**
	 * Altera a data de um desafio para a data dada.
	 * 
	 * @param datahora
	 */
	public void setNovaData(LocalDateTime datahora) {
		this.datahora = datahora;
	}
}
