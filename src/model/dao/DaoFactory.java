package model.dao;

import db.DB;
import model.dao.implementation.SellerDaoJDBC;

/**
 *
 * @author David
 */
public class DaoFactory {
    
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }
    
}
