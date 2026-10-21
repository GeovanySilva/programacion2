public class Main {
  static class Producto {
    public String nombre;
    public double precio;
    String categoria;
    public void mostrarInformacion() { System.out.println("Nombre: " + nombre + ", precio: " + precio + ", categoría: " + categoria); }
    void mostrarCategoria() { System.out.println("Categoría: " + categoria); }
  }
  public static void main(String[] args) {
    Producto p1 = new Producto(); p1.nombre = "Mouse"; p1.precio = 20; p1.categoria = "Tecnología";
    Producto p2 = new Producto(); p2.nombre = "Curso Java"; p2.precio = 75; p2.categoria = "Educación";
    p1.mostrarInformacion(); p1.mostrarCategoria(); p2.mostrarInformacion(); p2.mostrarCategoria();
    p1.precio = 25; p1.mostrarInformacion(); p2.mostrarInformacion();
  }
}
