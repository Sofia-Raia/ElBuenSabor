package entidades;

import enumerables.Estado;
import enumerables.FormaPago;
import enumerables.TipoEnvio;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Pedido {
    private LocalTime horaEstimadaFinalizacion;
    private double total;
    private double totalCosto;
    private TipoEnvio tipoEnvio;
    private Estado estado;
    private FormaPago formaPago;
    private LocalDate fechaPedido;

    private Set<DetallePedido> detalles;
    private Factura factura;
    private Sucursal sucursal;
    private Domicilio domicilio;  //tengo dudas de si va este atributo, proque ya la sucursal tiene domicilio o es el del cliente?

    //lo cree con valores por defecto.
    public Pedido(double totalCosto) {
        this.estado = Estado.PENDIENTE;
        this.tipoEnvio = TipoEnvio.DELIVERY;
        this.formaPago= FormaPago.MERCADOPAGO;
        this.totalCosto = totalCosto;
    }

    public LocalTime getHoraEstimadaFinalizacion() {
        return horaEstimadaFinalizacion;
    }

    public void setHoraEstimadaFinalizacion(LocalTime horaEstimadaFinalizacion) {
        this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotalCosto() {
        return totalCosto;
    }

    public void setTotalCosto(double totalCosto) {
        this.totalCosto = totalCosto;
    }

    public TipoEnvio getTipoEnvio() {
        return tipoEnvio;
    }

    public void setTipoEnvio(TipoEnvio tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public void addDetallePedido(DetallePedido detallePedido){
        if(this.detalles == null){
            this.detalles = new HashSet<DetallePedido>();
        }
    }
    public void removeDetallePedido(DetallePedido detallePedido){
        this.detalles.remove(detallePedido);
    }
//le deje todos los datos.
    @Override
    public String toString() {
        return "Pedido{" +
                "horaEstimadaFinalizacion=" + horaEstimadaFinalizacion +
                ", total=" + total +
                ", totalCosto=" + totalCosto +
                ", tipoEnvio=" + tipoEnvio +
                ", estado=" + estado +
                ", formaPago=" + formaPago +
                ", fechaPedido=" + fechaPedido +
                ", detalles=" + detalles +
                ", factura=" + factura +
                ", sucursal=" + sucursal +
                ", domicilio=" + domicilio +
                '}';
    }
}
