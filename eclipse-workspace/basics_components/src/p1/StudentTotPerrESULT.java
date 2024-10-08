package p1;

 class TotM{
	int tot(int s1,int s2,int s3,int s4,int s5,int s6) {
	return s1+s2+s3+s4+s5+s6;}
}
 class Per
{
	float per(int total)
	{
		return (total/6);
	}
}
class StudentTotPerrESULT {
String result(float percentage,boolean t)
{
	if(t)
	{
		return "Fail";
	}
else if (percentage>=90)
			{
		return "Distinction";
			}
	else if(percentage>=75 && percentage<90)
	{
		return "First Class";
	}
	else if(percentage>=50 && percentage<75)
	{
	return "Second Class";	
	}
	else {
		return "Fail";
	}
	
}
}
class CheckBr
{
	boolean check(String br)
	{
		return switch(br)
		{
		case "ECE" : yield true;
		case "CSE" : yield true;
		case "MECH" : yield true;
		default : yield false;
		};
	}
}
class checkbrcode
{
	String checkbc(String bn)
	{
		return switch(bn)
				{
		case "ECE":yield "01";
		case "CSE":yield "02";
		case "MECH":yield "03";
		default:yield "Not matched";
				};
	}
}