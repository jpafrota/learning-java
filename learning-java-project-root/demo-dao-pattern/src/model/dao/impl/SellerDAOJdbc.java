package model.dao.impl;

import db.DB;
import db.DbException;
import model.Department;
import model.Seller;
import model.dao.ISellerDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class SellerDAOJdbc implements ISellerDAO {

    private final Connection conn;

    public SellerDAOJdbc(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(Seller obj) {

    }

    @Override
    public void update(Seller obj) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Seller findById(Integer id) {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement("SELECT seller.*, department.Name as DepName "
            + "FROM seller INNER JOIN department "
            + "ON seller.DepartmentId = department.Id "
            + "WHERE seller.Id = ?");

            st.setInt(1, id);

            rs = st.executeQuery();

            if (!rs.next()) return null;

            Department dep = new Department(rs.getInt("DepartmentId"), rs.getString("DepName"));
            return new Seller(
                    rs.getInt("Id"),
                    rs.getString("Name"),
                    rs.getString("Email"),
                    rs.getDate("BirthDate"),
                    rs.getDouble("BaseSalary"),
                    dep
            );
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeResultSet(rs);
            DB.closeStatement(st);
        }
    }

    @Override
    public List<Seller> findAll() {
        return List.of();
    }
}
