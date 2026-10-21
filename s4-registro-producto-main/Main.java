public class Main {
  static class Producto {
    private int id;
    private String nombre;
    private double precio;
    private int stock;
    private static int contadorProductos = 0;
    public Producto(String nombre, double precio, int stock) {
        contadorProductos++;
        this.id = contadorProductos;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    public int getId() { return id; }
    public static int getTotalProductos() { return contadorProductos; }
  }
  public static void main(String[] args) {
    Producto ejemplo = new Producto("Ejemplo", 0, 0);
    System.out.println("ID: " + ejemplo.getId());
    System.out.println("Total de productos: " + Producto.getTotalProductos());
    for (int i=1; i<5; i++) new Producto("Producto " + i, i*10.0, i*2);
    System.out.println("Total de productos: " + Producto.getTotalProductos());
  }
}
