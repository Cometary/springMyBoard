
package tommy.spring.web.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tommy.spring.web.board.BoardService;
import tommy.spring.web.board.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardDAOJPA boardDAO;

//	public void setBoardDAO(BoardDAO boardDAO) {
//		this.boardDAO = boardDAO;
//	}

	@Override
	@Transactional
	public void insertBoard(BoardVO vo) { //
//		if (vo.getSeq() == 0) { //
//			throw new IllegalArgumentException("0번 글은 등록할 수 없습니다."); //
//		}
		boardDAO.insertBoard(vo); // Exception 발생
	}

	@Override
	@Transactional
	public void updateBoard(BoardVO vo) {
		boardDAO.updateBoard(vo);
	}

	@Override
	@Transactional
	public void deleteBoard(BoardVO vo) {
		boardDAO.deleteBoard(vo);
	}

	@Override
	public BoardVO getBoard(BoardVO vo) {
		return boardDAO.getBoard(vo);
	}

	@Override
	public List<BoardVO> getBoardList(BoardVO vo) {
		return boardDAO.getBoardList(vo);
	}

}
