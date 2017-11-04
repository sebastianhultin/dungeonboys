package se.dungeonboys.gamview;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

public abstract class GameView {
	
	protected OrthographicCamera orthographicCamera;
	protected Vector3 mouse;
	protected GameViewManager gameViewManager;
	
	
	public GameView (GameViewManager gameViewManager) {
		this.gameViewManager = gameViewManager;
		orthographicCamera = new OrthographicCamera();
		mouse = new Vector3();
	}
	
	public abstract void handleInput();
	public abstract void update(float deltaTime);
	public abstract void render(SpriteBatch spriteBatch);
	
}

