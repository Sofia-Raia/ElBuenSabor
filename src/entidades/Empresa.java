package entidades;

import java.util.HashSet;
import java.util.Set;

public class Empresa {
    private String nombre;
    private String razonSocial;
    private Integer cuil;
    private Set<Sucursal> sucursales;

    public Empresa(String nombre, Integer cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Integer getCuil() {
        return cuil;
    }

    public void setCuil(Integer cuil) {
        this.cuil = cuil;
    }
    public void addSucursal(Sucursal sucursal) {
        if (this.sucursales == null) {
            this.sucursales = new HashSet<Sucursal>();
        }
        this.sucursales.add(sucursal);
    }
    public void removeSucursal(Sucursal sucursal) {
        this.sucursales.remove(sucursal);
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", cuil=" + cuil +
                ", sucursales=" + sucursales +
                '}';
    }
}
