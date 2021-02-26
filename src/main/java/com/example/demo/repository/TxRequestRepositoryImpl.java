package com.example.demo.repository;

import com.example.demo.dto.SearchTxInfo;
import com.example.demo.entity.TxRequest;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.QueryResults;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.util.StringUtils;

import static com.example.demo.entity.QTxRequest.txRequest;

public class TxRequestRepositoryImpl extends QuerydslRepositorySupport implements TxRequestRepositoryCustom {
    /**
     * Creates a new {@link QuerydslRepositorySupport} instance for the given domain type.
     */
    public TxRequestRepositoryImpl() {
        super(TxRequest.class);
    }

    @Override
    public Page<TxRequest> search(SearchTxInfo condition, Pageable pageable) {
        BooleanBuilder wherePredicate = new BooleanBuilder();
        if (StringUtils.hasText(condition.getTxName())) {
            wherePredicate.and(txRequest.txName.eq(condition.getTxName()));
        }
        if (StringUtils.hasText(condition.getTxNumber())) {
            wherePredicate.and(txRequest.txNumber.eq(condition.getTxNumber()));
        }

        QueryResults<TxRequest> searchResult = from(txRequest)
                .where(wherePredicate)
                .fetchResults();
        return new PageImpl<>(searchResult.getResults(), pageable, searchResult.getTotal());
    }
}
