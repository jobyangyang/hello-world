package com.zhiy.zy.mapper;

import com.zhiy.zy.domain.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {

    List<Employee> getAll();

    Employee findEmpByNo(@Param("empNo") String empNo);
}
