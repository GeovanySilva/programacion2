public class Main {
  static class Cupon {
    public String codigo; public double porcentajeDescuento; String descripcion; boolean activo;
    public void mostrarInformacion() { System.out.println("Cupón " + codigo + " | " + porcentajeDescuento + "% | " + descripcion + " | activo=" + activo); }
    public void activar() { activo=true; } void desactivar() { activo=false; }
    void mostrarDescuento() { System.out.println("Descuento: " + porcentajeDescuento + "%"); }
    void mostrarResumen() { System.out.println("Cupón " + codigo + " - Descuento " + porcentajeDescuento + "%"); }
  }
  public static void main(String[] args) {
    Cupon a=new Cupon(); a.codigo="VERANO20"; a.porcentajeDescuento=20; a.descripcion="Promoción de verano"; a.activo=true;
    Cupon b=new Cupon(); b.codigo="OTONO10"; b.porcentajeDescuento=10; b.descripcion="Oferta de temporada"; b.activo=true;
    Cupon c=new Cupon(); c.codigo="NUEVO15"; c.porcentajeDescuento=15; c.descripcion="Primera compra"; c.activo=true;
    a.mostrarInformacion(); a.mostrarDescuento(); a.mostrarResumen(); b.mostrarInformacion(); c.mostrarInformacion();
  }
}
