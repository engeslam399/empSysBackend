package com.egomaa.ems.bussiness.mapper;

public interface CommonMapper<D,E> {

    E toEntity(D dto);
    D toDto(E entity);

}
