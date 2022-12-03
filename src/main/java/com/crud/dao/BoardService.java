package com.crud.dao;

import com.crud.bean.BoardVO;
import java.util.List;

public interface BoardService {
    public int insertBoard(BoardVO vo);
    public int deleteBoard(int seq);
    public int updateBoard(BoardVO vo,int seq);
    public BoardVO getBoard(int seq);
    public List<BoardVO> getBoardList();
}
