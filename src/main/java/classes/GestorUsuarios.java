package classes;

import java.sql.ResultSet;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.empleodigital.struts.Lidl.jpa.Cliente;

import bd.MysqlConnect;

public class GestorUsuarios {
	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
            .createEntityManagerFactory("JavaHelps");
	
	/*
	//MÉTODO STRUTS 2 (LOGIN)
	public static boolean usuarioExiste(String usuario, String contrasena) {
		
		MysqlConnect c = MysqlConnect.getDbCon();
		ResultSet rs = null;
		
		try {
			rs = c.query("SELECT * FROM cliente WHERE cliente.usuario = '"+usuario+"' and cliente.contrasena = '"+contrasena+"'");
			
			if (rs.next()) {
				return true;
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return false;
	}*/
	
	
	//MÉTODO HIBERNATE (LOGIN)
	public static Cliente loginUsuario(String usuario, String contrasena) {
		
		Cliente cliente = null;

        // Create an EntityManager
        EntityManager manager = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction transaction = null;

        try {
            // Get a transaction
            transaction = manager.getTransaction();
            // Begin the transaction
            transaction.begin();

            // Get a List of Students
            cliente = manager.createQuery(("FROM Cliente WHERE usuario = '"+usuario+"' and contrasena = '"+contrasena+"'"),
                    Cliente.class).getSingleResult();

            // Commit the transaction
            transaction.commit();
        } catch (Exception ex) {
            // If there are any exceptions, roll back the changes
            if (transaction != null) {
                transaction.rollback();
            }
            // Print the Exception
            ex.printStackTrace();
        } finally {
            // Close the EntityManager
            manager.close();
        }
        return cliente;
    }
		

	//Método STRUTS 2 (REGISTRO)
	/*public static boolean usuarioExiste(String usuario, String contrasena, String nombre, int edad) {
		MysqlConnect c = MysqlConnect.getDbCon();
		ResultSet rs = null;
		
		try {
			if (c.insert("INSERT INTO cliente(`nombre`, `edad`, `usuario`, `contrasena`) VALUES ('"+nombre+"','"+edad+"','"+usuario+"','"+contrasena+"');")>0){
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}*/
	
	//MÉTODO HIBERNATE (REGISTRO)
	public static boolean nuevoUsuario(String nombre, int edad, String usuario,  int contrasena){
			
		 // Create an EntityManager
        EntityManager manager = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction transaction = null;

        try {
            // Get a transaction
            transaction = manager.getTransaction();
            // Begin the transaction
            transaction.begin();

            // Create a new Student object
            Cliente stu = new Cliente();
            stu.setNombre(nombre);
            stu.setEdad(edad);
            stu.setUsuario(usuario);
            stu.setContrasena(contrasena);

            // Save the student object
            manager.persist(stu);

            // Commit the transaction
            transaction.commit();
        } catch (Exception ex) {
            // If there are any exceptions, roll back the changes
            if (transaction != null) {
                transaction.rollback();
            }
            // Print the Exception
            ex.printStackTrace();
        } finally {
            // Close the EntityManager
            manager.close();
        }
		return false;
    }
	
	}
	


