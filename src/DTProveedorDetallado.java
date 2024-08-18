package src;
import java.util.List;
import java.util.ArrayList;

public class DTProveedorDetallado extends DTProveedor {
	
	private String nombre;
	private String apellido;
	private DTFecha fechaNac;
	private String foto;
	private String nomCompania;
	private String link;
	
	
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
	public DTFecha getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(DTFecha fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getNomCompania() {
		return nomCompania;
	}
	public void setNomCompania(String nomCompania) {
		this.nomCompania = nomCompania;
	}
	public DTProveedorDetallado(String nickname, String email) {
		super(nickname, email);
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	
}
