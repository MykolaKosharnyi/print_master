package entities.printer;

public enum TypePrint {
	THERMAL_INKJET("Термо-струйная")/* Термо-струйная */, PIJ("Пьезо-струйная")/* Пьезоструйная */;
	private String nameTypePrint;

	private TypePrint(String nameTypePrint) {
		this.nameTypePrint = nameTypePrint;
	}

	/**
	 * @return the nameTypePrint
	 */
	public String getNameTypePrint() {
		return nameTypePrint;
	}

	/**
	 * @param nameTypePrint
	 *            the nameTypePrint to set
	 */
	public void setNameTypePrint(String nameTypePrint) {
		this.nameTypePrint = nameTypePrint;
	}

}
