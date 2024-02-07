package br.com.tiowilliam.rinhabackend4.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.tiowilliam.rinhabackend4.entity.LimiteCliente;
import br.com.tiowilliam.rinhabackend4.entity.Transacao;

@RestController
public class ClienteController
{
   @PostMapping("/cliente/{id}/transacoes")
   public ResponseEntity<?> inserirTransacao(@RequestParam long id, @RequestBody Transacao transcacao)
   {
      if (id > 5)
      {
         return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new LimiteCliente());
      }
      
      return ResponseEntity.status(HttpStatus.OK).body(null);
   }
}
