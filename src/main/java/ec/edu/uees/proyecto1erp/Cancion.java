/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.uees.proyecto1erp;

/**
 *
 * @author Vivobook Pro OLED
 */
public class Cancion{
        private String titulo;
        private String rutaArchivo;

        public Cancion(String titulo, String rutaArchivo) {
            this.titulo = titulo;
            this.rutaArchivo = rutaArchivo;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getRutaArchivo() {
            return rutaArchivo;
        }
}
