package com.fbjm.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class PantallaMenu extends Pantallas {

	public PantallaMenu(BlocksGameDesktop juego) {
		super(juego);
	}
	
	private Texture botonJugar, botonSalir;
	private Stage stage;

	@Override
	public void show() {
		
		botonJugar = BlocksGameDesktop.MANAGER.get("play.png",Texture.class);
		botonSalir = BlocksGameDesktop.MANAGER.get("quit.png",Texture.class);
		
		stage = new Stage();
		
		Image imgFondo = new Image(BlocksGameDesktop.MANAGER.get("fondoJuego.jpg",Texture.class));
		imgFondo.setFillParent(true);
		stage.addActor(imgFondo);
		
		Image imgJugar = new Image(botonJugar);
		imgJugar.setBounds(40, 35, 117, 68);
		imgJugar.addListener(new InputListener() {

			@Override
			public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
				juego.setScreen(new PantallaJuego(juego));
				return true;
			}
			
		});
		stage.addActor(imgJugar);
		
		Image imgSalir = new Image(botonSalir);
		imgSalir.setBounds(250, 35, 101, 43);
		imgSalir.addListener(new InputListener() {

			@Override
			public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
				Gdx.app.exit();
				return true;
			}
			
		});
		stage.addActor(imgSalir);
		
		Gdx.input.setInputProcessor(stage);
		
	}

	@Override
	public void render(float delta) {
		stage.act();
		stage.draw();
	}

	@Override
	public void hide() {
		Gdx.input.setInputProcessor(null);
	}

	@Override
	public void dispose() {
		stage.dispose();
	}

}
