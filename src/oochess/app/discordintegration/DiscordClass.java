package oochess.app.discordintegration;

/**
 * 
 * @author João Leitão, 50929
 * @author Pedro Correia, 54570
 *
 */
public interface DiscordClass {

	/**
	 * Método da interface para enviar a mensagem Discord
	 * 
	 * @param username Username do destinatário
	 * @param message	Mensagem a ser enviada
	 */
	public void discordMensagem(String username, String message);

}
