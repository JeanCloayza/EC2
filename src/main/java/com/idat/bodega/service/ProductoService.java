package com.idat.bodega.service;

import java.util.List;

import com.idat.bodega.model.Productos;

public interface ProductoService {
	
	void guardarProducto(Productos producto);
	void actualizarProducto(Productos producto);
	void eliminarProducto(Integer id);
	List<Productos> listarProductos();
	Productos obtenerProductoId(Integer id);

}
