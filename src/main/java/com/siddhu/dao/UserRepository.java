package com.siddhu.dao;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.siddhu.model.User;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
 
public interface UserRepository extends ReactiveMongoRepository<User, Integer> {
    @Query("{ 'name': ?0 }")
    Flux<User> findByName(final String name);
    
}