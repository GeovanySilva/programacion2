# Explicación detallada de Main.java — Ejercicio guiado S3.2

Producto ahora protege nombre, precio y categoría con private. Esto impide que main acceda a esos campos directamente. En su lugar utiliza setters para asignar valores y getters para consultarlos: setNombre/getNombre, setPrecio/getPrecio y setCategoria/getCategoria.

Los setters de texto comprueban que el valor no sea null ni esté vacío o compuesto por espacios mediante isBlank(). El setter de precio solo guarda valores mayores o iguales a cero. Si un valor no cumple la condición, el método lo ignora y conserva el precio anterior.

main crea dos productos, asigna sus datos mediante setters y prueba setPrecio(-100) en el primero. El valor negativo se rechaza, por eso después getPrecio devuelve el precio válido anterior, 20. Luego se imprimen los datos de ambos productos usando getters.

La clase demuestra encapsulación y validación en el punto de modificación. Esta solución valida campos individuales, aunque el constructor sigue siendo implícito y los campos empiezan con valores predeterminados hasta que se configuran.