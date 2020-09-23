package org.roman.model.photo;

import java.time.LocalDateTime;

public class Photo {

    private long id;
    private String comment;
    private Byte[] object;
    private LocalDateTime createdAt;

    public Photo(Byte[] object) {
        this.object = object;
        this.comment = "";
        this.createdAt = LocalDateTime.now();
    }
}
