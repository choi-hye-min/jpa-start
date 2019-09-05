package com.example.arthurjpa.domain.coupon.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Table
@Entity
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String couponName;

    @Column
    private Integer discount;

    @Builder
    public Coupon(String couponName, Integer discount) {
        this.couponName = couponName;
        this.discount = discount;
    }
}
