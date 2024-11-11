package Agro_Arg.Agro_Arg.Servicios.impl;

import Agro_Arg.Agro_Arg.Repository.ProductoRepository;
import Agro_Arg.Agro_Arg.Servicios.ProductoService;
import Agro_Arg.Agro_Arg.modelos.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {


    @Autowired
    ProductoRepository productoRepository;


    @Override
    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    @Override
    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Optional<Producto> getById(Long id) {
        return Optional.of(productoRepository.getById(id));
    }


}
