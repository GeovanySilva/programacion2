# Explicación detallada de Main.java — Router S3

Router representa un equipo de red con nombre, dirección IP, cantidad de puertos y estado activo. Sus cuatro campos son privados y se consultan mediante getters.

setNombre y setDireccionIP aceptan únicamente textos no nulos y no vacíos. setCantidadPuertos requiere un entero mayor que cero. setActivo permite establecer el estado directamente; encender() y apagar() ofrecen operaciones con intención más clara para cambiarlo.

mostrarInformacion() imprime this. La versión sobrescrita de toString() genera el texto con nombre, IP, cantidad de puertos y estado. isActivo() y getActivo() consultan el mismo boolean.

main configura un router central con IP 192.168.1.1 y ocho puertos, lo enciende y muestra su estado. Después intenta asignar cero puertos. El setter lo rechaza y la consulta final conserva ocho.

El ejemplo muestra encapsulación, validación de texto y enteros, métodos de estado y toString().