package com.fbjm.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class PantallaCarga extends Pantallas {
	float timer  = 0.01f;
	float timer1 = 1f;
	private SpriteBatch sprite;
	

	public PantallaCarga(BlocksGameDesktop juego) {
		super(juego);
	}

	@Override
	public void show() {
		sprite = new SpriteBatch();
	}

	@Override
	public void render(float delta) {
		while(!BlocksGameDesktop.MANAGER.update()) {

		}
		
		
		int width, height;
		width = Gdx.graphics.getWidth();
		height = Gdx.graphics.getHeight();
		sprite.begin();
		if(BlocksGameDesktop.MANAGER.isLoaded("fondoCarga.jpg",Texture.class) && BlocksGameDesktop.MANAGER.isLoaded("logo.png",Texture.class)) {
			if(BlocksGameDesktop.MANAGER.update()) {
				if(timer < 1.5f) {
					sprite.setColor(timer, timer, timer, timer);
					timer = timer +0.01f;
				}
				else if(timer > 1.5f && timer <2.5f) {
					sprite.setColor(timer1, timer1,timer1, timer1);
					timer = timer + 0.01f;
					timer1 = timer1 - 0.01f;
				}
				else if(timer > 2.5f) {
					sprite.setColor(0, 0,0,0);
					juego.setScreen(juego.PantallaMenu);
				}
			}
			
			sprite.draw(BlocksGameDesktop.MANAGER.get("fondoCarga.jpg",Texture.class), 0, 0, width, height);
			sprite.draw(BlocksGameDesktop.MANAGER.get("logo.png",Texture.class),
					(width/2)-(BlocksGameDesktop.MANAGER.get("logo.png",Texture.class).getWidth()/2), 
					(height/2)-(BlocksGameDesktop.MANAGER.get("logo.png",Texture.class).getHeight()/2),
					BlocksGameDesktop.MANAGER.get("logo.png",Texture.class).getWidth(),
					BlocksGameDesktop.MANAGER.get("logo.png",Texture.class).getHeight());
						
			sprite.end();
		}
	}

	@Override
	public void hide() {

	}

	@Override
	public void dispose() {
		sprite.dispose();
	}

}
