package com.codegym.servic;

import com.codegym.model.Shoes;

import java.sql.SQLException;
import java.util.List;

public interface IShoesService {
    public List<Shoes> findAll();

    public void insert(Shoes shoes) throws SQLException;

    public  List<Shoes> FindByCategoryShoes();

    public  boolean update(Shoes shoes) throws SQLException;

    public boolean delete(int shoes_id) throws SQLException;

    public List<Shoes> findByPrice(float price) throws SQLException;
}
