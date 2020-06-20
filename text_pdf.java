import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text; 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException; 
import java.util.ArrayList;

class text_pdf {
    public static void main(String args[]) throws Exception {
        String line = "";
        ArrayList<String> data = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));

        while ((line = br.readLine()) != null)
            data.add(line);
                
        br.close();         

        PdfWriter writer = new PdfWriter("file.pdf");            
        PdfDocument pdfdoc = new PdfDocument(writer);
        Document document = new Document(pdfdoc);
        PdfFont font = PdfFontFactory.createFont(FontConstants.COURIER); 

        for (int x = 0; x < data.size(); x++) {
            Text text = new Text(data.get(x));
            text.setFont(font);
            Paragraph paragraph = new Paragraph(text);
            document.add(paragraph);
        }

        document.close();
    }
}