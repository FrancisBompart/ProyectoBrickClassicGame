package Logica;

import java.util.ArrayList;
import java.util.List;

public class CrearBrickClassic implements CrearGame<Integer,CasillaCuadrada,FichaCuadrada> {

    @Override
    public List<Pieza<Integer, CasillaCuadrada, FichaCuadrada>> crearPiezasJuego() {
        List<Pieza<Integer, CasillaCuadrada, FichaCuadrada>> piezasJuego = new ArrayList<Pieza<Integer, CasillaCuadrada, FichaCuadrada>>();

        /*      PIEZA 1
                  f1 f2
                     f3
                     f4
        */

        FichaCuadrada f1 = new FichaCuadrada(10, "CUADRADO"); f1.setMaxAdyacencia(); f1.setAdyacentes();
        f1.setRuta("fichaVerde.png");
        FichaCuadrada f2 = new FichaCuadrada(10, "CUADRADO"); f2.setMaxAdyacencia(); f2.setAdyacentes();
        f2.setRuta("fichaVerde.png");
        FichaCuadrada f3 = new FichaCuadrada(10, "CUADRADO"); f3.setMaxAdyacencia(); f3.setAdyacentes();
        f3.setRuta("fichaVerde.png");
        FichaCuadrada f4 = new FichaCuadrada(10, "CUADRADO"); f4.setMaxAdyacencia(); f4.setAdyacentes();
        f4.setRuta("fichaVerde.png");
        f1.adyacentes.put("DERECHA",f2); f1.adyacentes.put("ABAJO", null); f1.adyacentes.put("IZQUIERDA",null);
        f2.adyacentes.put("DERECHA", null); f2.adyacentes.put("ABAJO",f3); f2.adyacentes.put("IZQUIERDA", null);
        f3.adyacentes.put("DERECHA", null); f3.adyacentes.put("ABAJO", f4); f3.adyacentes.put("IZQUIERDA", null);
        f4.adyacentes.put("DERECHA", null); f4.adyacentes.put("ABAJO", null); f4.adyacentes.put("IZQUIERDA", null);

        Pieza<Integer,CasillaCuadrada,FichaCuadrada> pieza1 = new Pieza<Integer,CasillaCuadrada,FichaCuadrada>
                (false, true, f1, new ArrayList<FichaCuadrada>());
        pieza1.setFichas(f1,f2,f3,f4);
        pieza1.setRuta("pieza1.png");

        piezasJuego.add(pieza1);

        /*      PIEZA 2
                  f5 f6
                  f7
                  f8
        */

        FichaCuadrada f5 = new FichaCuadrada(10, "CUADRADO"); f5.setMaxAdyacencia(); f5.setAdyacentes();
        f5.setRuta("fichaVerde.png");
        FichaCuadrada f6 = new FichaCuadrada(10, "CUADRADO"); f6.setMaxAdyacencia(); f6.setAdyacentes();
        f6.setRuta("fichaVerde.png");
        FichaCuadrada f7 = new FichaCuadrada(10, "CUADRADO"); f7.setMaxAdyacencia(); f7.setAdyacentes();
        f7.setRuta("fichaVerde.png");
        FichaCuadrada f8 = new FichaCuadrada(10, "CUADRADO"); f8.setMaxAdyacencia(); f8.setAdyacentes();
        f8.setRuta("fichaVerde.png");
        f5.adyacentes.put("DERECHA",f6); f5.adyacentes.put("ABAJO",f7);f5.adyacentes.put("IZQUIERDA",null);
        f6.adyacentes.put("DERECHA", null); f6.adyacentes.put("ABAJO",null); f6.adyacentes.put("IZQUIERDA", null);
        f7.adyacentes.put("DERECHA", null); f7.adyacentes.put("ABAJO", f8); f7.adyacentes.put("IZQUIERDA", null);
        f8.adyacentes.put("DERECHA", null); f8.adyacentes.put("ABAJO", null); f8.adyacentes.put("IZQUIERDA", null);

        Pieza<Integer,CasillaCuadrada,FichaCuadrada> pieza2 = new Pieza<Integer,CasillaCuadrada,FichaCuadrada>(false, true, f5, new ArrayList<FichaCuadrada>());
        pieza2.setFichas(f5,f6,f7,f8);
        pieza2.setRuta("pieza2.png");
        piezasJuego.add(pieza2);

        /*      PIEZA 3
                  f9
                  f10
                  f11 f12
        */

        FichaCuadrada f9 = new FichaCuadrada(10, "CUADRADO"); f9.setMaxAdyacencia(); f9.setAdyacentes();
        f9.setRuta("fichaVerde.png");
        FichaCuadrada f10 = new FichaCuadrada(10, "CUADRADO"); f10.setMaxAdyacencia(); f10.setAdyacentes();
        f10.setRuta("fichaVerde.png");
        FichaCuadrada f11 = new FichaCuadrada(10, "CUADRADO"); f11.setMaxAdyacencia(); f11.setAdyacentes();
        f11.setRuta("fichaVerde.png");
        FichaCuadrada f12 = new FichaCuadrada(10, "CUADRADO"); f12.setMaxAdyacencia(); f12.setAdyacentes();
        f12.setRuta("fichaVerde.png");
        f9.adyacentes.put("DERECHA", null); f9.adyacentes.put("ABAJO",f10); f9.adyacentes.put("IZQUIERDA",null);
        f10.adyacentes.put("DERECHA", null); f10.adyacentes.put("ABAJO",f11); f10.adyacentes.put("IZQUIERDA", null);
        f11.adyacentes.put("DERECHA", f12); f11.adyacentes.put("ABAJO", null); f11.adyacentes.put("IZQUIERDA", null);
        f12.adyacentes.put("DERECHA", null); f12.adyacentes.put("ABAJO", null); f12.adyacentes.put("IZQUIERDA", null);

        Pieza<Integer,CasillaCuadrada,FichaCuadrada> pieza3 = new Pieza<Integer,CasillaCuadrada,FichaCuadrada>(false, true, f9, new ArrayList<FichaCuadrada>());
        pieza3.setFichas(f9,f10,f11,f12);
        pieza3.setRuta("pieza3.png");
        piezasJuego.add(pieza3);

        /*      PIEZA 4
                      f13
                      f14
                  f16 f15
        */

        FichaCuadrada f13 = new FichaCuadrada(10, "CUADRADO"); f13.setMaxAdyacencia(); f13.setAdyacentes();
        f13.setRuta("fichaVerde.png");
        FichaCuadrada f14 = new FichaCuadrada(10, "CUADRADO"); f14.setMaxAdyacencia(); f14.setAdyacentes();
        f14.setRuta("fichaVerde.png");
        FichaCuadrada f15 = new FichaCuadrada(10, "CUADRADO"); f15.setMaxAdyacencia(); f15.setAdyacentes();
        f15.setRuta("fichaVerde.png");
        FichaCuadrada f16 = new FichaCuadrada(10, "CUADRADO"); f16.setMaxAdyacencia(); f16.setAdyacentes();
        f16.setRuta("fichaVerde.png");
        f13.adyacentes.put("DERECHA", null); f13.adyacentes.put("ABAJO",f14); f13.adyacentes.put("IZQUIERDA",null);
        f14.adyacentes.put("DERECHA", null); f14.adyacentes.put("ABAJO",f15); f14.adyacentes.put("IZQUIERDA", null);
        f15.adyacentes.put("DERECHA", null); f15.adyacentes.put("ABAJO", null); f15.adyacentes.put("IZQUIERDA", f16);
        f16.adyacentes.put("DERECHA", null); f16.adyacentes.put("ABAJO", null); f16.adyacentes.put("IZQUIERDA", null);

        Pieza<Integer,CasillaCuadrada,FichaCuadrada> pieza4 = new Pieza<Integer,CasillaCuadrada,FichaCuadrada>(false, true, f13, new ArrayList<FichaCuadrada>());
        pieza4.setFichas(f13,f14,f15,f16);
        pieza4.setRuta("pieza4.png");
        piezasJuego.add(pieza4);

        /*      PIEZA 5
                  f17 f18 f19
                  f20
                  f21
        */

        FichaCuadrada f17 = new FichaCuadrada(10, "CUADRADO"); f17.setMaxAdyacencia(); f17.setAdyacentes();
        f17.setRuta("fichaVerde.png");
        FichaCuadrada f18 = new FichaCuadrada(10, "CUADRADO"); f18.setMaxAdyacencia(); f18.setAdyacentes();
        f18.setRuta("fichaVerde.png");
        FichaCuadrada f19 = new FichaCuadrada(10, "CUADRADO"); f19.setMaxAdyacencia(); f19.setAdyacentes();
        f19.setRuta("fichaVerde.png");
        FichaCuadrada f20 = new FichaCuadrada(10, "CUADRADO"); f20.setMaxAdyacencia(); f20.setAdyacentes();
        f20.setRuta("fichaVerde.png");
        FichaCuadrada f21 = new FichaCuadrada(10, "CUADRADO"); f21.setMaxAdyacencia(); f21.setAdyacentes();
        f21.setRuta("fichaVerde.png");
        f17.adyacentes.put("DERECHA", f18); f17.adyacentes.put("ABAJO", f20); f17.adyacentes.put("IZQUIERDA", null);
        f18.adyacentes.put("DERECHA", f19); f18.adyacentes.put("ABAJO", null); f18.adyacentes.put("IZQUIERDA", null);
        f19.adyacentes.put("DERECHA", null); f19.adyacentes.put("ABAJO", null); f19.adyacentes.put("IZQUIERDA", null);
        f20.adyacentes.put("DERECHA", null); f20.adyacentes.put("ABAJO", f21); f20.adyacentes.put("IZQUIERDA", null);
        f21.adyacentes.put("DERECHA", null); f21.adyacentes.put("ABAJO", null); f21.adyacentes.put("IZQUIERDA", null);

        Pieza<Integer,CasillaCuadrada,FichaCuadrada> pieza5 = new Pieza<Integer,CasillaCuadrada,FichaCuadrada>(false, true, f17, new ArrayList<FichaCuadrada>());
        pieza5.setFichas(f17,f18,f19,f20,f21);
        pieza5.setRuta("pieza5.png");
        piezasJuego.add(pieza5);

        /*      PIEZA 6
                  f22 f23 f24
                          f25
                          f26
        */

        FichaCuadrada f22 = new FichaCuadrada(10, "CUADRADO"); f22.setMaxAdyacencia(); f22.setAdyacentes();
        f22.setRuta("fichaVerde.png");
        FichaCuadrada f23 = new FichaCuadrada(10, "CUADRADO"); f23.setMaxAdyacencia(); f23.setAdyacentes();
        f23.setRuta("fichaVerde.png");
        FichaCuadrada f24 = new FichaCuadrada(10, "CUADRADO"); f24.setMaxAdyacencia(); f24.setAdyacentes();
        f24.setRuta("fichaVerde.png");
        FichaCuadrada f25 = new FichaCuadrada(10, "CUADRADO"); f25.setMaxAdyacencia(); f25.setAdyacentes();
        f25.setRuta("fichaVerde.png");
        FichaCuadrada f26 = new FichaCuadrada(10, "CUADRADO"); f26.setMaxAdyacencia(); f26.setAdyacentes();
        f26.setRuta("fichaVerde.png");
        f22.adyacentes.put("DERECHA", f23); f22.adyacentes.put("ABAJO", null); f22.adyacentes.put("IZQUIERDA", null);
        f23.adyacentes.put("DERECHA", f24); f23.adyacentes.put("ABAJO", null); f23.adyacentes.put("IZQUIERDA", null);
        f24.adyacentes.put("DERECHA", null); f24.adyacentes.put("ABAJO", f25); f24.adyacentes.put("IZQUIERDA", null);
        f25.adyacentes.put("DERECHA", null); f25.adyacentes.put("ABAJO", f26); f25.adyacentes.put("IZQUIERDA", null);
        f26.adyacentes.put("DERECHA", null); f26.adyacentes.put("ABAJO", null); f26.adyacentes.put("IZQUIERDA", null);

        Pieza<Integer,CasillaCuadrada,FichaCuadrada> pieza6 = new Pieza<Integer,CasillaCuadrada,FichaCuadrada>(false, true, f22, new ArrayList<FichaCuadrada>());
        pieza6.setFichas(f22,f23,f24,f25,f26);
        pieza6.setRuta("pieza6.png");
        piezasJuego.add(pieza6);

        /*      PIEZA 7
                  f27
                  f28
                  f29 f30 f31
        */

        FichaCuadrada f27 = new FichaCuadrada(10, "CUADRADO"); f27.setMaxAdyacencia(); f27.setAdyacentes();
        f27.setRuta("fichaVerde.png");
        FichaCuadrada f28 = new FichaCuadrada(10, "CUADRADO"); f28.setMaxAdyacencia(); f28.setAdyacentes();
        f28.setRuta("fichaVerde.png");
        FichaCuadrada f29 = new FichaCuadrada(10, "CUADRADO"); f29.setMaxAdyacencia(); f29.setAdyacentes();
        f29.setRuta("fichaVerde.png");
        FichaCuadrada f30 = new FichaCuadrada(10, "CUADRADO"); f30.setMaxAdyacencia(); f30.setAdyacentes();
        f30.setRuta("fichaVerde.png");
        FichaCuadrada f31 = new FichaCuadrada(10, "CUADRADO"); f31.setMaxAdyacencia(); f31.setAdyacentes();
        f31.setRuta("fichaVerde.png");
        f27.adyacentes.put("DERECHA", null); f27.adyacentes.put("ABAJO", f28); f27.adyacentes.put("IZQUIERDA", null);
        f28.adyacentes.put("DERECHA", null); f28.adyacentes.put("ABAJO", f29); f28.adyacentes.put("IZQUIERDA", null);
        f29.adyacentes.put("DERECHA", f30); f29.adyacentes.put("ABAJO", null); f29.adyacentes.put("IZQUIERDA", null);
        f30.adyacentes.put("DERECHA", f31); f30.adyacentes.put("ABAJO", null); f30.adyacentes.put("IZQUIERDA", null);
        f31.adyacentes.put("DERECHA", null); f31.adyacentes.put("ABAJO", null); f31.adyacentes.put("IZQUIERDA", null);

        Pieza<Integer,CasillaCuadrada,FichaCuadrada> pieza7 = new Pieza<Integer,CasillaCuadrada,FichaCuadrada>(false, true, f27, new ArrayList<FichaCuadrada>());
        pieza7.setFichas(f27,f28,f29,f30,f31);
        pieza7.setRuta("pieza7.png");
        piezasJuego.add(pieza7);

        /*      PIEZA 8
                          f32
                          f33
                  f36 f35 f34
        */

        FichaCuadrada f32 = new FichaCuadrada(10, "CUADRADO"); f32.setMaxAdyacencia(); f32.setAdyacentes();
        f32.setRuta("fichaVerde.png");
        FichaCuadrada f33 = new FichaCuadrada(10, "CUADRADO"); f33.setMaxAdyacencia(); f33.setAdyacentes();
        f33.setRuta("fichaVerde.png");
        FichaCuadrada f34 = new FichaCuadrada(10, "CUADRADO"); f34.setMaxAdyacencia(); f34.setAdyacentes();
        f34.setRuta("fichaVerde.png");
        FichaCuadrada f35 = new FichaCuadrada(10, "CUADRADO"); f35.setMaxAdyacencia(); f35.setAdyacentes();
        f35.setRuta("fichaVerde.png");
        FichaCuadrada f36 = new FichaCuadrada(10, "CUADRADO"); f36.setMaxAdyacencia(); f36.setAdyacentes();
        f36.setRuta("fichaVerde.png");
        f32.adyacentes.put("DERECHA", null); f32.adyacentes.put("ABAJO", f33); f32.adyacentes.put("IZQUIERDA", null);
        f33.adyacentes.put("DERECHA", null); f33.adyacentes.put("ABAJO", f34); f33.adyacentes.put("IZQUIERDA", null);
        f34.adyacentes.put("DERECHA", null); f34.adyacentes.put("ABAJO", null); f34.adyacentes.put("IZQUIERDA", f35);
        f35.adyacentes.put("DERECHA", null); f35.adyacentes.put("ABAJO", null); f35.adyacentes.put("IZQUIERDA", f36);
        f36.adyacentes.put("DERECHA", null); f36.adyacentes.put("ABAJO", null); f36.adyacentes.put("IZQUIERDA", null);

        Pieza<Integer,CasillaCuadrada,FichaCuadrada> pieza8 = new Pieza<Integer,CasillaCuadrada,FichaCuadrada>(false, true, f32, new ArrayList<FichaCuadrada>());
        pieza8.setFichas(f32,f33,f34,f35,f36);
        pieza8.setRuta("pieza8.png");
        piezasJuego.add(pieza8);

        /*      PIEZA 9
                  f37 f38
                  f39
        */

        FichaCuadrada f37 = new FichaCuadrada(10, "CUADRADO"); f37.setMaxAdyacencia(); f37.setAdyacentes();
        f37.setRuta("fichaAzulOscura.png");
        FichaCuadrada f38 = new FichaCuadrada(10, "CUADRADO"); f38.setMaxAdyacencia(); f38.setAdyacentes();
        f38.setRuta("fichaAzulOscura.png");
        FichaCuadrada f39 = new FichaCuadrada(10, "CUADRADO"); f39.setMaxAdyacencia(); f39.setAdyacentes();
        f39.setRuta("fichaAzulOscura.png");
        f37.adyacentes.put("DERECHA", f38); f37.adyacentes.put("ABAJO", f39); f37.adyacentes.put("IZQUIERDA", null);
        f38.adyacentes.put("DERECHA", null); f38.adyacentes.put("ABAJO", null); f38.adyacentes.put("IZQUIERDA", null);
        f39.adyacentes.put("DERECHA", null); f39.adyacentes.put("ABAJO", null); f39.adyacentes.put("IZQUIERDA", null);

        Pieza<Integer,CasillaCuadrada,FichaCuadrada> pieza9 = new Pieza<Integer,CasillaCuadrada,FichaCuadrada>(false, true, f37, new ArrayList<FichaCuadrada>());
        pieza9.setFichas(f37,f38,f39);
        pieza9.setRuta("pieza9.png");
        piezasJuego.add(pieza9);

        /*      PIEZA 10
                  f40 f41
                      f42
        */

        FichaCuadrada f40 = new FichaCuadrada(10, "CUADRADO"); f40.setMaxAdyacencia(); f40.setAdyacentes();
        f40.setRuta("fichaAzulOscura.png");
        FichaCuadrada f41 = new FichaCuadrada(10, "CUADRADO"); f41.setMaxAdyacencia(); f41.setAdyacentes();
        f41.setRuta("fichaAzulOscura.png");
        FichaCuadrada f42 = new FichaCuadrada(10, "CUADRADO"); f42.setMaxAdyacencia(); f42.setAdyacentes();
        f42.setRuta("fichaAzulOscura.png");
        f40.adyacentes.put("DERECHA", f41); f40.adyacentes.put("ABAJO", null); f40.adyacentes.put("IZQUIERDA", null);
        f41.adyacentes.put("DERECHA", null); f41.adyacentes.put("ABAJO", f42); f41.adyacentes.put("IZQUIERDA", null);
        f42.adyacentes.put("DERECHA", null); f42.adyacentes.put("ABAJO", null); f42.adyacentes.put("IZQUIERDA", null);

        Pieza<Integer,CasillaCuadrada,FichaCuadrada> pieza10 = new Pieza<Integer,CasillaCuadrada,FichaCuadrada>(false, true, f40, new ArrayList<FichaCuadrada>());
        pieza10.setFichas(f40,f41,f42);
        pieza10.setRuta("pieza10.png");
        piezasJuego.add(pieza10);

        /*      PIEZA 11
                  f43
                  f44 f45
        */

        FichaCuadrada f43 = new FichaCuadrada(10, "CUADRADO"); f43.setMaxAdyacencia(); f43.setAdyacentes();
        f43.setRuta("fichaAzulOscura.png");
        FichaCuadrada f44 = new FichaCuadrada(10, "CUADRADO"); f44.setMaxAdyacencia(); f44.setAdyacentes();
        f44.setRuta("fichaAzulOscura.png");
        FichaCuadrada f45 = new FichaCuadrada(10, "CUADRADO"); f45.setMaxAdyacencia(); f45.setAdyacentes();
        f45.setRuta("fichaAzulOscura.png");
        f43.adyacentes.put("DERECHA", null); f43.adyacentes.put("ABAJO", f44); f43.adyacentes.put("IZQUIERDA", null);
        f44.adyacentes.put("DERECHA", f45); f44.adyacentes.put("ABAJO", null); f44.adyacentes.put("IZQUIERDA", null);
        f45.adyacentes.put("DERECHA", null); f45.adyacentes.put("ABAJO", null); f45.adyacentes.put("IZQUIERDA", null);

        Pieza<Integer,CasillaCuadrada,FichaCuadrada> pieza11 = new Pieza<Integer,CasillaCuadrada,FichaCuadrada>(false, true, f43, new ArrayList<FichaCuadrada>());
        pieza11.setFichas(f43,f44,f45);
        pieza11.setRuta("pieza11.png");
        piezasJuego.add(pieza11);

        /*      PIEZA 12
                      f46
                  f48 f47
        */

        FichaCuadrada f46 = new FichaCuadrada(10, "CUADRADO"); f46.setMaxAdyacencia(); f46.setAdyacentes();
        f46.setRuta("fichaAzulOscura.png");
        FichaCuadrada f47 = new FichaCuadrada(10, "CUADRADO"); f47.setMaxAdyacencia(); f47.setAdyacentes();
        f47.setRuta("fichaAzulOscura.png");
        FichaCuadrada f48 = new FichaCuadrada(10, "CUADRADO"); f48.setMaxAdyacencia(); f48.setAdyacentes();
        f48.setRuta("fichaAzulOscura.png");
        f46.adyacentes.put("DERECHA", null); f46.adyacentes.put("ABAJO", f47); f46.adyacentes.put("IZQUIERDA", null);
        f47.adyacentes.put("DERECHA", null); f47.adyacentes.put("ABAJO", null); f47.adyacentes.put("IZQUIERDA", f48);
        f48.adyacentes.put("DERECHA", null); f48.adyacentes.put("ABAJO", null); f48.adyacentes.put("IZQUIERDA", null);

        Pieza<Integer,CasillaCuadrada,FichaCuadrada> pieza12 = new Pieza<Integer,CasillaCuadrada,FichaCuadrada>(false, true, f46, new ArrayList<FichaCuadrada>());
        pieza12.setFichas(f46,f47,f48);
        pieza12.setRuta("pieza12.png");
        piezasJuego.add(pieza12);

        /*      PIEZA 13
                  f49 f50 f51
                  f52
        */

        FichaCuadrada f49 = new FichaCuadrada(10, "CUADRADO"); f49.setMaxAdyacencia(); f49.setAdyacentes();
        f49.setRuta("fichaVerde.png");
        FichaCuadrada f50 = new FichaCuadrada(10, "CUADRADO"); f50.setMaxAdyacencia(); f50.setAdyacentes();
        f50.setRuta("fichaVerde.png");
        FichaCuadrada f51 = new FichaCuadrada(10, "CUADRADO"); f51.setMaxAdyacencia(); f51.setAdyacentes();
        f51.setRuta("fichaVerde.png");
        FichaCuadrada f52 = new FichaCuadrada(10, "CUADRADO"); f52.setMaxAdyacencia(); f52.setAdyacentes();
        f52.setRuta("fichaVerde.png");
        f49.adyacentes.put("DERECHA", f50); f49.adyacentes.put("ABAJO", f52); f49.adyacentes.put("IZQUIERDA", null);
        f50.adyacentes.put("DERECHA", f51); f50.adyacentes.put("ABAJO", null); f50.adyacentes.put("IZQUIERDA", null);
        f51.adyacentes.put("DERECHA", null); f51.adyacentes.put("ABAJO", null); f51.adyacentes.put("IZQUIERDA", null);
        f52.adyacentes.put("DERECHA", null); f52.adyacentes.put("ABAJO", null); f52.adyacentes.put("IZQUIERDA", null);

        Pieza<Integer,CasillaCuadrada,FichaCuadrada> pieza13 = new Pieza<Integer,CasillaCuadrada,FichaCuadrada>(false, true, f49, new ArrayList<FichaCuadrada>());
        pieza13.setFichas(f49,f50,f51,f52);
        pieza13.setRuta("pieza13.png");
        piezasJuego.add(pieza13);

        /*      PIEZA 14
                  f53 f54 f55
                          f56
        */

        FichaCuadrada f53 = new FichaCuadrada(10, "CUADRADO"); f53.setMaxAdyacencia(); f53.setAdyacentes();
        f53.setRuta("fichaVerde.png");
        FichaCuadrada f54 = new FichaCuadrada(10, "CUADRADO"); f54.setMaxAdyacencia(); f54.setAdyacentes();
        f54.setRuta("fichaVerde.png");
        FichaCuadrada f55 = new FichaCuadrada(10, "CUADRADO"); f55.setMaxAdyacencia(); f55.setAdyacentes();
        f55.setRuta("fichaVerde.png");
        FichaCuadrada f56 = new FichaCuadrada(10, "CUADRADO"); f56.setMaxAdyacencia(); f56.setAdyacentes();
        f56.setRuta("fichaVerde.png");
        f53.adyacentes.put("DERECHA", f54); f53.adyacentes.put("ABAJO", null); f53.adyacentes.put("IZQUIERDA", null);
        f54.adyacentes.put("DERECHA", f55); f54.adyacentes.put("ABAJO", null); f54.adyacentes.put("IZQUIERDA", null);
        f55.adyacentes.put("DERECHA", null); f55.adyacentes.put("ABAJO", f56); f55.adyacentes.put("IZQUIERDA", null);
        f56.adyacentes.put("DERECHA", null); f56.adyacentes.put("ABAJO", null); f56.adyacentes.put("IZQUIERDA", null);

        Pieza<Integer,CasillaCuadrada,FichaCuadrada> pieza14 = new Pieza<Integer,CasillaCuadrada,FichaCuadrada>(false, true, f53, new ArrayList<FichaCuadrada>());
        pieza14.setFichas(f53,f54,f55,f56);
        pieza14.setRuta("pieza14.png");
        piezasJuego.add(pieza14);

        /*      PIEZA 15
                  f57
                  f58 f59 f60
        */

        FichaCuadrada f57 = new FichaCuadrada(10, "CUADRADO"); f57.setMaxAdyacencia(); f57.setAdyacentes();
        f57.setRuta("fichaVerde.png");
        FichaCuadrada f58 = new FichaCuadrada(10, "CUADRADO"); f58.setMaxAdyacencia(); f58.setAdyacentes();
        f58.setRuta("fichaVerde.png");
        FichaCuadrada f59 = new FichaCuadrada(10, "CUADRADO"); f59.setMaxAdyacencia(); f59.setAdyacentes();
        f59.setRuta("fichaVerde.png");
        FichaCuadrada f60 = new FichaCuadrada(10, "CUADRADO"); f60.setMaxAdyacencia(); f60.setAdyacentes();
        f60.setRuta("fichaVerde.png");
        f57.adyacentes.put("DERECHA", null); f57.adyacentes.put("ABAJO", f58); f57.adyacentes.put("IZQUIERDA", null);
        f58.adyacentes.put("DERECHA", f59); f58.adyacentes.put("ABAJO", null); f58.adyacentes.put("IZQUIERDA", null);
        f59.adyacentes.put("DERECHA", f60); f59.adyacentes.put("ABAJO", null); f59.adyacentes.put("IZQUIERDA", null);
        f60.adyacentes.put("DERECHA", null); f60.adyacentes.put("ABAJO", null); f60.adyacentes.put("IZQUIERDA", null);

        Pieza<Integer,CasillaCuadrada,FichaCuadrada> pieza15 = new Pieza<Integer,CasillaCuadrada,FichaCuadrada>(false, true, f57, new ArrayList<FichaCuadrada>());
        pieza15.setFichas(f57,f58,f59,f60);
        pieza15.setRuta("pieza15.png");
        piezasJuego.add(pieza15);

        /*      PIEZA 16
                          f61
                  f64 f63 f62
        */

        FichaCuadrada f61 = new FichaCuadrada(10, "CUADRADO"); f61.setMaxAdyacencia(); f61.setAdyacentes();
        f61.setRuta("fichaVerde.png");
        FichaCuadrada f62 = new FichaCuadrada(10, "CUADRADO"); f62.setMaxAdyacencia(); f62.setAdyacentes();
        f62.setRuta("fichaVerde.png");
        FichaCuadrada f63 = new FichaCuadrada(10, "CUADRADO"); f63.setMaxAdyacencia(); f63.setAdyacentes();
        f63.setRuta("fichaVerde.png");
        FichaCuadrada f64 = new FichaCuadrada(10, "CUADRADO"); f64.setMaxAdyacencia(); f64.setAdyacentes();
        f64.setRuta("fichaVerde.png");
        f61.adyacentes.put("DERECHA", null); f61.adyacentes.put("ABAJO", f62); f61.adyacentes.put("IZQUIERDA", null);
        f62.adyacentes.put("DERECHA", null); f62.adyacentes.put("ABAJO", null); f62.adyacentes.put("IZQUIERDA", f63);
        f63.adyacentes.put("DERECHA", null); f63.adyacentes.put("ABAJO", null); f63.adyacentes.put("IZQUIERDA", f64);
        f64.adyacentes.put("DERECHA", null); f64.adyacentes.put("ABAJO", null); f64.adyacentes.put("IZQUIERDA", null);

        Pieza<Integer,CasillaCuadrada,FichaCuadrada> pieza16 = new Pieza<Integer,CasillaCuadrada,FichaCuadrada>(false, true, f61, new ArrayList<FichaCuadrada>());
        pieza16.setFichas(f61,f62,f63,f64);
        pieza16.setRuta("pieza16.png");
        piezasJuego.add(pieza16);

        /*      PIEZA 17
                  f65 f66 f67
        */

        FichaCuadrada f65 = new FichaCuadrada(10, "CUADRADO"); f65.setMaxAdyacencia(); f65.setAdyacentes();
        f65.setRuta("fichaRoja.png");
        FichaCuadrada f66 = new FichaCuadrada(10, "CUADRADO"); f66.setMaxAdyacencia(); f66.setAdyacentes();
        f66.setRuta("fichaRoja.png");
        FichaCuadrada f67 = new FichaCuadrada(10, "CUADRADO"); f67.setMaxAdyacencia(); f67.setAdyacentes();
        f67.setRuta("fichaRoja.png");
        f65.adyacentes.put("DERECHA", f66); f65.adyacentes.put("ABAJO", null); f65.adyacentes.put("IZQUIERDA", null);
        f66.adyacentes.put("DERECHA", f67); f66.adyacentes.put("ABAJO", null); f66.adyacentes.put("IZQUIERDA", null);
        f67.adyacentes.put("DERECHA", null); f67.adyacentes.put("ABAJO", null); f67.adyacentes.put("IZQUIERDA", null);

        Pieza<Integer,CasillaCuadrada,FichaCuadrada> pieza17 = new Pieza<Integer,CasillaCuadrada,FichaCuadrada>(false, true, f65, new ArrayList<FichaCuadrada>());
        pieza17.setFichas(f65,f66,f67);
        pieza17.setRuta("pieza17.png");
        piezasJuego.add(pieza17);

        /*      PIEZA 18
                  f68
                  f69
                  f70
        */

        FichaCuadrada f68 = new FichaCuadrada(10, "CUADRADO"); f68.setMaxAdyacencia(); f68.setAdyacentes();
        f68.setRuta("fichaRoja.png");
        FichaCuadrada f69 = new FichaCuadrada(10, "CUADRADO"); f69.setMaxAdyacencia(); f69.setAdyacentes();
        f69.setRuta("fichaRoja.png");
        FichaCuadrada f70 = new FichaCuadrada(10, "CUADRADO"); f70.setMaxAdyacencia(); f70.setAdyacentes();
        f70.setRuta("fichaRoja.png");
        f68.adyacentes.put("DERECHA", null); f68.adyacentes.put("ABAJO", f69); f68.adyacentes.put("IZQUIERDA", null);
        f69.adyacentes.put("DERECHA", null); f69.adyacentes.put("ABAJO", f70); f69.adyacentes.put("IZQUIERDA", null);
        f70.adyacentes.put("DERECHA", null); f70.adyacentes.put("ABAJO", null); f70.adyacentes.put("IZQUIERDA", null);

        Pieza<Integer,CasillaCuadrada,FichaCuadrada> pieza18 = new Pieza<Integer,CasillaCuadrada,FichaCuadrada>(false, true, f68, new ArrayList<FichaCuadrada>());
        pieza18.setFichas(f68,f69,f70);
        pieza18.setRuta("pieza18.png");
        piezasJuego.add(pieza18);

        /*      PIEZA 19
                  f71 f72 f73 f74
        */

        FichaCuadrada f71 = new FichaCuadrada(10, "CUADRADO"); f71.setMaxAdyacencia(); f71.setAdyacentes();
        f71.setRuta("fichaAmarilla.png");
        FichaCuadrada f72 = new FichaCuadrada(10, "CUADRADO"); f72.setMaxAdyacencia(); f72.setAdyacentes();
        f72.setRuta("fichaAmarilla.png");
        FichaCuadrada f73 = new FichaCuadrada(10, "CUADRADO"); f73.setMaxAdyacencia(); f73.setAdyacentes();
        f73.setRuta("fichaAmarilla.png");
        FichaCuadrada f74 = new FichaCuadrada(10, "CUADRADO"); f74.setMaxAdyacencia(); f74.setAdyacentes();
        f74.setRuta("fichaAmarilla.png");
        f71.adyacentes.put("DERECHA", f72); f71.adyacentes.put("ABAJO", null); f71.adyacentes.put("IZQUIERDA", null);
        f72.adyacentes.put("DERECHA", f73); f72.adyacentes.put("ABAJO", null); f72.adyacentes.put("IZQUIERDA", null);
        f73.adyacentes.put("DERECHA", f74); f73.adyacentes.put("ABAJO", null); f73.adyacentes.put("IZQUIERDA", null);
        f74.adyacentes.put("DERECHA", null); f74.adyacentes.put("ABAJO", null); f74.adyacentes.put("IZQUIERDA", null);

        Pieza<Integer,CasillaCuadrada,FichaCuadrada> pieza19 = new Pieza<Integer,CasillaCuadrada,FichaCuadrada>(false, true, f71, new ArrayList<FichaCuadrada>());
        pieza19.setFichas(f71,f72,f73,f74);
        pieza19.setRuta("pieza19.png");
        piezasJuego.add(pieza19);

        /*      PIEZA 20
                  f75
                  f76
                  f77
                  f78
        */

        FichaCuadrada f75 = new FichaCuadrada(10, "CUADRADO"); f75.setMaxAdyacencia(); f75.setAdyacentes();
        f75.setRuta("fichaAmarilla.png");
        FichaCuadrada f76 = new FichaCuadrada(10, "CUADRADO"); f76.setMaxAdyacencia(); f76.setAdyacentes();
        f76.setRuta("fichaAmarilla.png");
        FichaCuadrada f77 = new FichaCuadrada(10, "CUADRADO"); f77.setMaxAdyacencia(); f77.setAdyacentes();
        f77.setRuta("fichaAmarilla.png");
        FichaCuadrada f78 = new FichaCuadrada(10, "CUADRADO"); f78.setMaxAdyacencia(); f78.setAdyacentes();
        f78.setRuta("fichaAmarilla.png");
        f75.adyacentes.put("DERECHA", null); f75.adyacentes.put("ABAJO", f76); f75.adyacentes.put("IZQUIERDA", null);
        f76.adyacentes.put("DERECHA", null); f76.adyacentes.put("ABAJO", f77); f76.adyacentes.put("IZQUIERDA", null);
        f77.adyacentes.put("DERECHA", null); f77.adyacentes.put("ABAJO", f78); f77.adyacentes.put("IZQUIERDA", null);
        f78.adyacentes.put("DERECHA", null); f78.adyacentes.put("ABAJO", null); f78.adyacentes.put("IZQUIERDA", null);

        Pieza<Integer,CasillaCuadrada,FichaCuadrada> pieza20 = new Pieza<Integer,CasillaCuadrada,FichaCuadrada>(false, true, f75, new ArrayList<FichaCuadrada>());
        pieza20.setFichas(f75,f76,f77,f78);
        pieza20.setRuta("pieza20.png");
        piezasJuego.add(pieza20);

        /*      PIEZA 21
                  f79 f80
        */

        FichaCuadrada f79 = new FichaCuadrada(10, "CUADRADO"); f79.setMaxAdyacencia(); f79.setAdyacentes();
        f79.setRuta("fichaMorada.png");
        FichaCuadrada f80 = new FichaCuadrada(10, "CUADRADO"); f80.setMaxAdyacencia(); f80.setAdyacentes();
        f80.setRuta("fichaMorada.png");
        f79.adyacentes.put("DERECHA", f80); f79.adyacentes.put("ABAJO", null); f79.adyacentes.put("IZQUIERDA", null);
        f80.adyacentes.put("DERECHA", null); f80.adyacentes.put("ABAJO", null); f80.adyacentes.put("IZQUIERDA", null);

        Pieza<Integer,CasillaCuadrada,FichaCuadrada> pieza21 = new Pieza<Integer,CasillaCuadrada,FichaCuadrada>(false, true, f79, new ArrayList<FichaCuadrada>());
        pieza21.setFichas(f79,f80);
        pieza21.setRuta("pieza21.png");
        piezasJuego.add(pieza21);

        /*      PIEZA 22
                  f81
                  f82
        */

        FichaCuadrada f81 = new FichaCuadrada(10, "CUADRADO"); f81.setMaxAdyacencia(); f81.setAdyacentes();
        f81.setRuta("fichaMorada.png");
        FichaCuadrada f82 = new FichaCuadrada(10, "CUADRADO"); f82.setMaxAdyacencia(); f82.setAdyacentes();
        f82.setRuta("fichaMorada.png");
        f81.adyacentes.put("DERECHA", null); f81.adyacentes.put("ABAJO", f82); f81.adyacentes.put("IZQUIERDA", null);
        f82.adyacentes.put("DERECHA", null); f82.adyacentes.put("ABAJO", null); f82.adyacentes.put("IZQUIERDA", null);

        Pieza<Integer,CasillaCuadrada,FichaCuadrada> pieza22 = new Pieza<Integer,CasillaCuadrada,FichaCuadrada>(false, true, f81, new ArrayList<FichaCuadrada>());
        pieza22.setFichas(f81,f82);
        pieza22.setRuta("pieza22.png");
        piezasJuego.add(pieza22);

        /*      PIEZA 23
                  f83 f84
                  f85 f86
        */

        FichaCuadrada f83 = new FichaCuadrada(10, "CUADRADO"); f83.setMaxAdyacencia(); f83.setAdyacentes();
        f83.setRuta("fichaAzulClara.png");
        FichaCuadrada f84 = new FichaCuadrada(10, "CUADRADO"); f84.setMaxAdyacencia(); f84.setAdyacentes();
        f84.setRuta("fichaAzulClara.png");
        FichaCuadrada f85 = new FichaCuadrada(10, "CUADRADO"); f85.setMaxAdyacencia(); f85.setAdyacentes();
        f85.setRuta("fichaAzulClara.png");
        FichaCuadrada f86 = new FichaCuadrada(10, "CUADRADO"); f86.setMaxAdyacencia(); f86.setAdyacentes();
        f86.setRuta("fichaAzulClara.png");
        f83.adyacentes.put("DERECHA", f84); f83.adyacentes.put("ABAJO", f85); f83.adyacentes.put("IZQUIERDA", null);
        f84.adyacentes.put("DERECHA", null); f84.adyacentes.put("ABAJO", null); f84.adyacentes.put("IZQUIERDA", null);
        f85.adyacentes.put("DERECHA", f86); f85.adyacentes.put("ABAJO", null); f85.adyacentes.put("IZQUIERDA", null);
        f86.adyacentes.put("DERECHA", null); f86.adyacentes.put("ABAJO", null); f86.adyacentes.put("IZQUIERDA", null);

        Pieza<Integer,CasillaCuadrada,FichaCuadrada> pieza23 = new Pieza<Integer,CasillaCuadrada,FichaCuadrada>(false, true, f83, new ArrayList<FichaCuadrada>());
        pieza23.setFichas(f83,f84,f85,f86);
        pieza23.setRuta("pieza23.png");
        piezasJuego.add(pieza23);

        /*      PIEZA 24
                  f87 f88 f89
                  f90 f91 f92
                  f93 f94 f95
        */

        FichaCuadrada f87 = new FichaCuadrada(10, "CUADRADO"); f87.setMaxAdyacencia(); f87.setAdyacentes();
        f87.setRuta("fichaRoja.png");
        FichaCuadrada f88 = new FichaCuadrada(10, "CUADRADO"); f88.setMaxAdyacencia(); f88.setAdyacentes();
        f88.setRuta("fichaRoja.png");
        FichaCuadrada f89 = new FichaCuadrada(10, "CUADRADO"); f89.setMaxAdyacencia(); f89.setAdyacentes();
        f89.setRuta("fichaRoja.png");
        FichaCuadrada f90 = new FichaCuadrada(10, "CUADRADO"); f90.setMaxAdyacencia(); f90.setAdyacentes();
        f90.setRuta("fichaRoja.png");
        FichaCuadrada f91 = new FichaCuadrada(10, "CUADRADO"); f91.setMaxAdyacencia(); f91.setAdyacentes();
        f91.setRuta("fichaRoja.png");
        FichaCuadrada f92 = new FichaCuadrada(10, "CUADRADO"); f92.setMaxAdyacencia(); f92.setAdyacentes();
        f92.setRuta("fichaRoja.png");
        FichaCuadrada f93 = new FichaCuadrada(10, "CUADRADO"); f93.setMaxAdyacencia(); f93.setAdyacentes();
        f93.setRuta("fichaRoja.png");
        FichaCuadrada f94 = new FichaCuadrada(10, "CUADRADO"); f94.setMaxAdyacencia(); f94.setAdyacentes();
        f94.setRuta("fichaRoja.png");
        FichaCuadrada f95 = new FichaCuadrada(10, "CUADRADO"); f95.setMaxAdyacencia(); f95.setAdyacentes();
        f95.setRuta("fichaRoja.png");
        f87.adyacentes.put("DERECHA", f88); f87.adyacentes.put("ABAJO", f90); f87.adyacentes.put("IZQUIERDA", null);
        f88.adyacentes.put("DERECHA", f89); f88.adyacentes.put("ABAJO", null); f88.adyacentes.put("IZQUIERDA", null);
        f89.adyacentes.put("DERECHA", null); f89.adyacentes.put("ABAJO", null); f89.adyacentes.put("IZQUIERDA", null);
        f90.adyacentes.put("DERECHA", f91); f90.adyacentes.put("ABAJO", f93); f90.adyacentes.put("IZQUIERDA", null);
        f91.adyacentes.put("DERECHA", f92); f91.adyacentes.put("ABAJO", null); f91.adyacentes.put("IZQUIERDA", null);
        f92.adyacentes.put("DERECHA", null); f92.adyacentes.put("ABAJO", null); f92.adyacentes.put("IZQUIERDA", null);
        f93.adyacentes.put("DERECHA", f94); f93.adyacentes.put("ABAJO", null); f93.adyacentes.put("IZQUIERDA", null);
        f94.adyacentes.put("DERECHA", f95); f94.adyacentes.put("ABAJO", null); f94.adyacentes.put("IZQUIERDA", null);
        f95.adyacentes.put("DERECHA", null); f95.adyacentes.put("ABAJO", null); f95.adyacentes.put("IZQUIERDA", null);

        Pieza<Integer,CasillaCuadrada,FichaCuadrada> pieza24 = new Pieza<Integer,CasillaCuadrada,FichaCuadrada>(false, true, f87, new ArrayList<FichaCuadrada>());
        pieza24.setFichas(f87,f88,f89,f90,f91,f92,f93,f94,f95);
        pieza24.setRuta("pieza24.png");
        piezasJuego.add(pieza24);

        /*      PIEZA 25
                  f96
        */

        FichaCuadrada f96 = new FichaCuadrada(10, "CUADRADO"); f96.setMaxAdyacencia(); f96.setAdyacentes();
        f96.setRuta("fichaNaranja.png");
        f96.adyacentes.put("DERECHA", null); f96.adyacentes.put("ABAJO", null); f96.adyacentes.put("IZQUIERDA", null);

        Pieza<Integer,CasillaCuadrada,FichaCuadrada> pieza25 = new Pieza<Integer,CasillaCuadrada,FichaCuadrada>(false, true, f96, new ArrayList<FichaCuadrada>());
        pieza25.setFichas(f96);
        pieza25.setRuta("pieza25.png");
        piezasJuego.add(pieza25);

        return piezasJuego;
    }

    @Override
    public List<Pieza<Integer, CasillaCuadrada, FichaCuadrada>> crearPiezasActivas() {
        List<Pieza<Integer,CasillaCuadrada, FichaCuadrada>>
                piezasActivas = new ArrayList<Pieza<Integer,CasillaCuadrada, FichaCuadrada>>()
        {{add(new Pieza<Integer,CasillaCuadrada, FichaCuadrada>(false, false, new FichaCuadrada(10,"CUADRADO"), new ArrayList<FichaCuadrada>()));
            add(new Pieza<Integer,CasillaCuadrada, FichaCuadrada>(false, false, new FichaCuadrada(10,"CUADRADO"), new ArrayList<FichaCuadrada>()));
            add(new Pieza<Integer,CasillaCuadrada, FichaCuadrada>(false, false, new FichaCuadrada(10,"CUADRADO"), new ArrayList<FichaCuadrada>()));}};

        return piezasActivas;
    }

    @Override
    public List<CasillaCuadrada> crearTablero() {
        List<CasillaCuadrada> casillasCuadradas= new ArrayList<CasillaCuadrada>();

        for (int id = 0; id < 64; id++){
            CasillaCuadrada casillaCuadrada = new CasillaCuadrada(id,"CUADRADO");
            casillaCuadrada.setFicha(null);
            casillaCuadrada.setMaxAdyacencia();
            casillaCuadrada.setMaxVigilancia();
            casillaCuadrada.setAdyacentes();
            casillaCuadrada.setVigilantes();
            casillasCuadradas.add(casillaCuadrada);
        }

        //ENLACE A LA DERECHA. La primera posicion en la lista de adyacentes simboliza a la casilla vecina a la derecha
        for (CasillaCuadrada casillaCuadrada : casillasCuadradas){
            if ((casillaCuadrada.id+1) %8  !=0)
                casillaCuadrada.adyacentes.put("DERECHA", casillasCuadradas.get(casillaCuadrada.id+1));
            else casillaCuadrada.adyacentes.put("DERECHA",null);
        }

        //ENLACE HACIA ABAJO. La segunda posicion en la lista de adyacentes simboliza a la casilla vecina hacia abajo
        for (CasillaCuadrada casillaCuadrada : casillasCuadradas){
            if (casillaCuadrada.id<56)
                casillaCuadrada.adyacentes.put("ABAJO",casillasCuadradas.get(casillaCuadrada.id+8));
            else casillaCuadrada.adyacentes.put("ABAJO",null);
        }

        //ENLACE A LA IZQUIERDA. La tercera posicion en la lista de adyacentes simboliza a la casilla vecina a la izquierda
        for (CasillaCuadrada casillaCuadrada: casillasCuadradas){
            if (casillaCuadrada.id % 8 !=0)
                casillaCuadrada.adyacentes.put("IZQUIERDA",casillasCuadradas.get(casillaCuadrada.id-1));
            else casillaCuadrada.adyacentes.put("IZQUIERDA", null);
        }

        return casillasCuadradas;
    }


    @Override
    public List<CasillaCuadrada> asignarVigilantes(List<Vigilante<FichaCuadrada>> vigilantes, List<CasillaCuadrada> tablero) {
        int index=0;
        int index2=8;
        for (CasillaCuadrada casilla : tablero) {
            casilla.vigilantes.put("DERECHA", vigilantes.get(index));
            casilla.vigilantes.put("ABAJO", vigilantes.get(index2));
            index2++;
            if (index2 == 16){
                index++;
                index2=8;
            }
        }
        return tablero;
    }

    @Override
    public List<Vigilante<FichaCuadrada>> asignarCasillas(List<Vigilante<FichaCuadrada>> vigilantes, List<CasillaCuadrada> tablero) {
        int cont=8;
        int index=0;

        for (Vigilante<FichaCuadrada> vigilante : vigilantes){
            vigilante.casilla= tablero.get(index);
            index+=cont;
            if (index == 64){
                index=0;
                cont=1;
            }
        }
        return vigilantes;
    }

    @Override
    public List<Vigilante<FichaCuadrada>> crearVigilantes() {
        List<Vigilante<FichaCuadrada>> vigilantes = new ArrayList<Vigilante<FichaCuadrada>>();
        for (int index = 0; index < 16; index++)
            vigilantes.add(new Vigilante<FichaCuadrada>(null, false));
        return vigilantes;
    }

}
