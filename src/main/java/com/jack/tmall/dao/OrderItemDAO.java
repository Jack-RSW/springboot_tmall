package com.jack.tmall.dao;

import java.util.List;

import com.jack.tmall.pojo.Order;
import com.jack.tmall.pojo.OrderItem;
import com.jack.tmall.pojo.Product;
import com.jack.tmall.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemDAO extends JpaRepository<OrderItem,Integer>{
    List<OrderItem> findByOrderOrderByIdDesc(Order order);
    List<OrderItem> findByProduct(Product product);
    List<OrderItem> findByUserAndOrderIsNull(User user);
}