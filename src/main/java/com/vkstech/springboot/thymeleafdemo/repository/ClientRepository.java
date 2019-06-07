package com.vkstech.springboot.thymeleafdemo.repository;

import com.vkstech.springboot.thymeleafdemo.model.ClientModel;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends PagingAndSortingRepository<ClientModel,Long> {
}