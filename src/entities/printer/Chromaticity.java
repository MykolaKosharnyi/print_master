package entities.printer;

public enum Chromaticity {
	CMYK("CMYK"), CMYK_X_2("CMYK X 2"), CMYKLcLm("CMYKLcLm"), CMYKLcLmOG(
			"CMYKLcLmOG");

	private String valueChromaticity;

	private Chromaticity(String valueChromaticity) {
		this.valueChromaticity = valueChromaticity;
	}

	/**
	 * @return the valueChromaticity
	 */
	public String getValueChromaticity() {
		return valueChromaticity;
	}

	/**
	 * @param valueChromaticity the valueChromaticity to set
	 */
	public void setValueChromaticity(String valueChromaticity) {
		this.valueChromaticity = valueChromaticity;
	}


}
