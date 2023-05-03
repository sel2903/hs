package yehhs;

public class ElectricBill extends AccountHolder {
	int num_units;
	double unit_cost;
	String name;
	ElectricBill(int num_units, String acct_num)
	{
	super();
	this.num_units = num_units;
	this.acct_num = acct_num;
	}
	void displayBill()
	{
	double total_cost;
	//compute bill amount
	total_cost = ComputeCost();
	String prefix = "number of units = ";
	System.out.println(prefix + num_units);
	System.out.println("unit cost = " + unit_cost);
	System.out.println("Total cost = " + total_cost);
	}
	private double ComputeCost() {
		double total_cost;
		int category1 = 500;
		if (num_units>category1)
		unit_cost = 2.5;
		else {
			int category2 = 200;
			if (num_units<300 && num_units >category2)
			unit_cost=1.5;

			else unit_cost=1.0;
		}
		total_cost = num_units * unit_cost;
		return total_cost;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
