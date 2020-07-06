/**
 * 
 */
package com.toannk.project.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.toannk.project.dataset.Image;

/**
 * @author WIN
 *
 */
@Mapper
public interface ImageMapper {
	@Select("Select *"
			+ "from "
			+ "tbl_image")
	public List<Image>getAllImage();
	
	@Insert("Insert into "
			+ "tbl_image "
			+ "values "
			+ "( #{image} )")
	public int addImage(Image image);
}
