package com.tseng.booksystem.service.impl;

import com.tseng.booksystem.dao.ReaderMapper;
import com.tseng.booksystem.domain.ResponseResult;
import com.tseng.booksystem.domain.entity.Reader;
import com.tseng.booksystem.domain.entity.ReaderType;
import com.tseng.booksystem.service.ReaderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ReaderServiceImpl implements ReaderService {

    @Resource
    ReaderMapper readerMapper;

    @Override
    public ResponseResult<?> addReader(Reader reader) {
        readerMapper.insertReader(reader.getName(), reader.getTelephone(), reader.getEmail(), reader.getType());
        return ResponseResult.okResult();
    }

    @Override
    public ResponseResult<?> deleteReader(Integer id) {
        readerMapper.deleteReader(id);
        return ResponseResult.okResult();
    }

    @Override
    public ResponseResult<?> updateReader(Integer id, Reader reader) {
        readerMapper.updateReader(id, reader.getName(), reader.getTelephone(), reader.getEmail(), reader.getType());
        return ResponseResult.okResult();
    }

    @Override
    public ResponseResult<?> searchReaderById(Integer id) {
        Reader reader = readerMapper.selectReaderById(id);
        return ResponseResult.okResult(reader);
    }

    @Override
    public ResponseResult<?> addReaderType(ReaderType readerType) {
        readerMapper.insertReaderType(readerType.getName());
        return ResponseResult.okResult();
    }

    @Override
    public ResponseResult<?> deleteReaderType(Integer id) {
        readerMapper.deleteReaderType(id);
        return ResponseResult.okResult();
    }

    @Override
    public ResponseResult<?> updateReaderType(Integer id, ReaderType readerType) {
        readerMapper.updateReaderType(id, readerType.getName());
        return ResponseResult.okResult();
    }

    @Override
    public ResponseResult<?> searchReaderTypeById(Integer id) {
        ReaderType readerType = readerMapper.selectReaderTypeById(id);
        return ResponseResult.okResult(readerType);
    }
}
