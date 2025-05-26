package com.example.CrudHexagonal.domain.repositories;

import java.util.List;

public interface BaseRepository <T>{

    public List<T> getAll();

    public T getById(Long id);

    public T save(T t);

    public T update(T t);

    public boolean delete(Long id);
}
