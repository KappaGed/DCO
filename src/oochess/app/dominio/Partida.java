package oochess.app.dominio;

import java.time.LocalDateTime;

/**
 * 
 * @author João Leitão, 50929
 * @author Pedro Correia, 54570
 *
 */
public class Partida {

	private Utilizador u;
	private Utilizador ua;
	private String codigo;
	private LocalDateTime datahora;
	private String resultado;

	public Partida(Utilizador jogador1, Utilizador jogador2, String codigo, LocalDateTime datahora, String resultado) {
		this.u = jogador1;
		this.ua = jogador2;
		this.codigo = codigo;
		this.datahora = datahora;
		this.resultado = resultado;
	}

	/**
	 * 
	 * Retorna o utilizador.
	 * 
	 * @return utilizador
	 */
	public Utilizador getU() {
		return u;
	}

	/**
	 * Retorna o utilizador adversario.
	 * 
	 * @return utilizador adversario
	 */
	public Utilizador getUa() {
		return ua;
	}

	/**
	 * Retorna o codigo da partida.
	 * 
	 * @return codigo da partida
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * Retorna a data da partida.
	 * 
	 * @return data da partida
	 */
	public LocalDateTime getDataHora() {
		return datahora;
	}

	/**
	 * Retorna o resultado da partida.
	 * 
	 * @return resultado da partida
	 */
	public String getResultado() {
		return resultado;
	}

	/**
	 * Atribui o resultado dado a partida.
	 * 
	 * @param resultado Resultado que ficará definido
	 */
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

}
