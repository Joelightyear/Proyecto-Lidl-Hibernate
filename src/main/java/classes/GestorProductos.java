package classes;

import java.sql.ResultSet;
import java.util.ArrayList;

import bd.MysqlConnect;

public class GestorProductos{

	static ArrayList <ProductosBean> produ = new ArrayList <ProductosBean>();
	public static ArrayList <ProductosBean> mostrarProductos() {
		
		MysqlConnect c = MysqlConnect.getDbCon();
		ResultSet rs = null;
		
		try {
			rs = c.query("SELECT * FROM producto");
			produ.clear();
			while (rs.next()){
				ProductosBean p = new ProductosBean(rs.getString("nombre"), rs.getDouble("peso"), rs.getDouble("precio"), rs.getString("descripcion"),rs.getString("imagen"));
				produ.add(p);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return produ;
				
	}
	
}
