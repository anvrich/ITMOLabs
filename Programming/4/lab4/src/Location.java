public enum Location {
    Park("Парк"),
    Garden("Лес");
    private String translation;

    Location(String translation){
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
}
