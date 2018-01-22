package Main;

import AbstractionOccurrence.LibraryItem;
import AbstractionOccurrence.Title;

public class DesignPatternsMain {

   private void AbstractionOccurrence() {
      Title title1 = new Title();
      title1.addLibraryItem(new LibraryItem());
      title1.addLibraryItem(new LibraryItem());
      title1.addLibraryItem(new LibraryItem());

      Title title2 = new Title();
      title2.addLibraryItem(new LibraryItem());
      title2.addLibraryItem(new LibraryItem());
      title2.addLibraryItem(new LibraryItem());
   }

   public static void main(String[] args) {
      DesignPatternsMain designPatternsMain = new DesignPatternsMain();
      designPatternsMain.AbstractionOccurrence();
   }
}
