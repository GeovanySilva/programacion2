package interfaz;

import negocio.Usuario;

// Geovanny Gabriel Silva Coello
public class MainUsuario {
    public static void main(String[] args) {
        Usuario[] usuarios = new Usuario[3];
        // Se llena todo el arreglo antes de mostrar el menú.
        for (int i = 0; i < usuarios.length; i++) {
            String nombre = Entrada.texto("Usuario " + i + ": nombre");
            if (nombre == null) return;
            String correo = Entrada.texto("Correo del usuario " + i);
            if (correo == null) return;
            usuarios[i] = new Usuario();
            usuarios[i].setNombreUsuario(nombre);
            usuarios[i].setCorreo(correo);
            while (true) {
                String clave = Entrada.texto("Contraseña del usuario " + i + " (mínimo 8 caracteres)");
                if (clave == null) return;
                try { usuarios[i].setContrasena(clave); break; }
                catch (IllegalArgumentException ex) { Entrada.aviso(ex.getMessage()); }
            }
        }
        int opcion;
        do {
            opcion = Entrada.entero("USUARIOS - ARREGLO COMPLETO\n1. Mostrar todos\n2. Actualizar todos los correos\n3. Cambiar todas las contraseñas\n0. Salir", 0, 3);
            switch (opcion) {
                case 1:
                    for (int i = 0; i < usuarios.length; i++) usuarios[i].mostrarDatos();
                    Entrada.aviso("Datos mostrados en la consola del IDE.");
                    break;
                case 2:
                    for (int i = 0; i < usuarios.length; i++) {
                        String correo = Entrada.texto("Nuevo correo de " + usuarios[i].getNombreUsuario());
                        if (correo == null) return;
                        usuarios[i].setCorreo(correo);
                    }
                    break;
                case 3:
                    for (int i = 0; i < usuarios.length; i++) {
                        while (true) {
                            String clave = Entrada.texto("Nueva contraseña de " + usuarios[i].getNombreUsuario());
                            if (clave == null) return;
                            try { usuarios[i].setContrasena(clave); break; }
                            catch (IllegalArgumentException ex) { Entrada.aviso(ex.getMessage()); }
                        }
                    }
                    break;
            }
        } while (opcion > 0);
    }
}
