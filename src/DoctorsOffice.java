/**
 * 
 * @author hdiab22
 *
 */
public class DoctorsOffice 
{
//representng doctors office:
	//patient name field
	//address field
	//balance owed field
	//get name
	//set name
	//get address
	//set address
	//method for set charge
	//method for payment
	
	private String name;
	private String address;
	private double debt;
	public void setAddress(String address1)
	{
		address=address1;
	}
	public String getAddress()
	{
		return address;
	}
	public void setName(String name1)
	{
		name=name1;
	}
	public String getName()
	{
		return name;
	}
	public void setCharge(double charge)
	{
		debt+=charge;
	}
	public void newPayment(double pay)
	{
		debt-=pay;
	}
	public double getCharge()
	{
		return debt;
	}
}
