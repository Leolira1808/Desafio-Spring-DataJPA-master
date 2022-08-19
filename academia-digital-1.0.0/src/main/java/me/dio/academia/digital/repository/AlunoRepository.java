package me.dio.academia.digital.repository;

import me.dio.academia.digital.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import java.util.List;

public interface AlunoRepository extends JpaRepositoryImplementation<Aluno, Long> {

    List<Object> findAllById(Long alunoId);

}
