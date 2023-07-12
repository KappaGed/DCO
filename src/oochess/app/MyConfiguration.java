package oochess.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

import oochess.app.discordintegration.*;
/**
 * 
 * @author João Leitão, 50929
 * @author Pedro Correia, 54570
 *
 */
public class MyConfiguration {

	/**
	 * Método que define qual o tipo de Adapter a usar conforme os valores
	 * passados no ficheiro "preferences.properties".
	 * 
	 * @return o DiscordAdapter correspondente
	 */
	public DiscordClass getDiscordAdapter() {
		Properties p = new Properties();
		try {
			p.load(new FileInputStream(new File("preferences.properties")));
			
			String klassName = (String) p.getOrDefault("DISCORD_CLASS", "oochess.app.discordintegration.JDAAdapter");
			String klassToken = (String) p.getOrDefault("DISCORD_TOKEN", "1231412341");
			
			Class<?> klass = Class.forName(klassName);
			
			return (DiscordClass) klass.getConstructor(String.class).newInstance(klassToken);
		} catch (FileNotFoundException e) {
			System.err.println("Ficheiro não encontrado.");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("Input/Output erro.");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.err.println("Class não encontrada.");
			e.printStackTrace();
		} catch (InstantiationException e) {
			System.err.println("Instância não definida.");
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			System.err.println("Acesso ilegal.");
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			System.err.println("Argumento ilegal.");
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			System.err.println("Target não invocado.");
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			System.err.println("Método não definido.");
			e.printStackTrace();
		} catch (SecurityException e) {
			System.err.println("Problema de segurança.");
			e.printStackTrace();
		}
		return new JDAAdapter("1231412341");
	}
}
