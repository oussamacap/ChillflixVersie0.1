package com.devglan.videoportal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
//@RequestMapping({"/api"})
@RequestMapping({"/videos"})
public class VideoController {

    @Autowired
    private VideoService videoService;

    @PostMapping
    public Video create(@RequestBody Video video){
        return videoService.create(video);
    }

    @GetMapping(path = {"/{id}"})
    public Video findById(@PathVariable("id") int id){
        return videoService.findById(id);
    }

    @PutMapping(path = {"/{id}"})
    public Video update(@PathVariable("id") int id, @RequestBody Video video){
        video.setId(id);
        return videoService.update(video);
    }

    @DeleteMapping(path ={"/{id}"})
    public Video delete(@PathVariable("id") int id) {
        return videoService.delete(id);
    }

    @GetMapping
    public List<Video> findAll(){
        return videoService.findAll();
    }
}
