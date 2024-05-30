/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inicio;

import java.io.*;

/**
 *
 * @author Manuel Guererro Morales
 */
public class Archivos {

    public void verificarArchivo(String ruta, String dato) {

        File file = new File(ruta);
        boolean nameFound= false;
        try (BufferedReader bR = new BufferedReader(new FileReader(file))) {
            String lectura;
            while ((lectura = bR.readLine()) != null) {
                if (lectura.contains(dato)) {
                   
                    nameFound = true;
                }
            }
            if (!nameFound) {
                System.out.println("Nombre no encontrado en " + ruta);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: Problema de I/O - " + e.getMessage());
        }
    }
}
