class PdfDocument implements Document, Cloneable {
    private String fileName;
    private String author;
    private int pageCount;
    
    public PdfDocument() {
        System.out.println("Creating a PDF Document prototype.");
    }
    
    public PdfDocument(String fileName, String author, int pageCount) {
        this.fileName = fileName;
        this.author = author;
        this.pageCount = pageCount;
    }
    
    @Override
    public Document clone() {
        return new PdfDocument(fileName, author, pageCount);
    }
    
    @Override
    public void open() {
        System.out.println("Opening PDF Document: " + fileName + " by " + author + " (" + pageCount + " pages)");
        System.out.println("Type: " + getType() + ", File: " + fileName + ", Author: " + author + ", Pages: " + pageCount);
    }
    
    @Override
    public String getType() {
        return "PDF";
    }
    
    // Setters for prototype configuration
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
