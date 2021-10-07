package in.corejava.ipl;

import java.sql.Connection;

public interface JDBCAccess extends DataBaseAccess{

	Connection getConnection();
	void createDBSchema();
	void destroyDBSchema();
}
