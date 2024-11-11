package Agro_Arg.Agro_Arg.Repository;

import Agro_Arg.Agro_Arg.modelos.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
