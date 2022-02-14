package customDashboard1.controller;

import customDashboard1.dao.CdbInfo_Repo;
import customDashboard1.model.Cdb_info;
import customDashboard1.services.Cdb_info_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customDashboard")
@CrossOrigin("http://localhost:3000/")
public class ApiRestController {

    @Autowired
    Cdb_info_service cdb_info_service;

    @Autowired
    CdbInfo_Repo cdbInfo_repo;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @PostMapping("/InsertInfo")
    public void save(Cdb_info cdb_info)
    {
        cdb_info_service.save(cdb_info);
    }

    @GetMapping("/getInfo/{id}")
    public Cdb_info getById(@PathVariable int id)
    {
        return cdb_info_service.getById(id);
    }

    @GetMapping("/getAll")
    public List<Cdb_info> getAll(){
        return cdb_info_service.findAllInfo();
    }

}
