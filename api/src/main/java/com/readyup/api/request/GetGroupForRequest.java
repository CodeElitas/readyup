package com.readyup.api.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GetGroupForRequest {

    private String personName;
    private Long id;
}
