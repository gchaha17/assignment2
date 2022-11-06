package com.example.assignment2.resource;

import com.example.assignment2.model.Album;
import com.example.assignment2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserResource {
    @Autowired
    private UserService u2;


    @GetMapping("/album1")
    public Album getAlbum() {
        return u2.getAlbum();

    }

    @PostMapping("/album")
    public Album saveAlbum(@RequestBody Album al) {

        return u2.saveAlbum(al);

    }

    @GetMapping("/album")
    public List<Album> getAllAlbum() {
        return u2.getAllAlbum();

    }

    @GetMapping("/album/{albumId}")
    public Album getalbumbyId(@PathVariable("albumId") int albumId) {

        return u2.getalbumbyId(albumId);

    }

    @PutMapping("/album/{albumId}")
    public Album updateAlbum(@PathVariable("albumId") int albumId, @RequestBody Album al) {

        return u2.updateAlbum(albumId, al);
    }

    @DeleteMapping("/album")
    public Album deleteAlbum(@RequestParam(name = "albumId") int albumId) {
        return u2.deleteAlbum(albumId);

    }
}
