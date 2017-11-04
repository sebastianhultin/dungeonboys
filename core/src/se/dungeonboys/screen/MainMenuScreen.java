package se.dungeonboys.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;

import se.dungeonboys.DungeonboysGame;

public class MainMenuScreen extends ScreenAdapter {
	
	Texture background;
	Texture icon;
	
	DungeonboysGame dungeonboysGame;
	OrthographicCamera camera;
	
	public MainMenuScreen(final DungeonboysGame dungeonboysGame) {
		this.dungeonboysGame = dungeonboysGame;
		this.icon = new Texture("man.png");
		background = new Texture("bg.png");
		camera = new OrthographicCamera();
		camera.setToOrtho(false);
	}

	@Override
	public void show() {
		
		
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0.2f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		dungeonboysGame.batch.begin();
		dungeonboysGame.batch.draw(background, 0, 0);
		dungeonboysGame.batch.draw(icon, 25, 25);
		dungeonboysGame.batch.end();
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
	

}
