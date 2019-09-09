package study.service.impl;


import com.sc.study.entitys.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import study.dao.DeptMapper;
import study.service.DeptService;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService
{
    @Autowired
    private DeptMapper dao;

    @Override
    public boolean add(Dept dept)
    {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id)
    {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list()
    {
        return dao.findAll();
    }

}