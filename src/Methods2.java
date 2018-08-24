import java.util.Random;

public class Methods2 {

	public static void main(String[] args) {
		Methods2 name=new Methods2();
		
		//System.out.println(name.whichPresent("karl"));
		//System.out.println(name.getMyLuckyNumber());
		//System.out.println(name.eggsMomWants()+name.eggsDadWants()+name.eggsBabyWants());
		System.out.println(name.getAverageHeight(101));
		
		
		
	}
	
	String whichPresent(String friendName) {
		if(friendName.equals("leo")) {
			return "NO PRESENT >:)";
		}
		else if(friendName.equals("wyatt")) {
			return "NO PRESENT, wyatt >:)";
		}
		else if(friendName.equals("josh")) {
			return "NO PRESENT, josh >:)";
		}
		else if(friendName.equals("karl")) {
			return "lots and lots of presents!!!111111";
		}
		else {
			
				return "aww thats sad, ";
			
		}
	}
	
	boolean doPigsEat(String food) {
	if(food.equals("roots")) {
		return true;
	}
	else if(food.equals("bananas")) {
		return false;
	}
	else {return true;}
	}
	
	int getMyLuckyNumber() {
		Random ran=new Random();
		int h=ran.nextInt(700);
		return h;
	}
	
	int eggsMomWants() {
return 500;
        //some code

  }



  int eggsDadWants() {
return 1;
        //some code

  }



  int eggsBabyWants() {
return 17;
        //some code

  }
	
  int getAverageHeight(int age) {

      if (age > 100) {

             return 34;

      } 

      else if (age > 50) {

             return 30;

      }

      else{

             return 20;

      }
}
	
	
	
	
	
	
	
	
}
