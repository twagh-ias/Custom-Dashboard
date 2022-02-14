package customDashboard1.services;

import customDashboard1.model.Cdb_info;

import java.util.List;

public interface Cdb_info_service {
   void save(Cdb_info cdb_info);

   Cdb_info getById(int id);

   List<Cdb_info> findAllInfo();
}
