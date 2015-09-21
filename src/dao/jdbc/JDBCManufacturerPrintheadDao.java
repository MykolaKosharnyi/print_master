package dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.ManufacturerPrintheadDao;
import entities.printer.ManufacturerPrinthead;

public class JDBCManufacturerPrintheadDao implements ManufacturerPrintheadDao {

	@Override
	public void create(ManufacturerPrinthead manufacturerPrinthead) {
		try {
			Connection cn = null;
			try {
				cn = JdbcConnection.getInstance().getConnection();
				PreparedStatement st = null;
				try {
					st = cn.prepareStatement(
							"INSERT INTO manufacturer_printhead (typeManufacturerPrinthead, valueManufacturerPrinthead) values (?, ?)",
							Statement.RETURN_GENERATED_KEYS);
					st.setString(1, manufacturerPrinthead.name());
					st.setString(2, manufacturerPrinthead.getValueManufacturerPrinthead());
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
	public ManufacturerPrinthead find(int id) {
		ManufacturerPrinthead manufacturerPrinthead = null;
		try {
			Connection cn = null;
			try {
				JdbcConnection connection = JdbcConnection.getInstance();
				cn = connection.getConnection();
				PreparedStatement st = null;
				try {
					st = cn.prepareStatement("SELECT * FROM manufacturer_printhead WHERE idManufacturerPrinthead = ?");
					st.setInt(1, id);
					ResultSet rs = null;
					try {
						rs = st.executeQuery();
						if (rs.next()) {
							manufacturerPrinthead = ManufacturerPrinthead.valueOf(rs.getString(2));
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
		return manufacturerPrinthead;
	}

	@Override
	public int find(String typeManufacturerPrinthead) {
		int id = 0;
		try {
			Connection cn = null;
			try {
				JdbcConnection connection = JdbcConnection.getInstance();
				cn = connection.getConnection();
				PreparedStatement st = null;
				try {
					st = cn.prepareStatement("SELECT * FROM manufacturer_printhead WHERE typeManufacturerPrinthead = ?");
					st.setString(1, typeManufacturerPrinthead);
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
	public List<ManufacturerPrinthead> findAll() {
		List<ManufacturerPrinthead> manufacturerPrinthead = new ArrayList<ManufacturerPrinthead>();

		try {
			Connection cn = null;
			try {
				cn = JdbcConnection.getInstance().getConnection();
				Statement st = null;
				try {
					st = cn.createStatement();
					ResultSet rs = null;
					try {
						rs = st.executeQuery("SELECT * FROM manufacturer_printhead ");
						while (rs.next()) {
							manufacturerPrinthead.add(ManufacturerPrinthead.valueOf(rs.getString(2)));
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
		return manufacturerPrinthead;
	}

	@Override
	public void update(int id, ManufacturerPrinthead manufacturerPrinthead) {
		try {
			Connection cn = null;
			try {
				JdbcConnection connection = JdbcConnection.getInstance();
				cn = connection.getConnection();
				PreparedStatement st = null;
				try {
					st = cn.prepareStatement("UPDATE manufacturer_printhead SET (typeManufacturerPrinthead = ?, valueManufacturerPrinthead = ?) WHERE idManufacturerPrinthead = ?");
					st.setString(1, manufacturerPrinthead.name());
					st.setString(2, manufacturerPrinthead.getValueManufacturerPrinthead());
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
					st = cn.prepareStatement("DELETE FROM manufacturer_printhead WHERE idManufacturerPrinthead = ?");
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
