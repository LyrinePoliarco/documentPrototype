public class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();
        
        // Create and configure a PDF document
        PdfDocument pdfDoc = (PdfDocument) registry.createSheepClone("PDF");
        pdfDoc.setFileName("annual_report_2024.pdf");
        pdfDoc.setAuthor("Acme Corp");
        pdfDoc.setPageCount(150);
        pdfDoc.open();
        
        // Create and configure a Text document
        TextDocument textDoc = (TextDocument) registry.createSheepClone("Text");
        textDoc.setFilePath("meeting_notes.txt");
        textDoc.setEncoding("UTF-8");
        textDoc.setWordCount(250);
        textDoc.open();
        
        // Create and configure a Spreadsheet document
        SpreadsheetDocument spreadsheetDoc = (SpreadsheetDocument) registry.createSheepClone("Spreadsheet");
        spreadsheetDoc.setSpreadsheetName("sales_data_q1.xlsx");
        spreadsheetDoc.setRowCount(1000);
        spreadsheetDoc.setColumnCount(20);
        spreadsheetDoc.open();
        
        // Create another PDF document
        PdfDocument anotherPdfDoc = (PdfDocument) registry.createSheepClone("PDF");
        anotherPdfDoc.setFileName("summary_report.pdf");
        anotherPdfDoc.setAuthor("Acme Corp");
        anotherPdfDoc.setPageCount(30);
        anotherPdfDoc.open();
    }
}