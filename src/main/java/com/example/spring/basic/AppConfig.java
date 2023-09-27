package com.example.spring.basic;

import com.example.spring.basic.discount.DiscountPolicy;
import com.example.spring.basic.discount.RateDiscountPolicy;
import com.example.spring.basic.order.OrderService;
import com.example.spring.basic.order.OrderServiceImpl;
import com.example.spring.basic.member.MemberRepository;
import com.example.spring.basic.member.MemberService;
import com.example.spring.basic.member.MemberServiceImpl;
import com.example.spring.basic.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }
}
