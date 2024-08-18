import java.util.List;
import java.util.ArrayList;

public class OrdenDeCompra {
	
	private int numero;
	private float precioTotal;
	private DTFecha fecha;
	private Cliente cliente;
	private List<Cantidad> cantidad;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public float getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(float precioTotal) {
		this.precioTotal = precioTotal;
	}
	public DTFecha getFecha() {
		return fecha;
	}
	public void setFecha(DTFecha fecha) {
		this.fecha = fecha;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Cantidad> getCantidad() {
		return cantidad;
	}
	public void setCantidad(List<Cantidad> cantidad) {
		this.cantidad = cantidad;
	}
	
	public void desvincularCliente () {
		this.Cliente.desvincularOrdenDeCompra(this.getNumero());
	}
	
	public void agregarProducto(Producto producto, int cantidad) {
		Cantidad nueva = new Cantidad(cantidad);
		nueva.setProducto(producto);
		List<Cantidad> lista = this.getCantidad();
		lista.add(nueva);
		this.setCantidad(lista);
	}
	public OrdenDeCompra(int numero, DTFecha fecha, Cliente cliente) {
		super();
		this.numero = numero;
		this.fecha = fecha;
		this.cliente = cliente;
	}
	
	
	
	public DTOrdenDeCompra getDTOrden() {
		return new DTOrdenDeCompra(this.numero, this.fecha);
	}
	
	public DTOrdenDeCompraDetallada getDTOrdenDetallada() {
		return new DTOrdenDeCompraDetallada(this.numero, this.fecha, this.cantidad);
	}
	

}