package application;

import db.DB;
import model.Seller;
import model.dao.DAOFactory;
import model.dao.impl.SellerDAOJdbc;

public class Program {
    public static void main(String[] args) {
        Seller seller = DAOFactory.createSellerDAO().findById(1);

        Seller seller2 = new SellerDAOJdbc(DB.getConnection()).findById(1);

        System.out.println(seller);
        System.out.println(seller2);
    }
}