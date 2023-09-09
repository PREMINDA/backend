package com.ecom.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecom.entity.OrderDetail;
import com.ecom.entity.User;

@Repository
public interface OrderDetailDao extends JpaRepository<OrderDetail, Integer> {
	
	public List<OrderDetail> findByUser(User user);

}
