package com.imageshop.mapper;

import java.util.List;

import com.imageshop.domain.Board;
import com.imageshop.domain.PageRequest;

public interface BoardMapper {

	public void create(Board board) throws Exception;
	
	public Board read(Integer boardNo) throws Exception;
	
	public void update(Board board) throws Exception;

	public void delete(Integer boardNo) throws Exception;
	
	public List<Board> list(PageRequest pageRequest) throws Exception;

	public int count(PageRequest pageRequest) throws Exception;
}
