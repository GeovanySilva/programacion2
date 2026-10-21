public class Main {
  static class Producto {
    private String nombre; private double precio; private String categoria;
    public void setNombre(String nombre) { if (nombre != null && !nombre.isBlank()) this.nombre = nombre; }
    public String getNombre() { return nombre; }
    public void setPrecio(double precio) { if (precio >= 0) this.precio = precio; }
    public double getPrecio() { return precio; }
    public void setCategoria(String categoria) { if (categoria != null && !categoria.isBlank()) this.categoria = categoria; }
    public String getCategoria() { return categoria; }
  }
  public static void main(String[] args) {
    Producto p1 = new Producto(); p1.setNombre("Mouse"); p1.setPrecio(20); p1.setCategoria("Tecnología");
    Producto p2 = new Producto(); p2.setNombre("Curso Java"); p2.setPrecio(75); p2.setCategoria("Educación");
    p1.setPrecio(-100);
    System.out.println(p1.getNombre() + " " + p1.getPrecio() + " " + p1.getCategoria());
    System.out.println(p2.getNombre() + " " + p2.getPrecio() + " " + p2.getCategoria());
  }
}
