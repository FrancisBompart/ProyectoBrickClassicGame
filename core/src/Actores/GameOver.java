package Actores;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.fbjm.game.BlocksGameDesktop;

public class GameOver extends Actor {
	
	private float timer = 0.01f;
	public boolean animacion ;
	public boolean animacion2;
	private TextureRegion pieza;
	public Vector2 velocidad = new Vector2(0,0);

	public GameOver(String ruta){
		pieza = new TextureRegion(BlocksGameDesktop.MANAGER.get(ruta, Texture.class), 
				BlocksGameDesktop.MANAGER.get(ruta, Texture.class).getWidth(), 
				BlocksGameDesktop.MANAGER.get(ruta, Texture.class).getHeight());
		
		setSize(300,300);
		this.animacion = false;
		this.animacion2 = false;
	}
	
	@Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(pieza, getX(), getY(), getOriginX(), getOriginY(), getWidth(), getHeight(), getScaleX(), getScaleY(), getRotation());
    }

	@Override
	public void act(float delta) {
		if(animacion) {
			moveBy(velocidad.x*delta, velocidad.y);
			
			if(getY()>250-getHeight()/2) {
				setPosition(getX(),250-getHeight()/2);
				animacion = false;
				animacion2 = true;
			}
		}
		
		if(animacion2) {
			if(timer < 0.2f)
				setSize(300, 300);
			
			else if(timer > 0.2f && timer < 0.4f)
				setSize(310, 310);
				
				
			if(timer>0.4f)
				timer = 0.01f;
				
			timer = timer + 0.01f;			
		}
	}
}
