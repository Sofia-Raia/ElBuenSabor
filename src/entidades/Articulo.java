package entidades;

import lombok.*;

import java.util.HashSet;
import java.util.Set;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public abstract class Articulo {
    protected String denominacion;
    protected Double precioVenta;

    protected UnidadMedida unidadMedida;
    protected Set<Imagen> imagenes;

    public Articulo(String denominacion, Double precioVenta) {
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
    }

    public Articulo(String denominacion, Double precioVenta, UnidadMedida unidadMedida) {
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
        this.unidadMedida = unidadMedida;
    }

    public String getDenominacion() {
        return denominacion;
    }



    public Double getPrecioVenta() {
        return precioVenta;
    }



    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }



    public Set<Imagen> getImagenes() {
        return imagenes;
    }

    public void addImagen(Imagen imagen) {
        if (imagenes == null) {
            imagenes = new HashSet<Imagen>();
        }
        this.imagenes.add(imagen);
  }
  public void removeImagen(Imagen imagen) {
        this.imagenes.remove(imagen);
  }
//no muestro imagen.
    @Override
    public String toString() {
        return "Articulo{" +
                "denominacion='" + denominacion + '\'' +
                ", precioVenta=" + precioVenta +
                ", unidadMedida=" + unidadMedida +
                '}';
    }
}
