package com.example.springmvc.mapper;

import com.example.springmvc.domain.Board;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardMapper {

    int boardCount();

    List<Board> getList();

}
