public class Main {
  static class Cliente {
    private int id;
    private String nombre;
    private String correo;
    private static int contadorClientes = 0;
    private boolean activo;
    public Cliente(String nombre, String correo) {
        contadorClientes++;
        this.id = contadorClientes;
        this.nombre = nombre;
        this.correo = correo;
        this.activo = true;
    }
    public int getId() { return id; }
    public void activar() { activo = true; }
    public void desactivar() { activo = false; }
    public static int getTotalClientes() { return contadorClientes; }
  }
  public static void main(String[] args) {
    Cliente ana = new Cliente("Ana Pérez", "ana@correo.com");
    Cliente luis = new Cliente("Luis Ruiz", "luis@correo.com");
    ana.desactivar(); luis.activar();
    System.out.println("IDs: " + ana.getId() + ", " + luis.getId());
    System.out.println("Total de clientes: " + Cliente.getTotalClientes());
  }
}
