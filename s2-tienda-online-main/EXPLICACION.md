# Explicación detallada de Main.java — Tienda online S2

La clase anidada Producto representa un producto de catálogo. Guarda nombre, precio, categoría y disponibilidad. Los dos primeros atributos son públicos y los otros tienen visibilidad de paquete.

mostrarInformacion() presenta todos los datos. cambiarDisponibilidad(boolean nuevaDisponibilidad) recibe un boolean y lo guarda en disponible. mostrarPrecio() y mostrarDisponibilidad() muestran datos por separado, para practicar métodos que realizan consultas e impresión.

En main se crean tres objetos Producto: audífonos, mouse y curso de Java. Primero se muestra el primer producto como disponible; luego se cambia su disponibilidad a false y se imprime el nuevo estado y su precio. Los otros dos se imprimen sin modificaciones.

El ejemplo muestra que el boolean representa dos estados, true y false, y que un método puede recibir un dato para modificar un atributo. Los objetos se inicializan campo por campo; no se han agregado controles sobre precios ni sobre nombres.