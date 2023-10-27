package edu.kh.project.board.model.service;

import java.util.List;
import java.util.Map;

import edu.kh.project.board.model.dto.Comment;

public interface CommentService {

	/** 댓글 목록 조회 Service
	 * @param boardNo
	 * @return
	 */
	List<Comment> select(int boardNo);

	/** 댓글 삽입 service
	 * @param comment
	 * @return result
	 */
	int insert(Comment comment);

	/** 댓글 삭제 service
	 * @param commentNo
	 * @return
	 */
	int delete(int commentNo);

	/** 댓글 수정 service
	 * @param comment
	 * @return
	 */
	int update(Comment comment);
 

}
