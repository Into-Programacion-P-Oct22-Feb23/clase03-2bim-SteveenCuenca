/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author reroes
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de arreglo bidimensionales
        String[][] datof = new String [2][3];
        double[][] dato1 = {{1, 2, 3},{6, 8, 9}};
        int operacion;
        double valor;
        /*
            1   4   3
            36  64  9
        */
        for(int fila = 0; fila < dato1.length; fila++){
            for (int col = 0; col < dato1[fila].length; col++){
                valor = dato1[fila][col];
                if (valor%2 == 0){
                    operacion = (int) (dato1[fila][col] * dato1[fila][col]);
                }else{
                    operacion = (int) (dato1[fila][col] * 1);
                }           
                datof[fila][col] = String.format("%d", operacion);
            }
        }
        for(int fila = 0; fila < dato1.length; fila++){
            for (int col = 0; col < dato1[fila].length; col++){
                System.out.printf("%s\t", datof[fila][col]);
            }
            System.out.println("");
        }
        
    }
    
}
