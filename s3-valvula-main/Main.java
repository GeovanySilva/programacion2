public class Main {
  static class Valvula {
    private String codigo;
    private int apertura;
    private double presion;
    private boolean activa;
    public Valvula() {}
    public void mostrarInformacion() { System.out.println(this); }
    public String getCodigo() { return codigo; }
    public void setCodigo(String v) { if (v != null && !v.isBlank()) this.codigo = v; }
    public int getApertura() { return apertura; }
    public void setApertura(int v) { if (v >= 0 && v <= 100) this.apertura = v; }
    public double getPresion() { return presion; }
    public void setPresion(double v) { if (v >= 0) this.presion = v; }
    public boolean getActiva() { return activa; }
    public boolean isActiva() { return activa; }
    public void setActiva(boolean v) { this.activa = v; }
    public void activar() { activa = true; }
    public void desactivar() { activa = false; }
    @Override public String toString() { return "Valvula{" + "codigo=" + codigo + ", " + "apertura=" + apertura + ", " + "presion=" + presion + ", " + "activa=" + activa + "}"; }
  }
  public static void main(String[] args) {
    Valvula ejemplo = new Valvula();
    ejemplo.setCodigo("V-01"); ejemplo.setApertura(40); ejemplo.setPresion(2.5);
    ejemplo.activar(); ejemplo.mostrarInformacion();
    ejemplo.setApertura(120); // Rechazado: fuera del rango 0–100
    System.out.println("Apertura validada: " + ejemplo.getApertura());
  }
}
