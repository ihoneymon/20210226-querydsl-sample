package com.example.demo.repository;

import com.example.demo.dto.SearchTxInfo;
import com.example.demo.entity.TxRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TxRequestRepositoryCustom {
    Page<TxRequest> search(SearchTxInfo condition, Pageable pageable);
}
