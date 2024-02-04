package com.ssafy.devoca.search.model.mapper;

import com.ssafy.devoca.card.model.CardDTO;
import com.ssafy.devoca.word.model.WordDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

@Mapper
public interface SearchMapper {

    void saveSearchKeyword(@Param("keyword") String keyword, @Param("loginUserIdx") int loginUserIdx) throws SQLException;

    List<WordDTO> searchWord(@Param("keyword")String keyword, @Param("scroll")int scroll) throws SQLException;

    void updateWordSearchedCnt(int wordId) throws SQLException;

    List<CardDTO> searchCard(@Param("keyword")String keyword, @Param("scroll")int scroll, @Param("loginUserIdx") int loginUserIdx)
            throws SQLException;
}