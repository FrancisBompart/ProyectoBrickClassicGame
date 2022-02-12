package com.fbjm.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

import Actores.CasillaActor;
import Actores.DestroyActor;
import Actores.GameOver;
import Actores.MarcoActor;
import Actores.MedallaActor;
import Actores.PiezaCuadradaActor;
import Actores.PuntajeActor;
import Logica.CasillaCuadrada;
import Logica.CrearBrickClassic;
import Logica.FichaCuadrada;
import Logica.Forma;
import Logica.GeneradorCuadrado;
import Logica.Pieza;
import Logica.Vigilante;

public class PantallaJuego extends Pantallas{
    private Stage stage;
    CrearBrickClassic crearBlocksGame = new CrearBrickClassic();
    GeneradorCuadrado generador = new GeneradorCuadrado(crearBlocksGame.crearPiezasActivas(),crearBlocksGame.crearPiezasJuego(), 25);
    List<CasillaCuadrada> CASILLAS_JUEGO = crearBlocksGame.crearTablero();
    List<Vigilante<FichaCuadrada>> VIGILANTES = crearBlocksGame.crearVigilantes();
    final CasillaCuadrada ORIGEN = CASILLAS_JUEGO.get(0);
    public int gain= 0;
    public int n_pieza=0;
    final List<Integer> CASILLAS_PRINCIPALES = new ArrayList<Integer>(){{add(0);add(8);add(16);add(24);add(32);add(40);add(48);add(56);}};

    //marco grafico
    private MarcoActor marco;

    //piezas graficas
    public PiezaCuadradaActor pieza1;
    public PiezaCuadradaActor pieza2;
    public PiezaCuadradaActor pieza3;
    public List<PiezaCuadradaActor> piezaCuadradaActores = new ArrayList<PiezaCuadradaActor>();;

    //casilla vacia grafica
    private CasillaActor casilla;
    private List<CasillaActor> casillasActores = new ArrayList<CasillaActor>();
    
    //Actores para eliminar casillas
    private DestroyActor Destroy;
    private List<DestroyActor> Destruidos = new ArrayList<DestroyActor>();
    
    //
    private MedallaActor medalla;
    
    //puntaje
    private PuntajeActor puntaje;
    
    //gameOver
    private GameOver over;
    
    public PantallaJuego(BlocksGameDesktop juego) {
        super(juego);
    }

    @Override
    public void show() {

        //se crea el stage
    	stage = new Stage();
    	
    	//dimensiones de la pantalla
    	int width = Gdx.graphics.getWidth();
    	int height = Gdx.graphics.getHeight();
    	
        //se habilita al stage la entrada del usuario
        Gdx.input.setInputProcessor(stage);
        
        Image imgFondo = new Image(BlocksGameDesktop.MANAGER.get("fondoJuego.jpg",Texture.class));
        imgFondo.setFillParent(true);
        stage.addActor(imgFondo);
        
        //se crea el tablero grafico vacio inicialmente
        for(int index = 0; index<64 ; index++) {
            casilla = new CasillaActor("casillaVacia.jpg", index);
            casillasActores.add(casilla);
        }

        //se crea el marco
        marco = new MarcoActor();
        marco.setPosition((width/2)-(marco.getWidth()/2), 130);
        stage.addActor(marco);

        //se actualizan las piezas logicas iniciales
        actualizarPiezasLogicas();

        //actualizar el tablero vacio
        actualizarTablero(60,398,stage);
        
        //pieza1
        pieza1 = new PiezaCuadradaActor((int) (((width*(21.25))/100)), generador.piezasActivas.get(0));
        pieza1.setPosition((pieza1.posicionX)-(pieza1.getHeight()/2), 20);
        pieza1.setMovimientos((int) (pieza1.posicionX), CASILLAS_JUEGO, generador.piezasActivas.get(0), casillasActores, pieza1.piezaBox);
        stage.addActor(pieza1);
        piezaCuadradaActores.add(pieza1);
        
        //pieza2
        pieza2 = new PiezaCuadradaActor((int)  (((width*(50))/100)), generador.piezasActivas.get(1));
        pieza2.setPosition((pieza2.posicionX)-(pieza2.getHeight()/2), 20);
        pieza2.setMovimientos((int) (pieza2.posicionX), CASILLAS_JUEGO,generador.piezasActivas.get(1), casillasActores, pieza2.piezaBox);
        stage.addActor(pieza2);;
        piezaCuadradaActores.add(pieza2);
        
        //pieza3
        pieza3 = new PiezaCuadradaActor((int)  (((width*(78.75))/100)),generador.piezasActivas.get(2));
        pieza3.setPosition((pieza3.posicionX)-(pieza3.getHeight()/2), 20);
        pieza3.setMovimientos((int) (pieza3.posicionX), CASILLAS_JUEGO, generador.piezasActivas.get(2), casillasActores, pieza3.piezaBox);
        stage.addActor(pieza3);
        piezaCuadradaActores.add(pieza3);
        
        //medalla
        medalla = new MedallaActor("medalla.png");
        medalla.setPosition(width/2-medalla.getWidth()/2, 450);
        stage.addActor(medalla);
        
        //puntaje
        puntaje = new PuntajeActor(new BitmapFont());   
        puntaje.setPosition(width/2-3,485);
        puntaje.gain = 0;
        stage.addActor(puntaje);
        
        //gameOver
        over = new GameOver("gameOver.png");
        over.setPosition((width/2)-(over.getWidth()/2),-over.getHeight());
        over.addListener(new InputListener() {

			@Override
			public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
				if(!over.animacion)
					juego.setScreen(juego.PantallaMenu);
				return true;
			}
        	
        });
        over.velocidad.x = 3;
        over.velocidad.y = 3;
        stage.addActor(over);
        
        CASILLAS_JUEGO = crearBlocksGame.asignarVigilantes(VIGILANTES, CASILLAS_JUEGO);
        VIGILANTES= crearBlocksGame.asignarCasillas(VIGILANTES, CASILLAS_JUEGO);
    }

    public void actualizarPiezasLogicas() {
        for(Pieza<Integer,CasillaCuadrada,FichaCuadrada> piezaLogica: generador.piezasActivas){

            if (!piezaLogica.activa){
                n_pieza = generador.generarPieza();
                piezaLogica.fichas = generador.piezasJuego.get(n_pieza).fichas;
                piezaLogica.principal= generador.piezasJuego.get(n_pieza).principal;

                piezaLogica.actualizar(generador.piezasJuego.get(n_pieza).rutaImg, generador.piezasJuego.get(n_pieza).fichas);

                if (generador.bloquearPieza(piezaLogica, ORIGEN, CASILLAS_PRINCIPALES))
                    piezaLogica.bloqueada = true;
                else{
                    piezaLogica.activa = true;
                    piezaLogica.bloqueada = false;
                }
            }
            else {
                if (generador.bloquearPieza(piezaLogica,ORIGEN,CASILLAS_PRINCIPALES)){
                    piezaLogica.bloqueada=true;
                    piezaLogica.activa= true;
                }
                else {
                    piezaLogica.activa=true;
                    piezaLogica.bloqueada=false;
                }
            }
        }
    }

    public void actualizarTablero(int x, int y, Stage stage){
        int index = 0;
        
        for(CasillaCuadrada casillaLogica : CASILLAS_JUEGO) {
            if(casillaLogica.ficha == null) {
            	 if(casillasActores.get(index).ruta != "casillaVacia.jpg") {
            		//sonido si explotan
            		BlocksGameDesktop.MANAGER.get("Destruccion.wav", Sound.class).play();
            		Random rand = new Random();
            		int deg = 1 + rand.nextInt((359 - 1));
            		int dire = 0 + rand.nextInt((3 - 0));
            		int Vx = 150 + rand.nextInt((180 - 150));
            	    int Vy = 150 + rand.nextInt((180 - 150));
            	    
            	    if(dire == 1)
            	    	Vx = -Vx;
            	    else if(dire == 2) {
            	    	Vx = -Vx;
            	    	Vy = -Vy;         
            	    }
            	    else if(dire == 3)
            	    	Vy = -Vy;
            	        
            		casillasActores.get(index).animacion = false;
                 	Destroy = new DestroyActor(casillasActores.get(index).ruta);
                 	stage.addActor(Destroy);
                 	Destroy.setPosition(x, y);
                 	Destroy.velocidad.x = Vx;
                 	Destroy.velocidad.y = Vy;
                 	Destroy.velocidad.rotateDeg(deg);
                 	Destruidos.add(Destroy);

            	 }
            		 
                casillasActores.get(index).setRuta("casillaVacia.jpg");
                casillasActores.get(index).setPosition(x, y);
                stage.addActor(casillasActores.get(index));
                casillasActores.get(index).casillaBox.x = casillasActores.get(index).getX();
                casillasActores.get(index).casillaBox.y = casillasActores.get(index).getY();
            }
            else {
                casillasActores.get(index).setRuta(casillaLogica.ficha.rutaImg);
                casillasActores.get(index).setPosition(x, y);
                stage.addActor(casillasActores.get(index));
            }

            if ((casillaLogica.id+1) % 8 == 0 ){		//es un multiplo de 8, esta al final de la fila
                x=60;
                y-=35;
            }
            else x+=35;
            index++; 
        }
    }

    public void actualizarPiezaGrafica(List<PiezaCuadradaActor> piezaCuadradaActores){
        int index = 0;
        for(Pieza<Integer,CasillaCuadrada,FichaCuadrada> piezaLogica: generador.piezasActivas){
            piezaCuadradaActores.get(index).setPiezaLogica(piezaLogica);
            piezaCuadradaActores.get(index).setRuta(piezaLogica.rutaImg);
            piezaCuadradaActores.get(index).setMovimientos(piezaCuadradaActores.get(index).posicionX, CASILLAS_JUEGO, piezaLogica, casillasActores,piezaCuadradaActores.get(index).piezaBox);
            index++;
        }
    }

    public boolean seHaJugado() {
        boolean seHaJugadoUnaPieza = false;

        for(Pieza<Integer, CasillaCuadrada, FichaCuadrada> piezaLogica: generador.piezasActivas){
            if (!piezaLogica.activa){
                seHaJugadoUnaPieza = true;
                gain += piezaLogica.getPuntaje();
                puntaje.gain = gain;
            }
        }

        return seHaJugadoUnaPieza;
    }  

    @Override
    public void render(float delta) {
    	
    	Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act();
        stage.draw(); 
          if(seHaJugado()){
        	  actualizarPiezasLogicas();
              actualizarPiezaGrafica(piezaCuadradaActores);
              actualizarTablero(60,398,stage);
              gain += ORIGEN.activarVigilantes(CASILLAS_PRINCIPALES);
              medalla.animacion = true;
              desbloquearPiezasLogicas();
              actualizarTablero(60,398,stage);
              if(generador.GameOver())
                over.animacion = true;   
          }  
    }

	private void desbloquearPiezasLogicas(){
        int index=0;
        for(Pieza<Integer,CasillaCuadrada,FichaCuadrada> piezaLogica: generador.piezasActivas){
            if (generador.bloquearPieza(piezaLogica,ORIGEN,CASILLAS_PRINCIPALES)){
                piezaCuadradaActores.get(index).piezaLogica.bloqueada=true;
                piezaCuadradaActores.get(index).piezaLogica.activa= true;
            }
            else {
                piezaCuadradaActores.get(index).piezaLogica.activa=true;
                piezaCuadradaActores.get(index).piezaLogica.bloqueada=false;
            }
            index++;
        }

    }

    @Override
    public void dispose() {
        stage.dispose();
    }

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void hide() {
		Gdx.input.setInputProcessor(null);
	}
    
}