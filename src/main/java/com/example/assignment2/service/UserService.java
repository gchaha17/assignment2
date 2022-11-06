package com.example.assignment2.service;

import com.example.assignment2.model.Album;
import com.example.assignment2.repoistery.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo u3;

    public Album saveAlbum(Album al) {
        return u3.saveAlbum(al);
    }

    public Album getAlbum() {
        return u3.getAlbum();
    }

    public List<Album> getAllAlbum() {
        return  u3.getAllAlbum();
    }

    public Album getalbumbyId(int albumId) {
        return u3.getalbumbyId(albumId);
    }

    public Album updateAlbum(int albumId, Album al) {
        return u3.updateAlbum(albumId,al);
    }

    public Album deleteAlbum(int albumId) {
        return u3.deleteAlbum(albumId);
}}
