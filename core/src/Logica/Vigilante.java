package Logica;

public class Vigilante<FICHA>{
    Casilla<FICHA> casilla;
    boolean vaciar;

    Vigilante(Casilla<FICHA> casilla, boolean vaciar){
        this.casilla=casilla;
        this.vaciar=vaciar;
    }

    public int vaciarCasillas(String direccion){
        int aumento_rate= this.casilla.vaciar(direccion);
        this.vaciar=false;
        return aumento_rate;
    }   

    public boolean revisarCasillas(String direccion){
        return this.casilla.revision(direccion);
    }

}
