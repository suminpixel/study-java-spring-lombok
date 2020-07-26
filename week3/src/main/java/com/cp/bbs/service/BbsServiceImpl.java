package com.cp.bbs.service;

import com.cp.bbs.model.Board;
import com.cp.bbs.repository.BbsRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BbsServiceImpl implements BbsService {

    final private BbsRepository bbsRepository;

    @Override
    public Page<Board> getList(Pageable pageable) {

        return bbsRepository.findAll(pageable);

    }
}
