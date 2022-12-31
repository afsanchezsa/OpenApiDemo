package com.example.openApi.demoOpenApi.controllers;


import com.example.openApi.demoOpenApi.api.ArtistsApiDelegate;
import com.example.openApi.demoOpenApi.model.Artist;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
public class ArtistDelegate implements ArtistsApiDelegate {

    public ResponseEntity<List<Artist>> artistsGet(Integer limit,
                                            Integer offset) {

        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

    }

}
