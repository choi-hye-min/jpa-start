package com.example.arthurjpa.domain.coupon.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Table
@Entity
@NoArgsConstructor
public class CouponIssue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "arthurId")
    private Coupon coupon;

    @Builder
    public CouponIssue(Long userId, Coupon coupon) {
        this.userId = userId;
        this.coupon = coupon;
    }
}
