class DocumentRegistry {
    private Document pdfPrototype;
    private Document textDocumentPrototype;
    private Document spreadsheetPrototype;
    
    public DocumentRegistry() {
        pdfPrototype = new PdfDocument();
        textDocumentPrototype = new TextDocument();
        spreadsheetPrototype = new SpreadsheetDocument();
    }
    
    public Document createSheepClone(String name) {
        if ("PDF".equalsIgnoreCase(name)) {
            return pdfPrototype.clone();
        } else if ("Text".equalsIgnoreCase(name)) {
            return textDocumentPrototype.clone();
        } else if ("Spreadsheet".equalsIgnoreCase(name)) {
            return spreadsheetPrototype.clone();
        }
        return null;
    }
    
    public Document createCow() {
        // Just for demonstration as per the diagram
        return pdfPrototype.clone();
    }
    
    public Document createHorse() {
        // Just for demonstration as per the diagram
        return textDocumentPrototype.clone();
    }
}
