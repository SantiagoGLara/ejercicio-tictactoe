public class Principal {
    public static void main(String[] args) throws Exception {
        String[][] tablero={{" ","|"," ","|"," "},{"-","-","-","-","-"},{" ","|"," ","|"," "},
        {"-","-","-","-","-"},{" ","|"," ","|"," "}};
        boolean condicion=true;
        do {
            System.out.println("Seleccione un espacio a rellenar");
            for (int fil = 0; fil < tablero.length; fil++) {
                for (int col = 0; col < tablero.length; col++) {
                    System.out.print(tablero[fil][col]);
                }
                System.out.println();
            }
            condicion=false;
        } while (condicion==true);
}
}
