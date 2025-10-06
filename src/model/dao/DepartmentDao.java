package model.dao;

import java.util.List;
import model.entities.Department;

/**
 *
 * @author David
 */
public interface DepartmentDao {
    
    void insert(Department obj);
    void update(Department obj);
    void delete(Integer id);
    Department findById(Integer id);
    List<Department> findAll();
}
