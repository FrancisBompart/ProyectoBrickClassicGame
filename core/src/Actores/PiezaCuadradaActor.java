package Actores;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.fbjm.game.BlocksGameDesktop;
import java.util.ArrayList;
import java.util.List;
import Logica.Casilla;
import Logica.CasillaCuadrada;
import Logica.Ficha;
import Logica.FichaCuadrada;
import Logica.Pieza;
import Logica.Vigilante;

public class PiezaCuadradaActor extends PiezaActor<Integer, CasillaCuadrada, FichaCuadrada> {

    private final class InputPieza extends InputListener {
		private final Pieza<Integer, CasillaCuadrada, FichaCuadrada> piezaActiva;
		private final int pantalla;
		private final List<CasillaCuadrada> CASILLAS_JUEGO;
		private final List<CasillaActor> casillasActores;
		private final Rectangle piezaBox;

		private InputPieza(Pieza<Integer, CasillaCuadrada, FichaCuadrada> piezaActiva, int pantalla, List<CasillaCuadrada> CASILLAS_JUEGO, List<CasillaActor> casillasActores, Rectangle piezaBox) {
			this.piezaActiva = piezaActiva;
			this.pantalla = pantalla;
			this.CASILLAS_JUEGO = CASILLAS_JUEGO;
			this.casillasActores = casillasActores;
			this.piezaBox = piezaBox;
		}

		@Override
		public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
		    if (piezaLogica.bloqueada) {
		    	BlocksGameDesktop.MANAGER.get("Blip_Select2.wav", Sound.class).play();
		    	animacion = true;
		    	return false;	    	
		    }
		    else { 
		    	animacion = false;
		    	return true;
		    }
		}

		@Override
		public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
			int id = 0;
			boolean seHaJugado = false;
			
			if((getX()>60 && getX()<340) && (getY()<398 && getY()>(118-getHeight()))) {
				for(CasillaActor casilla : casillasActores) {
					if(!seHaJugado) {
						if(piezaBox.overlaps(casilla.casillaBox)) {
							if(piezaActiva.rutaImg == "pieza4.png" || piezaActiva.rutaImg == "pieza12.png") {
								id = casilla.id + 1;
							}
							else if(piezaActiva.rutaImg == "pieza8.png" || piezaActiva.rutaImg == "pieza16.png") {
								id = casilla.id + 2;
							}
							else 
								id = casilla.id;
							
							if (piezaLogica.ubicable(CASILLAS_JUEGO.get(id))) {
				            	BlocksGameDesktop.MANAGER.get("Pickup_Coin.wav", Sound.class).play();
				                piezaLogica.ponerPieza(CASILLAS_JUEGO.get(id));
				                piezaActiva.activa= false;
				                piezaLogica.principal.revisarVigilantes(new ArrayList<Vigilante<FichaCuadrada>>(), CASILLAS_JUEGO.get(id));
				     
							}
				            else
				            	BlocksGameDesktop.MANAGER.get("Blip_Select2.wav", Sound.class).play();
							
							seHaJugado = true;
						}
					}
				}
			}
		   
		    setSize(BlocksGameDesktop.MANAGER.get(piezaLogica.rutaImg, Texture.class).getWidth(),BlocksGameDesktop.MANAGER.get(piezaLogica.rutaImg, Texture.class).getHeight());
		    setPosition(pantalla - (getWidth()/2),30);
		    piezaBox.x = pantalla - (getWidth()/2);
		    piezaBox.y = 30;
		    piezaBox.width = getWidth();
		    piezaBox.height = getHeight();
		}

		@Override
		public void touchDragged(InputEvent event, float x, float y, int pointer) {
		    if(piezaActiva.rutaImg == "pieza19.png")
		        setSize(135,95);
		    else if(piezaActiva.rutaImg == "pieza20.png")
		        setSize(95,135);
		    else
		        setSize(95,95);

		    moveBy(x,y);
		    piezaBox.x = getX();
		    piezaBox.y = getY();
		    piezaBox.width = getWidth();
		    piezaBox.height = getHeight();
		    
		    
		    int limitX = 0;
		    int limitY = 0;

			if ((piezaActiva.rutaImg=="pieza1.png")||(piezaActiva.rutaImg=="pieza2.png")||(piezaActiva.rutaImg=="pieza3.png")||(piezaActiva.rutaImg=="pieza4.png")||
			    (piezaActiva.rutaImg=="pieza9.png")||(piezaActiva.rutaImg=="pieza10.png")||(piezaActiva.rutaImg=="pieza11.png")||(piezaActiva.rutaImg=="pieza12.png")||
				(piezaActiva.rutaImg=="pieza22.png")||(piezaActiva.rutaImg=="pieza23.png"))
				limitX = (int) (getWidth()/3);

			if ((piezaActiva.rutaImg=="pieza9.png")||(piezaActiva.rutaImg=="pieza10.png")||(piezaActiva.rutaImg=="pieza11.png")||(piezaActiva.rutaImg=="pieza12.png")||
			    (piezaActiva.rutaImg=="pieza13.png")||(piezaActiva.rutaImg=="pieza14.png")||(piezaActiva.rutaImg=="pieza15.png")||(piezaActiva.rutaImg=="pieza16.png")||
				(piezaActiva.rutaImg=="pieza21.png")||(piezaActiva.rutaImg=="pieza23.png"))
				limitY = (int) (getHeight()/3);

			if ((piezaActiva.rutaImg=="pieza18.png")||(piezaActiva.rutaImg=="pieza20.png")||(piezaActiva.rutaImg=="pieza21.png")||(piezaActiva.rutaImg=="pieza25.png"))
				limitX = (int) (getWidth()/3)*2;

			if ((piezaActiva.rutaImg=="pieza17.png")||(piezaActiva.rutaImg=="pieza19.png")||(piezaActiva.rutaImg=="pieza22.png")||(piezaActiva.rutaImg=="pieza25.png"))
				limitY = (int) (getHeight()/3)*2;

		    if(getX()<0)
		    	setX(0);
		    else if((getRight()-limitX) > getStage().getWidth())
		    	setX(getStage().getWidth()-(getWidth()-limitX));
		    if((getY()+limitY)<0)
		    	setY(0-limitY);
		    else if(getTop() > getStage().getHeight())
		    	setY(getStage().getHeight()-getHeight());
		}
	}


    public boolean animacion;
    private float timer;
    public int posicionX;
    public Rectangle piezaBox;

    public PiezaCuadradaActor(int posicionX, Pieza<Integer, CasillaCuadrada, FichaCuadrada> piezaLogica){
		super(piezaLogica);
        this.animacion = false;
        this.timer = 0.01f;
        this.posicionX = posicionX;
        piezaBox = new Rectangle(getX(), getY(), getWidth(), getHeight());
    }

    @Override
    public void setRuta(String ruta) {
        super.setRuta(ruta);
    }

    @Override
    public void setPiezaLogica(Pieza<Integer, CasillaCuadrada, FichaCuadrada> piezaLogica) { super.setPiezaLogica(piezaLogica); }

    @Override
    public void setMovimientos(final int pantalla, final List<CasillaCuadrada> CASILLAS_JUEGO, final Pieza<Integer, CasillaCuadrada, FichaCuadrada> piezaActiva, List<CasillaActor> casillasActores, Rectangle piezaBox){
        this.addListener(new InputPieza(piezaActiva, pantalla, CASILLAS_JUEGO, casillasActores, piezaBox));
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

