package com.fbjm.game;

import com.badlogic.gdx.Screen;

public abstract class Pantallas implements Screen {
	protected BlocksGameDesktop juego;
	
    public Pantallas(BlocksGameDesktop juego) {
    	this.juego = juego;
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
