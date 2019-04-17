class Lab01{
	public static void main(String args[]){
		String name="Aamir";
		int rollno=69;
		int totalobt=350;
		int total=500;
		float per=0f;
		per=(totalobt*100)/total;
		System.out.println("name="+name+"\n"+"Roll No="+rollno+"\n"+"Total Marks="+total+"\n"+"Total Obtained="+totalobt+"\n"+" Percentage="+per+"%"+"\n");
		if(per>=50)
			System.out.println("true");
		else 
			System.out.println("false");
	}
}