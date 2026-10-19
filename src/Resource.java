public class Resource {
    private String identifier; // ISBN eller EAN
    private String title;
    private String creator; // Forfatter eller Studie
    private boolean isLoaned; // Holder styr på om den er udlånt

    public Resource(String identifier, String title, String creator){
        this.identifier = identifier;
        this.title = title;
        this.creator = creator;
        this.isLoaned = false; // Som udgangspunkt Ledig
    }

    // Fælles gettere og settere
    public String getIdentifier() { return identifier; }
    public String getTitle() { return title; }
    public String getCreator() { return creator; }
    public boolean isLoaned() { return isLoaned; }

    // Setter til at ændre udlånsstatus (sand/falsk reference)
    public void setLoaned(boolean loaned) { this.isLoaned = loaned; }
}
