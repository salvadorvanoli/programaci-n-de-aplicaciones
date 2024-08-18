package src;
import java.util.ArrayList;
import java.util.List;

public class Producto {
    private String nombreProducto;
    private String descripcion;
    private String especificacion;
    private int numReferencia;
    private float precio;
    private List<String> imagenes;
    private List<Categoria> categorias;
    private Proveedor proveedor;

    // Constructor
    public Producto(String nombreProducto, String descripcion, String especificacion, int numReferencia, float precio, List<String> imagenes, List<Categoria> categorias, Proveedor proveedor) {
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.especificacion = especificacion;
        this.numReferencia = numReferencia;
        this.precio = precio;
        this.imagenes = imagenes;
        this.categorias = categorias;
        this.proveedor = proveedor;
    }

    // Setters
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEspecificacion(String especificacion) {
        this.especificacion = especificacion;
    }

    public void setNumReferencia(int numReferencia) {
        this.numReferencia = numReferencia;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setImagenes(List<String> imagenes) {
        this.imagenes = imagenes;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    // Getters
    public String getNombreProducto() {
        return nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEspecificacion() {
        return especificacion;
    }

    public int getNumReferencia() {
        return numReferencia;
    }

    public float getPrecio() {
        return precio;
    }

    public List<String> getImagenes() {
        return imagenes;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    // Método para obtener los datos básicos del producto
    public DTProducto getDTProducto() {
        return new DTProducto(nombreProducto, descripcion, precio);
    }

    // Método para obtener los datos detallados del producto
    public DTProductoDetallado getDTProductoDetallado() {
        // Convertir las categorías de Categoria a String
        List<String> nombresCategorias = new ArrayList<>();
        for (Categoria categoria : categorias) {
            nombresCategorias.add(categoria.getNombreCat());
        }

        // Crear el objeto DTProveedor a partir del Proveedor
        DTProveedor dtProveedor = proveedor.getDTProveedor();

        // Crear y retornar el objeto DTProductoDetallado
        return new DTProductoDetallado(
            nombreProducto,
            descripcion,
            precio,
            numReferencia,
            especificacion,
            nombresCategorias,
            dtProveedor,
            imagenes
        );
    }

    // Método para modificar los datos del producto
    public void modificarDatosProducto(String tituloProducto, int numReferencia, String descripcion, float precio, String especificacion) {
        this.nombreProducto = tituloProducto;
        this.numReferencia = numReferencia;
        this.descripcion = descripcion;
        this.precio = precio;
        this.especificacion = especificacion;
    }

    // Método para modificar las imágenes del producto
    public void modificarImagenes(List<String> nuevasImagenes) {
        this.imagenes = nuevasImagenes;
    }
}
