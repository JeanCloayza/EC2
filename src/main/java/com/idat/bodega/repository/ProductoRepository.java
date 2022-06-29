package com.idat.bodega.repository;

import java.util.List;

import com.idat.bodega.model.Productos;

public interface ProductoRepository {
	
	void guardarProducto(Productos producto);
	void actualizarProducto(Productos producto);
	void eliminarProducto(Integer id);
	List<Productos> listarProductos();
	Productos obtenerProductoId(Integer id);

}
