# Explicación detallada de Main.java — Registro de clientes S4

Cliente contiene id, nombre, correo y estado activo. contadorClientes es static y registra cuántas instancias se crearon. El constructor incrementa ese contador, asigna el número como ID, guarda nombre y correo y deja activo en true inicialmente.

getId() consulta el identificador. activar() y desactivar() permiten cambiar el estado booleano. getTotalClientes() devuelve el contador global de la clase.

main registra a Ana y Luis. Los IDs se asignan en orden, comenzando en 1. Después Ana se desactiva y Luis se activa (ya estaba activo por defecto), y se imprimen los IDs y el total de dos clientes.

El ejercicio demuestra constructor, estado inicial, métodos que cambian estado y contador static. Aunque nombre, correo y activo forman parte del objeto, esta salida no los imprime porque la clase no incluye getters ni un método de presentación.