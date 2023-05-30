package com.project.BackendV3.Dao;

import com.project.BackendV3.bean.Activite;
import com.project.BackendV3.bean.Don;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonDao extends JpaRepository<Don, Long> {


}
