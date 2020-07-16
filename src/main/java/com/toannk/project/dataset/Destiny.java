/**
 * 
 */
package com.toannk.project.dataset;

import java.util.List;

/**
 * @author WIN
 *
 */
public class Destiny {
	private int id;
	private String name;
	private String location;
	private String description;
	private String createTime;
	private String endTime;
	private String detail;
	private int numberOfScreen;
	private List<ActorRoleInDestiny> listActor;
	private List<EquipmentInDestiny> listEquipment;
	private int isDone;
	
	
	

	/**
	 * @return the isDone
	 */
	public int getIsDone() {
		return isDone;
	}

	/**
	 * @param isDone the isDone to set
	 */
	public void setIsDone(int isDone) {
		this.isDone = isDone;
	}

	/**
	 * @return the listActor
	 */
	public List<ActorRoleInDestiny> getListActor() {
		return listActor;
	}

	/**
	 * @param listActor the listActor to set
	 */
	public void setListActor(List<ActorRoleInDestiny> listActor) {
		this.listActor = listActor;
	}

	/**
	 * @return the listEquipment
	 */
	public List<EquipmentInDestiny> getListEquipment() {
		return listEquipment;
	}

	/**
	 * @param listEquipment the listEquipment to set
	 */
	public void setListEquipment(List<EquipmentInDestiny> listEquipment) {
		this.listEquipment = listEquipment;
	}

	/**
	 * @return the detail
	 */
	public String getDetail() {
		return detail;
	}

	/**
	 * @param detail the detail to set
	 */
	public void setDetail(String detail) {
		this.detail = detail;
	}

	/**
	 * @return the numberOfScreen
	 */
	public int getNumberOfScreen() {
		return numberOfScreen;
	}

	/**
	 * @param numberOfScreen the numberOfScreen to set
	 */
	public void setNumberOfScreen(int numberOfScreen) {
		this.numberOfScreen = numberOfScreen;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the createTime
	 */
	public String getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the endTime
	 */
	public String getEndTime() {
		return endTime;
	}

	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

}
