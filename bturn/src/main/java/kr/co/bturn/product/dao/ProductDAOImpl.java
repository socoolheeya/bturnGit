package kr.co.bturn.product.dao;

import java.util.List;

import kr.co.bturn.product.model.ProductDTO;

import org.mybatis.spring.SqlSessionTemplate;
import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;

/**
 * 
 * @author LeeWonHee
 * @since 2015.09.22
 */
public class ProductDAOImpl implements ProductDAO {
	
	Logger log = Logger.getLogger(this.getClass());
	private SqlSessionTemplate sqlMap;
	
	public ProductDAOImpl(SqlSessionTemplate sqlMap) {
		super();
		this.sqlMap = sqlMap;
	}

	@Override
	public int insertProduct(ProductDTO dto) throws DataAccessException {
		int result = 0;
		try {
			sqlMap.insert("insertProduct", dto);
			sqlMap.commit();
		} catch(Exception e) {
			sqlMap.rollback();
		} finally {
			sqlMap.close();
		}
		
		return result;
	}

	@Override
	public ProductDTO selectProduct(long index) throws DataAccessException {
		ProductDTO dto = null;
		try {
			dto = sqlMap.selectOne("selectProduct", index);
			sqlMap.commit();
		} catch(Exception e) {
			sqlMap.rollback();
		} finally {
			sqlMap.close();
		}
		
		return dto;
	}

	@Override
	public int updateProduct(long index) throws DataAccessException {
		return sqlMap.update("updateProduct", index);
	}

	@Override
	public int deleteProduct(long index) throws DataAccessException {
		
		return sqlMap.delete("deleteProduct", index);
	}

	@Override
	public List<ProductDTO> searchProduct(String keyword) throws DataAccessException {
		sqlMap.selectList("searchProductList", keyword);
		return null;
	}

	@Override
	public List<ProductDTO> selectProductList(ProductDTO dto)
			throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

}
