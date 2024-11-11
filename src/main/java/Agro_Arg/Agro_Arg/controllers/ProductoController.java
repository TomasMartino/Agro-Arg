package Agro_Arg.Agro_Arg.controllers;

import Agro_Arg.Agro_Arg.Servicios.ProductoService;
import Agro_Arg.Agro_Arg.modelos.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping("/all")
    public List<Producto> getAllProductos() {
        return productoService.findAll();
    }

    @GetMapping(path = "/all/{id}")
    public Optional<Producto> getProductoById(@PathVariable Long id){
        return this.productoService.getById(id);
    }

    @PostMapping(value = "/crear")
    public Producto crearProducto( @RequestBody Producto producto) {

        return productoService.save(producto);
    }



}
