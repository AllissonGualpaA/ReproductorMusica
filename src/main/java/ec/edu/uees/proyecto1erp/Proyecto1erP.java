/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.uees.proyecto1erp;

import javax.swing.*;

public class Proyecto1erP {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Interfaz reproductor = new Interfaz();
            reproductor.setVisible(true);
        });
    }
}
