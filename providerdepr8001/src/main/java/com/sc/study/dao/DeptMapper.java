package com.sc.study.dao;

import com.sc.study.entitys.Dept;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DeptMapper {
//        @Insert("INSERT INTO dept(dname,db_source) VALUES(#{dname},DATABASE());")
        public boolean addDept(Dept dept);
//        @Select("select deptno,dname,db_source from dept where deptno=#{deptno}; ")
        public Dept findById(Long id);
//        @Select("SELECT * from dept ; ")
        public List<Dept> findAll();
}
