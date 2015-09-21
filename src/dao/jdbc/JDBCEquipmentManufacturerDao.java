package dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.EquipmentManufacturerDao;
import entities.printer.EquipmentManufacturer;

public class JDBCEquipmentManufacturerDao implements EquipmentManufacturerDao {

	@Override
	public void create(EquipmentManufacturer equipmentManufacturer) {
		try {
			Connection cn = null;
			try {
				cn = JdbcConnection.getInstance().getConnection();
				PreparedStatement st = null;
				try {
					st = cn.prepareStatement(
							"INSERT INTO equipment_manufacturer (typeEquipmentManufacturer, valueEquipmentManufacturer) values (?, ?)",
							Statement.RETURN_GENERATED_KEYS);
					st.setString(1, equipmentManufacturer.name());
					st.setString(2, equipmentManufacturer.getValueEquipmentManufacturer());
					st.executeUpdate();

				} finally {
					if (st != null)
						st.close();
					st = null;
				}
			} finally {
				if (cn != null)
					cn.close();
				cn = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public EquipmentManufacturer find(int id) {
		EquipmentManufacturer equipmentManufacturer = null;
		try {
			Connection cn = null;
			try {
				JdbcConnection connection = JdbcConnection.getInstance();
				cn = connection.getConnection();
				PreparedStatement st = null;
				try {
					st = cn.prepareStatement("SELECT * FROM equipment_manufacturer WHERE idEquipmentManufacturer = ?");
					st.setInt(1, id);
					ResultSet rs = null;
					try {
						rs = st.executeQuery();
						if (rs.next()) {
							equipmentManufacturer = EquipmentManufacturer.valueOf(rs.getString(2));
						}
					} finally {
						if (rs != null)
							rs.close();
						rs = null;
					}
				} finally {
					if (st != null)
						st.close();
					st = null;
				}
			} finally {
				if (cn != null)
					cn.close();
				cn = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return equipmentManufacturer;
	}

	@Override
	public int find(String typeEquipmentManufacturer) {
		int id = 0;
		try {
			Connection cn = null;
			try {
				JdbcConnection connection = JdbcConnection.getInstance();
				cn = connection.getConnection();
				PreparedStatement st = null;
				try {
					st = cn.prepareStatement("SELECT * FROM equipment_manufacturer WHERE typeEquipmentManufacturer = ?");
					st.setString(1, typeEquipmentManufacturer);
					ResultSet rs = null;
					try {
						rs = st.executeQuery();
						if (rs.next()) {
							id = rs.getInt(1);
						}
					} finally {
						if (rs != null)
							rs.close();
						rs = null;
					}
				} finally {
					if (st != null)
						st.close();
					st = null;
				}
			} finally {
				if (cn != null)
					cn.close();
				cn = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return id;
	}

	@Override
	public List<EquipmentManufacturer> findAll() {
		List<EquipmentManufacturer> equipmentManufacturer = new ArrayList<EquipmentManufacturer>();

		try {
			Connection cn = null;
			try {
				cn = JdbcConnection.getInstance().getConnection();
				Statement st = null;
				try {
					st = cn.createStatement();
					ResultSet rs = null;
					try {
						rs = st.executeQuery("SELECT * FROM equipment_manufacturer ");
						while (rs.next()) {
							equipmentManufacturer.add(EquipmentManufacturer.valueOf(rs.getString(2)));
						}
					} finally {
						if (rs != null)
							rs.close();
						rs = null;
					}
				} finally {
					if (st != null)
						st.close();
					st = null;
				}
			} finally {
				if (cn != null)
					cn.close();
				cn = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return equipmentManufacturer;
	}

	@Override
	public void update(int id, EquipmentManufacturer equipmentManufacturer) {
		try {
			Connection cn = null;
			try {
				JdbcConnection connection = JdbcConnection.getInstance();
				cn = connection.getConnection();
				PreparedStatement st = null;
				try {
					st = cn.prepareStatement("UPDATE equipment_manufacturer SET (typeEquipmentManufacturer = ?, valueEquipmentManufacturer = ?) WHERE idEquipmentManufacturer = ?");
					st.setString(1, equipmentManufacturer.name());
					st.setString(2, equipmentManufacturer.getValueEquipmentManufacturer());
					st.setInt(3, id);
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
					st = cn.prepareStatement("DELETE FROM equipment_manufacturer WHERE idEquipmentManufacturer = ?");
					st.setInt(1, id);
					st.executeUpdate();

				} finally {
					if (st != null)
						st.close();
					st = null;
				}
			} finally {
				if (cn != null)
					cn.close();
				cn = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
