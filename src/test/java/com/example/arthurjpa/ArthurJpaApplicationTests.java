package com.example.arthurjpa;

import com.example.arthurjpa.domain.coupon.entity.CouponIssue;
import com.example.arthurjpa.domain.coupon.reposiroty.CouponRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArthurJpaApplicationTests {
    @Autowired
    CouponRepository couponRepository;


    @Test
    public void contextLoads() {
    }

    @Test
    @Transactional(readOnly = true)
    public void 유저쿠폰조회() {
        List<CouponIssue> couponIssues = couponRepository.findByUserId(100L);

        Assert.assertNotNull(couponIssues);
    }
}
