package com.pbe.tapecaria.model.repository;

import com.pbe.tapecaria.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}