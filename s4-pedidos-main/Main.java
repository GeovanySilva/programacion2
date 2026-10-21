public class Main {
  static class Pedido {
    private int id;
    private String cliente;
    private double total;
    private static int contadorPedidos = 0;
    private String estado;
    private static double ventasTotales;
    public Pedido(String cliente, double total) {
        contadorPedidos++;
        this.id = contadorPedidos;
        this.cliente = cliente;
        this.total = total;
        this.estado = "Pendiente";
    }
    public int getId() { return id; }
    public void confirmar() { if (!"Confirmado".equals(estado)) { estado = "Confirmado"; ventasTotales += total; } }
    public static double getVentasTotales() { return ventasTotales; }
  }
  public static void main(String[] args) {
    Pedido p1 = new Pedido("Carlos", 120.50);
    Pedido p2 = new Pedido("Ana", 80.00);
    p1.confirmar(); p1.confirmar(); p2.confirmar();
    System.out.println("Pedidos: " + p1.getId() + ", " + p2.getId());
    System.out.println("Ventas confirmadas: " + Pedido.getVentasTotales());
  }
}
