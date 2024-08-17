import java.util.List;
import java.util.ArrayList;

public class DTOrdenDeCompraDetallada extends DTOrdenDeCompra{
	private List<DTCantidadProducto> productosCantidad;

	public DTOrdenDeCompraDetallada(int numero, DTFecha fecha, float precioTotal) {
		super(numero, fecha, precioTotal);
	}

	public List<DTCantidadProducto> getProductosCantidad() {
		return productosCantidad;
	}

	public void setProductosCantidad(List<DTCantidadProducto> productosCantidad) {
		this.productosCantidad = productosCantidad;
	}
	
	
	
}
