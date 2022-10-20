package com.dev.warehouse.bus.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dev.warehouse.bus.entity.Student;
import com.dev.warehouse.bus.mapper.StudentMapper;
import com.dev.warehouse.bus.service.IStudentService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.Collection;


@Service
@Transactional
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

	@Override
	public boolean save(Student entity) {
		// TODO Auto-generated method stub
		return super.save(entity);
	}

	@Override
	public boolean saveOrUpdate(Student entity) {
		// TODO Auto-generated method stub
		return super.saveOrUpdate(entity);
	}

	@Override
	public boolean removeById(Serializable id) {
		// TODO Auto-generated method stub
		return super.removeById(id);
	}

	@Override
	public boolean remove(Wrapper<Student> wrapper) {
		// TODO Auto-generated method stub
		return super.remove(wrapper);
	}

	@Override
	public boolean removeByIds(Collection<? extends Serializable> idList) {
		// TODO Auto-generated method stub
		return super.removeByIds(idList);
	}
	
	 
    
}
