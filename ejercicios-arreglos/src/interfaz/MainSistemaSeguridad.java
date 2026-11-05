package interfaz;

import negocio.SistemaSeguridad;

// Geovanny Gabriel Silva Coello
public class MainSistemaSeguridad {
    public static void main(String[] args) {
        SistemaSeguridad[] sistemas = new SistemaSeguridad[3];
        for (int i = 0; i < sistemas.length; i++) {
            String nombre = Entrada.texto("Nombre del sistema " + i);
            if (nombre == null) return;
            sistemas[i] = new SistemaSeguridad(nombre);
        }
        int opcion;
        do {
            opcion = Entrada.entero("SISTEMAS - ARREGLO COMPLETO\n1. Registrar un fallo en todos\n2. Reiniciar todos\n3. Mostrar todos\n0. Salir", 0, 3);
            switch (opcion) {
                case 1:
                    for (int i = 0; i < sistemas.length; i++) sistemas[i].registrarIntentoFallido();
                    break;
                case 2:
                    for (int i = 0; i < sistemas.length; i++) sistemas[i].reiniciarContador();
                    break;
                case 3:
                    for (int i = 0; i < sistemas.length; i++) sistemas[i].mostrarEstado();
                    Entrada.aviso("Estados mostrados en la consola del IDE.");
                    break;
            }
        } while (opcion > 0);
    }
}
