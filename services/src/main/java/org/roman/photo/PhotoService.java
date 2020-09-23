package org.roman.photo;

import org.roman.model.photo.Photo;

public interface PhotoService {

    void savePhoto(Photo photo);
    void commentPhoto(long id);
    Byte[] getPhoto(long id);
}
