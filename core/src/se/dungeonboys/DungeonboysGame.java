package se.dungeonboys;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;



import se.dungeonboys.screen.MoventTestScreen;

public class DungeonboysGame extends Game {
	
	public static int SCREEN_HEIGHT = 700;
	public static int SCREEN_WIDTH = 1100;
	
	public SpriteBatch batch;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		Gdx.gl.glClearColor(1, 0, 0, 1);
		this.setScreen(new MoventTestScreen(this));
	}

	@Override
	public void render () {
		super.render(); // Impotant, otherwise render() do not run on the ScreenAdapters
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
