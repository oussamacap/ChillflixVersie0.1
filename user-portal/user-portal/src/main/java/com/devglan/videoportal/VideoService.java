package com.devglan.videoportal;



import java.util.List;

// Deze interface is gemaakt om methode's aan te maken die gebruikt zullen worden om te comminuren tussen de database en de frontend angular

public interface VideoService {
    Video create(Video video);

    Video delete(int id);

    List<Video> findAll();

    Video findById(int id);

    Video update(Video video);
}
