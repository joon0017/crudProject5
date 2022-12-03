package com.crud.dao;

import com.crud.bean.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImplementation implements BoardService{
    @Autowired
    BoardDAO boardDAO;

    @Override
    public int insertBoard(BoardVO vo) {
        return boardDAO.insertBoard(vo);
    }

    @Override
    public int deleteBoard(int seq) {
        return boardDAO.deleteBoard(seq);
    }

    @Override
    public int updateBoard(BoardVO vo,int seq) {
        return boardDAO.updateBoard(vo,seq);
    }

    @Override
    public BoardVO getBoard(int seq) {
        return boardDAO.getBoard(seq);
    }

    @Override
    public List<BoardVO> getBoardList() {
        return boardDAO.getBoardList();
    }
}
