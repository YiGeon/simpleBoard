package com.gun.simpleboard.mapper;

import com.gun.simpleboard.domain.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    public int insertBoard(BoardDTO params);

    public BoardDTO selectBoardDetail(Long idx);

    public int updateBoard(BoardDTO params);

    public int deleteBoard(Long idx);

    public List<BoardDTO> selectBoardList();

    public int selectBoardTotalCount();
}
