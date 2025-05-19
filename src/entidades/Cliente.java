package entidades;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Cliente {
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private LocalDate fechaNacimiento;

    private Set<Pedido> pedidos;
    private Set<Domicilio>domicilios; //puede pedir de diferentes lugares.
    private Usuario usuario;
    private Imagen imagenCliente;

    public Cliente(String nombre, String apellido, String telefono, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Imagen getImagenCliente() {
        return imagenCliente;
    }

    public void setImagenCliente(Imagen imagenCliente) {
        this.imagenCliente = imagenCliente;
    }
    public void addPedido(Pedido pedido) {
        if (this.pedidos == null) {
            this.pedidos = new HashSet<Pedido>();
        }
        this.pedidos.add(pedido);
    }
    public void removePedido(Pedido pedido) {
        this.pedidos.remove(pedido);
    }
    public void addDomicilio(Domicilio domicilio) {
        if (this.domicilios == null) {
            this.domicilios = new HashSet<>();
        }
        this.domicilios.add(domicilio);
    }
    public void removeDomicilio(Domicilio domicilio) {
        this.domicilios.remove(domicilio);
    }
 //solo muestro algunos datos.
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
