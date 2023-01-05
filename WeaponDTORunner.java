package com.xworkz.pizza.boot;

import java.time.LocalDate;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.pizza.constant.Types;
import com.xworkz.pizza.dto.WeaponDTO;

public class WeaponDTORunner {

	public static void main(String[] args) {
		
		WeaponDTO dto = new WeaponDTO("ShotGun", "Omkar", LocalDate.of(2018, 01, 20), 36000D, Types.FIRAMS);
		WeaponDTO dto1 = new WeaponDTO("Rifle", "Tom", LocalDate.now(), 5650D, Types.CHEMICAL_WEAPONS);
		WeaponDTO dto2 = new WeaponDTO("AK47", "Robert", LocalDate.now(), 2552D, Types.AK47);
		WeaponDTO dto3 = new WeaponDTO("AssaultRifle", "Shubham", LocalDate.now(), 16210D, Types.BIOLOGICAL_WEPONS);
		WeaponDTO dto4 = new WeaponDTO("Pistol", "Dharshan", LocalDate.now(), 925624D, Types.COMBAT_WEPONS);
		WeaponDTO dto5 = new WeaponDTO("Firearm", "tilak", LocalDate.now(), 472347D, Types.FIRAMS);
		WeaponDTO dto6 = new WeaponDTO("SniperRifle", "Kartik", LocalDate.now(), 895485D, Types.lONG_RANGE_WEAPONS);
		WeaponDTO dto7 = new WeaponDTO("iron", "Akshay", LocalDate.now(), 255620D, Types.Long);
		WeaponDTO dto8 = new WeaponDTO("SubmachineGun", "Manu", LocalDate.now(), 565482D, Types.MISSILAS);
		WeaponDTO dto9 = new WeaponDTO("Bow and Arrow", "Gani", LocalDate.now(), 235658D, Types.NUCLEAR_WEPONS);
		WeaponDTO dto10 = new WeaponDTO("HandGun", "Raviteja", LocalDate.now(), 365890D, Types.ROCKET);
		WeaponDTO dto11 = new WeaponDTO("Artillery", "Sanjay", LocalDate.now(), 5698200D, Types.SEMI_AUTOMIC);
		WeaponDTO dto12 = new WeaponDTO("Rocket Launcher", "Srisham", LocalDate.now(), 40350D, Types.SIGE_WEPONS);
		WeaponDTO dto13 = new WeaponDTO("Sword", "Neeraj", LocalDate.now(), 552200D, Types.SHORT_RANGE_WEAPONS);
		WeaponDTO dto14 = new WeaponDTO("Axe", "Nataraj", LocalDate.now(), 13522D, Types.CHEMICAL_WEAPONS);
		WeaponDTO dto15 = new WeaponDTO("AKM", "ironman", LocalDate.now(), 13500D, Types.EXPLOSSIVE);
		WeaponDTO dto16 = new WeaponDTO("Mortal", "Thor", LocalDate.now(), 336500D, Types.SIGE_WEPONS);
		WeaponDTO dto17 = new WeaponDTO("Dagger", "Hulk", LocalDate.now(), 256890D, Types.FIRAMS);
		WeaponDTO dto18 = new WeaponDTO("Flamethrower", "Captain", LocalDate.now(), 935601D, Types.MISSILAS);
		WeaponDTO dto19 = new WeaponDTO("Katana", "ChrisEvan", LocalDate.now(), 589699D, Types.BIOLOGICAL_WEPONS);

		WeaponDTO a3=new WeaponDTO();
		Collection<WeaponDTO> wepons = Stream.of(dto, dto1, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10,
				dto11, dto12, dto13, dto14, dto15, dto16, dto17, dto18, dto19).collect(Collectors.toList());
		wepons.stream().forEach(e -> System.out.println(e));

		System.out.println(System.lineSeparator());

		System.out.println("Printing all weapon price gratherthan 100");
		wepons.stream().filter(e -> e.getPrice() > 1000).collect(Collectors.toList())
				.forEach(p -> System.out.println(p));

		System.out.println(System.lineSeparator());

		System.out.println("Print all weapons madeby and made on");
		wepons.stream().collect(Collectors.toList())
				.forEach(r -> System.out.println("Made By    : " + r.getMadeBy() + "    Made On  : " + r.getMadeOn()));

		System.out.println(System.lineSeparator());

		System.out.println("Print all the weapons by name sorted in desc order");

		wepons.stream().sorted((a1, a2) -> a2.getName().compareToIgnoreCase(a1.getName())).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));
		System.out.println(System.lineSeparator());
		System.out.println("all weapons sort by madeBy  :");
		wepons.stream().sorted((a1,a2)-> a1.getMadeBy().compareTo(a2.getMadeBy())).collect(Collectors.toList()).forEach(e->System.out.println(e));
		System.out.println(System.lineSeparator());
		System.out.println("all weapons sort by on  :");
		wepons.stream().sorted((a1,a2)->a1.getMadeOn().compareTo(a2.getMadeOn())).collect(Collectors.toList()).forEach(r->System.out.println(r));
		
		System.out.println(System.lineSeparator());
		System.out.println("all weapons sort by on  :");
		wepons.stream().sorted((a1,a2)->Double.compare(a1.getPrice(), a2.getPrice())).collect(Collectors.toList()).forEach(p->System.out.println(p));
		
		System.out.println(System.lineSeparator());
		System.out.println("all weapons sort by on  :");
		wepons.stream().sorted((a1,a2)->Double.compare(a2.getPrice(), a1.getPrice())).collect(Collectors.toList()).forEach(p->System.out.println(p));
		
		System.out.println(System.lineSeparator());
		System.out.println("all weapons sort by on  :");
		
		
	}


	}


