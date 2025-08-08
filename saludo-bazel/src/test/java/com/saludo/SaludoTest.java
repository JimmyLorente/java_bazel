package com.saludo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SaludoTest {

    @Test
    public void testGenerarMensaje() {
        // Preparamos el entorno de la prueba
        Saludo miSaludo = new Saludo();
        String nombre = "Prueba";
        String mensajeEsperado = "¡Hola, Prueba! Bienvenido a tu proyecto con Bazel.";

        // Ejecutamos el método que queremos probar
        String mensajeReal = miSaludo.generarMensaje(nombre);

        // Verificamos que el resultado es el esperado
        assertEquals(mensajeEsperado, mensajeReal);
    }
}