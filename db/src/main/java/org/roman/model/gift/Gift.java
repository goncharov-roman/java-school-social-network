package org.roman.model.gift;

import java.time.LocalDateTime;

public class Gift {

    private long id;
    private GiftEnum type;
    private long fromId;
    private long toId;
    private LocalDateTime createdAt;
}
