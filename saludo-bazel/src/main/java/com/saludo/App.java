package com.saludo;

public class App {
    public static void main(String[] args) {
        Saludo miSaludo = new Saludo();
        String mensaje = miSaludo.generarMensaje("Mundo");
        System.out.println(mensaje);
    }
}