package entities.printer;

public enum CompatibleInk {
	WATER("Водные")/* Водные */, PIGMENT("Пигментные")/* Пигментные */, SUBLIMATION(
			"Сублимационные")/* Сублимационные */, ECOSOLVENT("Экосольвентные")/* Экосольвентные */, SOLVENT(
			"Сольвентные")/* Сольвентные */, UV_INK("UV-чернила")/* UV-чернила */;

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
