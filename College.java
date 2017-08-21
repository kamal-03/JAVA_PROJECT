import java.util.*;
import java.io.*;

class College implements Serializable{
	 int ccode;
	 
	 String cname;
	College(){}
	
	}

}

class Branch extends College implements Serializable{
	int bcode,r1,r2,r3,no_seats;
	String bname;
	Branch(){}
	Branch(int code,int brcode,int no_of_seats, String name,String branch, int rp1,int rp2, int rp3){
		ccode=code;
	    bcode=brcode;
	    cname=name;
	    bname=branch;
	    r1=rp1;
	    r2=rp2;
	    r3=rp3;
	    no_seats=no_of_seats;

	}
	public static void no_of_seats(){}
}


class Administrator {
	public static void intialise(Branch [] b){
		
		b[0]=new Branch(1,10,3,"DJ.Sanghvi","Computers",174,171,170);
		b[1]=new Branch(1,11,3,"DJ.Sanghvi","Information Technology",170,164,160);
		b[2]=new Branch(1,12,3,"DJ.Sanghvi","EXTC",156,151,147);
		b[3]=new Branch(1,13,3,"DJ.Sanghvi","Chemical",151,150,145);
		b[4]=new Branch(1,14,3,"DJ.Sanghvi","Biomed",127,124,120);
		b[5]=new Branch(1,15,3,"DJ.Sanghvi","Production",143,140,132);
		b[6]=new Branch(2,20,3,"Fr.Conceicao Rodrigues","Computers",155,151,147);
		b[7]=new Branch(2,21,3,"Fr.Conceicao Rodrigues","Information Technology",145,141,138);
		b[8]=new Branch(2,22,3,"Fr.Conceicao Rodrigues","Electronics",128,127,125);
		b[9]=new Branch(2,23,3,"Fr.Conceicao Rodrigues","Production",126,123,120);
		b[10]=new Branch(3,30,3,"Institute of Chemical Technology","Chemical",181,173,169);
		b[11]=new Branch(3,31,3,"Institute of Chemical Technology","Dyestuff",151,141,140);
		b[12]=new Branch(3,32,3,"Institute of Chemical Technology","Oil,Oleochemicals and Surfactants",161,144,142);
		b[13]=new Branch(3,33,3,"Institute of Chemical Technology","Pharmaceuticals",165,160,159);
		b[14]=new Branch(3,34,3,"Institute of Chemical Technology","Polymers",175,158,156);
		b[15]=new Branch(4,40,3,"K.J.Somaiya","Computers",165,161,160);
		b[16]=new Branch(4,41,3,"K.J.Somaiya","Information Technology",153,149,145);
		b[17]=new Branch(4,42,3,"K.J.Somaiya","EXTC",148,146,145);
		b[18]=new Branch(4,43,3,"K.J.Somaiya","Mechanical",165,156,154);
		b[19]=new Branch(4,44,3,"K.J.Somaiya","Electronics",141,137,135);
		b[20]=new Branch(5,50,3,"College of Engineering-Pune","Computers",189,186,183);
		b[21]=new Branch(5,51,3,"College of Engineering-Pune","Information Technology",181,178,177);
		b[22]=new Branch(5,52,3,"College of Engineering-Pune","Civil",176,168,159);
		b[23]=new Branch(5,53,3,"College of Engineering-Pune","Electrical",178,173,165);
		b[24]=new Branch(5,54,3,"College of Engineering-Pune","EXTC",180,176,166);
		b[25]=new Branch(5,55,3,"College of Engineering-Pune","Instrumentation",172,168,165);
		b[26]=new Branch(5,56,3,"College of Engineering-Pune","Mechanical",182,180,177);
		b[27]=new Branch(6,61,3,"Sardar Patel Institute of Technology","Computers",181,177,176);
		b[28]=new Branch(6,62,3,"Sardar Patel Institute of Technology","Information Technology",175,172,171);
		b[29]=new Branch(6,63,3,"Sardar Patel Institute of Technology","EXTC",169,165,164);
		b[30]=new Branch(6,64,3,"Sardar Patel Institute of Technology","Electronics",163,160,158);
		b[31]=new Branch(7,70,3,"Sardar Patel College","Civil",162,158,157);
		b[32]=new Branch(7,71,3,"Sardar Patel College","Electrical",171,165,163);
		b[33]=new Branch(7,72,3,"Sardar Patel College","Mechanical",176,173,172);
		b[34]=new Branch(8,80,3,"Thadomal Shahani Engineering College","Computers",161,159,158);
		b[35]=new Branch(8,81,3,"Thadomal Shahani Engineering College","Information Technology",151,144,143);
		b[36]=new Branch(8,82,3,"Thadomal Shahani Engineering College","EXTC",146,142,140);
		b[37]=new Branch(8,83,3,"Thadomal Shahani Engineering College","Chemical",147,138,136);
		b[38]=new Branch(8,84,3,"Thadomal Shahani Engineering College","Biotechnology",121,119,115);
		b[39]=new Branch(8,85,3,"Thadomal Shahani Engineering College","Biomedical",116,114,110);
		b[40]=new Branch(9,90,3,"Veermata Jijabai College","Computers",188,187,185);
		b[41]=new Branch(9,91,3,"Veermata Jijabai College","Information Technology",180,178,175);
		b[42]=new Branch(9,92,3,"Veermata Jijabai College","Electronics",175,169,166);
		b[43]=new Branch(9,93,3,"Veermata Jijabai College","Electrical",176,171,168);
		b[44]=new Branch(9,94,3,"Veermata Jijabai College","EXTC",176,174,172);
		b[45]=new Branch(9,95,3,"Veermata Jijabai College","Civil",166,163,161);
		b[46]=new Branch(9,96,3,"Veermata Jijabai College","Mechanical",180,177,175);
		b[47]=new Branch(9,97,3,"Veermata Jijabai College","Production",159,157,155);
		b[48]=new Branch(9,98,3,"Veermata Jijabai College","Textile",132,126,121);
		b[49]=new Branch(9,99,3,"Vivekananda College","Computers",156,154,153);
		b[50]=new Branch(9,100,3,"Vivekananda College","Information Technology",145,142,141);
		b[51]=new Branch(9,101,3,"Vivekananda College","EXTC",137,135,132);
		b[52]=new Branch(9,102,3,"Vivekananda College","Electronics",128,126,125);
		b[53]=new Branch(9,103,3,"Vivekananda College","Instrumentation",117,112,110);
	}
	public static void display (Branch[] b){
		System.out.println("Sr.No\t\t"+"Ccode\t\t"+"Bcode\t\t"+"Branch\t\t\t\t\t"+"College Name");
		//System.out.format(%s%10s)
		for(int i=0;i<b.length;i++){
			System.out.println(i+1+"\t\t"+b[i].ccode+"\t\t"+b[i].bcode+"\t\t"+b[i].bname+"\t\t\t\t"+b[i].cname);
		}
	}
}

class User {
	public static int details_user(){
		System.out.println("Enter your name (as per class 12th marksheet)");
		Scanner sc= new Scanner(System.in);
		String name= sc.nextLine();
		System.out.println("Enter the marks obtained in MHT-CET 2016 exam");
		int marks=sc.nextInt();
		return marks;
	}
	public static int[] round_list(){
		Scanner sc= new Scanner(System.in);
		int[] array_bcode=new int[20];
		System.out.println("Enter college code followed branch code according to your precedence(max 20)(-1 to exit)");
		int i=0;
		boolean flag=true;
		while(i<20 &&flag==true){
			int c_code=sc.nextInt();
			switch(c_code){
				case 1:{
					array_bcode[i]=sc.nextInt();
					break;
				}
				case 2:{
					array_bcode[i]=sc.nextInt();
					break;
				}
				case 3:{
					array_bcode[i]=sc.nextInt();
					break;
				}
				case 4:{
					array_bcode[i]=sc.nextInt();
					break;
				}
				case 5:{
					array_bcode[i]=sc.nextInt();
					break;
				}
				case 6:{
					array_bcode[i]=sc.nextInt();
					break;
				}
				case 7:{
					array_bcode[i]=sc.nextInt();
					break;
				}
				case 8:{
					array_bcode[i]=sc.nextInt();
					break;
				}
				case 9:{
					array_bcode[i]=sc.nextInt();
					break;
				}
				case -1:{
					flag=false;
					break;
				}
				default:{
					System.out.println("Enter correct college code");
				}

			}

			
			i++;
		}
		return array_bcode;

	}
		
		/*for(int j=0;j<array_bcode.length;j++)
		System.out.println(array_bcode[j]);

		}*/
	public static int Round1(Branch[] b, int[] round1_list, int marks){
		for(int i=0;i<b.length;i++){
			for(int j=0;j<round1_list.length;j++){

					if(b[i].bcode==round1_list[j]&&(marks>=b[i].r1)){
						if(b[i].bcode==round1_list[0]){
		
							System.out.println("You hav been alloted:");
							System.out.println("College: "+b[i].cname+" "+"Branch:"+ b[i].bname);
							System.out.println("You are not applicable for round 2");
							

							return 1;
						}
						else{
							System.out.println("You hav been alloted:");
							System.out.println("College: "+b[i].cname+" "+"Branch:"+ b[i].bname);
							return 1;

						}
					}
					
				}
		
		}

	return 0;
	}

	public static int Round2(Branch[] b, int[] round2_list, int marks){
		for(int i=0;i<b.length;i++){
			for(int j=0;j<round2_list.length;j++){

					if(b[i].bcode==round2_list[j]&&(marks>=b[i].r2)){
						if(b[i].bcode==round2_list[0]||b[i].bcode==round2_list[1]||b[i].bcode==round2_list[2]||
							b[i].bcode==round2_list[3]||b[i].bcode==round2_list[4]){
		
							System.out.println("You hav been alloted:");
							System.out.println("College: "+b[i].cname+" "+"Branch:"+ b[i].bname);
							System.out.println("You are not applicable for round 3");
							

							return -1;
						}
						else{
							System.out.println("You hav been alloted:");
							System.out.println("College: "+b[i].cname+" "+"Branch:"+ b[i].bname);
							return 1;

						}
					}
					
				}
		
		}

	return 0;
	}

	public static int Round3(Branch[] b, int[] round3_list, int marks){
		for(int i=0;i<b.length;i++){
			for(int j=0;j<round3_list.length;j++){

					if(b[i].bcode==round3_list[j]&&(marks>=b[i].r3)){
						if(b[i].bcode==round3_list[0]||(b[i].bcode==round3_list[1]||(b[i].bcode==round3_list[2]||
							(b[i].bcode==round1_list[3]||(b[i].bcode==round1_list[4]||(b[i].bcode==round1_list[5]||
								(b[i].bcode==round1_list[6]){
		
							System.out.println("You hav been alloted:");
							System.out.println("College: "+b[i].cname+" "+"Branch:"+ b[i].bname);
							//System.out.println("You are not applicable for round 2");
							

							return -1;
						}
						else{
							System.out.println("You have not been alotted any college in DTE CAP Rounds 1,2,3.
								Check www.dte.org for further details.");
								return 0;
							
							

						}
					}
					
				}
		
		}

	return 0;
	}
public static void user_Status(int status ){
	if(status ==-1)
		System.out.println("You cannot enter the this round as you have been alloted college in previous round");
	else if(status ==0)
		System.out.println("You were not been alloted any college in previous round. Enter your details for next round ");
	else
		System.out.println("Please enter your details for the next round");
}



}


	
	
//}
class Main  {
	public static void main(String[] args) {
		
		Branch[] b1= new Branch[54];
		Scanner sc= new Scanner(System.in)
		Administrator.intialise(b1);
		System.out.println("WELCOME TO DTE COLLEGE ALLOTMENT PROCESS");
		

		System.out.println("Enter your choice")
		System.out.println("1: Apply for CAP ROUND 1\n 2: Cancellation of Admission\n 3: Go back")
		switch (sc.nextInt()){
			case 1:{
					Administrator.display(b1);
	    			System.out.println("Note : If you have been alloted the first collefe of your list in CAP ROUND 1
	    								you will not be eligible for next rounds")
	    			int marks=User.details_user();
	   				int[] round1=User.round_list();
					int status_r1=User.Round1(b1,round1,marks);

					if(status_r1==1||status_r1==0||status_r1==-1){
					System.out.println("1. Confirm your Admission\n 2. Apply for next Round\n 3. Go back")
					switch(sc.nextInt()){
						case 1:{
							if(status_r1==0){
								System.out.println("You cannot confirm your Admission as you hav not been alloted any college");
								break;
							}
						
							else{
								System.out.pritnln("Enter the college code and branch code you were alloted");
							int bcode_alloted=sc.nextInt();
							int ccode_alloted=sc.nextInt();	
							for(int i=0; i<b1.length;i++){
								if(b1[i].ccode==ccode_alloted &&b1[i].bcode=bcode_alloted){
									b1[i].no_seats=b1[i].no_seats-1;
								}
							}
							status_r1=-1;
							break;

							}
							
					}
					case 2:{
						if(status_r1==-1){
							User.user_Status(status_r1);
							break;
						}
						else
						int [] round2=User.round_list();
						int status_r2=User.Round2(b1,round2,marks);
						if(status_r2==1||status_r2==0||status_r2==-1){
						System.out.println("1. Confirm your Admission\n 2. Apply for next Round\n 3. Go back")
						switch(sc.nextInt()){
						case 1:{
							if(status_r2==0){
								System.out.println("You cannot confirm your Admission as you hav not been alloted any college");
								break;
							}
							else
							System.out.pritnln("Enter the college code and branch code you were alloted");
							int bcode_alloted=sc.nextInt();
							int ccode_alloted=sc.nextInt();	
							for(int i=0; i<b1.length;i++){
								if(b1[i].ccode==ccode_alloted &&b1[i].bcode=bcode_alloted){
									b1[i].no_seats=b1[i].no_seats-1;
								}
							}
							status_r2=-1;
							break;
					}

					case 2:{
						if(status_r1==-1){
							User.user_Status(status_r1);
							break;
						}
						else{
							int [] round3=User.round_list();
							int status_r3=User.Round2(b1,round3,marks);
							break;

						}
						
					}
					case 3: goto 	
						


					






				
			
		
		
		
		

