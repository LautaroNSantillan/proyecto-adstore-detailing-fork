package mindhub.adstoreDetailing.servicios;
import mindhub.adstoreDetailing.dtos.ClienteDTO;
import mindhub.adstoreDetailing.models.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ServicioCliente {
   ClienteDTO findByIds(Long id);
   Cliente findByEmail(String email);
   void registrarCliente(Cliente cliente);
   void guardar(Cliente cliente);
   boolean emailEsValido(String email);
   List<ClienteDTO> findAllClienteDTO();


}
