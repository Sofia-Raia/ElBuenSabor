package entidades;

public class ArticuloInsumo extends Articulo {
    private double precioCompra;
    private Integer stockActual;
    private Integer stockMaximo;
    private boolean esParaElaborar;

    public ArticuloInsumo(String denominacion, Double precioVenta, UnidadMedida unidadMedida, double precioCompra) {
        super(denominacion, precioVenta, unidadMedida);
        this.precioCompra = precioCompra;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Integer getStockActual() {
        return stockActual;
    }

    public void setStockActual(Integer stockActual) {
        this.stockActual = stockActual;
    }

    public Integer getStockMaximo() {
        return stockMaximo;
    }

    public void setStockMaximo(Integer stockMaximo) {
        this.stockMaximo = stockMaximo;
    }

    public boolean isEsParaElaborar() {
        return esParaElaborar;
    }

    public void setEsParaElaborar(boolean esParaElaborar) {
        this.esParaElaborar = esParaElaborar;
    }
//no muestro imagen, stockActual, stockMaximo.
    @Override
    public String toString() {
        return "ArticuloInsumo{" +
                ", denominacion='" + denominacion + '\'' +
                ", precioVenta=" + precioVenta +
                "precioCompra=" + precioCompra +
                ", unidadMedida=" + unidadMedida +
                ", esParaElaborar=" + esParaElaborar +
                '}';
    }
}
