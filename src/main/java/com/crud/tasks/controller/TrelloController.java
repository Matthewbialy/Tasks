package com.crud.tasks.controller;

import com.crud.tasks.client.TrelloClient;
import com.crud.tasks.config.TrelloConfig;
import com.crud.tasks.domain.CreatedTrelloCard;
import com.crud.tasks.domain.TrelloBoardDto;
import com.crud.tasks.domain.TrelloCardDto;
import com.crud.tasks.domain.TrelloListDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1/trello")
public class TrelloController {

    @Autowired
    private TrelloClient trelloClient;

    @Autowired
    private TrelloBoardDto trelloBoardDto;

    @Autowired
    private TrelloListDto trelloListDto;

    @Autowired
    private TrelloConfig trelloConfig;


    @RequestMapping(method = RequestMethod.GET, value = "getTrelloBoards")
    public void getTrelloBoards() {

        List<TrelloBoardDto> trelloBoards = trelloClient.getTrelloBoards();

        trelloBoards.forEach(trelloBoardDto -> System.out.println(trelloBoardDto.getId() + " " + trelloBoardDto.getName()));

        System.out.println("This board contains lists: ");

        trelloBoardDto.getLists().forEach(trelloListDto -> System.out.println(trelloListDto.getId() + " - " + trelloListDto.getName() + " - " + trelloListDto.isClosed()));
        }

    @RequestMapping(method = RequestMethod.POST, value = "getTrelloName")
    public String getTrelloName(@RequestParam(value = "name", defaultValue = "kodilla") final String name,
                                @RequestParam(value = "id", defaultValue = "kodilla") final String id) {
        List<TrelloBoardDto> trelloBoards = trelloClient.getTrelloBoards();
        trelloBoards.forEach(trelloBoardDto -> System.out.println(trelloBoardDto.getName() + trelloBoardDto.getId()));
        return name + id;
    }

    @RequestMapping(method = RequestMethod.POST, value = "createTrelloCard")
    public CreatedTrelloCard createdTrelloCard(@RequestBody TrelloCardDto trelloCardDto) {
        return trelloClient.createdTrelloCard(trelloCardDto);
    }

    }



