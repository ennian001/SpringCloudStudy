package study.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.sc.study.entitys.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import study.service.DeptService;

import java.util.List;

@RestController
public class DeptController
{
    @Autowired
    private DeptService service;

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept)
    {
        return service.add(dept);
    }

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept get(@PathVariable("id") Long id)
    {
        Dept dept = service.get(id);
        if (null == dept)
        {
            throw new RuntimeException("该ID："+id+"没有对应信息");
        }
        return dept;
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list()
    {
        return service.list();
    }

    public Dept processHystrix_Get(@PathVariable("id") Long id){
        Dept dept = new Dept();
        dept.setDb_source("no dataBase in the  Mysql");
        dept.setDname("该id没有对应信息");
        dept.setDeptno(id);
        return dept;
    }

}