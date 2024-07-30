package com.indusnet.jms.model.JobModel;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Document(collection = "jobs")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class JobModel {

    @Id
    private Integer id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String title;
    private String description;
    private String company;
    private String location;
    private List<String> skills;

   
}