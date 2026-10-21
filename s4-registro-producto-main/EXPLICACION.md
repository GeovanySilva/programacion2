# Explicación detallada de Main.java — Registro de producto S4

Producto almacena identificador, nombre, precio y stock. contadorProductos es static, así que mantiene un total común para todos los productos. El constructor incrementa el contador, asigna ese número a id y guarda los otros datos recibidos.

getId() permite consultar el identificador de cada instancia. getTotalProductos() es static porque consulta el contador de la clase.

main crea primero un producto de ejemplo y muestra su ID y el total, que en ese momento es uno. Después, un ciclo for crea cuatro productos adicionales con nombre, precio y stock calculados según i. Al final, el total asciende a cinco.

El ejercicio practica constructor parametrizado, asignación automática de IDs, campo compartido static y ciclo for. En esta versión no hay validación de precio o stock ni getters para esos dos campos; la demostración se centra en el registro y conteo.