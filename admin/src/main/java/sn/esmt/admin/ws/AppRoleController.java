package sn.esmt.admin.ws;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sn.esmt.admin.dao.AppRoleRepository;
import sn.esmt.admin.entities.AppRoleEntity;

import java.util.List;

@RestController
@RequestMapping(value = "/roles")
@AllArgsConstructor
public class AppRoleController  {
    private final AppRoleRepository appRoleRepository;
    @PostMapping(path = "/save")
    public AppRoleEntity save(@RequestBody AppRoleEntity appRoleEntity) { return appRoleRepository.save(appRoleEntity); }
    @GetMapping(path = "/all")
    public List<AppRoleEntity> getAll() {
        return appRoleRepository.findAll();
    }
    @GetMapping(path = "/findId")
    public AppRoleEntity findById(@RequestParam int id) {
        return appRoleRepository.findById(id);
    }
    @GetMapping(path = "/findName")
    public AppRoleEntity findByName(@RequestParam String name) {
        return appRoleRepository.findByName(name);
    }
    @PutMapping(path = "/update")
    public AppRoleEntity update(@RequestBody AppRoleEntity appRoleEntity) { return appRoleRepository.save(appRoleEntity); }
    @DeleteMapping(path = "/delete")
    public void delete(@RequestBody AppRoleEntity appRoleEntity) {
        appRoleRepository.delete(appRoleEntity);
    }
}

