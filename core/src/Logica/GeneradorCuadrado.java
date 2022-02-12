package Logica;

import java.util.List;

public class GeneradorCuadrado extends Generador<Integer,CasillaCuadrada,FichaCuadrada>{
    public GeneradorCuadrado(List<Pieza<Integer, CasillaCuadrada, FichaCuadrada>> piezasActivas, List<Pieza<Integer, CasillaCuadrada, FichaCuadrada>> piezasJuego, int max_val) {
        super(piezasActivas,piezasJuego, max_val);
    }

    @Override
    public int generarPieza(){   
        return super.generarPieza();
    }

    @Override
    public boolean GameOver(){
        return super.GameOver();
    }

    @Override
    public boolean bloquearPieza(Pieza<Integer,CasillaCuadrada, FichaCuadrada> pieza,
                                 CasillaCuadrada casilla, List<Integer> CASILLAS_PRINCIPALES) {
        boolean bloquear= true;
        if(pieza.ubicable(casilla))
            bloquear=false;
        else{
            if(casilla.adyacentes.get("DERECHA") != null)
                bloquear= this.bloquearPieza(pieza, (CasillaCuadrada) casilla.adyacentes.get("DERECHA"),CASILLAS_PRINCIPALES);
            if ((bloquear)&&(CASILLAS_PRINCIPALES.contains(casilla.id))&&(casilla.adyacentes.get("ABAJO")!=null))
                bloquear= this.bloquearPieza(pieza, (CasillaCuadrada) casilla.adyacentes.get("ABAJO"),CASILLAS_PRINCIPALES);
        }
        return bloquear;
    }

}
