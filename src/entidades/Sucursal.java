package entidades;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Sucursal {
    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private Domicilio domicilio;
    private Set<Categoria> categorias;
    private Set<Promocion> promociones;

    public Sucursal(String nombre) {
        this.nombre = nombre;
        this.horarioApertura = LocalTime.of(14, 30);
        this.horarioCierre = LocalTime.of(22, 30);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalTime getHorarioApertura() {
        return horarioApertura;
    }

    public void setHorarioApertura(LocalTime horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public LocalTime getHorarioCierre() {
        return horarioCierre;
    }

    public void setHorarioCierre(LocalTime horarioCierre) {
        this.horarioCierre = horarioCierre;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public void addCategoria(Categoria categoria) {
       if(categorias == null) {
           categorias = new HashSet<>();
       }
       categorias.add(categoria);

    }
    public void removeCategoria(Categoria categoria) {
        this.categorias.remove(categoria);
    }
    public void addPromocion(Promocion promocion) {
        if(promociones == null) {
            promociones = new HashSet<>();
        }
        promociones.add(promocion);
    }
    public void removePromocion(Promocion promocion) {
        this.promociones.remove(promocion);
    }

    //no muestro los sets de promocion y categoria.
    @Override
    public String toString() {
        return "Sucursal{" +
                "nombre='" + nombre + '\'' +
                ", horarioApertura=" + horarioApertura +
                ", horarioCierre=" + horarioCierre +
                ", domicilio=" + domicilio +
                '}';
    }
}
