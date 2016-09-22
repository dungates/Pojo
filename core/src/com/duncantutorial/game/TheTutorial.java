package com.duncantutorial.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class TheTutorial extends ApplicationAdapter {
	private SpriteBatch batch;
	private Texture texture;
	private Texture texture2;
	private Sprite sprite;
	private Sprite sprite2;


	@Override
	public void create () {
		batch = new SpriteBatch();
		texture = new Texture("rough_pojo.png");
		sprite = new Sprite(texture);
		sprite.setPosition((Gdx.graphics.getWidth()/2)-sprite.getWidth()/2, (Gdx.graphics.getHeight()/2)-sprite.getHeight()/2);
		texture2 = new Texture("Arrows.png");
		sprite2 = new Sprite(texture2);
		sprite2.setPosition(-130,-300);
		Rectangle wleftBounds = new Rectangle(0, 890, 270, 181);
		Rectangle wrightBounds = new Rectangle(270, 890, 255, 181);
	}

	@Override
	public void dispose () {
		batch.dispose();
		texture.dispose();
	}

	@Override
	public void render () {
		System.out.print(Gdx.input.getX());
		System.out.print(" ");
		System.out.println(Gdx.input.getY());

		sprite.translateX(1.0f);
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.begin();
		sprite.draw(batch);
		sprite2.draw(batch);
		batch.end();
	}
	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}

}
