public class Main {
  static class Motor {
    public String nombre; public double potencia; double velocidad; boolean encendido;
    public void encender() { encendido=true; } void apagar() { encendido=false; }
    public void mostrarInformacion() { System.out.println(nombre + " | " + potencia + " kW | " + velocidad + " rpm | encendido=" + encendido); }
    void mostrarEstado() { System.out.println("Encendido: " + encendido); }
  }
  public static void main(String[] args) {
    Motor a=new Motor(); a.nombre="Motor principal"; a.potencia=15.5; a.velocidad=1500;
    Motor b=new Motor(); b.nombre="Motor auxiliar"; b.potencia=7.5; b.velocidad=900;
    Motor c=new Motor(); c.nombre="Motor bomba"; c.potencia=3.0; c.velocidad=600;
    a.encender(); a.mostrarInformacion(); a.apagar(); a.mostrarEstado(); b.mostrarInformacion(); c.mostrarInformacion();
  }
}
