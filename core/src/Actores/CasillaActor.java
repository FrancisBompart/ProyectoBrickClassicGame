package Actores;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.fbjm.game.BlocksGameDesktop;

public class CasillaActor extends Actor {
    private TextureRegion pieza;
    public boolean animacion;
    public String ruta;
    public Rectangle casillaBox;
    public int id;

    public CasillaActor(String ruta, int id) {
    	this.id = id;
    	this.ruta = ruta; 	
        pieza = new TextureRegion(BlocksGameDesktop.MANAGER.get(ruta, Texture.class), 35,35); 
        setSize(pieza.getRegionWidth(),pieza.getRegionHeight());
        this.animacion = false;
        
        casillaBox = new Rectangle(getX(), getY(), getWidth(), getHeight());
    }
    
    public void setRuta(String ruta) {
    	this.ruta = ruta;
        pieza.setTexture(BlocksGameDesktop.MANAGER.get(ruta, Texture.class));
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(pieza, getX(), getY(), getOriginX(), getOriginY(), getWidth(), getHeight(), getScaleX(), getScaleY(), getRotation());
    }

	@Override
	public void act(float delta) {
		
	}
    
    
}
