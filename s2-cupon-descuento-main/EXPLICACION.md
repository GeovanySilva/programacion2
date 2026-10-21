# Explicación detallada de Main.java — Cupón de descuento S2

Cupon agrupa cuatro datos: código promocional, porcentaje de descuento, descripción y estado activo. codigo y porcentajeDescuento son públicos; descripcion y activo tienen visibilidad de paquete.

mostrarInformacion() combina todos los atributos en una línea. activar() y desactivar() cambian el estado activo a true o false. mostrarDescuento() imprime el porcentaje y mostrarResumen() muestra código y porcentaje de forma breve.

main crea tres cupones con códigos y descripciones distintos. El cupón de verano se consulta mediante sus cuatro operaciones de salida; también se muestra la información de los otros dos. Los tres comienzan activos por asignación directa.

La práctica refuerza modelar objetos que representan promociones, usar String, double y boolean, cambiar el estado de un objeto y definir métodos con diferentes propósitos. Aunque existe desactivar(), esta ejecución no desactiva ningún cupón; el método queda disponible para usarlo.