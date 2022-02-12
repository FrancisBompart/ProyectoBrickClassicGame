package Actores;

import java.util.Random;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.fbjm.game.BlocksGameDesktop;

public class DestroyActor extends Actor {
    private TextureRegion pieza;
    public String ruta;
    public Vector2 velocidad = new Vector2(0,0);
    
	public DestroyActor(String ruta){
		this.ruta = ruta;
        pieza = new TextureRegion(BlocksGameDesktop.MANAGER.get(ruta, Texture.class), 35,35); 
        setSize(pieza.getRegionWidth(),pieza.getRegionHeight());
    }
	
	@Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(pieza, getX(), getY(), getOriginX(), getOriginY(), getWidth(), getHeight(), getScaleX(), getScaleY(), getRotation());
    }

	@Override
	public void act(float delta) {
		moveBy(velocidad.x*delta, velocidad.y*delta);
		if(getX()<0) {
	    	remove();
	    }
	    else if(getRight() > 400) {
	    	remove();
	    }
	    
	    if(getY()<0) {
	    	remove();
	    }
	    else if(getTop() > 500) {
	    	remove();
	    }
	}

}
