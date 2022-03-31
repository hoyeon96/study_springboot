package dev.yeon.mybatis.mapper;

import dev.yeon.mybatis.dto.BoardDto;

public interface BoardMapper {

    int createBoard(BoardDto boardDto);

}
