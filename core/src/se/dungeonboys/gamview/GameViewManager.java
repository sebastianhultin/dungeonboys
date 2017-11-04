package se.dungeonboys.gamview;

import java.util.Stack;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameViewManager {
	
	public Stack<GameView> gameViews;
	public GameViewManager() {
		gameViews = new Stack<GameView>();
	}
	
	public void push (GameView gameView) {
		gameViews.push(gameView);
	}
	
	public void pop() {
		gameViews.pop();
	}
	
	public void set(GameView gameView) {
		gameViews.pop();
		gameViews.push(gameView);
	}

	public void update(float deltaTime) {
		gameViews.peek().update(deltaTime);
	}
	
	public void render(SpriteBatch spriteBatch) {
		gameViews.peek().render(spriteBatch);
	}
}
