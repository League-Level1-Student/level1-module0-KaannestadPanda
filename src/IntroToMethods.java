
public class IntroToMethods {
	
	
public static void main(String[] args) {
	IntroToMethods name= new IntroToMethods();
	//name.weRock();
	//name.rocker("Bob");
	//name.truth("Rob Thomas");
	//name.truth("dsjfdkf");
	//name.echo("well");
	//name.repeat("GIRZMOTOV", 5);
	
	//String theBest = name.getTheBestCoder();
	//System.out.println(theBest);
	
	//int sum = name.add(70,22);
	//System.out.println(sum);
	
	//String yeah=name.what(7423);
	//System.out.println(yeah);
	
	
	//System.out.println(name.sumDouble(70, 71));
	
	
	//if(name.monkeyTrouble(true, false)==true) {
	//	System.out.println("trouble");
	//}
	//else {System.out.println("all good");}
	
	
	
}

void weRock() {
	System.out.println("The League rocks");
}

void rocker(String rock) {
	System.out.println(rock +" rocks");
	
}

void truth(String oy) {
	if(oy.equals("Rob Thomas")) {
		System.out.println(oy+" is awesome");
	}
	else{
		System.out.println(oy+" is annoying");
	}
	
}

void echo(String torb) {
	System.out.println(torb+" "+torb);
}

void repeat(String re, int peat) {
	for(int i=0;i<peat;i++) {
		System.out.print(re+" ");
	}
	
}

String getTheBestCoder() {
	return "Karl";
	
}

int add(int one, int two) {
	int answer=one+two;
	
	
	return answer;
	
}

String what(int who) {
	
	if(who%2==0) {
		return "even";
	}
	else{
		return "odd";
		
	}
	
}

int sumDouble(int a,int b) {
	int c=a+b;
	if(a!=b) {
		return(c);
		
	}
	else if(a==b) {
		return(c*2);
	}
	return 0;
	
}

boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
	if(aSmile==true&&bSmile==true) {
		return true;
	}
	else if(aSmile==false&&bSmile==false) {
		return true;
	}
	else {
		return false;
	}
}





}
