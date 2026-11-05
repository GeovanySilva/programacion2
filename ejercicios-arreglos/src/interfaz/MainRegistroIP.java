package interfaz;

import negocio.RegistroIP;

// Geovanny Gabriel Silva Coello
public class MainRegistroIP {
    public static void main(String[] args) {
        RegistroIP[] registros = new RegistroIP[3];
        int cantidad = 0;
        int opcion;
        do {
            opcion = Entrada.entero("REGISTROS IP\n1. Ingresar un registro\n2. Mostrar un registro\n3. Cambiar permiso\n4. Cambiar hora\n0. Salir", 0, 4);
            if (opcion == 1) {
                if (cantidad == registros.length) { Entrada.aviso("No hay espacio disponible."); continue; }
                String ip = Entrada.texto("Dirección IP");
                if (ip == null) continue;
                String hora = Entrada.texto("Hora de acceso");
                if (hora == null) continue;
                int permiso = Entrada.entero("¿Acceso permitido? 1: sí, 0: no", 0, 1);
                if (permiso == -1) continue;
                registros[cantidad] = new RegistroIP(ip, hora, permiso == 1);
                Entrada.aviso("Registro guardado en el índice " + cantidad);
                cantidad++;
            } else if (opcion >= 2) {
                if (cantidad == 0) { Entrada.aviso("Primero ingrese un registro."); continue; }
                int indice = Entrada.entero("Índice del registro (0 a " + (cantidad - 1) + ")", 0, cantidad - 1);
                if (indice == -1) continue;
                if (opcion == 2) registros[indice].mostrarEstado();
                if (opcion == 3) {
                    int permiso = Entrada.entero("Nuevo permiso: 1 sí, 0 no", 0, 1);
                    if (permiso != -1) registros[indice].setPermitida(permiso == 1);
                }
                if (opcion == 4) {
                    String hora = Entrada.texto("Nueva hora");
                    if (hora != null) registros[indice].setHoraAcceso(hora);
                }
            }
        } while (opcion > 0);
    }
}
