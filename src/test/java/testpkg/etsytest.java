package testpkg;

import org.testng.annotations.Test;

import basepkg.etsybase;
import pagepkg.etsypage;
import utilitypkg.etsyutilities;

public class etsytest extends etsybase{
	@Test
	public void testing()
	{
		etsypage e1=new etsypage(driver);
		String xl="‪‪C:\\Users\\HP\\Downloads\\etsy.xlsx";
		String Sheet="Sheet1";
		int rowCount = etsyutilities.getRowCount(xl, Sheet);
		for(int i=1;i<=rowCount;i++)
		{	

			String email=etsyutilities.getCellValue(xl, Sheet, i, 0);
			String pass=etsyutilities.getCellValue(xl, Sheet, i, 1);
			//e1.sigin();
			e1.setvalues(email, pass);
			e1.siginbutton();
			e1.search("furniture");
			e1.searchbutton();
			e1.firstproduct();
			e1.addtocart();
			e1.homepage();
			e1.product();
			e1.wishlist();
		}
	}
	

}
