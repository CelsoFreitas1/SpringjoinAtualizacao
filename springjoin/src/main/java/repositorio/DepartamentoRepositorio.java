package repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import dto.DeptEmpDto;
import entidade.Departamento;

public class DepartamentoRepositorio extends JpaRepository<Departamento, Integer> {
	
	@Query("SELECT new br.senac.springjoin.dto.DeptEmpDto(d.name,e.name,e.email,e.endereco)"
			+ "FRON Departamento d LEFT JOIN d.empregado e")
	List<DeptEmpDto> fetchEmpDeptDataLeftJoin();
	
	@Query("SELECT new br.senac.springjoin.dto.DeptEmpDto(d.name,e.name,e.email,e.endereco)"
			+ "FRON Departamento d LEFT JOIN d.empregado e")
	List<DeptEmpDto> fetchEmpDeptDataRightJoin();

		
}
