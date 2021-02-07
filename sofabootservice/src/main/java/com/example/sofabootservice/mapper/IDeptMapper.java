package com.example.sofabootservice.mapper;

import com.example.sofabootservice.entity.Dept;
import com.example.sofabootservice.entity.Emp;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Mapper
@Transactional
public interface IDeptMapper {
    @Select("select * from dept")
    List<Dept> selectDept();

    @Insert("insert into dept(deptno,dname,loc) values(#{deptno},#{dname},#{loc})")
    void InsertDept(@Param("deptno") int deptno,@Param("dname")String dname,@Param("loc")String loc);

    @Select("select * from emp")
    List<Emp> selectEmp();
}
