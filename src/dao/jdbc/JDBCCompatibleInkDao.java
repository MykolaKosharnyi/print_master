package dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.CompatibleInkDao;
import entities.printer.CompatibleInk;

public class JDBCCompatibleInkDao implements CompatibleInkDao {

	@Override
	public void create(CompatibleInk compatibleInk) {
		try {
			Connection cn = null;
			try {
				cn = JdbcConnection.getInstance().getConnection();
				PreparedStatement st = null;
				try {
					st = cn.prepareStatement(
							"INSERT INTO ñompatible_ink (typeCompatibleInk, valueCompatibleInk) values (?, ?)",
							Statement.RETURN_GENERATED_KEYS);
					st.setString(1, compatibleInk.name());
					st.setString(2, compatibleInk.getValueCompatibleInk());
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
	public CompatibleInk find(int id) {
		CompatibleInk compatibleInk = null;
		try {
			Connection cn = null;
			try {
				JdbcConnection connection = JdbcConnection.getInstance();
				cn = connection.getConnection();
				PreparedStatement st = null;
				try {
					st = cn.prepareStatement("SELECT * FROM ñompatible_ink WHERE idCompatibleInk = ?");
					st.setInt(1, id);
					ResultSet rs = null;
					try {
						rs = st.executeQuery();
						if (rs.next()) {
							compatibleInk = CompatibleInk.valueOf(rs.getString(2));
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
		return compatibleInk;
	}

	@Override
	public int find(String typeCompatibleInk) {
		int id = 0;
		try {
			Connection cn = null;
			try {
				JdbcConnection connection = JdbcConnection.getInstance();
				cn = connection.getConnection();
				PreparedStatement st = null;
				try {
					st = cn.prepareStatement("SELECT * FROM ñompatible_ink WHERE typeCompatibleInk = ?");
					st.setString(1, typeCompatibleInk);
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
	public List<CompatibleInk> findAll() {
		List<CompatibleInk> compatibleInk = new ArrayList<CompatibleInk>();

		try {
			Connection cn = null;
			try {
				cn = JdbcConnection.getInstance().getConnection();
				Statement st = null;
				try {
					st = cn.createStatement();
					ResultSet rs = null;
					try {
						rs = st.executeQuery("SELECT * FROM ñompatible_ink ");
						while (rs.next()) {
							compatibleInk.add(CompatibleInk.valueOf(rs.getString(2)));
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
		return compatibleInk;
	}

	@Override
	public void update(int id, CompatibleInk compatibleInk) {
		try {
			Connection cn = null;
			try {
				JdbcConnection connection = JdbcConnection.getInstance();
				cn = connection.getConnection();
				PreparedStatement st = null;
				try {
					st = cn.prepareStatement("UPDATE ñompatible_ink SET (typeCompatibleInk = ?, valueCompatibleInk = ?) WHERE idCompatibleInk = ?");
					st.setString(1, compatibleInk.name());
					st.setString(2, compatibleInk.getValueCompatibleInk());
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
					st = cn.prepareStatement("DELETE FROM ñompatible_ink WHERE idCompatibleInk = ?");
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
