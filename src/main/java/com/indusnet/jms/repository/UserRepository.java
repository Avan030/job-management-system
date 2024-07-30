package com.indusnet.jms.repository;


import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.indusnet.jms.common.ResponseModel;
import com.indusnet.jms.model.JobModel.UserModel;

public interface UserRepository extends MongoRepository<UserModel, String> {

    Optional<UserModel> findById(Integer id);

    ResponseModel save(ResponseModel saveUser);
	 
}


