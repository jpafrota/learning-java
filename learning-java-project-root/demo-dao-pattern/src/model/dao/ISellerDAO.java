package model.dao;

import model.Seller;

import java.util.List;

public interface  ISellerDAO {
    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
}
