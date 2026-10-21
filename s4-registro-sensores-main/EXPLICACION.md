# Explicación detallada de Main.java — Registro de sensores S4

Sensor guarda id, tipo, unidad y lectura. cantidadSensores es static, así que todos los sensores comparten el contador. El constructor incrementa el total, asigna un identificador consecutivo y guarda tipo y unidad. La lectura inicia en cero por ser double.

actualizarLectura(double nuevaLectura) cambia la lectura del objeto que recibe la llamada. getId() consulta el identificador; getTotalSensores() devuelve el total común.

main crea sensores de temperatura, humedad y presión, luego asigna una lectura a cada uno. Finalmente imprime los IDs y el total de tres sensores.

El ejercicio practica constructores, datos por objeto, actualización de estado y conteo static. tipo, unidad y lectura son privados, pero esta versión no tiene getters ni método para imprimirlos; por eso la salida únicamente presenta IDs y cantidad.