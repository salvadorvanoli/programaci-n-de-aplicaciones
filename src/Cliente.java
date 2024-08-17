package src;

public class Cliente extends Usuario{
	
		public Cliente(String nickName, String nombre, String apellido, String email, DTFecha fecha, String foto){
			super(nickName, nombre, apellido, email, fecha, foto);
		}
		
		public DTCliente getDTCliente() {
			DTCliente c;
			c.setEmall(c.getEmail());
			c.setNickname(c.getNickname());
			return c;
		}
		
		public void desvincularOrdenDeCompra(int numero){
			
		}
}
