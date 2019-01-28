package com.devglan.videoportal;

import org.springframework.data.repository.Repository;

import java.util.List;

//ik weet niet waarom deze klasse moet worden aangemaakt

public interface VideoRepository  extends Repository<Video, Integer> {

    void delete(Video video);

    List<Video> findAll();

    Video findById(int id);

    Video save(Video video);
}
