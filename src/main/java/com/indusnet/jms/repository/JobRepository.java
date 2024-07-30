package com.indusnet.jms.repository;


import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.indusnet.jms.model.JobModel.JobModel;

public interface JobRepository extends MongoRepository<JobModel, Long> {

    Optional<JobModel> findById(String id);
	 
}


