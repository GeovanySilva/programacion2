package interfaz;

import negocio.SensorTemperatura;

// Geovanny Gabriel Silva Coello
public class MainSensorTemperatura {
    public static void main(String[] args) {
        SensorTemperatura[] sensores = new SensorTemperatura[3];
        int cantidad = 0;
        int opcion;
        do {
            opcion = Entrada.entero("SENSORES\n1. Agregar un sensor\n2. Mostrar una lectura\n3. Actualizar temperatura\n4. Corregir unidad\n0. Salir", 0, 4);
            if (opcion == 1) {
                if (cantidad == sensores.length) { Entrada.aviso("El arreglo está lleno."); continue; }
                String id = Entrada.texto("Identificador del sensor");
                if (id == null) continue;
                Double valor = Entrada.decimal("Temperatura actual");
                if (valor == null) continue;
                String unidad = Entrada.texto("Unidad (por ejemplo, C)");
                if (unidad == null) continue;
                sensores[cantidad] = new SensorTemperatura(id, valor, unidad);
                Entrada.aviso("Sensor guardado en el índice " + cantidad);
                cantidad++;
            } else if (opcion >= 2) {
                if (cantidad == 0) { Entrada.aviso("Primero agregue un sensor."); continue; }
                int indice = Entrada.entero("Índice del sensor (0 a " + (cantidad - 1) + ")", 0, cantidad - 1);
                if (indice == -1) continue;
                if (opcion == 2) sensores[indice].mostrarLectura();
                if (opcion == 3) {
                    Double valor = Entrada.decimal("Nueva temperatura en " + sensores[indice].getUnidad());
                    if (valor != null) sensores[indice].setValorActual(valor);
                }
                if (opcion == 4) {
                    String unidad = Entrada.texto("Unidad correcta (se corrige la etiqueta, no se convierte la temperatura)");
                    if (unidad != null) sensores[indice].setUnidad(unidad);
                }
            }
        } while (opcion > 0);
    }
}
