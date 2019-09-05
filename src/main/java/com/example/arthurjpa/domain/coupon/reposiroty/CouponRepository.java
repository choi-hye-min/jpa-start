package com.example.arthurjpa.domain.coupon.reposiroty;

import com.example.arthurjpa.domain.coupon.entity.CouponIssue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CouponRepository extends JpaRepository<CouponIssue, Long> {
    List<CouponIssue> findByUserId(Long id);
}
