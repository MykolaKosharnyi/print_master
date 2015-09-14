package entities.printer;

public class Printer {
	private int id;
	private int partNumber;// ��������� �����
	private String name;//��������
	private int weightPrintInch;//������ ������ � ������
	private int weightPrintFormat;//������ ������ � ��������
	private int weightPrintSM;//������ ������ � �����������
	private TypePrint typePrint;//��� ������
	private Feed feed; //������ ���������
	private Chromaticity chromaticity;// ���������
	private ManufacturerPrinthead manufacturer_printhead;//������������� ���������� �������
	private TypeOfPrinthead typeOfPrinthead;//��� ���������� �������
	private CompatibleInk compatibleInk;//����������� �������
	private TypeDrops typeDrops;//��� �����
	private SizeDrops sizeDrops;//������ �����
	private int speedPrint;//�������� ������
	private PrintResolution printResolution;//���������� ������
	private EquipmentManufacturer equipmentManufacturer;//������������� ������������
	private String equipmentModel;//������ ������������
	private InterfaceConnection interfaceConnection;//��������� �����������
	private int maximumMediaThickness;//������������ ������� ��������
	private int maximumWeightOfVehicle;//������������ ��� ��������
	private RIP rip;//�� RIP
	private int maxPowerConsumption;//������������ ������������ ��������
	private int weight;//���
	private int width;//������
	private int heigth;//������
	private int depth;//�������
	
}
