public class Main {
  static class Motor {
    private String nombre;
    private double potencia;
    private int velocidad;
    private boolean encendido;
    public Motor() {}
    public void mostrarInformacion() { System.out.println(this); }
    public String getNombre() { return nombre; }
    public void setNombre(String v) { if (v != null && !v.isBlank()) this.nombre = v; }
    public double getPotencia() { return potencia; }
    public void setPotencia(double v) { if (v >= 0) this.potencia = v; }
    public int getVelocidad() { return velocidad; }
    public void setVelocidad(int v) { if (v >= 0 && v <= 100) this.velocidad = v; }
    public boolean getEncendido() { return encendido; }
    public boolean isEncendido() { return encendido; }
    public void setEncendido(boolean v) { this.encendido = v; }
    public void encender() { encendido = true; }
    public void apagar() { encendido = false; }
    @Override public String toString() { return "Motor{" + "nombre=" + nombre + ", " + "potencia=" + potencia + ", " + "velocidad=" + velocidad + ", " + "encendido=" + encendido + "}"; }
  }
  public static void main(String[] args) {
    Motor ejemplo = new Motor();
    ejemplo.setNombre("Motor principal"); ejemplo.setPotencia(15.5); ejemplo.setVelocidad(60);
    ejemplo.encender(); ejemplo.mostrarInformacion();
    ejemplo.setVelocidad(120); // Rechazado: fuera del rango 0–100
    System.out.println("Velocidad validada: " + ejemplo.getVelocidad());
  }
}
