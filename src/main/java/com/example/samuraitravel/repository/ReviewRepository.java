 package com.example.samuraitravel.repository;
 
 import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.samuraitravel.entity.House;
import com.example.samuraitravel.entity.Review;
import com.example.samuraitravel.entity.User;
 
 public interface ReviewRepository extends JpaRepository<Review, Integer> {
	 /* 引数として渡された民宿に紐づくレビューを作成日時順（降順）に6件取得する。 */
     public List<Review> findTop6ByHouseOrderByCreatedAtDesc(House house);
     /* 引数として渡された民宿とユーザーに紐づくレビューを1件取得する。 */
     public Review findByHouseAndUser(House house, User user);
     /* 引数として渡された民宿に紐づくレビューの件数を取得する。 */
     public long countByHouse(House house);
     /* 引数として渡された民宿に紐づくレビューを作成日時順（降順）にすべて取得し、Page型のオブジェクトとして返す。 */
     public Page<Review> findByHouseOrderByCreatedAtDesc(House house, Pageable pageable);
 }