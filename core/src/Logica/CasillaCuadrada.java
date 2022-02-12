package Logica;

import java.util.HashMap;
import java.util.List;

public class CasillaCuadrada extends Casilla<FichaCuadrada> {
    public String rutaImg;

    CasillaCuadrada(int id, String forma) {
        super(id, forma);
    }

    public void setRuta(String rutaImg){
        this.rutaImg= rutaImg;
    }

    @Override
    public void setFicha(FichaCuadrada ficha){ super.setFicha(ficha); }

    @Override
    public boolean estaLibre(){
        return super.estaLibre();
    }

    @Override
    public void setMaxAdyacencia(){super.setMaxAdyacencia(); }

    @Override
    public void setAdyacentes(){
        HashMap<String, Casilla<FichaCuadrada>> adyacentes = new HashMap<>(this.MaxAdyacencia);
        this.adyacentes = adyacentes;
    }

    @Override
    public void setMaxVigilancia() {
        this.MaxVigilancia= this.MaxAdyacencia-1;
    }

    @Override
    public void setVigilantes(){
        HashMap<String,Vigilante<FichaCuadrada>> vigilantes = new HashMap<>(this.MaxVigilancia);
        this.vigilantes = vigilantes;
    }

    @Override
    public boolean revision(String direccion) {
        if(!this.estaLibre()){
            if(((direccion=="DERECHA")&&(this.adyacentes.get("DERECHA") == null))||
               ((direccion=="ABAJO")&&(this.adyacentes.get("ABAJO") == null)))         
                return true;                
            else{
                if((direccion=="DERECHA")&&(this.adyacentes.get("DERECHA") != null)){
                    if (this.adyacentes.get("DERECHA").revision(direccion))
                        return true;
                }
                else if ((direccion=="ABAJO")&&(this.adyacentes.get("ABAJO") != null)){
                    if (this.adyacentes.get("ABAJO").revision(direccion))
                        return true;
                }
            }
        }
        return false;
    }

    @Override
    public int activarVigilantes(List<Integer> CASILLAS_PRINCIPALES) {
        String direccion="DERECHA";
        int aumento_rate=0;

        for (Vigilante<FichaCuadrada> vigilante : this.vigilantes.values()){
            if (vigilante.vaciar)
                aumento_rate+= vigilante.vaciarCasillas(direccion);
            direccion="ABAJO";
        }

        if ((this.id<=8)&&(this.adyacentes.get("DERECHA")!=null))
            aumento_rate+= this.adyacentes.get("DERECHA").activarVigilantes(CASILLAS_PRINCIPALES);
        
        if ((CASILLAS_PRINCIPALES.contains(this.id))&&(this.adyacentes.get("ABAJO")!=null))
            aumento_rate+= this.adyacentes.get("ABAJO").activarVigilantes(CASILLAS_PRINCIPALES);

        return aumento_rate;
    }

    @Override
    public int vaciar(String direccion) {
        int aumento_rate=10;
        this.setFicha(null);
        if ((this.adyacentes.get("DERECHA")!=null)&&(direccion=="DERECHA"))
            aumento_rate+= this.adyacentes.get("DERECHA").vaciar(direccion);    
        else if ((this.adyacentes.get("ABAJO")!=null)&&(direccion=="ABAJO"))
            aumento_rate+= this.adyacentes.get("ABAJO").vaciar(direccion);
        
        return aumento_rate;
    }

}
