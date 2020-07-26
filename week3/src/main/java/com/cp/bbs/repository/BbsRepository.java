package com.cp.bbs.repository;

import com.cp.bbs.model.Board;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BbsRepository extends JpaRepository<Board, Long> {

}
