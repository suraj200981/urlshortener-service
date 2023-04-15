package com.example.url.shortner.microservices.urlshortenerservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Data
@Entity(name = "urls")
public class UrlDTO {
    @Id
    private int id;
    private String originalUrl;
    //hide prefix in database
    private String prefix;
    private int clickCount;

//    private List<String> ipAddress;
    private Date createdAt;
    private String shortenedUrl;

}
