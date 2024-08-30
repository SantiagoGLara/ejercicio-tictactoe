import java.util.Scanner;
public class Principal {
    public static void main(String[] args) throws Exception {
        int sel1,sel2=0;
        Scanner scan = new Scanner(System.in);
        String[][] tablero={{" ","|"," ","|"," "},{"-","-","-","-","-"},{" ","|"," ","|"," "},
        {"-","-","-","-","-"},{" ","|"," ","|"," "}};
        boolean condicion=true,turno=true;
        do {
            System.out.println("Seleccione un espacio a rellenar (inician circulos)");
            for (int fil = 0; fil < tablero.length; fil++) {
                for (int col = 0; col < tablero.length; col++) {
                    System.out.print(tablero[fil][col]);
                }
                System.out.println();
            }
            System.out.print("Selección en x: ");
            sel1=scan.nextInt();
            System.out.print("\nSeleccón en Y: ");
            sel2=scan.nextInt();
            if ((comprobarCasilla(tablero, sel1, sel2)==true)&&turno==true) {
                tablero[sel1][sel2]="O";
                turno=false;
            }else if(((comprobarCasilla(tablero, sel1, sel2)==true)&&turno==true)&&turno==false){
                tablero[sel1][sel2]="X";
                turno=true;
            }


            condicion=false;
        } while (condicion==true);
}
static private boolean checkContinuar(String[][] matriz){
    for (int fil = 0; fil < matriz.length; fil++) {
        switch (matriz[fil][1]) {
            //case "X":
            case "":
                
                break;
        
            default:
                break;
        }
    }
    return true;
}

static private boolean comprobarCasilla(String[][]matriz, int x, int y){
    boolean disponible=false;
    switch (matriz[x][y]) {
        case " ":
            disponible=true;
            break;
    
        default:
            disponible=false;
            break;
    }
    return disponible;
}
}
