package edu.kh.project.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.kh.project.board.model.dto.Comment;
import edu.kh.project.board.model.service.CommentService;

//@Controller + @ResponseBody

@RestController // 요청/응답 처리(단, 모든 요청 응답은 비동기)
				// -> REST API를 구축하기 위한 Controller
public class CommentController {
	
	@Autowired
	private CommentService service;

	// 댓글 목록 조회					// json 통신 시 한글 깨짐 방지
	@GetMapping(value="/comment", produces="application/json; charset=UTF-8")
	public List<Comment> select(int boardNo) {
		
		return service.select(boardNo); 
		// 동기 시 return : foward / redirect
		// 비동기 시 return : 값 자체
	}
	
	// 댓글 삽입
	
	
	
	// 댓글 삭제
	
	
	
	// 댓글 수정
	
}
