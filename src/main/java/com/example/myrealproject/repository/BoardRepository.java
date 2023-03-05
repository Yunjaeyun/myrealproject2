package com.example.myrealproject.repository;

import com.example.myrealproject.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
