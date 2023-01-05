package com.xworkz.pizza.dto;

import java.time.LocalDate;

import com.xworkz.pizza.constant.Types;

public class WeaponDTO implements Comparable<WeaponDTO> {
	
	private String name;
	private String madeBy;
	private LocalDate madeOn;
	private double price;
	private Types type;

	public WeaponDTO() {
		// TODO Auto-generated constructor stub
	}

	public WeaponDTO(String name, String madeBy, LocalDate madeOn, double price, Types type) {
		super();
		this.name = name;
		this.madeBy = madeBy;
		this.madeOn = madeOn;
		this.price = price;
		this.type = type;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 22;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof WeaponDTO) {
				WeaponDTO dto = (WeaponDTO) obj;
				if (this.name.equals(dto.getName())) {
					System.out.println("cheaking sucessfully");
					return true;

				}
			}
		}
		return false;
	}

	@Override
	public int compareTo(WeaponDTO o) {
		return this.name.compareTo(o.getName());
	}

	@Override
	public String toString() {
		return "WeaponDTO [name=" + name + ", madeBy=" + madeBy + ", madeOn=" + madeOn + ", price=" + price + ", type="
				+ type + "]";
	}

	public String getName() {
		return name;
	}

	public String getMadeBy() {
		return madeBy;
	}

	public LocalDate getMadeOn() {
		return madeOn;
	}

	public double getPrice() {
		return price;
	}

	public Types getType() {
		return type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public void setMadeOn(LocalDate madeOn) {
		this.madeOn = madeOn;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setType(Types type) {
		this.type = type;
	}


}
