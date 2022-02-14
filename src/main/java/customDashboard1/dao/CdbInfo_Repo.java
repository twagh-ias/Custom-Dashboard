package customDashboard1.dao;

import customDashboard1.model.Cdb_info;

import java.util.List;

public interface CdbInfo_Repo {
    void save(Cdb_info cdb_info);

    Cdb_info getById(int id);

    List<Cdb_info> findAllInfo();
}
