package com.example.demo.repository;

import com.example.demo.entity.TxRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TxRequestRepository extends JpaRepository<TxRequest, Long> {
}
