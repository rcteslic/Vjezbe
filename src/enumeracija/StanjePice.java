package enumeracija;

public enum StanjePice {
   NARUCENA("Vasa pica je narucena"), PRAVISE("..ona se jos uvjek pravi"), PRODANA("prodana je odavno");

   private String description;

   StanjePice(String description) {
      this.description = description;
   }

   public String getDescription() {
      return description;
   }
}
