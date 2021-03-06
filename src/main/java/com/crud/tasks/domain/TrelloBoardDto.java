package com.crud.tasks.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;



@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
public class TrelloBoardDto {

    @JsonProperty("name")
    private String name;

    @JsonProperty("id")
    private String id;

    @JsonProperty("lists")
    private List<TrelloListDto> lists;

    public TrelloBoardDto(String name, String id, List<TrelloListDto> lists) {
        this.name = name;
        this.id = id;
        this.lists = lists;
    }

//    public String getName() {
//        return name;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public List<TrelloListDto> getLists() {
//        return lists;
//    }
}
