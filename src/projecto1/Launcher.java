
import logica.Rutina;
import logica.Tablero;

import java.util.ArrayList;

public class Launcher {

    public static Tablero tablero;
    public static Rutina rutina;

    public static void main(String[] arg){

        ArrayList<Integer> pasos = new ArrayList<Integer>();

        pasos.add(Rutina.GIRAR_HORARIO);
        pasos.add(Rutina.AVANZAR);
        pasos.add(Rutina.ACTIVAR);
        pasos.add(Rutina.AVANZAR);
        pasos.add(Rutina.GIRAR_ANTIHORARIO);
        pasos.add(Rutina.AVANZAR);
        pasos.add(Rutina.AVANZAR);
        pasos.add(Rutina.ACTIVAR);

        tablero = new Tablero();
        rutina = new Rutina(pasos, tablero);
        rutina.Correr();
        rutina.Correr();
        rutina.Correr();
        rutina.Correr();
        rutina.Correr();
        rutina.Correr();
        rutina.Correr();
        rutina.Correr();
        rutina.Correr();
        rutina.Correr();
        rutina.Correr();
        rutina.Correr();
        //rutina.Borrar();
        rutina.Correr();
        rutina.Correr();

        for(int i = 0 ; tablero.tablero.length > i ; i++){
            for (int j = 0 ; tablero.tablero[0].length > j ; j++){
                System.out.print(tablero.tablero[i][j]);
            }
            System.out.println("");
        }




    }

}
