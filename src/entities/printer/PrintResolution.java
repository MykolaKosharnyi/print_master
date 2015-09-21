package entities.printer;

public enum PrintResolution {
	_360dpi("360"), _600dpi("600"), _720dpi("720"), _1200dpi("1200"), _1440dpi(
			"1440"), _2880dpi("2880");

	private String valuePrintResolution;

	private PrintResolution(String valuePrintResolution) {
		this.valuePrintResolution = valuePrintResolution;
	}

	/**
	 * @return the valuePrintResolution
	 */
	public String getValuePrintResolution() {
		return valuePrintResolution;
	}

	/**
	 * @param valuePrintResolution the valuePrintResolution to set
	 */
	public void setValuePrintResolution(String valuePrintResolution) {
		this.valuePrintResolution = valuePrintResolution;
	}

}
