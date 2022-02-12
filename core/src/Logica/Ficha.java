package Logica;

import java.util.HashMap;
import java.util.List;

public abstract class Ficha<VALOR, CASILLA, FICHA> extends Forma{
    public VALOR score;
    public String forma;
    public int MaxAdyacencia;
    public HashMap<String,FICHA> adyacentes;
    
    Ficha(VALOR score, String forma){
        this.score= score;
        this.forma= forma;
    }

    public void setMaxAdyacencia(){this.MaxAdyacencia = Forma.formas.get(this.forma);};

    public void setAdyacentes(){
        HashMap<String,FICHA> adyacentes = new HashMap<>(this.MaxAdyacencia);
        this.adyacentes= adyacentes;
    }

    public abstract boolean ubicable(CASILLA casilla);
    public abstract void ubicar(CASILLA casilla);
    public abstract void revisarVigilantes(List<Vigilante<FICHA>> realizaronVigilancia, CASILLA casilla);
    public abstract VALOR getPuntaje();

}