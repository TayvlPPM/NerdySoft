package com.nerdysoft.testtask.web.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class DeleteTaskRequest {

    @NotNull
    private Long id;

}
