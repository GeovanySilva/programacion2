package negocio;

public class Usuario {
    private String nombreUsuario;
    private String correo;
    private String contrasena;

    public String getNombreUsuario() { return nombreUsuario; }
    public void setNombreUsuario(String nombreUsuario) { this.nombreUsuario = nombreUsuario; }
    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }
    public String getContrasena() { return contrasena; }
    public void setContrasena(String contrasena) {
        if (contrasena == null || contrasena.length() < 8) {
            System.out.println("Advertencia: la contraseña debe tener al menos 8 caracteres.");
            throw new IllegalArgumentException("La contraseña debe tener al menos 8 caracteres.");
        }
        this.contrasena = contrasena;
    }
    public void mostrarDatos() {
        System.out.println("Usuario: " + nombreUsuario + " | Correo: " + correo);
    }
}
