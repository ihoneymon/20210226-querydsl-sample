package com.example.demo.repository;

import com.example.demo.dto.SearchTxInfo;
import com.example.demo.entity.TxRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

public class TxRequestRepositoryImpl extends QuerydslRepositorySupport implements TxRequestRepositoryCustom {
    /**
     * Creates a new {@link QuerydslRepositorySupport} instance for the given domain type.
     *
     */
    public TxRequestRepositoryImpl() {
        super(TxRequest.class);
    }

    @Override
    public Page<TxRequest> search(SearchTxInfo condition, Pageable pageable) {
        return null;
    }
}
