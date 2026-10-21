# Explicación detallada de Main.java — Ejercicio guiado S2

El archivo declara Main y una clase anidada Producto. Producto modela un artículo con nombre, precio y categoría. nombre y precio son públicos; categoria no tiene modificador y por tanto es accesible dentro del paquete.

mostrarInformacion() imprime los tres atributos en una sola línea. mostrarCategoria() imprime solo la categoría. Ambos métodos son de instancia: se ejecutan sobre un producto concreto y usan los valores guardados en ese objeto.

El método main crea dos productos con new. p1 representa un Mouse y p2 un Curso Java. Después muestra la información y categoría de ambos. Luego cambia solo el precio de p1 de 20 a 25 y vuelve a imprimir los dos productos. Esto demuestra que cada objeto guarda su propio estado y que modificar uno no cambia al otro.

La clase es un ejemplo básico de clase, objeto, atributos, métodos y asignación. En este ejercicio no hay constructor personalizado ni validaciones; los objetos se crean vacíos y se inicializan asignando campos directamente.