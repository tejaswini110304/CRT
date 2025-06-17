import java.util.TreeSet;
public class LibraryBookIID {
    public static void main(String[] args) {
        
        TreeSet<Integer> bookIDs = new TreeSet<>();
        bookIDs.add(5002);
        bookIDs.add(4998);
        bookIDs.add(5005);
        bookIDs.add(4999);
        bookIDs.add(5001);
        System.out.println("All Book IDs (sorted): " + bookIDs);
       
        int firstID = bookIDs.first();
        int lastID = bookIDs.last();
        Integer higherThan4999 = bookIDs.higher(4999);
        Integer lowerThan5005 = bookIDs.lower(5005);
        System.out.println("First Book ID: " + firstID);
        System.out.println("Last Book ID: " + lastID);
        System.out.println("Book ID just higher than 4999: " + higherThan4999);
        System.out.println("Book ID just lower than 5005: " + lowerThan5005);
    }
}
