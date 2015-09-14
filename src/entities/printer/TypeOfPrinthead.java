package entities.printer;

public enum TypeOfPrinthead {
	Nova_256("Nova 256"), Galaxy_256("Galaxy256"), Polyaris_512("Polyaris 512"),
	_126_50("126/50"), _126_80("126/80"), _128_40("128/40"), _128_80("128/80"),
	_500("500"), _255("255"), _510("510"), _1020("1020"), _256("256"), _512("512"),
	_1024("1024"), CA3("CA3"), CA4("CA4"), Gen4("Gen4"), Gen5("Gen5"), DX2("DX2"),
	DX4("DX4"), DX5("DX5"), DX6("DX6"),  DX7("DX7");
	
	private String type;
	
	private TypeOfPrinthead(String type) {
		this.type = type;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	
}
