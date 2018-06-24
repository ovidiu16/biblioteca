
package finalproject;

/**
 * This the enum that represents the categories of books
 * @author Kyrylo
 */
public enum Category {
    AVENTURA("Aventura"),
    FICTIUNE("Fictiune"),
    FANTASY("Fantastice"),
    ISTORIE("Istorice"),
    ROMANTIC("Romantic"),
    DRAMA("Drama"),
    COPII("COPII");
    
    private String name;
   /**
    * Category constructor
    * @param name 
    */
    private Category(String name) {
        this.name = name;
    }
/**
 * Gets name 
 * @return name of category
 */
    public String getName() {
        return name;
    }
    
    
}

