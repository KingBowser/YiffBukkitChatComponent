package de.doridian.yiffbukkit.chatcomponent.config;

import de.doridian.yiffbukkit.chatcomponent.YBChatComponent;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ConfigFileReader extends FileReader {
	public ConfigFileReader(String file) throws FileNotFoundException {
		super(YBChatComponent.instance.getDataFolder() + "/" + file);
	}
}
