package br.senac.df.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.senac.df.dto.DeptEmpDto;
import br.senac.df.entidade.Departamento;

public interface DepartamentoRepositorio extends JpaRepository <Departamento, Integer> {
	
	@Query("SELECT new br.senac.dto.DeptEmpDto(d.name,e.name,e.email,e.endereco)"
			+ "FRON Departamento d LEFT JOIN d.empregado e")
	public
	List<DeptEmpDto> fetchEmpDeptDataLeftJoin();
	
	@Query("SELECT new br.senac.springjoin.dto.DeptEmpDto(d.name,e.name,e.email,e.endereco)"
			+ "FRON Departamento d RIGHT JOIN d.empregado e")
	public
	List<DeptEmpDto> fetchEmpDeptDataRightJoin();

		
}
