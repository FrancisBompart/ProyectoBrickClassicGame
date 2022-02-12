package Actores;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.fbjm.game.BlocksGameDesktop;

import java.util.List;

import Logica.Casilla;
import Logica.CasillaCuadrada;
import Logica.Ficha;
import Logica.FichaCuadrada;
import Logica.Pieza;

public abstract class PiezaActor<VALOR,CASILLA extends Casilla<FICHA>,FICHA extends Ficha<VALOR,CASILLA,FICHA>> extends Actor {
    public TextureRegion pieza;
    public Pieza<VALOR,CASILLA,FICHA> piezaLogica;

    PiezaActor(Pieza<VALOR,CASILLA,FICHA> piezaLogica){
        this.piezaLogica= piezaLogica;

        pieza = new TextureRegion(BlocksGameDesktop.MANAGER.get(piezaLogica.rutaImg, Texture.class),
                BlocksGameDesktop.MANAGER.get(this.piezaLogica.rutaImg, Texture.class).getWidth(),
                BlocksGameDesktop.MANAGER.get(this.piezaLogica.rutaImg, Texture.class).getHeight());

        setSize(pieza.getRegionWidth(),pieza.getRegionHeight());
    }

    public void setRuta(String ruta){
        pieza.setTexture(BlocksGameDesktop.MANAGER.get(ruta, Texture.class));
        setSize(BlocksGameDesktop.MANAGER.get(this.piezaLogica.rutaImg, Texture.class).getWidth(),
                BlocksGameDesktop.MANAGER.get(this.piezaLogica.rutaImg, Texture.class).getHeight());
    }

    public void setPiezaLogica(Pieza<VALOR,CASILLA,FICHA> piezaLogica){this.piezaLogica = piezaLogica;}

	public void setMovimientos(int pantalla, List<CasillaCuadrada> CASILLAS_JUEGO,
			Pieza<Integer, CasillaCuadrada, FichaCuadrada> piezaActiva, List<CasillaActor> casillasActores,
			Rectangle piezaBox) {
		
	}
}
