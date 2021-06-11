package paquete1;

import paquete2.*;
import paquete3.*;
import paquete4.*;

import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        int tiempoPrestamo;
        String ciudad;
        String eleccion = "S";
        do {
            try {
                System.out.println("Menu de Prestamos\n"
                        + "Escoja una opcion\n"
                        + "1. Ingresar un prestamo de Tipo Automovil\n"
                        + "2. Ingresar un prestamo de Tipo Educativo\n");
                option = sc.nextInt();
                sc.nextLine();
                System.out.print("Ingrese el nombre del beneficiario: ");
                String nameb = sc.nextLine();
                System.out.print("Ingrese el apellido del beneficiario: ");
                String apellidob = sc.nextLine();
                System.out.print("Ingrese el tiempo del prestamo en meses: ");
                tiempoPrestamo = sc.nextInt();
                System.out.print("Ingrese la ciudad del prestamo: ");
                ciudad = sc.nextLine();
                Persona beneficiario = new Persona(nameb, apellidob);
                if (option == 1) {
                    sc.nextLine();
                    System.out.print("Ingrese el nombre del garante: ");
                    String nameg = sc.nextLine();
                    System.out.print("Ingrese el apellido del garante: ");
                    String apellidog = sc.nextLine();
                    System.out.print("Ingrese el tipo de auto: ");
                    String tipo = sc.nextLine();
                    System.out.print("Ingrese la marca del auto: ");
                    String marca = sc.nextLine();
                    System.out.print("Ingrese el valor del automovil: ");
                    double valorA = sc.nextDouble();
                    Persona garante = new Persona(nameg, apellidog);
                    PrestamoAutomovil prestAuto = new PrestamoAutomovil(beneficiario,
                            tiempoPrestamo, ciudad, tipo, marca, garante, valorA);
                    prestAuto.setCiudad(ciudad);
                    prestAuto.setValorMensualPagoPres();
                    System.out.println(prestAuto);
                } else {
                    sc.nextLine();
                    System.out.print("Ingrese el nivel de estudios: ");
                    String nivel = sc.nextLine();
                    System.out.print("Ingrese el nombre del centro educativo: ");
                    String centro = sc.nextLine();
                    System.out.print("Ingrese el valor de la carrera: ");
                    double carrera = sc.nextDouble();

                    PrestamoEducativo prestEduca = new PrestamoEducativo(beneficiario,
                            tiempoPrestamo, ciudad, nivel, centro, carrera);
                    
                    prestEduca.setCiudad(ciudad);
                    prestEduca.setValorMensualCostoPres();

                    System.out.println(prestEduca);
                }

                System.out.println("Desea seguir ingresado mas prestamos? Digite"
                        + " Si para continuar o No para salir");
                sc.nextLine();
                eleccion = sc.nextLine();

            } catch (NumberFormatException n) {
                System.out.println("Error" + n.getMessage());
            }

        } while (eleccion.equals("Si"));
    }
}
