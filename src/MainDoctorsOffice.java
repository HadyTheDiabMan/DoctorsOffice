/**
 * 
 * @author hdiab22
 *
 */
public class MainDoctorsOffice 
{

	public static void main(String[] args) 
	{
		DoctorsOffice doctorsoffice1= new DoctorsOffice();
		DoctorsOffice doctorsoffice2= new DoctorsOffice();
		doctorsoffice1.setName("Yeety");
		System.out.println(doctorsoffice1.getName());
		doctorsoffice1.setAddress("48 Meme");
		System.out.println(doctorsoffice1.getAddress());
		doctorsoffice1.setCharge(50.99);
		System.out.println(doctorsoffice1.getCharge());
		doctorsoffice1.newPayment(49.99);
		System.out.println(doctorsoffice1.getCharge());
		

	}

}
