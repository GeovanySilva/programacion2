public class Main {
  static class Router {
    private String nombre;
    private String direccionIP;
    private int cantidadPuertos;
    private boolean activo;
    public Router() {}
    public void mostrarInformacion() { System.out.println(this); }
    public String getNombre() { return nombre; }
    public void setNombre(String v) { if (v != null && !v.isBlank()) this.nombre = v; }
    public String getDireccionIP() { return direccionIP; }
    public void setDireccionIP(String v) { if (v != null && !v.isBlank()) this.direccionIP = v; }
    public int getCantidadPuertos() { return cantidadPuertos; }
    public void setCantidadPuertos(int v) { if (v > 0) this.cantidadPuertos = v; }
    public boolean getActivo() { return activo; }
    public boolean isActivo() { return activo; }
    public void setActivo(boolean v) { this.activo = v; }
    public void encender() { activo = true; }
    public void apagar() { activo = false; }
    @Override public String toString() { return "Router{" + "nombre=" + nombre + ", " + "direccionIP=" + direccionIP + ", " + "cantidadPuertos=" + cantidadPuertos + ", " + "activo=" + activo + "}"; }
  }
  public static void main(String[] args) {
    Router ejemplo = new Router();
    ejemplo.setNombre("Router central"); ejemplo.setDireccionIP("192.168.1.1"); ejemplo.setCantidadPuertos(8);
    ejemplo.encender(); ejemplo.mostrarInformacion();
    ejemplo.setCantidadPuertos(0); // Rechazado: requiere un valor mayor que cero
    System.out.println("Puertos validados: " + ejemplo.getCantidadPuertos());
  }
}
