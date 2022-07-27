package com.springcourse.hibernate_many_to_one_uni.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String departmentName;
    @Column(name = "max_salary")
    private int max_salary;
    @Column(name = "min_salary")
    private int min_salary;
/*
    {CascadeType.MERGE, CascadeType.DETACH,
            CascadeType.PERSIST, CascadeType.REFRESH}
            CascadeType.ALL
*/
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "departments_id")
    private List<Employee> emps;

    public List<Employee> getEmps() {
        return emps;
    }

    public void setEmps(List<Employee> emps) {
        this.emps = emps;
    }

    public Department() {
    }

    public Department(String name, int max_salary, int min_salary) {
        this.departmentName = name;
        this.max_salary = max_salary;
        this.min_salary = min_salary;
    }

    public void addEmployeeToDepartment(Employee employee) {
        if (emps == null) {
            emps = new ArrayList<>();
        }
        emps.add(employee);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getMax_salary() {
        return max_salary;
    }

    public void setMax_salary(int max_salary) {
        this.max_salary = max_salary;
    }

    public int getMin_salary() {
        return min_salary;
    }

    public void setMin_salary(int min_salary) {
        this.min_salary = min_salary;
    }

    @Override
    public String toString() {
        return "Department{"
                + "id=" + id
                + ", departmentName='" + departmentName + '\''
                + ", max_salary=" + max_salary
                + ", min_salary=" + min_salary
                + '}';
    }
}
