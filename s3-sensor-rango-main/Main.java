public class Main {
  static class Sensor {
    private String nombre;
    private double lectura;
    private double valorMinimo;
    private double valorMaximo;
    public Sensor() {}
    public void mostrarInformacion() { System.out.println(this); }
    public String getNombre() { return nombre; }
    public void setNombre(String v) { if (v != null && !v.isBlank()) this.nombre = v; }
    public double getLectura() { return lectura; }
    public void setLectura(double v) { if (v >= 0) this.lectura = v; }
    public double getValorMinimo() { return valorMinimo; }
    public void setValorMinimo(double v) { if (v <= valorMaximo) this.valorMinimo = v; }
    public double getValorMaximo() { return valorMaximo; }
    public void setValorMaximo(double v) { if (v >= valorMinimo) this.valorMaximo = v; }
    public void actualizarLectura(double v) { if (v >= valorMinimo && v <= valorMaximo) lectura = v; }
    @Override public String toString() { return "Sensor{" + "nombre=" + nombre + ", " + "lectura=" + lectura + ", " + "valorMinimo=" + valorMinimo + ", " + "valorMaximo=" + valorMaximo + "}"; }
  }
  public static void main(String[] args) {
    Sensor ejemplo = new Sensor();
    ejemplo.setNombre("Sensor térmico"); ejemplo.setValorMaximo(100); ejemplo.setValorMinimo(0);
    ejemplo.actualizarLectura(23.5); ejemplo.mostrarInformacion();
    ejemplo.actualizarLectura(150); // Rechazado: fuera del rango
    System.out.println("Lectura validada: " + ejemplo.getLectura());
  }
}
