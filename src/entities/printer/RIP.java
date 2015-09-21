package entities.printer;

public enum RIP {
	ONYX_GRAPHICS("ONYX Graphics"), SA_INTERNATIONAL_PHOTO_PRINT_FAMILY(
			"SA International/PhotoPRINT™ Family"), WASATCH_SOFTRIP(
			"Wasatch SOFTRIP"), COLOR_GATE_PRODUCTION_SERVER(
			"ColorGATE Productionserver"), POSTER_PRINT("Poster Print");

	private String valueRIP;

	private RIP(String valueRIP) {
		this.valueRIP = valueRIP;
	}

	/**
	 * @return the valueRIP
	 */
	public String getValueRIP() {
		return valueRIP;
	}

	/**
	 * @param valueRIP
	 *            the valueRIP to set
	 */
	public void setValueRIP(String valueRIP) {
		this.valueRIP = valueRIP;
	}

}
