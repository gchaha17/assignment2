package com.example.assignment2.repoistery;

import com.example.assignment2.model.Album;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepo {

    List<Album> userlist=new ArrayList<>();



    public Album saveAlbum(Album al) {
        al.setAlbumId(userlist.size() +1);
        userlist.add(al);
        return al;
    }

    public Album getAlbum() {
        Album al=new Album("gagan","birthday","chaha/documents");
        return al;
    }

    public List<Album> getAllAlbum() {
        return userlist;
    }

    public Album getalbumbyId(int albumId) {
        for(Album al:userlist)
        {
            if(al.getAlbumId()==albumId)
            {

                return al;
            }


        }
        return null;
    }

    public Album updateAlbum(int albumId, Album al) {
        for(Album al1:userlist)
        {
            if(al1.getAlbumId()==albumId)
            {
                al1.setName(al.getName());
                al1.setDescription(al.getDescription());
                al1.setCoverPicUrl(al.getCoverPicUrl());

            }

        }
        return null;
    }

    public Album deleteAlbum(int albumId) {
        Album d1=null;

        for(Album al:userlist)
        {
            if(al.getAlbumId()==albumId)
            {
                d1=al;
                userlist.remove(al);
                return d1;

            }


        }
        return d1;
    }
}
