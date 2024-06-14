package core.app.validations;

import java.time.LocalDate;

import core.app.entity.Brand;
import core.app.entity.Material;
import core.app.entity.Pen;

public class PenValidations {
	
	//Brand brand, String color, String inkColor, Material material,
	//int stock,double price
	public static Pen validateInputs(String brand, String color, String inkColor, String material,
			int stock,double price) {
		
		Brand pBrand = parseAndValidateBrand(brand);
		Material pMaterial = parseAndValidateMaterial(material);
		//LocalDate pUpdateDate = parseAndValidateDate(updateDate);
		return new Pen(pBrand,color,inkColor,pMaterial,stock,price);
				
	}

	private static LocalDate parseAndValidateDate(String updateDate) {
		
		return LocalDate.parse(updateDate);
	}

	private static Material parseAndValidateMaterial(String material) {
		
		return Material.valueOf(material.toUpperCase());
	}

	private static Brand parseAndValidateBrand(String brand) {
		
		return Brand.valueOf(brand.toUpperCase());
	}

}
