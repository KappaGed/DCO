package oochess.app.facade.handlers;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import oochess.app.MyConfiguration;
import oochess.app.discordintegration.DiscordClass;
import oochess.app.dominio.*;
import oochess.app.dto.UtilizadorDTO;

/**
 * 
 * @author João Leitão, 50929
 *
 */
public class DesafiarHandler {

	private CatalogoDeTorneios catTorneios;
	private List<Utilizador> listaUtilizadoresAdv = new ArrayList<>();
	private CatalogoDeUtilizadores catUtilizadores;
	private CatalogoDesafios catDesafios;
	private CatalogoDePartidas catPartidas;
	private Utilizador u;
	private Utilizador ua;
	private int codigo = 0;

	public DesafiarHandler(Utilizador utilizador, CatalogoDeUtilizadores catUtilizadores,
			CatalogoDeTorneios catTorneios, CatalogoDesafios catDesafios, CatalogoDePartidas catPartidas) {
		this.u = utilizador;
		this.catUtilizadores = catUtilizadores;
		this.catTorneios = catTorneios;
		this.catDesafios = catDesafios;
		this.catPartidas = catPartidas;
	}

	/**
	 * Indica um id de um torneio.
	 * 
	 * @param nome	Id dum torneio
	 */
	public void indicaTorneio(String nome) {
		catTorneios.getTorneio(nome);
	}

	/**
	 * Devolve uma lista de UtilizadoresDTO que abrangem os elos respectivos.
	 * 
	 * @param delta	Margem de elo
	 * @return	Lista UtilizadorDTO
	 */
	public List<UtilizadorDTO> indicaDeltaElo(int delta) {
		listaUtilizadoresAdv = catUtilizadores.getUtilizadorByElo(u.getElo() - delta, u.getElo() + delta);
		return listaUtilizadoresAdv.stream().map(ut -> new UtilizadorDTO(ut.getUsername())).collect(Collectors.toList());
	}

	/**
	 * Seleccionar um jogador da lista retornada do método anterior.
	 * 
	 * @param nome Username do jogador adversário
	 * @requires List<UtilizadorAdv> != null
	 */
	public void indicaJogador(String nome) {
		for (int i = 0; i < listaUtilizadoresAdv.size(); i++) {
			if (listaUtilizadoresAdv.get(i).getUsername().equals(nome)) {
				ua = listaUtilizadoresAdv.get(i);
			}
		}
	}

	/**
	 * Cria uma partida e um desafio correspondente à mesma, e é
	 * devolvido o código do desafio criado.
	 * 
	 * @param datahora	Data e hora do desafio
	 * @param msg	Mensagem para ser entregue com o desafio
	 * @return	Código do desafio criado
	 * @requires Existem um u e um ua atênticados
	 */
	public String indicaDetalhes(LocalDateTime datahora, String msg) {
		codigo += 1;
		Desafio des = new Desafio(u, ua, String.valueOf(codigo), datahora);
		catDesafios.desafioAdd(des);
		Partida part = new Partida(u, ua, String.valueOf(codigo), datahora, null);
		catPartidas.addPartida(part);
		DiscordClass discord = new MyConfiguration().getDiscordAdapter();
		discord.discordMensagem(ua.discordName(),
				"O jogador " + u.getUsername() + " convidou-o para uma partida de xadrez em " + datahora + ":" + msg);
		return String.valueOf(codigo);
	}

}
