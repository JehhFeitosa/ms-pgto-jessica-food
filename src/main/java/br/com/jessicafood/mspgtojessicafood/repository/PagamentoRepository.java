package br.com.jessicafood.mspgtojessicafood.repository;

import br.com.jessicafood.mspgtojessicafood.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

/*
Interface responsável pela comunicação entre a entidade e o BD.
 */
public interface PagamentoRepository extends JpaRepository<Pagamento, Long>{

}
