package salavegui;
import java.util.ArrayList;
import java.util.List;

public class Proveedor{
	
		private String nomCompania;
		private String link;
		private List <String> productos = new ArrayList<>();
		
		public Proveedor(String nickName, String nombre, String apellido, String email, DTFecha fecha, String foto, String nomCompania, String link){
			super(nickName, nombre, apellido, email, fecha, foto);
			this.link = link;
			this.nomCompania = nomCompania;
		}
		
		public void agregarProducto(Producto producto){
			this.productos.add(producto);
		}
		
		public void setlink(String link){
			this.link = link;
		}
		
		public void setnomCompania(String nomCompania){
			this.nomCompania = nomCompania;
		}
		
		public String getlink(){
			return this.link;
		}
		
		public String getnomCompania(){
			return this.nomCompania;
		}
}
