package entities.printer;

public enum TypeDrops {
	PERMANENT("����������")/* ���������� */, PARTIALLY("����������")/* ���������� */;
	private String nameTypeDrops;

	private TypeDrops(String nameTypeDrops) {
		this.nameTypeDrops = nameTypeDrops;
	}

	/**
	 * @return the nameTypeDrops
	 */
	public String getNameTypeDrops() {
		return nameTypeDrops;
	}

	/**
	 * @param nameTypeDrops
	 *            the nameTypeDrops to set
	 */
	public void setNameTypeDrops(String nameTypeDrops) {
		this.nameTypeDrops = nameTypeDrops;
	}

}
