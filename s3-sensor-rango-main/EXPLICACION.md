# Explicación detallada de Main.java — Sensor de rango S3

Sensor guarda nombre, lectura actual, valor mínimo y máximo como campos privados. getNombre, getLectura, getValorMinimo y getValorMaximo permiten consultar los datos; los setters controlan la asignación.

setNombre rechaza null y texto en blanco. setLectura acepta lecturas no negativas. setValorMinimo solo cambia el mínimo si no supera al máximo actual; setValorMaximo solo cambia el máximo si no queda por debajo del mínimo. Por eso main primero establece el máximo en 100 y después el mínimo en 0.

actualizarLectura(double v) cambia la lectura solo si queda dentro del intervalo inclusivo entre mínimo y máximo. toString() reúne el nombre y los tres valores para mostrar el estado del sensor.

main configura un sensor térmico, acepta 23.5 como lectura válida, muestra el objeto e intenta después actualizarlo a 150. Esa lectura queda rechazada y la lectura anterior permanece. El ejercicio demuestra rangos y validación de estado.