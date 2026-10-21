public class Main {
  static class Sensor {
    private int id;
    private String tipo;
    private String unidad;
    private static int cantidadSensores = 0;
    private double lectura;
    public Sensor(String tipo, String unidad) {
        cantidadSensores++;
        this.id = cantidadSensores;
        this.tipo = tipo;
        this.unidad = unidad;
    }
    public int getId() { return id; }
    public void actualizarLectura(double nuevaLectura) { lectura = nuevaLectura; }
    public static int getTotalSensores() { return cantidadSensores; }
  }
  public static void main(String[] args) {
    Sensor s1 = new Sensor("Temperatura", "°C");
    Sensor s2 = new Sensor("Humedad", "%");
    Sensor s3 = new Sensor("Presión", "kPa");
    s1.actualizarLectura(23.5); s2.actualizarLectura(48); s3.actualizarLectura(101.3);
    System.out.println("IDs: " + s1.getId() + ", " + s2.getId() + ", " + s3.getId());
    System.out.println("Total de sensores: " + Sensor.getTotalSensores());
  }
}
