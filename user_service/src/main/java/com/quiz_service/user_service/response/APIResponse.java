package com.quiz_service.user_service.response;

import java.util.Map;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder(toBuilder = true)
@JsonInclude(Include.NON_NULL)
public class APIResponse {

    private  int status;

    private String message;

    private boolean success;

    private Map<String, Object> data;


}
