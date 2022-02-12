package Logica;

import java.util.List;
import java.util.Random;

public abstract class Generador<VALOR,CASILLA extends Casilla<FICHA>,FICHA extends Ficha<VALOR,CASILLA,FICHA>>{
    public List<Pieza<VALOR,CASILLA,FICHA>> piezasActivas;
    public List<Pieza<VALOR,CASILLA,FICHA>> piezasJuego;
    public int max_val;

    Generador(List<Pieza<VALOR,CASILLA,FICHA>> piezasActivas,List<Pieza<VALOR,CASILLA,FICHA>> piezasJuego,int max_val){
        this.piezasActivas= piezasActivas;
        this.piezasJuego= piezasJuego;
        this.max_val= max_val;
    }

    public int generarPieza(){
        Random rand = new Random();
        int randomNum = 0 + rand.nextInt((this.max_val - 0));
        return randomNum;
    }

    public boolean GameOver(){
        for (Pieza<VALOR,CASILLA,FICHA> pieza : piezasActivas) {
            if (!pieza.bloqueada)
                return false;
        }
        return true;
    }

    public abstract boolean bloquearPieza(Pieza<VALOR,CASILLA,FICHA> pieza, CASILLA casilla, List<Integer> CASILLAS_PRINCIPALES);
}
