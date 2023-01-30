package ejercicios;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ejercicios {

    public static void main(String[] args) {


        //EJERCICIO 1
        Map<String, Integer> selecVic = new HashMap<>();

        selecVic.put("Selección Española", 1);
        selecVic.put("Selección Brasileña", 5);
        selecVic.put("Selección Alemana", 4);
        selecVic.put("Selección Inglesa", 1);
        selecVic.put("Selección Argentina", 3);
        selecVic.put("Selección Francesa", 2);



        //EJERCICIO 2
        Map<String, List<String>> selecJug = new HashMap<>();

        selecJug.put("Selección Española", List.of("Iker Casillas", "Sergio Ramos", "David Villa", "Andrés Iniesta", "Xavi Hernández", "Sergio Busquets", "Carles Puyol", "Gerard Piqué", "Xabi Alonso", "Pedro Rodriguez", "Joan Capdevilla"));

        selecJug.put("Selección Brasileña", List.of("Marcos", "Roque Junior", "Lúcio", "Cafú", "Roberto Carlos", "Edmilson", "Gilberto Silva", "Pelé", "Ronaldinho Gaucho", "Ronaldo Nazario", "Rivaldo"));

        selecJug.put("Selección Alemana", List.of("Neuer", "Beckenbauer", "Lahm", "Sammer", "Brehme", "Matthaus", "Kross", "Fritz Walter", "Helmut Rahn", "Rummenigge", "Gerd Muller"));

        selecJug.put("Selección Inglesa", List.of("Gordon Banks", "Rio Ferdinand", "Bobby Moore", "Billy Wright", "Ray Wilson", "Bryan Robson", "David Beckham", "Ashley Cole", "Steven Gerrard", "Gary Lineker", "Wayne Rooney"));

        selecJug.put("Selección Argentina", List.of("Dibu Martínez", "Javier Zanetti", "Daniel Passarella", "Verón", "Ángel Di Maria", "Fernando Redondo", "De Paul", "Gabriel Batistuta", "Mario Kempes", "Diego Armando Maradona", "Lionel Messi"));

        selecJug.put("Selección Francesa", List.of("Hugo Lloris", "Lilian Thuram", "Marcel Desailly", "Laurent Blanc", "Cantona", "Patrick Vieira", "Raymond Kopa", "Zinedine Zidane", "Michel Platini", "Kylian Mbappé", "Thierry Henry"));



        //EJERCICIO 3
        Integer totalMundiales = 0;

        for(Integer mundialesPorSeleccion : selecVic.values())
            totalMundiales += mundialesPorSeleccion;

        System.out.println("Total de mundiales jugados: " + totalMundiales);



        //EJERCICIO 4
        Map<String, Integer> seleccionesNumJugadores = new HashMap<>();

        for (String seleccion : selecJug.keySet()){

            seleccionesNumJugadores.put(seleccion, selecJug.get(seleccion).size());

        }

        System.out.println(seleccionesNumJugadores);



        //EJERCICIO 5
        Map<String, List<String>> jugadoresPorPosicionESP = new HashMap<>();
        jugadoresPorPosicionESP.put("DEL", List.of("David Villa", "Pedro Rodriguez"));
        jugadoresPorPosicionESP.put("MC", List.of("Andrés Iniesta", "Xavi Hernández", "Xabi Alonso", "Sergio Busquets"));
        jugadoresPorPosicionESP.put("DFC", List.of("Segio Ramos", "Joan Capdevilla", "Carles Puyol", "Gerard Piqué"));
        jugadoresPorPosicionESP.put("POR", List.of("Iker Casillas"));

        Map<String, List<String>> jugadoresPorPosicionBRA = new HashMap<>();
        jugadoresPorPosicionBRA.put("DEL", List.of("Ronaldo Nazario", "Rivaldo"));
        jugadoresPorPosicionBRA.put("MC", List.of("Edmilson", "Gilberto Silva", "Pelé", "Ronaldinho Gaucho"));
        jugadoresPorPosicionBRA.put("DFC", List.of("Roque Junior", "Lúcio", "Cafú", "Roberto Carlos"));
        jugadoresPorPosicionBRA.put("POR", List.of("Marcos"));

        Map<String, List<String>> jugadoresPorPosicionFRA = new HashMap<>();
        jugadoresPorPosicionFRA.put("DEL", List.of("Thierry Henry", "Kylian Mbappé"));
        jugadoresPorPosicionFRA.put("MC", List.of("Cantona", "Zinedine Zidane", "Patrick Vieira", "Raymond Kopa", "Michel Platini"));
        jugadoresPorPosicionFRA.put("DFC", List.of("Marcel Desailly", "Laurent Blanc", "Lilian Thuram"));
        jugadoresPorPosicionFRA.put("POR", List.of("Hugo Lloris"));


        Map<String, Map<String, List<String>>> selecionesPorPosicion = new HashMap<>();
        selecionesPorPosicion.put("Selección Española", jugadoresPorPosicionESP);
        selecionesPorPosicion.put("Selección Brasileña", jugadoresPorPosicionBRA);
        selecionesPorPosicion.put("Selección Francesa", jugadoresPorPosicionFRA);

        System.out.println(selecionesPorPosicion);



        //EJERCICIO 6
       for(String pais : selecionesPorPosicion.keySet()){

           System.out.println("------------- " + pais + " -------------");

           for (String posicion : selecionesPorPosicion.get(pais).keySet()){

               System.out.println("*** " + posicion + " ***");
               System.out.println("Jugadores ---> " + selecionesPorPosicion.get(pais).get(posicion).size() + "\n");

           }

       }



       //EJERCICIO 7
        for(String pais : selecionesPorPosicion.keySet()){

            System.out.println("------------- " + pais + " -------------");
            Integer totalJugadores = 0;

            for(String posicion : selecionesPorPosicion.get(pais).keySet()){

                totalJugadores += selecionesPorPosicion.get(pais).get(posicion).size();

            }
            System.out.println("Número total de jugadores: " + totalJugadores + "\n");

        }





        //System.out.println(selecVic);
        //System.out.println(selecJug);


    }

}