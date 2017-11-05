package se.dungeonboys.screen;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;

import se.dungeonboys.DungeonboysGame;

public class MoventTestScreen extends ScreenAdapter {

	Texture background;
	Texture man;
	Rectangle icon;
	Sprite sprite;
	
	Array<Projectile> projectiles;

	DungeonboysGame dungeonboysGame;
	OrthographicCamera camera;

	public MoventTestScreen(final DungeonboysGame dungeonboysGame) {
		this.dungeonboysGame = dungeonboysGame;
		man = new Texture("man.png");
		man.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		background = new Texture("bg.png");
		camera = new OrthographicCamera();
		camera.setToOrtho(false);

		icon = new Rectangle();
		icon.width = 64;
		icon.height = 64;
		icon.x = 50;
		icon.y = 50;
		
		
		sprite = new Sprite(man);
		sprite.setSize(200, 200);
		sprite.setRotation(180);
		
		projectiles = new Array<MoventTestScreen.Projectile>();
 
	}

	@Override
	public void show() {


	}

	@Override
	public void render(float delta) {
		sprite.setX(icon.x);
		sprite.setY(icon.y);
		Gdx.gl.glClearColor(0, 0, 0.2f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		dungeonboysGame.batch.setProjectionMatrix(camera.combined);
		dungeonboysGame.batch.begin();
		dungeonboysGame.batch.draw(background, 0, 0);
		sprite.draw(dungeonboysGame.batch);
		dungeonboysGame.batch.end();

		// Moving man with loop

		//		for (int i = 0; i < 10; i++) {
		//			if (icon.x < dungeonboysGame.SCREEN_WIDTH) {
		//				icon.x += 10*Gdx.graphics.getDeltaTime();
		//			}
		//		}


		if(Gdx.input.isKeyPressed(Keys.A))
			icon.x -= 10;
		
		if(Gdx.input.isKeyPressed(Keys.D))
			icon.x +=  10;
		//	sprite.setRotation(270);
		if (Gdx.input.isKeyPressed(Keys.W))
			icon.y +=  10;
		//	sprite.setRotation(90);
		if (Gdx.input.isKeyPressed(Keys.S))
			icon.y -= 10;
		//	sprite.setRotation(0);


		if (Gdx.input.isKeyPressed(Keys.Q)) {
			sprite.rotate(5);
		}
		if (Gdx.input.isKeyPressed(Keys.E)) {
			sprite.rotate(-5);
		}
		if (Gdx.input.isKeyJustPressed(Keys.SPACE)) {
			//projectiles.add(new Projectile(sprite.getRotation()));
		}



	}
	
	private class Projectile {
		public Projectile(Float rotation) {
			Texture texture = new Texture("projectile2.png");
			Sprite sprite = new Sprite(texture);
			sprite.setRotation(rotation);
			
			
			
		}
	}

	private class MousePosition {
		Vector2 mousePosition;

		private MousePosition() {
			mousePosition.x =Gdx.input.getX();
			mousePosition.y =Gdx.input.getY();
		}
		private float getX() {
			return mousePosition.x;
		}

		private float getY() {
			return mousePosition.y;
		}
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
