package model.dao.impl;

import db.DbException;
import model.Department;
import model.dao.IDepartmentDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DepartmentDAOJdbc implements IDepartmentDAO {

    private final Connection conn;

    public DepartmentDAOJdbc(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(Department obj) {

    }

    @Override
    public void update(Department obj) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Department findById(Integer id) {
        return null;
    }

    @Override
    public List<Department> findAll() {
        ResultSet rs;
        PreparedStatement st;
        try {
            st = conn.prepareStatement("");

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        return List.of();
    }
}
