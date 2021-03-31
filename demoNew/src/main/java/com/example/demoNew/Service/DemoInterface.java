package com.example.demoNew.Service;

import java.util.List;

import com.example.demoNew.Entity.DemoEntity;

public interface DemoInterface {

	String save(DemoEntity demo);

	List<DemoEntity> findAll();


}
