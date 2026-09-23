package org.com.lab.repository;

import org.com.lab.entity.UserDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserDomainJpaRepository extends JpaRepository<UserDomain, Integer> {

    @Query("SELECT u.domainId FROM UserDomain u WHERE u.userId = :userId AND u.revokedAt IS NULL")
    List<Long> findDomainIdsByUserIdAndRevokedAtNull(@Param("userId") String userId);
}