# Explicación detallada de Main.java — Pedidos S4

Pedido guarda id, cliente, total y estado. contadorPedidos y ventasTotales son static: pertenecen a la clase y se comparten entre todos los pedidos. El constructor asigna un ID consecutivo, guarda el cliente y total y establece estado inicial "Pendiente".

confirmar() cambia el estado a "Confirmado" y suma el total a ventasTotales solo si el pedido aún no estaba confirmado. La comparación usa "Confirmado".equals(estado), que compara el contenido del texto. Esta condición evita sumar dos veces el mismo pedido si se llama confirmar() repetidamente.

getId() obtiene el número del pedido y getVentasTotales() consulta la suma común.

main crea pedidos de Carlos y Ana, confirma dos veces el primero y una vez el segundo. Aunque confirmar se llama tres veces, las ventas acumuladas son 120.50 + 80.00 = 200.50, porque la segunda confirmación de Carlos no duplica su importe. Es un ejemplo de estado y protección de una operación repetida.