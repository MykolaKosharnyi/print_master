package entities.printer;

public class Printer {
	private int id;
	private int partNumber;// партийный номер
	private String name;//название
	private int weightPrintInch;//ширина печати в дюймах
	private int weightPrintFormat;//ширина печати в форматах
	private int weightPrintSM;//ширина печати в сантиметрах
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
	private RIP rip;//ПО RIP
	private int maxPowerConsumption;//максимальная потребляемая мощность
	private int weight;//вес
	private int width;//ширина
	private int heigth;//высота
	private int depth;//глубина
	
}
