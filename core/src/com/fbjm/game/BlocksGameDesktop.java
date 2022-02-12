package com.fbjm.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;

public class BlocksGameDesktop extends Game {

    public static final AssetManager MANAGER = new AssetManager();
    public final Pantallas PantallaJuego, PantallaCarga, PantallaMenu;

    public BlocksGameDesktop() {
    	this.PantallaJuego = new PantallaJuego(this);
    	this.PantallaCarga = new PantallaCarga(this);
    	this.PantallaMenu =  new PantallaMenu(this);
    }
    
    @Override
    public void create() {
    	MANAGER.load("fondoCarga.jpg",Texture.class);
        MANAGER.load("fondoJuego.jpg",Texture.class);
        MANAGER.load("logo.png",Texture.class);
        MANAGER.load("marco.png",Texture.class);
        MANAGER.load("casillaVacia.jpg",Texture.class);
        MANAGER.load("pieza1.png", Texture.class);
        MANAGER.load("pieza2.png", Texture.class);
        MANAGER.load("pieza3.png", Texture.class);
        MANAGER.load("pieza4.png", Texture.class);
        MANAGER.load("pieza5.png", Texture.class);
        MANAGER.load("pieza6.png", Texture.class);
        MANAGER.load("pieza7.png", Texture.class);
        MANAGER.load("pieza8.png", Texture.class);
        MANAGER.load("pieza9.png", Texture.class);
        MANAGER.load("pieza10.png", Texture.class);
        MANAGER.load("pieza11.png", Texture.class);
        MANAGER.load("pieza12.png", Texture.class);
        MANAGER.load("pieza13.png", Texture.class);
        MANAGER.load("pieza14.png", Texture.class);
        MANAGER.load("pieza15.png", Texture.class);
        MANAGER.load("pieza16.png", Texture.class);
        MANAGER.load("pieza17.png", Texture.class);
        MANAGER.load("pieza18.png", Texture.class);
        MANAGER.load("pieza19.png", Texture.class);
        MANAGER.load("pieza20.png", Texture.class);
        MANAGER.load("pieza21.png", Texture.class);
        MANAGER.load("pieza22.png", Texture.class);
        MANAGER.load("pieza23.png", Texture.class);
        MANAGER.load("pieza24.png", Texture.class);
        MANAGER.load("pieza25.png", Texture.class);
        MANAGER.load("fichaAmarilla.png", Texture.class);
        MANAGER.load("fichaAzulClara.png", Texture.class);
        MANAGER.load("fichaAzulOscura.png", Texture.class);
        MANAGER.load("fichaMorada.png", Texture.class);
        MANAGER.load("fichaNaranja.png", Texture.class);
        MANAGER.load("fichaRoja.png", Texture.class);
        MANAGER.load("fichaVerde.png", Texture.class);
        MANAGER.load("Blip_Select2.wav", Sound.class);
        MANAGER.load("Pickup_Coin.wav", Sound.class);
        MANAGER.load("Destruccion.wav", Sound.class);
        MANAGER.load("play.png", Texture.class);
        MANAGER.load("quit.png", Texture.class);
        MANAGER.load("gameOver.png", Texture.class);
        MANAGER.load("medalla.png", Texture.class);

        setScreen(PantallaCarga);
    }

    @Override
    public void dispose() {
        super.dispose();
        MANAGER.dispose();
    }

}
