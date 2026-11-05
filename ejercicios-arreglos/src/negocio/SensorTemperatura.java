package negocio;

public class SensorTemperatura {
    private String idSensor;
    private double valorActual;
    private String unidad;
    public SensorTemperatura(String idSensor, double valorActual, String unidad) {
        this.idSensor = idSensor;
        setValorActual(valorActual);
        setUnidad(unidad);
    }
    public String getIdSensor() { return idSensor; }
    public double getValorActual() { return valorActual; }
    public void setValorActual(double valorActual) {
        if (!Double.isFinite(valorActual)) throw new IllegalArgumentException("La temperatura debe ser un número finito.");
        this.valorActual = valorActual;
    }
    public String getUnidad() { return unidad; }
    public void setUnidad(String unidad) {
        if (unidad == null || unidad.trim().isEmpty()) throw new IllegalArgumentException("Indique la unidad.");
        this.unidad = unidad;
    }
    public void mostrarLectura() {
        System.out.println(idSensor + " | Lectura: " + valorActual + " " + unidad);
    }
}
