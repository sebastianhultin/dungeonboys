package se.dungeonboys.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Polygon;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Box2D;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.utils.Box2DBuild;
import com.badlogic.gdx.utils.FloatArray;

import se.dungeonboys.DungeonboysGame;

public class RotatingTestScreen extends ScreenAdapter {
	
	Texture background;
	DungeonboysGame dungeonboysGame;
	OrthographicCamera camera;
	
	Polygon polygon;
	
	public RotatingTestScreen(DungeonboysGame dungeonboysGame) {
		background = new Texture("bg.png");
		
		this.dungeonboysGame = dungeonboysGame;
		camera = new OrthographicCamera();
		camera.setToOrtho(false);
		
		
		polygon = new Polygon(createPolygon().toArray());
		polygon.setPosition(Gdx.graphics.getWidth()/2, Gdx.graphics.getHeight()/2);

		
		
		
		
	}
	
	
	@Override
	public void render (float delta) {
		
		Gdx.gl.glClearColor(0, 0, 0.2f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		ShapeRenderer shapeRenderer= new ShapeRenderer();
		shapeRenderer.begin(ShapeType.Line);
		shapeRenderer.setColor(Color.RED);
		shapeRenderer.polygon(polygon.getTransformedVertices());
		shapeRenderer.end();

		
		if(Gdx.input.isKeyPressed(Keys.A)) 
			polygon.setPosition(polygon.getX()-10, polygon.getY());
		if(Gdx.input.isKeyPressed(Keys.D))
			polygon.setPosition(polygon.getX()+10, polygon.getY());
		if (Gdx.input.isKeyPressed(Keys.W))
			polygon.setPosition(polygon.getX(), polygon.getY()+10);
		if (Gdx.input.isKeyPressed(Keys.S))
			polygon.setPosition(polygon.getX(), polygon.getY()-10);
	}
	
	private FloatArray createPolygon() {
		Vector2 center = new Vector2(Gdx.graphics.getWidth()/2, Gdx.graphics.getHeight()/2);
		float width = 110;
		float height = 110;
		FloatArray verticles = new FloatArray(new float[] {width,0,width,height,0,height});
		
		
		
		
		return verticles;
	}

}
