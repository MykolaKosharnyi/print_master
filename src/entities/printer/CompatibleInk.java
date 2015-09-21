package entities.printer;

public enum CompatibleInk {
	WATER("������")/* ������ */, PIGMENT("����������")/* ���������� */, SUBLIMATION(
			"��������������")/* �������������� */, ECOSOLVENT("��������������")/* �������������� */, SOLVENT(
			"�����������")/* ����������� */, UV_INK("UV-�������")/* UV-������� */;

	private String valueCompatibleInk;

	private CompatibleInk(String valueCompatibleInk) {
		this.valueCompatibleInk = valueCompatibleInk;
	}

	/**
	 * @return the typeCompatibleInk
	 */
	public String getValueCompatibleInk() {
		return valueCompatibleInk;
	}

	/**
	 * @param typeCompatibleInk
	 *            the typeCompatibleInk to set
	 */
	public void setValueCompatibleInk(String valueCompatibleInk) {
		this.valueCompatibleInk = valueCompatibleInk;
	}

}
