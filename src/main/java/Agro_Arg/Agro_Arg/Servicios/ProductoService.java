package Agro_Arg.Agro_Arg.Servicios;

import Agro_Arg.Agro_Arg.modelos.Producto;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductoService {
    List<Producto> findAll();

    Producto save(Producto producto);


    Optional<Producto> getById(Long id);
}
