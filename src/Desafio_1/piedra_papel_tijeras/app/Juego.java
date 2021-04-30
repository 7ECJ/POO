package Desafio_1.piedra_papel_tijeras.app;

import Desafio_1.piedra_papel_tijeras.dominio.PiedraPapelTijeras;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class Juego {
    public static List<Object> opcionesBienvenida= Arrays.asList("Ver Instrucciones", "Jugar", "Ver Resultados");
    public static final Object[] OPCIONES= {"Piedra", "Papel", "Tijeras"};
    public static boolean activo=true;
    public static void main(String[] args) {
        while(activo){
        int opcionBienvenida= mostrarOpciones("Bienvenid@, ¿Que quieres hacer?", opcionesBienvenida);
        switch(opcionBienvenida){
            case 0:{
                mostrarMensaje(PiedraPapelTijeras.INSTRUCCIONES);
                break;
            }
            case 1:{
                int optUser=0;
                int opcionPc=(int)Math.round(Math.random()* 2);
                String optPc;
                Object opcionUsuario=JOptionPane.showInputDialog(null,"¡A Jugar! Selecciona una de las siguientes opciones: ", "Elegir",JOptionPane.QUESTION_MESSAGE,null,OPCIONES, OPCIONES[0]);
                switch ((String) opcionUsuario){
                    case "Piedra":{
                        optUser=0;
                    break;}
                    case "Papel":{
                        optUser=1;
                        break;
                    }
                    case "Tijeras":{
                        optUser=2;
                        break;
                    }
                    default:{

                    }
                }
                switch (opcionPc){
                    case 0:{
                        optPc="Piedra";
                        break;
                    }
                    case 1:{
                        optPc="Papel";
                        break;
                    }
                    case 2:{
                        optPc="Tijeras";
                        break;
                    }
                    default:{
                        optPc="Nada";
                        break;
                    }
                }
                PiedraPapelTijeras.jugar(optUser, opcionPc);
                mostrarMensaje("Tu seleccionaste: "+ opcionUsuario +"\n El PC seleccionó: "+ optPc+"\n El resultado es: "+ PiedraPapelTijeras.resultado);
                break;
            }
            case 2:{
                mostrarMensaje(PiedraPapelTijeras.mostrarResultados());
                break;
            }
            default:{
                mostrarMensaje("No se ha seleccionado nada");
                activo=false;
                break;
            }
        }
        }
    }

public static void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
}
public static int mostrarOpciones(String mensaje, List<Object> lista){
    return JOptionPane.showOptionDialog(null, mensaje, "Piedra Papel o Tijeras", 0, JOptionPane.QUESTION_MESSAGE, null, lista.toArray(), null);
}
}

