package pdfReader;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.text.PDFTextStripper;

public class PDFReader1 
{
public static void main(String[] args) throws Exception, IOException
{

	File file = new File("C:\\Users\\CPSCUST\\Downloads\\Pushpendra CV -D!!TYss.pdf");
	PDDocument doc = PDDocument.load(file);
	
PDFTextStripper stripper = new	PDFTextStripper();
String text = stripper.getText(doc);
System.out.println(text);
doc.close();

}
}
