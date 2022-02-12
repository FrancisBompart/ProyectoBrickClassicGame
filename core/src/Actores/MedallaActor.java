package Actores;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.fbjm.game.BlocksGameDesktop;

public class MedallaActor extends Actor{
	private TextureRegion pieza;
	public boolean animacion;
	private float timer = 0.01f;
	
	public MedallaActor(String ruta){
		pieza = new TextureRegion(BlocksGameDesktop.MANAGER.get(ruta, Texture.class), 
				BlocksGameDesktop.MANAGER.get(ruta, Texture.class).getWidth(), 
				BlocksGameDesktop.MANAGER.get(ruta, Texture.class).getHeight());
		setSize(70,70);
		this.animacion = false;
	}

	@Override
	public void draw(Batch batch, float parentAlpha) {
		batch.draw(pieza, getX(), getY(), getOriginX(), getOriginY(), getWidth(), getHeight(), getScaleX(), getScaleY(), getRotation());
	}

	@Override
	public void act(float delta) {
		if(animacion) {
    		if(timer<=0.04f) {
    			rotateBy(500*delta);
    			timer = timer + 0.01f;
    		}
    		else if(timer>0.04f && timer<=0.08f) {
    			rotateBy(-500*delta);
    			timer = timer + 0.01f;
    		}
    		else if(timer>0.08f && timer<=0.12f) {
    			rotateBy(-500*delta);
    			timer = timer + 0.01f;
    		}
    		else if(timer>0.12f && timer<=0.16f) {
    			rotateBy(500*delta);
    			timer = timer + 0.01f;
    		}
    		else {
    			setRotation(0);
    			animacion = false;
    			timer = 0.01f;
    		}
    	}
	}
	
	

}
