package com.project.BackendV3.Dao;

import com.project.BackendV3.bean.Activite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActiviteDao extends JpaRepository<Activite, Long> {


}
