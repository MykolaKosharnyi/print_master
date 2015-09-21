package entities.printer;

public enum EquipmentManufacturer {
	MIMAKI("Mimaki"), ROLAND("Roland"), MUTOH("Mutoh"), HP("HP"), OCE("OCE"), AGFA(
			"Agfa"), LIYU("LIYU"), INFINITY("Infinity"), GONZENG("Gonzeng"), JONG_YE(
			"Jong Ye");

	private String valueEquipmentManufacturer;

	private EquipmentManufacturer(String valueEquipmentManufacturer) {
		this.valueEquipmentManufacturer = valueEquipmentManufacturer;
	}

	/**
	 * @return the valueEquipmentManufacturer
	 */
	public String getValueEquipmentManufacturer() {
		return valueEquipmentManufacturer;
	}

	/**
	 * @param valueEquipmentManufacturer the valueEquipmentManufacturer to set
	 */
	public void setValueEquipmentManufacturer(String valueEquipmentManufacturer) {
		this.valueEquipmentManufacturer = valueEquipmentManufacturer;
	}


}
