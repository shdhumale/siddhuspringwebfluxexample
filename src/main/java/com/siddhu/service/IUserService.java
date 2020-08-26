package com.siddhu.service;

import com.siddhu.model.User;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
 
public interface IUserService
{
    void create(User e);
     
    Mono<User> findById(Integer id);
 
    Flux<User> findByName(String name);
 
    Flux<User> findAll();
 
    Mono<User> update(User e);
 
    Mono<Void> delete(Integer id);
}