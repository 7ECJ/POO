package Desafio_1.piedra_papel_tijeras.dominio;

public class PiedraPapelTijeras {
    public static int puntosYo=0;
    public static int puntosPc=0;
    public static int empates=0;
    public static final int PIEDRA=0;
    public static final int PAPEL=1;
    public static final int TIJERAS=2;
    public static final String INSTRUCCIONES="" +
            "Juego de Piedra, Papel o Tijeras \n" +
            "Debes elegir una de las tres opciones para enfrentar a la computadora\n"+
            "Toma en cuenta: \n"+
            "-Piedra vence Tijera \n"+
            "-Tijera vence Papel\n"+
            "-Papel vence Piedra\n"+
            "-Si tu y la computadora eligen la misma opcion se declara empate\n"+
            "";

    public static void jugar(int opcionUsuario, int opcionPc){

        if(opcionPc==PIEDRA && opcionUsuario==PIEDRA){
            empates+=1;
        }
        if(opcionPc==PIEDRA && opcionUsuario==PAPEL){
            puntosYo+=1;
        }
        if(opcionPc==PIEDRA && opcionUsuario==TIJERAS){
           puntosPc+=1;
        }
        if(opcionPc==PAPEL && opcionUsuario==PIEDRA){
            puntosPc+=1;
        }
        if(opcionPc==PAPEL && opcionUsuario==PAPEL){
            empates+=1;
        }
        if(opcionPc==PAPEL && opcionUsuario==TIJERAS){
            puntosYo+=1;
        }
        if(opcionPc==TIJERAS && opcionUsuario==PIEDRA){
            puntosYo+=1;
        }
        if(opcionPc==TIJERAS && opcionUsuario==PAPEL){
            puntosYo+=1;
        }
        if(opcionPc==TIJERAS && opcionUsuario==TIJERAS){
            empates+=1;
        }
    }
    public static String mostrarResultados(){
        String mensaje="\n"+"TU: "+puntosYo+"\n"+"Computadora: "+puntosPc+"\n"+"Empates: "+empates;
        return mensaje;
    }
}
