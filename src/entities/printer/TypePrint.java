package entities.printer;

public enum TypePrint {
	THERMAL_INKJET("�����-��������")/* �����-�������� */, PIJ("�����-��������")/* ������������� */;
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
