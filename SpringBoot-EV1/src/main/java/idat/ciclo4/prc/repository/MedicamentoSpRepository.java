package idat.ciclo4.prc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import idat.ciclo4.prc.model.sp.MedicamentoSp;

@Repository
public interface MedicamentoSpRepository extends JpaRepository<MedicamentoSp, Long>{
	
	@Query(value = "{call sp_MantListarProducto}", nativeQuery = true)
	public List<MedicamentoSp> listarMedicamento();
}
