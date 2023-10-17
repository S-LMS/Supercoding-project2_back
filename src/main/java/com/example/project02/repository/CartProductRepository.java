package com.example.project02.repository;

import com.example.project02.entity.Cart;
import com.example.project02.entity.CartProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartProductRepository extends JpaRepository<CartProduct, Long> {
    CartProduct findByCartIdAndProductId(Long cartId, Long productId);

    List<CartProduct> findByCart(Cart userCart);
}
