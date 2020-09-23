package org.roman.repository;

import org.roman.model.photo.Photo;

public interface PhotoRepository {

    void savePhoto(Photo photo);
    void commentPhoto(long id);
    Byte[] getPhoto(long id);
}
