package com.example.samuraitravel.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.samuraitravel.entity.House;
import com.example.samuraitravel.repository.HouseRepository;

@Controller // Controllerファイルである宣言
public class HomeController {
	private final HouseRepository houseRepository;

	public HomeController(HouseRepository houseRepository) {
		this.houseRepository = houseRepository;
	}

	@GetMapping("/") // HTTPリクエストのGETメソッド：サーバーから情報を取得（ページの表示など）
	public String index(Model model) {
		List<House> newHouses = houseRepository.findTop10ByOrderByCreatedAtDesc();
		model.addAttribute("newHouses", newHouses);
		return "index";
	}
}

// @PostMapping HTTPリクエストのPOSTメソッド：サーバー上のデータを変更（入力内容をデータの作成や更新）
