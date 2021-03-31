package com.example.demoNew.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoNew.Entity.DemoEntity;

@Repository
public interface DemoRepository extends JpaRepository<DemoEntity, Integer> {

}
