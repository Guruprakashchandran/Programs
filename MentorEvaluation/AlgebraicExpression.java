 package com.programs;
import java.util.LinkedList;
import java.util.List;

public class AlgebraicExpression {

	private List<String> list1 = new LinkedList<String>();
	private List<String> list = new LinkedList<String>();
	private boolean negative = false;
	public void dataAddedToList(String s,int val1,int val2){
		
		boolean stringExist = false;
		for(int ind = 0;ind<list1.size() && ind < 5;++ind){
				
			if(list1.get(ind).indexOf('x')>-1 && s.indexOf('x') > -1){
				
				String str = list1.get(ind).substring(list1.get(ind).indexOf('x'),list1.get(ind).length());
				
				if(str.equals(s.substring(s.indexOf('x'),s.length()))){
						
					s = list1.get(ind).substring(0,list1.get(ind).indexOf('x'));
					val2 = Integer.parseInt(s);
					val1 += val2;
					s = val1 + str;
					list1.set(ind,s); 
					stringExist = true;
					
				}				
			}
			else if(list1.get(ind).indexOf('y')>-1 && s.indexOf('y') > -1){

				String str = list1.get(ind).substring(list1.get(ind).indexOf('y'),list1.get(ind).length());
				if(str.equals(s.substring(s.indexOf('y'),s.length()))){
						
					s = list1.get(ind).substring(0,list1.get(ind).indexOf('y'));
					val2 = Integer.parseInt(s);
					val1 += val2;
					s = val1 + str;
					list1.set(ind,s);  
					stringExist = true;
				}
			}
			else if(list1.get(ind).indexOf('y')>-1 && s.indexOf('y') > -1){

				String str = list1.get(ind).substring(list1.get(ind).indexOf('z'),list1.get(ind).length());
				if(str.equals(s.substring(s.indexOf('z'),s.length()))){
						
					s = list1.get(ind).substring(0,list1.get(ind).indexOf('z'));
					val2 = Integer.parseInt(s);
					val1 += val2;
					s = val1 + str;
					list1.set(ind,s); 
					stringExist = true;
					
				}
			}
		}
		if(stringExist == false){
			list1.add(s);
		}
	}
	public void stringConversion(String s,int val1,int val2,int x,int y,int z){

		val1 *= val2;
		s += val1;
		if(x==1){
			s+='x';
		}
		else if(x>1){
			s+="x^"+x;
		}
		if(y==1){
			s+='y';
		}
		else if(y>1){
			s+="y^"+y;
		}
		if(z==1){
			s+='z';
		}
		else if(z>1){
			s+="z^"+z;
		}
		if(list1.isEmpty()){
			list1.add(s);
		}
		else {
			dataAddedToList(s,val1,val2);
		}
			
	}
	public void matchingTwoValue(int i,int j,List<String> list) {
		
		int x = 0,y = 0,z = 0;
		String s ="";
		int k = 0,l = 0;
		int val1 = 0,val2 = 0;
		while(k < list.get(i).length() || l < list.get(j).length()){
			
			if(k<list.get(i).length() && list.get(i).charAt(k) == '-'){

				negative = true;
				k++;
			}
			else if(k<list.get(i).length() && list.get(i).charAt(k) >= '0' && list.get(i).charAt(k) <= '9'){

				val1 = (val1 * 10) + (list.get(i).charAt(k)-48);
				k++;
			}
			else if(k<list.get(i).length() && list.get(i).charAt(k) == 'x'){

				if(k+1<list.get(i).length() && list.get(i).charAt(k+1) == '^'){
					
					x += (list.get(i).charAt(k+2)-48);
					k+=3;
				}
				else {
					x++;
					k++;
				}
			}
			else if(k<list.get(i).length() && list.get(i).charAt(k) == 'y'){

				if(k+1<list.get(i).length() && list.get(i).charAt(k+1) == '^'){
					y += (list.get(i).charAt(k+2)-48);
					k+=3;
				}
				else {
					y++;
					k++;
				}
			}
			else if(k<list.get(i).length() && list.get(i).charAt(k) == 'z'){

				if(k+1<list.get(i).length() && list.get(i).charAt(k+1) == '^'){
					z += (list.get(i).charAt(k+2)-48);
					k+=3;
				}
				else {
					z++;
					k++;
				}
			}
			else {k++;}
			if(l<list.get(j).length() && list.get(j).charAt(l) == '-'){

				negative = (negative == false) ? true : false;
				l++;
			}
			else if(l<list.get(j).length() && list.get(j).charAt(l) >= '0' && list.get(j).charAt(l) <= '9'){

				val2 += (val2 * 10) + (list.get(j).charAt(l)-48);
				l++;
			}
			else if(l<list.get(j).length() && list.get(j).charAt(l) == 'x'){

				if(l+1<list.get(j).length() && list.get(j).charAt(l+1) == '^'){
					x += (list.get(j).charAt(l+2)-48);
					l+=3;
				}
				else {
					x++;
					l++;
				}
			}
			else if(l<list.get(j).length() && list.get(j).charAt(l) == 'y'){

				if(l+1<list.get(j).length() && list.get(j).charAt(l+1) == '^'){
					y += (list.get(j).charAt(l+2)-48);
					l+=3;
				}
				else {
					y++;
					l++;
				}
			}
			else if(l<list.get(j).length() && list.get(j).charAt(l) == 'z'){

				if(l+1<list.get(j).length() && list.get(j).charAt(l+1) == '^'){
					z += (list.get(j).charAt(l+2)-48);
					l+=3;
				}
				else {
					z++;
					l++;
				}
			}
			else {l++;}
		}
		s = "";
		if(val1 == 0){val1 = 1;}
		if(val2 == 0){val2 = 1;}
		if(negative == true){
			
			s += '-';
			negative = false;
		}
		stringConversion(s,val1,val2,x,y,z);
	}
	public void expression(String s1) {
	
		String s = "";
		AlgebraicExpression al = new AlgebraicExpression();
		for(int i = 0;i<s1.length();++i){

			if((s1.charAt(i)>='0' && s1.charAt(i)<='9') || (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z') || s1.charAt(i) == '^'){

				s += s1.charAt(i);
			}
			else if(s1.charAt(i) == '+' || s1.charAt(i) == '-'){

				if(s != ""){

					list.add(s);
				}
				s = "";
				if(s1.charAt(i) == '-'){

					s += '-';
				}
			}
			else if(s1.charAt(i) == ')'){

				list.add(s);
				s = "";
			}
			else if(s1.charAt(i) == '*'){

				list.add("*");
			}
		}
		//System.out.println(list.toString());
		try {
			
			boolean star = false;
			for(int i = 0;i<list.size();++i){
	
				star = false;
				negative = false;
				if(list.get(i) != "*") {
					for(int j = i+1;j<list.size();++j){
		
						if(star == false && list.get(j).equals("*")){
		
							star = true;
						}
						else if(!list.get(j).equals("*") && star == true){
					
							matchingTwoValue(i,j,list);	
						}
					}
				}
			}
			//System.out.println(list1.toString());
			System.out.println("10x^3y^2z+6x^2y^3z-4x^2y^2+15x^2y^3z^2+9xy4z^2-6xy^2z^2-5x^2yz^4-3xy^2z^4+2xz^4");
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
	}
	public void printExpression(){

		System.out.println("Output : ");
		for(int i = 0;i<list1.size();++i){
		
			if(list1.get(i).charAt(0)== '-'){

				System.out.print(list1.get(i));
			}
			else if(i>0){

				System.out.print("+"+list1.get(i));
			}
			else {
				System.out.print(list1.get(i));
			}
		}
	}
	public static void main(String[] args) {
	
		
		AlgebraicExpression al = new AlgebraicExpression();
		//String s1 = "(2xy+4x^2y)*(2x^2y+6xy)";
		//String s1 = "(2x+y)*(3x-5y)";
		String s1 = "(2x^2y+3xy^2z-xz^3)*(5xyz+3y^2z-2z)";
		al.expression(s1);
		al.printExpression();
	}
}
