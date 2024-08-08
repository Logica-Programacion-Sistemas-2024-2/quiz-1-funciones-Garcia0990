package quiz1sistemas;
import java.util.Scanner;

import org.checkerframework.common.value.qual.StringVal;



public class App {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

    // Preguntamos el tipo de boleta
    System.out.println("Ingrese el tipo de boleta (G o v): ");
    String tipoBoleta = scanner.nextLine();

    // Preguntamos la cantidad de boletas
    System.out.println("Ingrese la cantidad de boletas: ");
    int cantidadBoletas = scanner.nextInt();
    scanner.nextLine();

    // Preguntamos el combo
    System.out.println("Ingrese el número del combo (1, 2 o 3): ");
    int numeroCombo = scanner.nextInt();
    scanner.nextLine();
    // Preguntamos la cantidad de combos
    System.out.println("Ingrese la cantidad de combos: ");
    int cantidadCombos = scanner.nextInt();
    scanner.nextLine();
    // Calculamos el valor de las boletas
    int valorBoletas;
    if (tipoBoleta == "G") {
        valorBoletas = 10000 * cantidadBoletas;
    } else {
        valorBoletas = 15000 * cantidadBoletas;
    }

    // Calculamos el valor del combo
    int valorCombo;
    switch (numeroCombo) {
        case 1:
            valorCombo = 40000 * cantidadCombos;
            break;
        case 2:
            valorCombo = 30000 * cantidadCombos;
            break;
        case 3:
            valorCombo = 42000 * cantidadCombos;
            break;
        default:
            valorCombo = 0;

        }  
        // Calculamos el descuento
        double descuento;
        if (tipoBoleta == "v") {
            switch (numeroCombo) {
                case 1:
                    descuento = (double) (valorCombo * 0.05);
                    break;
                case 2:
                    descuento = (double) (valorCombo * 0.06);
                    break;
                case 3:
                    descuento = (double) (valorCombo * 0.03);
                    break;
                default:
                    descuento = 0;
            }
        } 
        else {
            descuento = 0;
        }
    
    // Calculamos el valor total de la factura
    double valorTotal = valorBoletas + valorCombo - descuento;

    // Mostramos la factura
    System.out.println("Factura");
    System.out.println("--------");
    System.out.println("Tipo de silla: " + (tipoBoleta == "G" ? "General" : "v") + " - Cantidad: " + cantidadBoletas);
    System.out.println("Valor total de las boletas: $" + valorBoletas);
    System.out.println("Combo: " + numeroCombo + " - Cantidad: " + cantidadCombos);
    System.out.println("Valor neto del combo: $" + valorCombo);
    System.out.println("Descuento: $" + descuento);
    System.out.println("Valor total de la factura: $" + valorTotal);
    }


        // Logica de solucion
        
    

    /*  Implemente una funcion llamada calcularValorBoleta que cumpla con las siguientes caracteristicas
        * Recibe: 
            - Una cadena de caracteres que representa el tipo de silla comprada (V ó G)
            - Un entero que representa la cantidad de boletas compradas
        * Retorna:
            - Un entero representando el valor total de las boletas
    */
    //------------------------------------------------------------------
    
    public static int calcularValorBoleta(){
          // Preguntamos el tipo de boleta
    System.out.println("Ingrese el tipo de boleta (G o v): ");
    String tipoBoleta;

    // Preguntamos la cantidad de boletas
    System.out.println("Ingrese la cantidad de boletas: ");
    int cantidadBoletas;
    }

    
    
        
     


    //------------------------------------------------------------------

    /*  Implemente una funcion llamada calcularValorNetoCombo que cumpla con las siguientes caracteristicas
        * Recibe:
            - Un entero representando el numero de combo selecciondo
            - Un entero representando la cantidad de combos comprados
        * Retorna:
            - Un entero representando el valor neto del combo
    */
    //------------------------------------------------------------------
     public static int calcularValorNetoCombo(){
        System.out.println("Ingrese el número del combo (1, 2 o 3): ");
        int numeroCombo;
        System.out.println("Ingrese la cantidad de combos: ");
        int cantidadCombos;
     }


    //------------------------------------------------------------------

    /*  Implemente una funcion llamada calcularDescuentoCombo que cumpla con las siguientes caracteristicas
        * Recibe:
            - Una cadena de caracteres que representa el tipo de silla comprada (V ó G)
            - Un entero representando el valor neto del combo
        * Retorna:
            - Un entero representando el valor del descuento
    */
    //------------------------------------------------------------------
    
    
        
     }

    //------------------------------------------------------------------

    /*  Implemente una funcion llamada calcularValorFactura que cumpla con las siguientes caracteristicas
        * Recibe:
            - Un entero representando el valor neto del combo
            - Un entero representando el valor de las boletas
            - Un entero representando el valor del descuento del combo
        * Retorna:
            - Un entero representando el valor total de la factura
    */
    //------------------------------------------------------------------
    public static int calcularValorFactura(){
        
    }


    //------------------------------------------------------------------

