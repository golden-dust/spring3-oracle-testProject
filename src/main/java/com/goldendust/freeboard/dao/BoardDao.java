package com.goldendust.freeboard.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.goldendust.freeboard.dto.BoardDto;

@Service
public interface BoardDao {
	public void writePost(String MNAME, String BTITLE, String BCONTENT);
	public ArrayList<BoardDto> getList();
}
