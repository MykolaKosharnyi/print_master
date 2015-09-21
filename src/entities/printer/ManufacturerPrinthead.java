package entities.printer;

public enum ManufacturerPrinthead {
	SPECTRA("Spectra"), XAAR("XAAR"), SPT("SPT"), KONIKA_MINOLTA(
			"Konika Minolta"), TOSHIBA("Toshiba"), RICOH("Ricoh"), EPSO("Epso"), LEXMARK(
			"Lexmark");

	private String valueManufacturerPrinthead;

	private ManufacturerPrinthead(String valueManufacturerPrinthead) {
		this.valueManufacturerPrinthead = valueManufacturerPrinthead;
	}

	/**
	 * @return the valueManufacturerPrinthead
	 */
	public String getValueManufacturerPrinthead() {
		return valueManufacturerPrinthead;
	}

	/**
	 * @param valueManufacturerPrinthead the valueManufacturerPrinthead to set
	 */
	public void setValueManufacturerPrinthead(String valueManufacturerPrinthead) {
		this.valueManufacturerPrinthead = valueManufacturerPrinthead;
	}
}
