package customDashboard1.services;

import customDashboard1.dao.CdbInfo_Repo;
import customDashboard1.model.Cdb_info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Cdb_info_serviceImpl implements Cdb_info_service {

    @Autowired
    CdbInfo_Repo cdbInfo_repo;

    @Override
    public void save(Cdb_info cdb_info){
        cdbInfo_repo.save(cdb_info);
    }

    @Override
    public Cdb_info getById(int id){
        return cdbInfo_repo.getById(id);
    }

    @Override
    public List<Cdb_info> findAllInfo(){
        return cdbInfo_repo.findAllInfo();
    }
}
