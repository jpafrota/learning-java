package model.dao;

import db.DB;
import model.dao.impl.DepartmentDAOJdbc;
import model.dao.impl.SellerDAOJdbc;

public class DAOFactory {
    public static ISellerDAO createSellerDAO() {
        return new SellerDAOJdbc(DB.getConnection());
    }

    public static IDepartmentDAO createDepartmentDAO() {
        return new DepartmentDAOJdbc(DB.getConnection());
    }
}
