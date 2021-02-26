package com.example.demo.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class TxRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String txName;
    private String txNumber;
    private String txAmount;

    @CreatedDate
    private LocalDateTime createDateTime;
    @LastModifiedBy
    private LocalDateTime modifiedDatetime;

    public TxRequest(String txName, String txNumber, String txAmount) {
        this.txName = txName;
        this.txNumber = txNumber;
        this.txAmount = txAmount;
    }

    protected TxRequest() {
    }

    public String getTxName() {
        return txName;
    }

    public String getTxNumber() {
        return txNumber;
    }

    public String getTxAmount() {
        return txAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TxRequest txRequest = (TxRequest) o;
        return Objects.equals(id, txRequest.id) && txNumber.equals(txRequest.txNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, txNumber);
    }
}
