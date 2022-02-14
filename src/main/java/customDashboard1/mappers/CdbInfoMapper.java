package customDashboard1.mappers;

import customDashboard1.model.Cdb_info;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CdbInfoMapper implements RowMapper<Cdb_info> {

    @Override
    public Cdb_info mapRow(ResultSet rs, int rowNum) throws SQLException {
        Cdb_info c = new Cdb_info();
        c.setId(rs.getString("id"));
        c.setSecret(rs.getString("secret"));
        return c;
    }
}
