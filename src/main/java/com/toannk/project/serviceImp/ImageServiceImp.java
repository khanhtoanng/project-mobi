package com.toannk.project.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toannk.project.dataset.Image;
import com.toannk.project.mapper.ImageMapper;
import com.toannk.project.service.ImageService;

@Service
public class ImageServiceImp implements ImageService{
	@Autowired
	private ImageMapper mapper;
	
	public ImageServiceImp(ImageMapper mapper) {
		this.mapper = mapper;
	}
	
	@Override
	public List<Image> getAllImage() {
		
		return mapper.getAllImage();
	}

	@Override
	public int addImage(Image image) {
		
		return mapper.addImage(image);
	}
	
	
}
