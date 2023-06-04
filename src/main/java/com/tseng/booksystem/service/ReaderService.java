package com.tseng.booksystem.service;

import com.tseng.booksystem.domain.ResponseResult;
import com.tseng.booksystem.domain.entity.Reader;
import com.tseng.booksystem.domain.entity.ReaderType;

public interface ReaderService {
    ResponseResult<?> addReader(Reader reader);

    ResponseResult<?> deleteReader(Integer id);

    ResponseResult<?> updateReader(Integer id, Reader reader);

    ResponseResult<?> searchReaderById(Integer id);

    ResponseResult<?> addReaderType(ReaderType readerType);

    ResponseResult<?> deleteReaderType(Integer id);

    ResponseResult<?> updateReaderType(Integer id, ReaderType readerType);

    ResponseResult<?> searchReaderTypeById(Integer id);
}
