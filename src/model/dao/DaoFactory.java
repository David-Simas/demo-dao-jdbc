package model.dao;

import model.dao.implementation.SellerDaoJDBC;

/**
 *
 * @author David
 */
public class DaoFactory {
    
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC();
    }
    
}
