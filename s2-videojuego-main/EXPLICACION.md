# Explicación detallada de Main.java — Videojuego S2

Videojuego contiene nombre, género, versión y un boolean activo. Los datos describen cada videojuego; activo permite representar si se ha iniciado.

mostrarInformacion() imprime sus datos principales. iniciar() asigna true a activo; cerrar() asigna false; mostrarVersion() imprime la versión. Son métodos de instancia, así que cambian o consultan un videojuego específico.

main crea tres objetos: Aventura, Carreras y Puzles. Se inicia únicamente el primero y se muestran sus datos y versión. Los otros dos se imprimen con su estado inicial false. Las asignaciones de datos se realizan directamente luego de llamar a new.

El ejercicio demuestra objetos independientes y transiciones sencillas de estado. El método cerrar() está definido aunque no se llama en esta ejecución. No hay todavía reglas que impidan iniciar un juego repetidamente ni validaciones del texto.