package entidades;

public class ArticuloManufacturado extends Articulo {
   private String descripcion;
   private Integer tiempoEstimadoMinutos;
   private String preparacion;
    private ArticuloManufacturadoDetalle aMd;

    public ArticuloManufacturado(String denominacion, Double precioVenta, UnidadMedida unidadMedida, String descripcion) {
        super(denominacion, precioVenta, unidadMedida);
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getTiempoEstimadoMinutos() {
        return tiempoEstimadoMinutos;
    }

    public void setTiempoEstimadoMinutos(Integer tiempoEstimadoMinutos) {
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public ArticuloManufacturadoDetalle getaMd() {
        return aMd;
    }

    public void setaMd(ArticuloManufacturadoDetalle aMd) {
        this.aMd = aMd;
    }
//no muestra preparacion ni detalle.
    @Override
    public String toString() {
        return "ArticuloManufacturado{" +
                "descripcion='" + descripcion + '\'' +
                ", tiempoEstimadoMinutos=" + tiempoEstimadoMinutos +
                '}';
    }
}
