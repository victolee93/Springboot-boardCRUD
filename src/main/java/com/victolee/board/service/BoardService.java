package com.victolee.board.service;

import com.victolee.board.domain.entity.BoardEntity;
import com.victolee.board.domain.repository.BoardRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@AllArgsConstructor
@Service
public class BoardService {
    private BoardRepository boardRepository;

    @Transactional
    public Long savePost(BoardEntity boardEntity) {
        return boardRepository.save(boardEntity).getId();
    }
}

