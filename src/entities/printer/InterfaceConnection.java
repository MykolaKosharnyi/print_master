package entities.printer;

public enum InterfaceConnection {
	SCSI("SCSI"), PCI_ADAPTER("PCI Adapter"), USB("USB"), FIRE_WIRE("Fire-Wire");

	private String valueInterfaceConnection;

	private InterfaceConnection(String valueInterfaceConnection) {
		this.valueInterfaceConnection = valueInterfaceConnection;
	}

	/**
	 * @return the valueInterfaceConnection
	 */
	public String getValueInterfaceConnection() {
		return valueInterfaceConnection;
	}

	/**
	 * @param valueInterfaceConnection the valueInterfaceConnection to set
	 */
	public void setValueInterfaceConnection(String valueInterfaceConnection) {
		this.valueInterfaceConnection = valueInterfaceConnection;
	}

}
