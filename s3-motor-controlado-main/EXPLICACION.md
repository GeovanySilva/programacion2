# Explicación detallada de Main.java — Motor controlado S3

Motor tiene nombre, potencia, velocidad y encendido, todos privados. Sus getters permiten consultar cada campo y sus setters controlan las modificaciones. El nombre debe ser texto no vacío; potencia no puede ser negativa; velocidad se limita al rango de 0 a 100. El boolean tiene getEncendido() e isEncendido(), dos convenciones para consultar estados.

encender() y apagar() cambian el estado del motor. mostrarInformacion() imprime el objeto usando this, lo que hace que Java invoque toString(). toString() fue sobrescrito para mostrar los cuatro campos en un formato legible; @Override marca explícitamente esa sustitución.

main configura un motor, lo enciende y muestra sus datos. Después intenta asignarle velocidad 120. Como excede el límite, setVelocidad no cambia el valor y getVelocidad sigue devolviendo 60.

El ejemplo enseña control de acceso, validaciones, métodos de estado y personalización de la representación textual del objeto.