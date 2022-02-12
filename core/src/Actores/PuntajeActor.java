package Actores;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class PuntajeActor extends Actor {

	public int gain;
	private int pre;
	
	public BitmapFont font;
	
	public PuntajeActor(BitmapFont font) {
		this.font = font;	
		this.pre = 0;
	}

	@Override
	public void draw(Batch batch, float parentAlpha) {
		font.draw(batch,Integer.toString(gain), getX(), getY());
	}

	@Override
	public void act(float delta) {
		if(gain>pre) {
			String Gain = Integer.toString(gain);
			String Pre = Integer.toString(pre);
			if(Gain.length() > Pre.length() )	
				setPosition(getX()-5, 485);
			
			pre = gain;
		}
	}
}
