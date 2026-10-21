# Explicación detallada de Main.java — Válvula S3

Valvula modela un componente con código, porcentaje de apertura, presión y estado activa. Los campos son privados. Los getters dan acceso de lectura; los setters validan el código no vacío, apertura entre 0 y 100 y presión no negativa.

activar() y desactivar() cambian el estado. mostrarInformacion() imprime this, que utiliza el toString() sobrescrito. toString() muestra código, apertura, presión y estado en un solo texto.

main crea una válvula, asigna código V-01, apertura 40 y presión 2.5, y la activa antes de imprimirla. Luego intenta establecer apertura 120. La validación del setter la rechaza, así que getApertura() muestra el valor anterior 40.

El código aplica encapsulación y condiciones de rango a un objeto de dominio. Los valores se han elegido para demostrar una asignación válida y otra inválida.