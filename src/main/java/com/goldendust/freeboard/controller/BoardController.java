package com.goldendust.freeboard.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.goldendust.freeboard.dao.BoardDao;
import com.goldendust.freeboard.dto.BoardDto;

@Controller
public class BoardController {
	
	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping(value="/write")
	public String write() {
		return "write_form";
	}
	
	@RequestMapping(value="/writeOk")
	public String writeOk(HttpServletRequest request) {
		
		BoardDao bDao = sqlSession.getMapper(BoardDao.class);
		bDao.writePost(request.getParameter("MNAME"), 
				request.getParameter("BTITLE"), 
				request.getParameter("BCONTENT"));
		
		return "redirect:boardlist";
	}
	
	@RequestMapping(value="/boardlist")
	public String boardList(HttpServletRequest request, Model model) {
		
		BoardDao bDao = sqlSession.getMapper(BoardDao.class);
		ArrayList<BoardDto> postlist = bDao.getList();
		
		model.addAttribute("postlist", postlist);
		model.addAttribute("boardsize", postlist.size());
		
		return "boardList";
	}

}
