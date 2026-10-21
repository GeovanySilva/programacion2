# Explicación detallada de Main.java — Ejercicio guiado S4

Producto tiene los campos privados nombre, precio y categoría, además del identificador id. La variable static contador es compartida por todos los productos. id es final: se asigna en la construcción y no puede cambiar después.

El constructor recibe nombre, precio y categoría. Valida que el nombre exista y no esté en blanco, y que el precio no sea negativo. Cuando el producto es válido, asigna sus atributos y establece id con ++contador. Así cada nuevo objeto recibe un número consecutivo.

Los getters devuelven los datos. getTotalCreados() es static y consulta el contador global de la clase.

main crea Mouse, Curso Java y Teclado; imprime ID y nombre para cada uno y al final muestra total 3. El ejercicio combina constructores, validación, encapsulación, campo final y contador static. La categoría y el precio están almacenados y disponibles mediante getters aunque esta salida solo presenta ID y nombre.