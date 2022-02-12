package Logica;

import java.util.List;

public class Pieza<VALOR,CASILLA extends Casilla<FICHA>,FICHA extends Ficha<VALOR,CASILLA,FICHA>>{
    public boolean bloqueada;
    public boolean activa;
    public Ficha<VALOR,CASILLA,FICHA> principal;
    public List<FICHA> fichas;
    public String rutaImg;

    Pieza(boolean bloqueada, boolean activa,Ficha<VALOR,CASILLA,FICHA> principal, List<FICHA> fichas){
        this.bloqueada=bloqueada;
        this.activa= activa;
        this.principal= principal;
        this.fichas=fichas;
    }

    public void setRuta(String rutaImg) {
        this.rutaImg = rutaImg;
    }

    public void setFichas(FICHA...args){
        for (FICHA ficha: args)
            this.fichas.add(ficha);
    }

    public void actualizar(String rutaImg,List<FICHA> fichas){
        this.rutaImg = rutaImg;
        this.fichas=fichas;
    }

    public boolean ubicable(CASILLA origen){
        return this.principal.ubicable(origen);
    }

    public void ponerPieza(CASILLA casilla){
        this.principal.ubicar(casilla);
    }

    public VALOR getPuntaje(){
        return this.principal.getPuntaje();
    }

}