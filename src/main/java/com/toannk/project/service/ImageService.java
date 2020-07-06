/**
 * 
 */
package com.toannk.project.service;

import java.util.List;

import com.toannk.project.dataset.Image;

/**
 * @author WIN
 *
 */
public interface ImageService {
	public List<Image> getAllImage();
	public int addImage(Image image);
}
