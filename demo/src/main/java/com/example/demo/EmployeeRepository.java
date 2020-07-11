/**
 * 
 */
package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author BhushanRade
 *
 */
public interface EmployeeRepository extends JpaRepository<Integer, Employee> {

}
