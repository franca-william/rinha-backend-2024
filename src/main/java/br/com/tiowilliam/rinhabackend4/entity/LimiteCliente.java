package br.com.tiowilliam.rinhabackend4.entity;

import java.io.Serializable;

public class LimiteCliente implements Serializable
{
   private static final long serialVersionUID = -6888411463940526811L;

   private long limite;
   
   private long saldo;

   public long getLimite()
   {
      return limite;
   }

   public void setLimite(long limite)
   {
      this.limite = limite;
   }

   public long getSaldo()
   {
      return saldo;
   }

   public void setSaldo(long saldo)
   {
      this.saldo = saldo;
   }
   
   
}
