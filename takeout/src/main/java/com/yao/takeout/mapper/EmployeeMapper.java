package com.yao.takeout.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yao.takeout.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee>{
}
