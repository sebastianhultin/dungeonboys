package se.dungeonboys;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import se.dungeonboys.gamview.GameViewManager;
import se.dungeonboys.gamview.MenuGameView;

public class DungeonboysGame extends ApplicationAdapter {
	
	private GameViewManager gameViewManager;
	SpriteBatch spriteBatch;
	Texture img;
	
	@Override
	public void create () {
		spriteBatch = new SpriteBatch();
		gameViewManager = new GameViewManager();
		img = new Texture("badlogic.jpg");
		Gdx.gl.glClearColor(1, 0, 0, 1);
		gameViewManager.push(new MenuGameView(gameViewManager));
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
