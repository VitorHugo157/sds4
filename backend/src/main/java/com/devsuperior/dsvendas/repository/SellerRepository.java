package com.devsuperior.dsvendas.repository;

import com.devsuperior.dsvendas.entity.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long> {
}
