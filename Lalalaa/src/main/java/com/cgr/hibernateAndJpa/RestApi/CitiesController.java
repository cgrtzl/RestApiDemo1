package com.cgr.hibernateAndJpa.RestApi;

import com.cgr.hibernateAndJpa.Entities.Cities;
import com.cgr.hibernateAndJpa.Service.ICitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CitiesController {
    private ICitiesService citiesService;

    @Autowired
    public CitiesController(ICitiesService citiesService) {
        this.citiesService = citiesService;
    }
    @GetMapping("/cities")
    public List<Cities> get(){
        return citiesService.getAll();
    }
    @PostMapping("/add")
    public void add(@RequestBody Cities cities){citiesService.add(cities);}
    @PostMapping("/update")
    public void update(@RequestBody Cities cities){citiesService.update(cities);}
    @PostMapping("/delete")
    public void delete(@RequestBody Cities cities){citiesService.delete(cities);}
    @GetMapping("/cities/{id}")
    public Cities getById(@PathVariable int id){
        return citiesService.getById(id);
    }

}
