package com.egomaa.ems.bussiness.model;

import lombok.Getter;
import lombok.Setter;

/**
 * DTO for {@link com.egomaa.ems.persistence.domain.Department}
 */

@Setter
@Getter
public class DepartmentDto {
    private Long id;
    private String name;
}