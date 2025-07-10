package com.generation;

import java.util.Scanner; //se importa la clase para usar el scanner

public class Codigo4 {

  public static void main(String[] args) {
    

    Scanner s = new Scanner(System.in); //Scanner con system.in 
    

    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine().toLowerCase(); //convertimos a minusculas para evitar errores
    
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); //cambiamos texto para que diga jugador 2
    Scanner s2 = new Scanner(System.in); //agregamos el systme.in
    String j2 = s2.nextLine().toLowerCase(); //igual convertimos a minusculas para evitar errores
    
    if (j1 == j2) {
      System.out.println("Empate");
    } else {
      int g = 2;

      switch(j1) {
        case "piedra":
          if (j2 == "tijeras") {
            g = 1;
            break; //agregamos break para terminar la ejecucion del codigo 
          }

        case "papel":
          if (j2 == "piedra") {
            g = 1;
            break; // y agregamos el break
          } //agregamos la llave que faltaba
          
        case "tijeras": //agregando la palabra s para que diga tijeras
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
        default:
      }
      System.out.println("Gana el jugador " + g);
    }
  }
}

