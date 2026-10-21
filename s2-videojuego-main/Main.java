public class Main {
  static class Videojuego {
    public String nombre; public String genero; String version; boolean activo;
    public void mostrarInformacion() { System.out.println(nombre + " | " + genero + " | v" + version + " | activo=" + activo); }
    public void iniciar() { activo=true; } void cerrar() { activo=false; } void mostrarVersion() { System.out.println("Versión: " + version); }
  }
  public static void main(String[] args) {
    Videojuego a=new Videojuego(); a.nombre="Aventura"; a.genero="Acción"; a.version="1.0";
    Videojuego b=new Videojuego(); b.nombre="Carreras"; b.genero="Deportes"; b.version="2.1";
    Videojuego c=new Videojuego(); c.nombre="Puzles"; c.genero="Lógica"; c.version="1.4";
    a.iniciar(); a.mostrarInformacion(); a.mostrarVersion(); b.mostrarInformacion(); c.mostrarInformacion();
  }
}
