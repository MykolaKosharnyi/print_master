package entities.printer;

public enum TypeDrops {
	PERMANENT("����������")/* ���������� */, PARTIALLY("����������")/* ���������� */;
	
	private String valueDrops;

	private TypeDrops(String valueDrops) {
		this.valueDrops = valueDrops;
	}

	/**
	 * @return the valueDrops
	 */
	public String getValueDrops() {
		return valueDrops;
	}

	/**
	 * @param valueDrops the valueDrops to set
	 */
	public void setValueDrops(String valueDrops) {
		this.valueDrops = valueDrops;
	}

}
