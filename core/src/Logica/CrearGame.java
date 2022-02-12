package Logica;

import java.util.List;

interface CrearGame<VALOR,CASILLA extends Casilla<FICHA>,FICHA extends Ficha<VALOR,CASILLA,FICHA>>{
    public List<Pieza<VALOR,CASILLA,FICHA>> crearPiezasJuego();
    public List<Pieza<VALOR,CASILLA,FICHA>> crearPiezasActivas();
    public List<CASILLA> crearTablero();
    public List<CASILLA> asignarVigilantes(List<Vigilante<FICHA>> vigilantes, List<CASILLA> casillas);
    public List<Vigilante<FICHA>> asignarCasillas(List<Vigilante<FICHA>> vigilantes, List<CASILLA> casillas);
    public List<Vigilante<FICHA>> crearVigilantes();
}
