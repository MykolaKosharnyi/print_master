package entities.printer;

public class Printer {
	private int id;
	private String partNumber;// партийный номер
	private String name;//название
	private int prise;//цена товара в долларах
	private int weightPrintMM;//ширина печати в миллиметрах
	private TypePrint typePrint;//тип печати
	private Feed feed; //подача материала
	private Chromaticity chromaticity;// цветность
	private ManufacturerPrinthead manufacturer_printhead;//производитель печатающей головки
	private TypeOfPrinthead typeOfPrinthead;//тип печатающей головки
	private CompatibleInk compatibleInk;//совместимые чернила
	private TypeDrops typeDrops;//тип капли
	private SizeDrops sizeDrops;//размер капли
	private int speedPrint;//скорость печати
	private PrintResolution printResolution;//разрешение печати 
	private EquipmentManufacturer equipmentManufacturer;//производитель оборудования
	private String equipmentModel;//модель оборудования
	private InterfaceConnection interfaceConnection;//интерфейс подключения
	private int maximumMediaThickness;//максимальная толщина носителя
	private int maximumWeightOfVehicle;//максимальный вес носителя
	private RIP rip;//программное обеспечение RIP
	private int maxPowerConsumption;//максимальная потребляемая мощность
	private int weight;//вес
	private int width;//ширина
	private int heigth;//высота
	private int depth;//глубина
	private String description;//описание
	
	public Printer() {}
	
	public Printer(int id, String partNumber, String name, int prise,
			int weightPrintMM, TypePrint typePrint, Feed feed,
			Chromaticity chromaticity,
			ManufacturerPrinthead manufacturer_printhead,
			TypeOfPrinthead typeOfPrinthead, CompatibleInk compatibleInk,
			TypeDrops typeDrops, SizeDrops sizeDrops, int speedPrint,
			PrintResolution printResolution,
			EquipmentManufacturer equipmentManufacturer, String equipmentModel,
			InterfaceConnection interfaceConnection, int maximumMediaThickness,
			int maximumWeightOfVehicle, RIP rip, int maxPowerConsumption,
			int weight, int width, int heigth, int depth, String description) {
		this.id = id;
		this.partNumber = partNumber;
		this.name = name;
		this.prise = prise;
		this.weightPrintMM = weightPrintMM;
		this.typePrint = typePrint;
		this.feed = feed;
		this.chromaticity = chromaticity;
		this.manufacturer_printhead = manufacturer_printhead;
		this.typeOfPrinthead = typeOfPrinthead;
		this.compatibleInk = compatibleInk;
		this.typeDrops = typeDrops;
		this.sizeDrops = sizeDrops;
		this.speedPrint = speedPrint;
		this.printResolution = printResolution;
		this.equipmentManufacturer = equipmentManufacturer;
		this.equipmentModel = equipmentModel;
		this.interfaceConnection = interfaceConnection;
		this.maximumMediaThickness = maximumMediaThickness;
		this.maximumWeightOfVehicle = maximumWeightOfVehicle;
		this.rip = rip;
		this.maxPowerConsumption = maxPowerConsumption;
		this.weight = weight;
		this.width = width;
		this.heigth = heigth;
		this.depth = depth;
		this.description = description;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the partNumber
	 */
	public String getPartNumber() {
		return partNumber;
	}

	/**
	 * @param partNumber the partNumber to set
	 */
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the prise
	 */
	public int getPrise() {
		return prise;
	}

	/**
	 * @param prise the prise to set
	 */
	public void setPrise(int prise) {
		this.prise = prise;
	}

	/**
	 * @return the weightPrintMM
	 */
	public int getWeightPrintMM() {
		return weightPrintMM;
	}

	/**
	 * @param weightPrintMM the weightPrintMM to set
	 */
	public void setWeightPrintMM(int weightPrintMM) {
		this.weightPrintMM = weightPrintMM;
	}

	/**
	 * @return the typePrint
	 */
	public TypePrint getTypePrint() {
		return typePrint;
	}

	/**
	 * @param typePrint the typePrint to set
	 */
	public void setTypePrint(TypePrint typePrint) {
		this.typePrint = typePrint;
	}

	/**
	 * @return the feed
	 */
	public Feed getFeed() {
		return feed;
	}

	/**
	 * @param feed the feed to set
	 */
	public void setFeed(Feed feed) {
		this.feed = feed;
	}

	/**
	 * @return the chromaticity
	 */
	public Chromaticity getChromaticity() {
		return chromaticity;
	}

	/**
	 * @param chromaticity the chromaticity to set
	 */
	public void setChromaticity(Chromaticity chromaticity) {
		this.chromaticity = chromaticity;
	}

	/**
	 * @return the manufacturer_printhead
	 */
	public ManufacturerPrinthead getManufacturer_printhead() {
		return manufacturer_printhead;
	}

	/**
	 * @param manufacturer_printhead the manufacturer_printhead to set
	 */
	public void setManufacturer_printhead(
			ManufacturerPrinthead manufacturer_printhead) {
		this.manufacturer_printhead = manufacturer_printhead;
	}

	/**
	 * @return the typeOfPrinthead
	 */
	public TypeOfPrinthead getTypeOfPrinthead() {
		return typeOfPrinthead;
	}

	/**
	 * @param typeOfPrinthead the typeOfPrinthead to set
	 */
	public void setTypeOfPrinthead(TypeOfPrinthead typeOfPrinthead) {
		this.typeOfPrinthead = typeOfPrinthead;
	}

	/**
	 * @return the compatibleInk
	 */
	public CompatibleInk getCompatibleInk() {
		return compatibleInk;
	}

	/**
	 * @param compatibleInk the compatibleInk to set
	 */
	public void setCompatibleInk(CompatibleInk compatibleInk) {
		this.compatibleInk = compatibleInk;
	}

	/**
	 * @return the typeDrops
	 */
	public TypeDrops getTypeDrops() {
		return typeDrops;
	}

	/**
	 * @param typeDrops the typeDrops to set
	 */
	public void setTypeDrops(TypeDrops typeDrops) {
		this.typeDrops = typeDrops;
	}

	/**
	 * @return the sizeDrops
	 */
	public SizeDrops getSizeDrops() {
		return sizeDrops;
	}

	/**
	 * @param sizeDrops the sizeDrops to set
	 */
	public void setSizeDrops(SizeDrops sizeDrops) {
		this.sizeDrops = sizeDrops;
	}

	/**
	 * @return the speedPrint
	 */
	public int getSpeedPrint() {
		return speedPrint;
	}

	/**
	 * @param speedPrint the speedPrint to set
	 */
	public void setSpeedPrint(int speedPrint) {
		this.speedPrint = speedPrint;
	}

	/**
	 * @return the printResolution
	 */
	public PrintResolution getPrintResolution() {
		return printResolution;
	}

	/**
	 * @param printResolution the printResolution to set
	 */
	public void setPrintResolution(PrintResolution printResolution) {
		this.printResolution = printResolution;
	}

	/**
	 * @return the equipmentManufacturer
	 */
	public EquipmentManufacturer getEquipmentManufacturer() {
		return equipmentManufacturer;
	}

	/**
	 * @param equipmentManufacturer the equipmentManufacturer to set
	 */
	public void setEquipmentManufacturer(EquipmentManufacturer equipmentManufacturer) {
		this.equipmentManufacturer = equipmentManufacturer;
	}

	/**
	 * @return the equipmentModel
	 */
	public String getEquipmentModel() {
		return equipmentModel;
	}

	/**
	 * @param equipmentModel the equipmentModel to set
	 */
	public void setEquipmentModel(String equipmentModel) {
		this.equipmentModel = equipmentModel;
	}

	/**
	 * @return the interfaceConnection
	 */
	public InterfaceConnection getInterfaceConnection() {
		return interfaceConnection;
	}

	/**
	 * @param interfaceConnection the interfaceConnection to set
	 */
	public void setInterfaceConnection(InterfaceConnection interfaceConnection) {
		this.interfaceConnection = interfaceConnection;
	}

	/**
	 * @return the maximumMediaThickness
	 */
	public int getMaximumMediaThickness() {
		return maximumMediaThickness;
	}

	/**
	 * @param maximumMediaThickness the maximumMediaThickness to set
	 */
	public void setMaximumMediaThickness(int maximumMediaThickness) {
		this.maximumMediaThickness = maximumMediaThickness;
	}

	/**
	 * @return the maximumWeightOfVehicle
	 */
	public int getMaximumWeightOfVehicle() {
		return maximumWeightOfVehicle;
	}

	/**
	 * @param maximumWeightOfVehicle the maximumWeightOfVehicle to set
	 */
	public void setMaximumWeightOfVehicle(int maximumWeightOfVehicle) {
		this.maximumWeightOfVehicle = maximumWeightOfVehicle;
	}

	/**
	 * @return the rip
	 */
	public RIP getRip() {
		return rip;
	}

	/**
	 * @param rip the rip to set
	 */
	public void setRip(RIP rip) {
		this.rip = rip;
	}

	/**
	 * @return the maxPowerConsumption
	 */
	public int getMaxPowerConsumption() {
		return maxPowerConsumption;
	}

	/**
	 * @param maxPowerConsumption the maxPowerConsumption to set
	 */
	public void setMaxPowerConsumption(int maxPowerConsumption) {
		this.maxPowerConsumption = maxPowerConsumption;
	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * @return the heigth
	 */
	public int getHeigth() {
		return heigth;
	}

	/**
	 * @param heigth the heigth to set
	 */
	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}

	/**
	 * @return the depth
	 */
	public int getDepth() {
		return depth;
	}

	/**
	 * @param depth the depth to set
	 */
	public void setDepth(int depth) {
		this.depth = depth;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Printer [id=" + id + ", partNumber=" + partNumber + ", name="
				+ name + ", prise=" + prise + ", weightPrintMM="
				+ weightPrintMM + ", typePrint=" + typePrint + ", feed=" + feed
				+ ", chromaticity=" + chromaticity
				+ ", manufacturer_printhead=" + manufacturer_printhead
				+ ", typeOfPrinthead=" + typeOfPrinthead + ", compatibleInk="
				+ compatibleInk + ", typeDrops=" + typeDrops + ", sizeDrops="
				+ sizeDrops + ", speedPrint=" + speedPrint
				+ ", printResolution=" + printResolution
				+ ", equipmentManufacturer=" + equipmentManufacturer
				+ ", equipmentModel=" + equipmentModel
				+ ", interfaceConnection=" + interfaceConnection
				+ ", maximumMediaThickness=" + maximumMediaThickness
				+ ", maximumWeightOfVehicle=" + maximumWeightOfVehicle
				+ ", rip=" + rip + ", maxPowerConsumption="
				+ maxPowerConsumption + ", weight=" + weight + ", width="
				+ width + ", heigth=" + heigth + ", depth=" + depth
				+ ", description=" + description + "]";
	}
	
}
