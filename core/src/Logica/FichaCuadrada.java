package Logica;

import java.util.List;

public class FichaCuadrada extends Ficha<Integer,CasillaCuadrada,FichaCuadrada>{
    public String rutaImg;

    FichaCuadrada(Integer score, String forma){
        super(score, forma);
    }

    public void setRuta(String rutaImg) {
        this.rutaImg= rutaImg;
    }

    @Override
    public void setMaxAdyacencia(){
        super.setMaxAdyacencia();
    }

    @Override
    public void setAdyacentes(){
        super.setAdyacentes();
    }

    @Override
    public boolean ubicable(CasillaCuadrada casilla) {
        boolean logrado=true;

        if((casilla != null)&&(casilla.estaLibre())){
            if(this.adyacentes.get("DERECHA") != null)
                logrado= this.adyacentes.get("DERECHA").ubicable((CasillaCuadrada) casilla.adyacentes.get("DERECHA"));
            if ((logrado)&&(this.adyacentes.get("ABAJO") != null))
                logrado= this.adyacentes.get("ABAJO").ubicable((CasillaCuadrada) casilla.adyacentes.get("ABAJO"));
            if ((logrado)&&(this.adyacentes.get("IZQUIERDA") != null))
                logrado= this.adyacentes.get("IZQUIERDA").ubicable((CasillaCuadrada) casilla.adyacentes.get("IZQUIERDA"));
        }
        else logrado=false;
        
        return logrado;
    }

    @Override
    public void ubicar(CasillaCuadrada casilla){
        casilla.setFicha(this);
        if(this.adyacentes.get("DERECHA")!= null)
            this.adyacentes.get("DERECHA").ubicar((CasillaCuadrada) casilla.adyacentes.get("DERECHA"));
        if(this.adyacentes.get("ABAJO") != null)
            this.adyacentes.get("ABAJO").ubicar((CasillaCuadrada) casilla.adyacentes.get("ABAJO"));
        if(this.adyacentes.get("IZQUIERDA") != null)
            this.adyacentes.get("IZQUIERDA").ubicar((CasillaCuadrada) casilla.adyacentes.get("IZQUIERDA"));        
    }

    @Override
    public void revisarVigilantes(List<Vigilante<FichaCuadrada>> realizaronVigilancia, CasillaCuadrada casilla){
        String direccion= "DERECHA";
        for(Vigilante<FichaCuadrada> vigilante: casilla.vigilantes.values()){
            if(!realizaronVigilancia.contains(vigilante)){
                realizaronVigilancia.add(vigilante);
                if (vigilante.revisarCasillas(direccion))
                    vigilante.vaciar=true;
            }
            direccion="ABAJO";
        }
        if (this.adyacentes.get("DERECHA") != null)
            this.adyacentes.get("DERECHA").revisarVigilantes(realizaronVigilancia, (CasillaCuadrada) casilla.adyacentes.get("DERECHA"));
        if (this.adyacentes.get("ABAJO") != null)
            this.adyacentes.get("ABAJO").revisarVigilantes(realizaronVigilancia, (CasillaCuadrada) casilla.adyacentes.get("ABAJO"));
        if (this.adyacentes.get("IZQUIERDA") != null)
            this.adyacentes.get("IZQUIERDA").revisarVigilantes(realizaronVigilancia, (CasillaCuadrada) casilla.adyacentes.get("IZQUIERDA"));
    }

    @Override
    public Integer getPuntaje(){
        int puntajefinal=this.score;
        if (this.adyacentes.get("DERECHA") != null)
            puntajefinal+= this.adyacentes.get("DERECHA").getPuntaje();
        if (this.adyacentes.get("ABAJO") != null)
            puntajefinal+= this.adyacentes.get("ABAJO").getPuntaje();
        if (this.adyacentes.get("IZQUIERDA") != null)
            puntajefinal+= this.adyacentes.get("IZQUIERDA").getPuntaje();
        return puntajefinal;
    }
}
