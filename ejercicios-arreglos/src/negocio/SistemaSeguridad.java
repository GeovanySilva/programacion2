package negocio;

public class SistemaSeguridad {
    private String nombreSistema;
    private int intentosFallidos;
    public SistemaSeguridad(String nombreSistema) {
        this.nombreSistema = nombreSistema;
        this.intentosFallidos = 0;
    }
    public String getNombreSistema() { return nombreSistema; }
    public int getIntentosFallidos() { return intentosFallidos; }
    public void registrarIntentoFallido() { intentosFallidos++; }
    public void reiniciarContador() { intentosFallidos = 0; }
    public void mostrarEstado() {
        System.out.println(nombreSistema + " | Intentos: " + intentosFallidos + " | " + (intentosFallidos >= 3 ? "Bloqueado" : "No bloqueado"));
    }
}
