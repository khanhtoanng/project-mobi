/**
 * 
 */
package com.toannk.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.toannk.project.dataset.Image;
import com.toannk.project.service.ImageService;

/**
 * @author WIN
 *
 */
@RequestMapping(value = "/api")
@RestController
public class ImageController {
	@Autowired
	private ImageService service;

	public ImageController(ImageService service) {
		this.service = service;
	}

	@GetMapping(value = "/image/{type}")
	public List<Image> getAllAccount(@PathVariable("type") String type) {
		return service.getAllImage(type);
	}

	@PostMapping(value = "/image")
	public int addImage(@RequestBody Image image) {
		return service.addImage(image);
	}

}
