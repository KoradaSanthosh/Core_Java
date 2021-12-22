package Collections;

import java.util.ArrayList;
import java.util.Collections;

class Merchant implements Comparable<Merchant>{
	private String MerchantName;
	private int Batchno;
	private int ExperienceAge;
	
	public Merchant(String MerchantName, int Batchno, int ExperienceAge) {
		this.MerchantName = MerchantName;
		this.Batchno = Batchno;
		this.ExperienceAge = ExperienceAge;
	}	
	//We need to create a method explicitly to accomplish the sort mechanism
	@Override
	public String toString() {
		return "Student [MerchantName=" + MerchantName + 
				", Batchno=" + Batchno + ", ExperienceAge=" + 
				ExperienceAge + "]";
	}	
	public int compareTo1(Merchant comparestu) {
			int compareage=((Merchant)comparestu).getExperienceAge(); //Sort --> lowest to highest
			return this.Batchno-compareage; //Student age lesser that element to should be first
		}
	private int getExperienceAge() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String getMerchantName() {
		return MerchantName;
	}
	public void setMerchantName(String MerchantName) {
		this.MerchantName = MerchantName;
	}
	public int getBatchno() {
		return Batchno;
	}
	public void setBatchno(int Batchno) {
		this.Batchno = Batchno;
	}
	public int getExperienceAge1() {
		return ExperienceAge;
	}
	public void setStudnentAge(int ExperienceAge) {
		this.ExperienceAge = ExperienceAge;
	}
	@Override
	public int compareTo(Merchant arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
public class SortwithComparable {
	public static void main(String[] args) {
		ArrayList<Merchant> Array = new ArrayList<Merchant>();
		Array.add(new Merchant("Sundar",1012,47));
		Array.add(new Merchant("Jaggu",2028,36));
		Collections.sort(Array);
		for(Merchant str:Array) {
			System.out.println(str);  // 24, 25,26,27,28<====
		}
		}
}
