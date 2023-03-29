package programacion.juegos;

public class tablero {

    private int filas;
    private int columnas;
    private int minas;

    
    int [][] newArray;
    String [][] arrayUsuario;

    //Creo el constructor de la clase tablero
    public tablero (int filas, int columnas, int minas){
        this.filas = filas;
        this.columnas = columnas;
        this.minas = minas;
        newArray = new int [filas][columnas];
        arrayUsuario = new String [filas][columnas];
    }

    //Genero las minas del tablero
    public void generaMinas(){
        for(int x = 0; x < 3; x++){
            int i = (int)(Math.random() * 6);
            int f = (int)(Math.random() * 6);
            newArray[i][f] = -1;
                if(newArray[i][f] == 0){
                    newArray[i][f] = -1;
                }
        }
    }

    //Muestro el array para ver si esta generandose correctamente el numero
    public void muestroArray(){
        for (int i = 0; i < arrayUsuario.length; i++){
            System.out.println();
            for (int f = 0; f < arrayUsuario.length; f++){
                System.out.print(arrayUsuario[i][f] + "\t");
            }
        }
        System.out.println();
    }

    //Creo el metodo que mirara las casillas adyacentes a las introducidas por cliente
    public void tableroCompleto(){                                                                                                                              
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (this.newArray[i][j] == -1) {
                    for (int k = i - 1; k <= i + 1; k++) {
                        for (int l = j - 1; l <= j + 1; l++) {
                            if (k >= 0 && k < filas && l >= 0 && l < columnas && newArray[k][l] != -1) {
                                this.newArray[k][l]++;
                            }
                        }
                    }
                }
            }
        }

        for(int i = 0; i < filas; i++){
            for (int f = 0; f < columnas; f++){
                arrayUsuario[i][f] = "*";
            }
        }
    }

    public void guardoDecisionUsuario(int decisionFila, int decisionColumna){
        arrayUsuario[decisionFila - 1][decisionColumna - 1] = String.valueOf(newArray[decisionFila - 1][decisionColumna - 1]);
    }

    public boolean caeMina(int decisionFila, int decisionColumna){
        if(newArray[decisionFila - 1][decisionColumna - 1] == -1){
            System.out.println("PERDISTE! Has caido en una mina.");
            return true;
        }else{
            return false;
        }
    }

}

