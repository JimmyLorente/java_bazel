# Este archivo BUILD define las reglas para el paquete 'saludo'

# 1. Definimos una librería Java con la clase Saludo.
java_library(
    name = "lib_saludo",
    srcs = ["Saludo.java"],
    visibility = ["//visibility:public"],
)

# 2. Definimos el binario (el programa ejecutable).
java_binary(
    name = "app_saludo",
    srcs = ["App.java"],
    main_class = "com.saludo.App",
    deps = [":lib_saludo"],
)