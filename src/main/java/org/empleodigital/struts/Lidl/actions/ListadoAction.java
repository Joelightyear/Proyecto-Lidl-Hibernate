package org.empleodigital.struts.Lidl.actions;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import classes.GestorProductos;
import classes.ProductosBean;

public class ListadoAction extends ActionSupport{

	ArrayList <ProductosBean> pro = new ArrayList<>();
	
	public String execute() throws Exception{
		pro = GestorProductos.mostrarProductos();
		
			return SUCCESS;		
	}

	public ArrayList<ProductosBean> getPro() {
		return pro;
	}

	public void setPro(ArrayList<ProductosBean> pro) {
		this.pro = pro;
	}

	
}

