package p1;
import java.util.*;
public class CharIndex {

	public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
  System.out.println("enter the string:");
  String str=s.nextLine();
  CharIndex ci=new CharIndex();
  System.out.println("enter the index :");
  int idx =s.nextInt();
  int vowel=0,cons=0,num=0,others=0;
 for(int i=0;i<=str.length()-1;i++) {
char chr=str.charAt(i);
 int k=(int) chr;
  if((k<=65 && k>=90 )||(k>=97 && k<=122))
  {
	  switch(chr)
	  {
	  case 'a':vowel++;break;
	  case 'A':vowel++;break;
	  case 'e':vowel++;break;
	  case 'E':vowel++;break;
	  case 'u':vowel++;break;
	  case 'U':vowel++;break;
	  case 'i':vowel++;break;
	  case 'I':vowel++;break;
	  case 'o':vowel++;break;
	  case 'O':vowel++;break;
		  default:
			  cons++;
			  
			  
	  }
  }
  else  if(k>=48 && k<=57){
	 num++;
  }
  else {
	  others++;
  }}
 int tot=vowel+cons+num+others;
 System.out.println(str.length());
 System.out.println("All results length"+tot);
  System.out.println("VOWELS COUNT"+vowel);
  System.out.println("CONSONATS COUNT"+cons);
  System.out.println("NUMBERS COUNT"+num);
  System.out.println("Others COUNT"+others);

 
  }
}
