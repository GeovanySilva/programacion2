# Explicación detallada de Main.java — Motor S2

Motor almacena nombre, potencia en kilovatios, velocidad en rpm y si está encendido. Sus atributos de texto y números permiten describir el motor; encendido es un boolean.

encender() y apagar() cambian el estado. mostrarInformacion() imprime nombre, potencia, velocidad y estado. mostrarEstado() imprime únicamente si está encendido.

main crea tres motores con características diferentes. Enciende el motor principal, muestra su información, lo apaga y después consulta su estado. Los otros motores permanecen apagados y se muestran con sus datos.

El ejemplo practica atributos, métodos de cambio de estado, métodos de consulta y varias instancias del mismo tipo. Los campos se asignan directamente y no se valida que la potencia o velocidad sean valores físicamente posibles.