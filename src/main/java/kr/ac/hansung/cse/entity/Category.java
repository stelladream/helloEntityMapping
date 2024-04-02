package kr.ac.hansung.cse.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//@Getter
//@Setter
//@ToString
//@NoArgsConstructor
//@Entity
//public class Category {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String name;
//
//    public Category(String name) {
//        this.name = name;
//    }
//}
//
//@Getter
//@Setter
//@ToString
//@NoArgsConstructor
//@Entity
//public class Category {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String name;
//
//    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Product> products = new ArrayList<>();
//
//    public Category(String name) {
//        this.name = name;
//    }
//
//    // 연관 관계 편의 메소드
//    public void addProduct(Product product) {
//        products.add(product);
//        product.setCategory(this);
//    }
//}