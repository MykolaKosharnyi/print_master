package entities.printer;

public enum TypePrint {
	THERMAL_INKJET("Термо-струйная")/* Термо-струйная */, PIJ("Пьезо-струйная")/* Пьезоструйная */;
	
	private String valueTypePrint;

	private TypePrint(String valueTypePrint) {
		this.valueTypePrint = valueTypePrint;
	}

	/**
	 * @return the valueTypePrint
	 */
	public String getValueTypePrint() {
		return valueTypePrint;
	}

	/**
	 * @param valueTypePrint the valueTypePrint to set
	 */
	public void setValueTypePrint(String valueTypePrint) {
		this.valueTypePrint = valueTypePrint;
	}

}
