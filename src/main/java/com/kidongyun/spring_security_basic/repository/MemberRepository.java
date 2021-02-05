package com.kidongyun.spring_security_basic.repository;

import com.kidongyun.spring_security_basic.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByEmail(String email);
}
