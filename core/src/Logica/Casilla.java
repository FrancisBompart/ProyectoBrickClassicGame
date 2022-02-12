package Logica;

import java.util.HashMap;
import java.util.List;

public abstract class Casilla<FICHA> extends Forma {
    public int id;
    public String forma;
    public int MaxAdyacencia;
    HashMap<String,Casilla<FICHA>> adyacentes;
    HashMap<String,Vigilante<FICHA>> vigilantes;
    public int MaxVigilancia;
    public FICHA ficha;

    Casilla(int id, String forma){
        this.id= id;
        this.forma= forma;
    }

    public void setFicha(FICHA ficha){ this.ficha= ficha;}

    public void setMaxAdyacencia(){ this.MaxAdyacencia = formas.get(this.forma);}

    public boolean estaLibre(){ return (this.ficha==null); }

    public abstract void setAdyacentes();
    public abstract void setVigilantes();
    public abstract void setMaxVigilancia();
    public abstract boolean revision(String direccion);
    public abstract int activarVigilantes(List<Integer> CASILLAS_PRINCIPALES);
    public abstract int vaciar(String direccion);
}
