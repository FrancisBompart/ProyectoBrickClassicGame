package Actores;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.fbjm.game.BlocksGameDesktop;

public class MarcoActor extends Actor {

    private TextureRegion pieza;

    public MarcoActor() {
        pieza = new TextureRegion(BlocksGameDesktop.MANAGER.get("marco.png", Texture.class), 365,365);
        setSize(325,325);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(pieza, getX(), getY(), getOriginX(), getOriginY(), getWidth(), getHeight(), getScaleX(), getScaleY(), getRotation());
    }
}
