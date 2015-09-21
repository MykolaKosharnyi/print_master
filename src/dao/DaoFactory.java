package dao;

import java.util.Properties;

public abstract class DaoFactory {
	public abstract PrinterDao createPrinterDao();
	
	public abstract ChromaticityDao createChromaticityDao();
	public abstract CompatibleInkDao createCompatibleInkDao();
	public abstract EquipmentManufacturerDao createEquipmentManufacturerDao();
	public abstract FeedDao createFeedDao();
	public abstract InterfaceConnectionDao createInterfaceConnectionDao();
	public abstract ManufacturerPrintheadDao createManufacturerPrintheadDao();
	public abstract PrintResolutionDao createPrintResolutionDao();
	public abstract RipDao createRipDao();
	public abstract SizeDropsDao createSizeDropsDao();
	public abstract TypeDropsDao createTypeDropsDao();
	public abstract TypeOfPrintheadDao createTypeOfPrintheadDao();
	public abstract TypePrintDao createTypePrintDao();
	
	    public static DaoFactory getInstance(){
	        try {
	            Properties config = new Properties();
	            return (DaoFactory) Class.forName(config.getProperty("dao.factory", "dao.jdbc.JDBCDaoFactory")).newInstance();
	        } catch (Exception ex) {
	            return null;
	        }
	    }
	}
