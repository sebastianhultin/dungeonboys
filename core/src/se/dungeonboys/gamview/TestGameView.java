package se.dungeonboys.gamview;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import se.dungeonboys.DungeonboysGame;

public class TestGameView extends GameView{
	Texture texture = new Texture("man.png");
	Texture bg = new Texture("bg.png");

	public TestGameView(GameViewManager gameViewManager) {
		super(gameViewManager);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleInput() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(float deltaTime) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(SpriteBatch spriteBatch) {
		spriteBatch.begin();
		spriteBatch.draw(bg, 0,0, DungeonboysGame.SCREEN_HEIGHT, DungeonboysGame.SCREEN_WIDTH);
		spriteBatch.draw(texture, 0, 0);
		spriteBatch.end();
		
	}

}
