package Desafio_1.calculadora.app;

import Desafio_1.calculadora.dominio.Calculadora;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class Calc {
    public static final int SUMAR=0;
    public static final int RESTAR=1;
    public static final int MULTIPLICAR=2;
    public static final int DIVIDIR=3;
    public static int a,b;
    public static boolean activa=true;

    public static void main(String[] args) {
        mostrarMensaje("Hola, bienvenido a mi calculadora");
        JCheckBox checkBox=new JCheckBox("¿Redondear?");

        List<Object> opciones = Arrays.asList("Sumar", "Restar", "Multiplicar", "Dividir", checkBox);
        while(activa==true) {

            int opcionSeleccionada = JOptionPane.showOptionDialog(null, "Selecciona una de las siguientes opciones", "UCO - POO", 0, JOptionPane.QUESTION_MESSAGE, null, opciones.toArray(), null);
            int cantidadNumeros=0;
            if(opcionSeleccionada!=-1){
            while(cantidadNumeros==0){
            try {
                cantidadNumeros= Integer.valueOf(JOptionPane.showInputDialog("¿Que cantidad de numeros quieres operar?"));
           }catch (Exception e){
               mostrarMensaje("Cantidad de numeros no valida");
           }
            }
            }

        switch (opcionSeleccionada){
            case SUMAR: {
                double a=0;
                for(int i=0; i<cantidadNumeros;i++){
                    double b=Double.parseDouble(JOptionPane.showInputDialog("Numero a sumar "));
                    a=Calculadora.sumar(a, b);
                }
                mostrarMensaje("El resultado de la suma es: "+ pruebaRedondear(checkBox, a));
                break;
            }
            case RESTAR: {
                double a = 0;
                for (int i = 0; i < cantidadNumeros; i++) {
                    double b = Double.parseDouble(JOptionPane.showInputDialog("Numero a restar "));
                    if (i == 0) {
                        a = b;
                    }
                    else{
                    a = Calculadora.restar(a, b);
                    }
                }
                mostrarMensaje("El resultado de la resta es: "+ pruebaRedondear(checkBox, a));
                break;
            }
            case MULTIPLICAR:{
                double a=1;
                for(int i=0; i<cantidadNumeros;i++){
                    double b=Double.parseDouble(JOptionPane.showInputDialog("Numero a multiplicar "));
                    a=Calculadora.multiplicar(a, b);
                }
                mostrarMensaje("El resultado de la multiplicacion es: "+ pruebaRedondear(checkBox, a));
                break;
            }
            case DIVIDIR:{
                double a=0;
                for(int i=0; i<cantidadNumeros;i++){
                    double b=Double.parseDouble(JOptionPane.showInputDialog("Numero a dividir "));
                    if(i==0){
                        a=b;
                }
                    else{
                        a=Calculadora.dividir(a, b);
                    }
                }

                mostrarMensaje("El resultado de la division es "+ pruebaRedondear(checkBox, a));
                break;
            }
            default:{
                mostrarMensaje("No seleccionó nada");
                activa=false;
            }
        }
    }
    }
    public static double pruebaRedondear(JCheckBox checkBox, double num){
        if(checkBox.isSelected()){
            return Math.round(num);
        }
        return num;
    }
    public static void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
