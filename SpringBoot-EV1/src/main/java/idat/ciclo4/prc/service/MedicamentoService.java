package idat.ciclo4.prc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.ciclo4.prc.model.sp.MedicamentoSp;
import idat.ciclo4.prc.repository.MedicamentoSpRepository;

@Service
public class MedicamentoService {

	@Autowired
	private MedicamentoSpRepository repository;
	
	public List<MedicamentoSp> listMedicamento(){
		return repository.listarMedicamento();
	}
}
