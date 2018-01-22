package AbstractionOccurrence;

import java.util.ArrayList;
import java.util.List;

public class Title {
   private String name;
   private String author;
   private String isbn;
   private String publicationDate;
   private List<LibraryItem> libraryItems = new ArrayList<>();

   public void addLibraryItem(LibraryItem libraryItem) {
      libraryItems.add(libraryItem);
      libraryItem.addTitle(this);
   }

}
