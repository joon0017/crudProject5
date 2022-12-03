package com.crud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.crud.bean.BoardVO;
import com.crud.common.JDBCUtil;

public class BoardDAO {
	
	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;
	private final String BOARD_INSERT = "insert into Customers (CustomerName,CustomerNumbers,Menu,ContactNum) values (?,?,?,?)";
	private final String BOARD_UPDATE = "update Customers set CustomerName=?, CustomerNumbers=?, Menu=?, ContactNum=?, Requests=?, PaymentMethod=? where OrderNum=?";
	private final String BOARD_DELETE = "delete from Customers  where OrderNum=?";
	private final String BOARD_GET = "select * from Customers  where OrderNum=?";
	private final String BOARD_LIST = "select * from Customers order by OrderNum desc";

	public int insertBoard(BoardVO vo) {
		System.out.println("===> JDBC로 insertBoard() 기능 처리");
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARD_INSERT);
			stmt.setString(1,vo.getCustomerName());
			stmt.setInt(2, vo.getCustomerNumbers());
			stmt.setString(3, vo.getMenu());
			stmt.setInt(4, vo.getContactNum());
			stmt.executeUpdate();
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	// 글 삭제
	public void deleteBoard(BoardVO vo) {
		System.out.println("===> JDBC로 deleteBoard() 기능 처리");
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARD_DELETE);
			stmt.setInt(1, vo.getOrderNum());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public int updateBoard(BoardVO vo) {
		System.out.println("===> JDBC로 updateBoard() 기능 처리");
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARD_UPDATE);
			stmt.setString(1, vo.getCustomerName());
			stmt.setInt(2, vo.getCustomerNumbers());
			stmt.setString(3, vo.getMenu());
			stmt.setInt(4, vo.getContactNum());
			stmt.setString(5, vo.getRequests());
			stmt.setString(6, vo.getPaymentMethod());
			
			System.out.println(BOARD_UPDATE);
			System.out.println(vo.getCustomerName() + "-" + vo.getCustomerNumbers() + "-" + vo.getMenu() + "-" + vo.getContactNum() + "-" + vo.getRequests() + "-" + vo.getPaymentMethod());
			stmt.executeUpdate();
			return 1;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}	
	
	public BoardVO getBoard(int seq) {
		BoardVO one = new BoardVO();
		System.out.println("===> JDBC로 getBoard() 기능 처리");
		try {
			Connection conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARD_GET);
			stmt.setInt(1, seq);
			rs = stmt.executeQuery();
			if(rs.next()) {
				one.setOrderNum(rs.getInt("OrderNum"));
				one.setCustomerName(rs.getString("CustomerName"));
				one.setCustomerNumbers(rs.getInt("CustomerNumbers"));
				one.setMenu(rs.getString("Menu"));
				one.setContactNum(rs.getInt("ContactNum"));
				one.setDate(rs.getDate("Date"));
				one.setRequests(rs.getString("Requests"));
				one.setPaymentMethod(rs.getString("PaymentMethod"));
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return one;
	}
	
	public List<BoardVO> getBoardList(){
		List<BoardVO> list = new ArrayList<BoardVO>();
		System.out.println("===> JDBC로 getBoardList() 기능 처리");
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARD_LIST);
			rs = stmt.executeQuery();
			while(rs.next()) {
				BoardVO one = new BoardVO();
				one.setOrderNum(rs.getInt("OrderNum"));
				one.setCustomerName(rs.getString("CustomerName"));
				one.setCustomerNumbers(rs.getInt("CustomerNumbers"));
				one.setMenu(rs.getString("Menu"));
				one.setContactNum(rs.getInt("ContactNum"));
				one.setDate(rs.getDate("Date"));
				one.setRequests(rs.getString("Requests"));
				one.setPaymentMethod(rs.getString("PaymentMethod"));
				list.add(one);
			}
			rs.close();
		} catch (Exception e) {
			System.out.println("arraylist error");
			e.printStackTrace();
		} 
		return list;
	}

//	public String getPhotoFilename(int sid){
//		String filename = null;
//		try{
//			conn = JDBCUtil.getConnection();
//			stmt = conn.prepareStatement(BOARD_GET);
//			stmt.setInt(1,sid);
//			rs = stmt.executeQuery();
//			if(rs.next()){
//				filename = rs.getString("photo");
//			}
//			rs.close();
//		}catch (Exception e){
//			e.printStackTrace();
//		}
//		System.out.println("===> JDBC로 getPhotoFilename() 기능 처리");
//
//		return filename;
//	}
}
