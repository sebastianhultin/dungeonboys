package se.dungeonboys;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.physics.box2d.BodyDef.BodyType;

import se.dungeonboys.gamview.GameViewManager;
import se.dungeonboys.gamview.MenuGameView;
import se.dungeonboys.gamview.TestGameView;

public class DungeonboysGame extends ApplicationAdapter {
	
	public static int SCREEN_HEIGHT = 1024;
	public static int SCREEN_WIDTH = 768;
	
	
	
	
	private GameViewManager gameViewManager;
	SpriteBatch spriteBatch;
	Texture img;
	BodyType bodyType;
	
	@Override
	public void create () {
		spriteBatch = new SpriteBatch();
		gameViewManager = new GameViewManager();
		img = new Texture("badlogic.jpg");
		Gdx.gl.glClearColor(1, 0, 0, 1);
		gameViewManager.push(new TestGameView(gameViewManager));
	}

	@Override
	public void render () {
		
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		gameViewManager.update(Gdx.graphics.getDeltaTime());
		gameViewManager.render(spriteBatch);
	}
	
	@Override
	public void dispose () {
		spriteBatch.dispose();
		img.dispose();
	}
}
