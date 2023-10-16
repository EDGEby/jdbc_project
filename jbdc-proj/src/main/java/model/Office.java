package model;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Office {

   private int id;
   private String title;
   private String address;
   private String phone1;
   private String phone2;
   private int postalCode;
   private Timestamp updated_ts;
   private Timestamp created_ts;


   public void setPostalCode(int postalCode) {
   }

   public void setCreatedTs(Timestamp created_ts) {
   }

   public void setUpdatedTs(Timestamp updated_ts) {
   }
}
