package com.springboot.emulatorapp.controller;
import java.util.List;

import com.springboot.emulatorapp.model.Card;
import com.springboot.emulatorapp.service.CardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CardController {
	
	@Value(`${com.springboot.emulatorapp.service.CardService}`)
	private final CardService cardService;

   @Autowired
   public CardController(CardService cardService) {
       this.cardService = cardService;
   }
   @PostMapping(value = "/cards")
   public ResponseEntity<?> create(@RequestBody Card card) {
       cardService.create(card);
       return new ResponseEntity<>(HttpStatus.CREATED);
   }

   @GetMapping(value = "/cards")
   public ResponseEntity<List<Card>> read() {
       final List<Card> cards = cardService.readAll();

       return cards != null &&  !cards.isEmpty()
               ? new ResponseEntity<>(cards, HttpStatus.OK)
               : new ResponseEntity<>(HttpStatus.NOT_FOUND);
   }

   @GetMapping(value = "/cards/{id}")
   public ResponseEntity<Card> read(@PathVariable(name = "id") int id) {
       final Card card = cardService.read(id);

       return card != null
               ? new ResponseEntity<>(card, HttpStatus.OK)
               : new ResponseEntity<>(HttpStatus.NOT_FOUND);
   }

   @PutMapping(value = "/cards/{id}")
   public ResponseEntity<?> update(@PathVariable(name = "id") int id, @RequestBody Card card) {
       final boolean updated = cardService.update(card, id);

       return updated
               ? new ResponseEntity<>(HttpStatus.OK)
               : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
   }

   @DeleteMapping(value = "/cards/{id}")
   public ResponseEntity<?> delete(@PathVariable(name = "id") int id) {
       final boolean deleted = cardService.delete(id);

       return deleted
               ? new ResponseEntity<>(HttpStatus.OK)
               : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
   }
}

