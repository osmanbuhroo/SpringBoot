package com.aws.repository;

import com.aws.entity.Aws;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AwsRepo extends JpaRepository<Aws,Long> {
}
