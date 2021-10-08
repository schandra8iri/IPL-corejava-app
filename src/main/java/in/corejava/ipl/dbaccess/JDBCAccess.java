package in.corejava.ipl.dbaccess;

import java.sql.Connection;

import in.corejava.ipl.dbaccess.DataBaseAccess;

public interface JDBCAccess extends DataBaseAccess{

	Connection getConnection();
	void createDBSchema();
	void destroyDBSchema();
}
