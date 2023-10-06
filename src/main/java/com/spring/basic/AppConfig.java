package com.spring.basic;

import com.spring.basic.discount.DiscountPolicy;
import com.spring.basic.discount.RateDiscountPolicy;
import com.spring.basic.member.MemberRepository;
import com.spring.basic.member.MemberService;
import com.spring.basic.member.MemberServiceImpl;
import com.spring.basic.member.MemoryMemberRepository;
import com.spring.basic.order.OrderService;
import com.spring.basic.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        System.out.println("call AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        System.out.println("call AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        System.out.println("call AppConfig.orderService");
        return new OrderServiceImpl(memberRepository(), discountPolicy());
//        return null;
    }

    @Bean
    public DiscountPolicy discountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }
}
