/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inicio;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.*;

/**
 *
 * @author Manuel Guererro Morales
 */
public class Imagenes {

    public static void imagenEscalada(String imagen, JLabel componente) {
        ImageIcon icono = new ImageIcon("src/main/resources/Imagenes/" + imagen);
        icono.setImage(icono.getImage().getScaledInstance(componente.getWidth(), componente.getHeight(), Image.SCALE_SMOOTH));
        componente.setIcon(icono);
    }

    public static Cursor Cursor(String imagen) {
        ImageIcon im = new ImageIcon("src/main/resources/Imagenes/" + imagen);
        Cursor cur = Toolkit.getDefaultToolkit().createCustomCursor(im.getImage(), new Point(10, 10), "WILL");
        return cur;
    }
}
