package com.crud.dao;

import com.crud.bean.BoardVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardDAO {
	@Autowired
	SqlSession sqlSession;

	public int insertBoard(BoardVO vo) {
		return sqlSession.insert("Board.insertBoard", vo);
	}
	public int deleteBoard(int orderNum){
		return sqlSession.delete("Board.deleteBoard", orderNum);
	}
	public int updateBoard(BoardVO vo,int seq) {
		vo.setOrderNum(seq);
		return sqlSession.update("Board.updateBoard", vo);
	}
	public BoardVO getBoard(int seq) {
		return sqlSession.selectOne("Board.getBoard", seq);
	}
	public List<BoardVO> getBoardList() {
		return sqlSession.selectList("Board.getBoardList");
	}

}