public class Main {
  static class Producto {
    public String nombre; public double precio; String categoria; boolean disponible;
    public void mostrarInformacion() { System.out.println("Producto: " + nombre + " | Precio: " + precio + " | Categoría: " + categoria + " | Disponible: " + disponible); }
    public void cambiarDisponibilidad(boolean nuevaDisponibilidad) { disponible = nuevaDisponibilidad; }
    void mostrarPrecio() { System.out.println("Precio: " + precio); }
    void mostrarDisponibilidad() { System.out.println("Disponible: " + disponible); }
  }
  public static void main(String[] args) {
    Producto producto1 = new Producto(); producto1.nombre="Audífonos Bluetooth"; producto1.precio=32.50; producto1.categoria="Tecnología"; producto1.disponible=true;
    Producto producto2 = new Producto(); producto2.nombre="Mouse"; producto2.precio=20; producto2.categoria="Tecnología"; producto2.disponible=true;
    Producto producto3 = new Producto(); producto3.nombre="Curso Java"; producto3.precio=75; producto3.categoria="Educación"; producto3.disponible=true;
    producto1.mostrarInformacion(); producto1.cambiarDisponibilidad(false); producto1.mostrarDisponibilidad(); producto1.mostrarPrecio(); producto2.mostrarInformacion(); producto3.mostrarInformacion();
  }
}
