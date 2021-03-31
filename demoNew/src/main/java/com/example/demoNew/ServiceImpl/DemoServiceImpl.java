package com.example.demoNew.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoNew.Entity.DemoEntity;
import com.example.demoNew.Repository.DemoRepository;
import com.example.demoNew.Service.DemoInterface;

@Service
public class DemoServiceImpl implements DemoInterface {

	@Autowired
	private DemoRepository repo;
	
	@Override
	public String save(DemoEntity demo) {
		
		 repo.save(demo);
		 return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<DemoEntity> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
