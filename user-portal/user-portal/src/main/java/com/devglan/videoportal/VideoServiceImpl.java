package com.devglan.videoportal;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoRepository repository;

    @Override
    public Video create(Video video) {
        return repository.save(video);
    }

    //hier later nakijken
    @Override
    public Video delete(int id) {
        Video video = findById(id);
        if(video != null){
            repository.delete(video);
        }
        return video;
    }

    @Override
    public List<Video> findAll() {

        return repository.findAll();
    }

    @Override
    public Video findById(int id) {

        return repository.findById(id);
    }

    @Override
    public Video update(Video video) {

        return repository.save(video);
    }
}
