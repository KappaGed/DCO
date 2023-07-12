package oochess.app.discordintegration;

import net.padroesfactory.Discord4JMock;

/**
 * 
 * @author João Leitão, 50929
 * @author Pedro Correia, 54570
 *
 */
public class Discord4JAdapter implements DiscordClass {

	private Discord4JMock disc4JM;

	/**
	 * Recebe o token do Discord
	 * 
	 * @param token Token do Discord
	 */
	public Discord4JAdapter(String token) {
		disc4JM = new Discord4JMock(token);
	}

	@Override
	public void discordMensagem(String username, String message) {
		disc4JM.getChannel(username).sendMessage(message);
	}

}
