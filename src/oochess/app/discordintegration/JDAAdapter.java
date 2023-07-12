package oochess.app.discordintegration;

import com.chavetasfechadas.JDAMock;
import com.chavetasfechadas.JDAMockBuilder;

/**
 * 
 * @author João Leitão, 50929
 * @author Pedro Correia, 54570
 *
 */
public class JDAAdapter implements DiscordClass {

	private JDAMockBuilder jDAMB = new JDAMockBuilder();

	/**
	 * Recebe o token do Discord
	 * 
	 * @param token Token do Discord
	 */
	public JDAAdapter(String token) {
		jDAMB.createDefault(token);
	}

	@Override
	public void discordMensagem(String username, String message) {
		JDAMock jDAM = jDAMB.build();
		jDAM.sendMessage(username, message);
	}

}
