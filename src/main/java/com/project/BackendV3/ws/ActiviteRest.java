package com.project.BackendV3.ws;

import com.project.BackendV3.bean.Activite;
import com.project.BackendV3.service.ActiviteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/activites")
public class ActiviteRest {
    @Autowired
    private ActiviteService activiteService;

    @GetMapping("/all")
    public List<Activite> findAll() {
        return activiteService.findAll();
    }

    @GetMapping("/get/{id}")
    public Optional<Activite> findById(@PathVariable Long aLong) {
        return activiteService.findById(aLong);
    }

    @GetMapping("/welcome")
    public String welcome(){
        return "welcome to this non secured page";
    }

    @PostMapping("/add")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String save(@RequestBody Activite activite) {
        return activiteService.save(activite);
    }




    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long aLong) {
        activiteService.deleteById(aLong);
    }

    @PutMapping("/update")
    public Activite update(@RequestBody Activite activite) {
        return activiteService.update(activite);
    }
}
