# Reglas para construir las pruebas

# 1. Importamos la regla de prueba de Java
load("@rules_java//java:defs.bzl", "java_test")

# 2. Definimos el objetivo de la prueba
java_test(
    name = "SaludoTest",
    srcs = ["SaludoTest.java"],
    # Indicamos la clase que contiene las pruebas
    test_class = "com.saludo.SaludoTest",
    # Añadimos las dependencias necesarias:
    #   - La librería que vamos a probar (lib_saludo)
    #   - Las librerías de JUnit que descargamos en WORKSPACE
    deps = [
        "//saludo-bazel/src/main/java/com/saludo:lib_saludo",
        "@maven//:junit_junit",
    ],
)