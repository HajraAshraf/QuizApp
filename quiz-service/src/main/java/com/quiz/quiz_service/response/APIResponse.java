package com.quiz.quiz_service.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@Builder
public class APIResponse
{
    private int status;
    private int code;
    private String message;
    private Map<String,Object> data;

}
