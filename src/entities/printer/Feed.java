package entities.printer;

public enum Feed {
	ROUND("��������")/* �������� */, FLATBED("��������������")/* �������������� */, HYBRID(
			"���������")/* ��������� */;

	private String valueFeed;

	private Feed(String valueFeed) {
		this.valueFeed = valueFeed;
	}

	/**
	 * @return the valueFeed
	 */
	public String getValueFeed() {
		return valueFeed;
	}

	/**
	 * @param valueFeed
	 *            the valueFeed to set
	 */
	public void setValueFeed(String valueFeed) {
		this.valueFeed = valueFeed;
	}

}
