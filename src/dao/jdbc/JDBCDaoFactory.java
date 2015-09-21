package dao.jdbc;

import dao.ChromaticityDao;
import dao.CompatibleInkDao;
import dao.DaoFactory;
import dao.EquipmentManufacturerDao;
import dao.FeedDao;
import dao.InterfaceConnectionDao;
import dao.ManufacturerPrintheadDao;
import dao.PrintResolutionDao;
import dao.PrinterDao;
import dao.RipDao;
import dao.SizeDropsDao;
import dao.TypeDropsDao;
import dao.TypeOfPrintheadDao;
import dao.TypePrintDao;

public class JDBCDaoFactory extends DaoFactory {

	@Override
	public PrinterDao createPrinterDao() {
		return new JDBCPrinterDao();
	}

	@Override
	public ChromaticityDao createChromaticityDao() {
		return new JDBCChromaticityDao();
	}

	@Override
	public CompatibleInkDao createCompatibleInkDao() {
		return new JDBCCompatibleInkDao();
	}

	@Override
	public EquipmentManufacturerDao createEquipmentManufacturerDao() {
		return new JDBCEquipmentManufacturerDao();
	}

	@Override
	public FeedDao createFeedDao() {
		return new JDBCFeedDao();
	}

	@Override
	public InterfaceConnectionDao createInterfaceConnectionDao() {
		return new JDBCInterfaceConnectionDao();
	}

	@Override
	public ManufacturerPrintheadDao createManufacturerPrintheadDao() {
		return new JDBCManufacturerPrintheadDao();
	}

	@Override
	public PrintResolutionDao createPrintResolutionDao() {
		return new JDBCPrintResolutionDao();
	}

	@Override
	public RipDao createRipDao() {
		return new JDBCRipDao();
	}

	@Override
	public SizeDropsDao createSizeDropsDao() {
		return new JDBCSizeDropsDao();
	}

	@Override
	public TypeDropsDao createTypeDropsDao() {
		return new JDBCTypeDropsDao();
	}

	@Override
	public TypeOfPrintheadDao createTypeOfPrintheadDao() {
		return new JDBCTypeOfPrintheadDao();
	}

	@Override
	public TypePrintDao createTypePrintDao() {
		return new JDBCTypePrintDao();
	}

}
