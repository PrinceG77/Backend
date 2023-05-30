package com.project.BackendV3.Dao;

import com.project.BackendV3.bean.Don;
import com.project.BackendV3.bean.InformationsCentre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InformationsCentreDao extends JpaRepository<InformationsCentre, Long> {


}
