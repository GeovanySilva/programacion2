public class Main {
  static class Producto {
    private String nombre; private double precio; private String categoria;
    private static int contador = 0; private final int id;
    public Producto(String nombre, double precio, String categoria) {
      if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("nombre requerido");
      if (precio < 0) throw new IllegalArgumentException("precio no puede ser negativo");
      this.nombre = nombre; this.precio = precio; this.categoria = categoria; this.id = ++contador;
    }
    public String getNombre() { return nombre; } public double getPrecio() { return precio; }
    public String getCategoria() { return categoria; } public int getId() { return id; }
    public static int getTotalCreados() { return contador; }
  }
  public static void main(String[] args) {
    Producto p1 = new Producto("Mouse", 20, "Tecnología");
    Producto p2 = new Producto("Curso Java", 75, "Educación");
    Producto p3 = new Producto("Teclado", 30, "Tecnología");
    System.out.println("Objeto " + p1.getId() + ": " + p1.getNombre());
    System.out.println("Objeto " + p2.getId() + ": " + p2.getNombre());
    System.out.println("Objeto " + p3.getId() + ": " + p3.getNombre());
    System.out.println("Total: " + Producto.getTotalCreados());
  }
}
