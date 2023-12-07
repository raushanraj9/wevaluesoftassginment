
import java.io.BufferedReader;
 import java.io.File;
 import java.io.FileNotFoundException;
 import java.io.PrintWriter;
 public class ProductCsv {
 public static void main(String[] args) {
   String fileName = "product.csv";
   generateCSV(fileName);
 //  readCSV(fileName);
   
}
private static void generateCSV(String fileName) {
 try {
   PrintWriter pw= new PrintWriter(new File(fileName));
   StringBuilder sb=new StringBuilder();
   sb.append("SL No.");
   sb.append(",");
   sb.append("Name");
   sb.append(",");
   sb.append("Price/Piece");
   sb.append(",");
   sb.append("Item Number");
   sb.append(",");
   sb.append("Model Number");
   sb.append(",");
   sb.append("Product Category");
   sb.append(",");
   sb.append("Product Description");
   sb.append("\r\n");
   sb.append("1");
   sb.append(",");
   sb.append("Staples Reinforced Hanging File Folders");
   sb.append(",");
   sb.append("$20.99");
   sb.append(",");
   sb.append("901-813110STP");
   sb.append(",");
   sb.append("18654-US-CC");
   sb.append(",");
   sb.append("Hanging File Folders");
   sb.append(",");
   sb.append("Designate a spot for business documents with this box of Staples assorted five-tab letter-size hanging file folders. Make organizing simple with these assorted hanging file folders. A variety of colors make it easy to color-code projects, and the included tabs and inserts support easy access. The reinforced paper stock used to construct these Staples assorted five-tab letter-size hanging file folders ensures lasting durability, and coated hangers slide easily along filing cabinet rails for convenient access.");
   sb.append("\r\n");
   sb.append("\r\n");
   sb.append("2");
   sb.append(",");
   sb.append("Staples Heavy Duty Hanging File Folders");
   sb.append(",");
   sb.append("$23.59");
   sb.append(",");
   sb.append("901-875411STP");
   sb.append(",");
   sb.append("875411-US");
   sb.append(",");
   sb.append("Hanging File Folders");
   sb.append(",");
   sb.append("Implement a streamlined filing solution with this 25-pack of Staples letter-size hanging file folders. Accommodate stacks of important business documents with these hanging file folders. Five tear-resistant tabs withstand frequent handling and allow easy customization and quick sorting, while the multiple colors add a visual element to your file organization. The included labels let you write identifying features or categories for each folder. Archive and retain letter-size documents longer with these heavyweight durable Staples letter-size hanging file folders.");
   sb.append("\r\n");
   sb.append("\r\n");
   sb.append("3");
   sb.append(",");
   sb.append("Pendaflex® SureHook® 5-Tab Hanging File Folders");
   sb.append(",");
   sb.append("$24.79");
   sb.append(",");
   sb.append("901-615215");
   sb.append(",");
   sb.append("6152 1/5");
   sb.append(",");
   sb.append("Hanging File Folders");
   sb.append(",");
   sb.append("Pendaflex SureHook hanging file folders feature longer plastic hooks and built-in tension springs that keep your filing system in order. With stronger hanging rods, longer plastic hooks and the innovative SureHook technology, Pendaflex hanging file folders are the solution to your office filing woes. These folders slide easily and hold up under pressure while their longer hooks keep a firm grip on the rails.");
   sb.append("\r\n");
   sb.append("\r\n");
   sb.append("4");
   sb.append(",");
   sb.append("Staples Hanging File Folder");
   sb.append(",");
   sb.append("$25.99");
   sb.append(",");
   sb.append("901-163501");
   sb.append(",");
   sb.append("TR163501");
   sb.append(",");
   sb.append("Hanging File Folders");
   sb.append(",");
   sb.append("Add some color to your filing system with this box of Staples five-tab letter-size blue hanging file folders. Keep paperwork in order with this 25-count box of blue hanging file folders. Plastic markers let you place the tabs in five different positions for simple organization, and paper inserts allow customized labels for easy document identification. The coated hangers on this Staples five-tab letter-size blue hanging file folder move smoothly along file drawer rails for quick access.");
   sb.append("\r\n");
   sb.append("\r\n");
   sb.append("5");
   sb.append(",");
   sb.append("Staples Hanging File Folder");
   sb.append(",");
   sb.append("$26.99");
   sb.append(",");
   sb.append("901-645587STP");
   sb.append(",");
   sb.append("13324-US");
   sb.append(",");
   sb.append("Hanging File Folders");
   sb.append(",");
   sb.append("Revamp your filing system with this 20-box of Staples letter-size assorted color hanging file folders. Declutter your desk with these assorted color hanging file folders. Multiple colors help you color-code your projects, while the five-tab position setup supports customization with labels. Important documents are protected from damage by the water-resistant design. Featuring durable plastic construction and coated hooks, these Staples letter-size assorted color hanging file folders withstand frequent handling and slide easily on rails for easy access.");
   sb.append("\r\n");
   sb.append("\r\n");
   sb.append("6");
   sb.append(",");
   sb.append("Smead FasTab Hanging File Folders");
   sb.append(",");
   sb.append("$27.99");
   sb.append(",");
   sb.append("901-64053QL");
   sb.append(",");
   sb.append("64053");
   sb.append(",");
   sb.append("Hanging File Folders");
   sb.append(",");
   sb.append("These files' durable construction withstands everyday use, so you can use them often. Assorted colors make a color-coded filing system easy. Three tabs are spaced atop the file folders, so your staff can see the labels quickly without having to shuffle through each folder. In addition, these folders can hold up to 3/4 inch of papers, which translates to around 100 pages if you're storing smaller documents.");
   sb.append("\r\n");
   sb.append("\r\n");
   sb.append("7");
   sb.append(",");
   sb.append("Pendaflex SureHook 5-Tab Hanging File Folders");
   sb.append(",");
   sb.append("$28.99");
   sb.append(",");
   sb.append("901-615215AD");
   sb.append(",");
   sb.append("6152 1/5 ASST");
   sb.append(",");
   sb.append("Hanging File Folders");
   sb.append(",");
   sb.append("Pendaflex SureHook multicolored five-tab letter-sized hanging folders have longer hooks for a better fit. Pendaflex SureHook multicolored five-tab letter-sized hanging folders expand your document storage options with a five-color system instead of a tri-color pattern. Built-in tension springs combine with longer plastic hooks to prevent them from falling into file cabinet drawers, while 11-point weight fiber material withstands everyday use by having extra durability.");
   sb.append("\r\n");
   sb.append("\r\n");
   sb.append("8");
   sb.append(",");
   sb.append("Staples Hanging File Folder");
   sb.append(",");
   sb.append("$29.99");
   sb.append(",");
   sb.append("901-266262");
   sb.append(",");
   sb.append("42150-US/266262");
   sb.append(",");
   sb.append("Hanging File Folders");
   sb.append(",");
   sb.append("Build a customized filing system with these Staples letter-size standard green hanging file folders. Organize your documents with these hanging folders. The five assorted-position tabs let you create a unique labeling system, and the sturdy paper construction helps extend the file lifespan. Coated hooks keep these folders securely in place and effortless to move. Designed to hold standard pages, these Staples letter-size standard green hanging file folders meet a range of filing needs");
   sb.append("\r\n");
   sb.append("\r\n");
   sb.append("9");
   sb.append(",");
   sb.append("Staples Heavy Duty Hanging File Folders");
   sb.append(",");
   sb.append("$35.99");
   sb.append(",");
   sb.append("901-345001");
   sb.append(",");
   sb.append("4221-5MIXT-US");
   sb.append(",");
   sb.append("Hanging File Folders");
   sb.append(",");
   sb.append("Maintain a neat, orderly filing system with these Staples legal-size assorted hanging file folders. Organize projects by color using these hanging file folders. An assortment of hues lets you highlight file priority or status, while the convenient sizing keeps legal-size documents and interior folders securely tucked inside. Heavyweight paper construction and strong hooks provide added protection and help extend the lifespan of your documents. These Staples legal-size assorted hanging file folders boast five tab positions for custom labeling and sorting.");
   sb.append("\r\n");
   sb.append("\r\n");
   sb.append("10");
   sb.append(",");
   sb.append("Staples Hanging File Folder");
   sb.append(",");
   sb.append("$45.99");
   sb.append(",");
   sb.append("901-490853STP");
   sb.append(",");
   sb.append("490853/TR490853");
   sb.append(",");
   sb.append("Hanging File Folders");
   sb.append(",");
   sb.append("Simplify office filing tasks with these Staples standard green five-tab hanging file folders. Protect important paperwork with these hanging file folders. The thoughtful sizing accommodates legal-size documents to meet your unique filing needs, while the five assorted-position tabs let you create a customized labeling system. Sturdy paper construction and hooks withstand frequent use, making these Staples standard green five-tab hanging file folders a durable addition to your office.");
   sb.append("\r\n");
   pw.write(sb.toString());
   pw.close();
   System.out.println("finished Loading Products");
   } catch (FileNotFoundException e) {
      System.out.println("Error Can't create Product CSV");
	  e.printStackTrace();
   }

   }
/*
private static void readCSV(String fileName){
	   try (BufferedReader br = new BufferedReader(new FileReader(fileName){
	   String line = "" ; 
	   {
	   while( (line = br.readLine()) != null ) {
	   System.out.println(line);
	   }
	   }
	   } catch (FileNotFoundException e){
		      System.out.println("Error Can't create Product CSV");
			  e.printStackTrace();
		   }  catch (IOException e) {
		      System.out.println("File Cannot be closed");
			  e.printStackTrace();
		   }
	 }
	 */
 }