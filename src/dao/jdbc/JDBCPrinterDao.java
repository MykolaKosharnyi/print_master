package dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.PrinterDao;
import entities.printer.Printer;

public class JDBCPrinterDao implements PrinterDao {

	@Override
	public void create(Printer printer) {
		try {
			Connection cn = null;
			try {
				cn = JdbcConnection.getInstance().getConnection();
				PreparedStatement st = null;
				try {
					st = cn.prepareStatement("INSERT INTO printers (part_number, name, prise, weight_print_mm,"
							+ " idTypePrint, idFeed, idChromaticity, idManufacturerPrinthead,"
							+ " idTypeOfPrinthead, idCompatibleInk, idTypeDrops, idSizeDrop,"
							+ " speed_print, idPrintResolution, idEquipmentManufacturer, equipment_model,"
							+ " idInterfaceConnection, maximum_media_thickness, maximum_weight_of_vehicle, idRIP,"
							+ " max_power_consumption, weight, width, heigth,"
							+ " depth, description) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
							+ " ?, ?, ?, ?, ?, ?, ?)"
                            , Statement.RETURN_GENERATED_KEYS);
					st.setString(1, printer.getPartNumber());
					st.setString(2, printer.getName());
					st.setLong(3, printer.getPrise());
					st.setInt(4, printer.getWeightPrintMM());
					st.setInt(5, new JDBCDaoFactory().createTypePrintDao().find(printer.getTypePrint().name()));
					st.setInt(6, new JDBCDaoFactory().createFeedDao().find(printer.getFeed().name()));
					st.setInt(7, new JDBCDaoFactory().createChromaticityDao().find(printer.getChromaticity().name()));
					st.setInt(8, new JDBCDaoFactory().createManufacturerPrintheadDao().find(printer.getManufacturerPrinthead().name()));
					st.setInt(9, new JDBCDaoFactory().createTypeOfPrintheadDao().find(printer.getTypeOfPrinthead().name()));
					st.setInt(10, new JDBCDaoFactory().createCompatibleInkDao().find(printer.getCompatibleInk().name()));
					st.setInt(11, new JDBCDaoFactory().createTypeDropsDao().find(printer.getTypeDrops().name()));
					st.setInt(12, new JDBCDaoFactory().createSizeDropsDao().find(printer.getSizeDrops().name()));
					st.setInt(13, printer.getSpeedPrint());
					st.setInt(14, new JDBCDaoFactory().createPrintResolutionDao().find(printer.getPrintResolution().name()));
					st.setInt(15, new JDBCDaoFactory().createEquipmentManufacturerDao().find(printer.getEquipmentManufacturer().name()));
					st.setString(16, printer.getEquipmentModel());
					st.setInt(17, new JDBCDaoFactory().createInterfaceConnectionDao().find(printer.getInterfaceConnection().name()));
					st.setInt(18, printer.getMaximumMediaThickness());
					st.setInt(19, printer.getMaximumWeightOfVehicle());
					st.setInt(20, new JDBCDaoFactory().createRipDao().find(printer.getRip().name()));
					st.setInt(21, printer.getMaxPowerConsumption());
					st.setInt(22, printer.getWeight());
					st.setInt(23, printer.getWidth());
					st.setInt(24, printer.getHeigth());
					st.setInt(25, printer.getDepth());
					st.setString(26, printer.getDescription());

		            st.executeUpdate();

					ResultSet key = null;
					try {
						key = st.getGeneratedKeys();
						int userId = 0;
			            if( key.next() ){
			            	userId = key.getInt(1);
			            }
			            printer.setId(userId);
					} finally {
						if (key != null)
							key.close();
							key=null;
					}
				} finally {
					if (st != null)
						st.close();
						st=null;
				}
			} finally {
				if (cn != null)
					cn.close();
					cn=null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Printer find(int id) {
		Printer printer = null;
		try {
			Connection cn = null;
			try {
				JdbcConnection connection = JdbcConnection.getInstance();
				cn = connection.getConnection();
				PreparedStatement st = null;
				try {
					st = cn.prepareStatement("SELECT * FROM printers WHERE ID = ?");
					st.setInt(1, id);
					ResultSet rs = null;
					try {
						rs = st.executeQuery();
						 if( rs.next() ){
							 printer = new Printer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5),
									 new JDBCDaoFactory().createTypePrintDao().find(rs.getInt(6)), new JDBCDaoFactory().createFeedDao().find(rs.getInt(7)),
									 new JDBCDaoFactory().createChromaticityDao().find(rs.getInt(8)), new JDBCDaoFactory().createManufacturerPrintheadDao().find(rs.getInt(9)),
									 new JDBCDaoFactory().createTypeOfPrintheadDao().find(rs.getInt(10)), new JDBCDaoFactory().createCompatibleInkDao().find(rs.getInt(11)),
									 new JDBCDaoFactory().createTypeDropsDao().find(rs.getInt(12)), new JDBCDaoFactory().createSizeDropsDao().find(rs.getInt(13)),
									 rs.getInt(14), new JDBCDaoFactory().createPrintResolutionDao().find(rs.getInt(15)),
									 new JDBCDaoFactory().createEquipmentManufacturerDao().find(rs.getInt(16)), rs.getString(17),
									 new JDBCDaoFactory().createInterfaceConnectionDao().find(rs.getInt(18)), rs.getInt(19),
									 rs.getInt(20), new JDBCDaoFactory().createRipDao().find(rs.getInt(21)),
									 rs.getInt(22), rs.getInt(23),
									 rs.getInt(24), rs.getInt(25),
									 rs.getInt(26), rs.getString(27));
				            }
					} finally {
						if (rs != null)
							rs.close();
							rs=null;
					}
				} finally {
					if (st != null)
						st.close();
						st=null;
				}
			} finally {
				if (cn != null)
					cn.close();
					cn=null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return printer;
	}

	@Override
	public List<Printer> findAll() {
		List<Printer> printer = new ArrayList<Printer>();
		 
		try {
			Connection cn = null;
			try {
				cn = JdbcConnection.getInstance().getConnection();
				Statement st = null;
				try {
					st = cn.createStatement();
					ResultSet rs = null;
					try {
						rs = st.executeQuery("SELECT * FROM printers ");
						 while (rs.next()) {
							 printer.add(new Printer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5),
									 new JDBCDaoFactory().createTypePrintDao().find(rs.getInt(6)), new JDBCDaoFactory().createFeedDao().find(rs.getInt(7)),
									 new JDBCDaoFactory().createChromaticityDao().find(rs.getInt(8)), new JDBCDaoFactory().createManufacturerPrintheadDao().find(rs.getInt(9)),
									 new JDBCDaoFactory().createTypeOfPrintheadDao().find(rs.getInt(10)), new JDBCDaoFactory().createCompatibleInkDao().find(rs.getInt(11)),
									 new JDBCDaoFactory().createTypeDropsDao().find(rs.getInt(12)), new JDBCDaoFactory().createSizeDropsDao().find(rs.getInt(13)),
									 rs.getInt(14), new JDBCDaoFactory().createPrintResolutionDao().find(rs.getInt(15)),
									 new JDBCDaoFactory().createEquipmentManufacturerDao().find(rs.getInt(16)), rs.getString(17),
									 new JDBCDaoFactory().createInterfaceConnectionDao().find(rs.getInt(18)), rs.getInt(19),
									 rs.getInt(20), new JDBCDaoFactory().createRipDao().find(rs.getInt(21)),
									 rs.getInt(22), rs.getInt(23),
									 rs.getInt(24), rs.getInt(25),
									 rs.getInt(26), rs.getString(27)));
				            }
					} finally {
						if (rs != null)
							rs.close();
							rs=null;
					}
				} finally {
					if (st != null)
						st.close();
						st=null;
				}
			} finally {
				if (cn != null)
					cn.close();
					cn=null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
        return printer;
	}

	@Override
	public void update(Printer printer) {
		try {
			Connection cn = null;
			try {
				JdbcConnection connection = JdbcConnection.getInstance();
				cn = connection.getConnection();
				PreparedStatement st = null;
				try {
					st = cn.prepareStatement("UPDATE printers SET part_number = ?, name = ?, prise = ?, weight_print_mm = ?,"
							+ " idTypePrint = ?, idFeed = ?, idChromaticity = ?, idManufacturerPrinthead = ?,"
							+ " idTypeOfPrinthead = ?, idCompatibleInk = ?, idTypeDrops = ?, idSizeDrop = ?,"
							+ " speed_print = ?, idPrintResolution = ?, idEquipmentManufacturer = ?, equipment_model = ?,"
							+ " idInterfaceConnection = ?, maximum_media_thickness = ?, maximum_weight_of_vehicle = ?, idRIP = ?,"
							+ " max_power_consumption = ?, weight = ?, width = ?, heigth = ?,"
							+ " depth = ?, description = ? WHERE id = ? ");
					st.setString(1, printer.getPartNumber());
					st.setString(2, printer.getName());
					st.setLong(3, printer.getPrise());
					st.setInt(4, printer.getWeightPrintMM());
					st.setInt(5, new JDBCDaoFactory().createTypePrintDao().find(printer.getTypePrint().name()));
					st.setInt(6, new JDBCDaoFactory().createFeedDao().find(printer.getFeed().name()));
					st.setInt(7, new JDBCDaoFactory().createChromaticityDao().find(printer.getChromaticity().name()));
					st.setInt(8, new JDBCDaoFactory().createManufacturerPrintheadDao().find(printer.getManufacturerPrinthead().name()));
					st.setInt(9, new JDBCDaoFactory().createTypeOfPrintheadDao().find(printer.getTypeOfPrinthead().name()));
					st.setInt(10, new JDBCDaoFactory().createCompatibleInkDao().find(printer.getCompatibleInk().name()));
					st.setInt(11, new JDBCDaoFactory().createTypeDropsDao().find(printer.getTypeDrops().name()));
					st.setInt(12, new JDBCDaoFactory().createSizeDropsDao().find(printer.getSizeDrops().name()));
					st.setInt(13, printer.getSpeedPrint());
					st.setInt(14, new JDBCDaoFactory().createPrintResolutionDao().find(printer.getPrintResolution().name()));
					st.setInt(15, new JDBCDaoFactory().createEquipmentManufacturerDao().find(printer.getEquipmentManufacturer().name()));
					st.setString(16, printer.getEquipmentModel());
					st.setInt(17, new JDBCDaoFactory().createInterfaceConnectionDao().find(printer.getInterfaceConnection().name()));
					st.setInt(18, printer.getMaximumMediaThickness());
					st.setInt(19, printer.getMaximumWeightOfVehicle());
					st.setInt(20, new JDBCDaoFactory().createRipDao().find(printer.getRip().name()));
					st.setInt(21, printer.getMaxPowerConsumption());
					st.setInt(22, printer.getWeight());
					st.setInt(23, printer.getWidth());
					st.setInt(24, printer.getHeigth());
					st.setInt(25, printer.getDepth());
					st.setString(26, printer.getDescription());
					st.setInt(27, printer.getId());
		            st.executeUpdate();

				} finally {
					if (st != null)
						st.close();
						st=null;
				}
			} finally {
				if (cn != null)
					cn.close();
					cn=null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id) {
		try {
			Connection cn = null;
			try {
				cn = JdbcConnection.getInstance().getConnection();
				PreparedStatement st = null;
				try {
					st = cn.prepareStatement("DELETE FROM printers WHERE id = ?");
					st.setInt(1, id);
		            st.executeUpdate();

				} finally {
					if (st != null)
						st.close();
						st=null;
				}
			} finally {
				if (cn != null)
					cn.close();
					cn=null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
