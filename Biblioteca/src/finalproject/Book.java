package finalproject;

import java.util.Objects;

/**
 
 *
 * @author Ovidiu
 */
public class Book {

    //fields that show book info   
    private String autor;
    private int an;
    private int cantitate;
    private String titlu;
    private Category categorie;
    private long isbn;

    /**
     * Constructor for Book
     *
     * @param autor
     * @param an
     * @param cantitate
     * @param titlu
     * @param categorie
     * @param isbn
     */
    public Book(String autor, int an, int cantitate, String titlu, Category categorie, long isbn) {

        setautor(autor);
        setan(an);
        setcantitate(cantitate);
        //I have changed booktitle
        settitlu(titlu);
        setcategorie(categorie);
        setIsbn(isbn);
    }

    /**
     * Gets autor
     *
     * @return autor
     */
    public String getautor() {
        return autor;
    }

    /**
     * Gets an
     *
     * @return anul publicarii
     */
    public int getan() {
        return an;
    }

    /**
     * Gets cantitate
     * @return numarul de carti
     */
    public int cantitate() {
        return cantitate;
    }

    /**
     *
     * @return
     */
    public String titlu() {
        return titlu;
    }

    /**
     *
     * @return
     */
    public Category categorie() {
        return categorie;
    }

    /**
     *
     * @return
     */
    public long getIsbn() {
        return isbn;
    }

    /**
     *
     * @param autor
     */
    public void setautor(String autor) {
        if (autor == null || autor.trim().equals("")) {
            throw new IllegalArgumentException("Autor gresit");
        }
        this.autor = autor;
    }

    /**
     *
     * @param an
     */
    public void setan(int an) {
        if (an < 1000 || an > 2018) {
            throw new IllegalArgumentException("Anul trebuie sa fie intre 1000 si 2018");
        }

        this.an = an;

    }

    /**
     * Sets and Checks the Quantity
     * @param cantitate
     */
    public void setcantitate(int cantitate) {
        if (cantitate < 0 || cantitate > 100) {
            throw new IllegalArgumentException("Cantitatea trebuie sa fie mai mare decat 0 si mai mica decat 100!!");
        }

        this.cantitate = cantitate;
    }

    /**
     *
     * @param titlu
     */
    public void settitlu(String titlu) {
        if (titlu == null || titlu.trim().equals("")) {
            throw new IllegalArgumentException("Introdu titlul cartii!!");
        }
        this.titlu = titlu;
    }

    /**
     *
     * @param categorie
     */
    public void setcategorie(Category categorie) {
        this.categorie = categorie;
    }

    /**
     *
     * @param isbn
     */
    public void setIsbn(long isbn) {
        if ((isbn + "").length() != 13) {
            throw new IllegalArgumentException("ISBN trebuie sa fie de 13 numere!!");
        }
        this.isbn = isbn;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "titlu: " + titlu + " autor: " + autor + " publicat: " + an + " cantitate: "
                + cantitate + " categorie: " + categorie + " ISBN: " + isbn;
    }

    /**
     *
     * @return
     */
    public String toFileString() {
        return autor + "~" + an + "~" + cantitate + "~" + titlu + "~" + categorie.name() + "~" + isbn + "\n";
    }

    /**
     * Hash Method
     *
     * @return HashCode
     */
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    /**
     * Equals method to compare Author, BookTitle, and Year
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;

        if (this.isbn == other.isbn) {
            return true;
        }
        if (this.an != other.an) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        if (!Objects.equals(this.titlu, other.titlu)) {
            return false;
        }
        return true;
    }

}
