package se.dungeonboys.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import se.dungeonboys.DungeonboysGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		config.title = "DungeonBoyz";
		config.width = 1024;
		config.height = 768;
		
		
		new LwjglApplication(new DungeonboysGame(), config);
	}
}
