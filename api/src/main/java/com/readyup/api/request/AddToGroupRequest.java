package com.readyup.api.request;

import lombok.Data;

@Data
public class AddToGroupRequest {
    private String username;
    private String groupUid;
}

