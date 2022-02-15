package customDashboard1.dao;

import customDashboard1.mappers.CdbInfoMapper;
import customDashboard1.model.Cdb_info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Types;
import java.util.List;

@Repository
public class CdbInfo_RepoImpl implements CdbInfo_Repo{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static final String insert_query="insert into cdb_info(id, secret) values(?,?)";

    private static final String get_all_cdbInfo="select id, secret from cdb_info where id=?";

    private static final String get_all_info="select * from cdb_info";

    private static final String update_query="update cdb_info set id=?, secret=? where id=?";

    @Override
    public void save(Cdb_info cdb_info) {
        int[] types = {Types.VARCHAR, Types.VARCHAR};
        Object[] args={cdb_info.getId(),cdb_info.getSecret()};
        jdbcTemplate.update(insert_query,args,types);
    }

    @Override
    public Cdb_info getById(int id) {
        return jdbcTemplate.queryForObject(get_all_cdbInfo,
                new Object[]{id},new CdbInfoMapper());
    }

    @Override
    public List<Cdb_info> findAllInfo(){
        List<Cdb_info> cdb_infos=jdbcTemplate.query(get_all_info,new CdbInfoMapper());
        return cdb_infos;
    }

    @Override
    public int updateInfo(Cdb_info cdb_info, long id){
        Object[] params = {cdb_info.getId(),cdb_info.getSecret(),id};
        int[] types = {Types.VARCHAR, Types.VARCHAR, Types.LONGVARCHAR};
        return jdbcTemplate.update(update_query,params,types);
    }
}
