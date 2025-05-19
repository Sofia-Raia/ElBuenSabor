package entidades;

import enumerables.TipoPromocion;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Promocion {
private String denominacion;
private LocalDate fechaDesde;
private LocalDate fechaHasta;
private LocalTime horaDesde;
private LocalTime horaHasta;
private String descripcionDescuento;
private Double precioPromocional;
private TipoPromocion tipoPromocion;

private Set<Imagen> imagenes ;
private Set<Articulo> articulos;

    public Promocion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public LocalDate getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(LocalDate fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public LocalDate getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(LocalDate fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public LocalTime getHoraDesde() {
        return horaDesde;
    }

    public void setHoraDesde(LocalTime horaDesde) {
        this.horaDesde = horaDesde;
    }

    public LocalTime getHoraHasta() {
        return horaHasta;
    }

    public void setHoraHasta(LocalTime horaHasta) {
        this.horaHasta = horaHasta;
    }

    public String getDescripcionDescuento() {
        return descripcionDescuento;
    }

    public void setDescripcionDescuento(String descripcionDescuento) {
        this.descripcionDescuento = descripcionDescuento;
    }

    public Double getPrecioPromocional() {
        return precioPromocional;
    }

    public void setPrecioPromocional(Double precioPromocional) {
        this.precioPromocional = precioPromocional;
    }

    public TipoPromocion getTipoPromocion() {
        return tipoPromocion;
    }
    //se lo deje por defecto..
    public void setTipoPromocion(TipoPromocion tipoPromocion) {
        this.tipoPromocion = tipoPromocion.HAPPYHOUR;
    }
    public void addImagen(Imagen imagen) {
        if (imagenes == null) {
            imagenes = new HashSet<>();
        }
        imagenes.add(imagen);
    }
    public void removeImagen(Imagen imagen) {
        this.imagenes.remove(imagen);
    }
    public void addArticulo(Articulo articulo) {
        if (articulos == null) {
            articulos = new HashSet<>();
        }
        this.articulos.add(articulo);
    }
    public void removeArticulo(Articulo articulo) {
        this.articulos.remove(articulo);
    }

    //no muestra los sets de imagenes y articulos.
    @Override
    public String toString() {
        return "Promocion{" +
                "denominacion='" + denominacion + '\'' +
                ", fechaDesde=" + fechaDesde +
                ", fechaHasta=" + fechaHasta +
                ", descripcionDescuento='" + descripcionDescuento + '\'' +
                ", precioPromocional=" + precioPromocional +
                ", tipoPromocion=" + tipoPromocion +

                '}';
    }
}
