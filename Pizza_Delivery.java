import java.util.Scanner;
public class Main
{
	public static void main(String[] args) throws InterruptedException {
	    //CODE STARTS HERE
	    Scanner sc = new Scanner(System.in);
        //Variables:
        double delivery_fee = 0;
        double pizza_price = 0;
        double crust_price = 0;
        double mushroom_price = 0;
        double onion_price = 0;
        double pepperoni_price = 0;
        double tips_price = 0;
        
        
        //account set up
        System.out.println("Greetings! Welcome to Honey Pizzas! We are so pleased to have you here! Before you can order, you will first need to create an account.");
        
        
        System.out.println("To do that, type your first name:");
        String first_name = sc.nextLine();
        System.out.println("Now, type your last name:");
        String last_name = sc.nextLine();
        System.out.println("Now, type a username:");
        String user_name = sc.nextLine();
        System.out.println("Now, type your email:");
        String email_address = sc.nextLine();
        
        Thread.sleep(1000);
        System.out.println("Hello "+first_name+" "+last_name+"! Your account will be set up with "+email_address+" as your email address. And your username is "+user_name+".");
        System.out.println("Now, type a password:");
        String password = sc.nextLine();
        int h = 1;
        while(h==1){
            System.out.println("Now, please confirm your password:");
            String confirmed_password = sc.nextLine();
            if (confirmed_password.equals(password)){ //if this line works, only then can you order your pizza
                System.out.println("Passwords match! You can now proceed to ordering your Pizza.");
                Thread.sleep(2000);
                break;
            }
            else{
                System.out.println("These passwords do not match, please try again!");
            }
        }
        
        
        //deliver or carryout
        System.out.println("Now, do you want a Delivery(D) or a Carryout(C)? Please type D for Delivery or C for Carryout.");
        int j = 1;
        while (j==1){
            System.out.println("Please type a letter to select your method:");
            String response = sc.nextLine();
            //carryout
            if (response.equalsIgnoreCase("C")){
                System.out.println("You have selected Carryout!");
                Thread.sleep(1000);
                break;
            }
            //delivery
            else if (response.equalsIgnoreCase("D")){
                System.out.println("You have selected Delivery! We deliver to the following zip codes: 12205, 12206, 12207.");
                String[] zip_codes = {"12205", "12206", "12207"};
                int g = 1;
                while (g==1){
                    System.out.println("Please select a zip code:");
                    String Yresponse = sc.nextLine();
                    if (Yresponse.equals(zip_codes[0])){
                        delivery_fee = 5;
                        System.out.println("You have selected "+zip_codes[0]+"! Your deliver fee is $"+delivery_fee);
                        Thread.sleep(1000);
                        break;
                    }
                    else if (Yresponse.equals(zip_codes[1])){
                        delivery_fee = 6;
                        System.out.println("You have selected "+zip_codes[1]+"! Your deliver fee is $"+delivery_fee);
                        Thread.sleep(1000);
                        break;
                    }
                    else if (Yresponse.equals(zip_codes[2])){
                        delivery_fee = 3;
                        System.out.println("You have selected "+zip_codes[2]+"! Your deliver fee is $"+delivery_fee);
                        Thread.sleep(1000);
                        break;
                    }
                    //loop
                    else{
                        System.out.println("Sorry, that zip code is not available!");
                    }
                }
            }
            //main loop
            else{
                System.out.println("Sorry, that is not a valid option!");
            }
        }
        



        //pizza size
        int c = 1;
        while (c==1){
            System.out.println("Now please select a pizza size. We have Small(S), Medium(M), and Large(L). Select your size by typing S for Small, M for Medium and L for Large.");
            String[] pizza_size = {"S for Small", "M for Medium", "L for Large"};
            System.out.println("Please type a letter to select your size:");
            String Zresponse = sc.nextLine();
            //small
            if (Zresponse.equalsIgnoreCase("S")){
                pizza_price = 5;
                System.out.println("You have selected "+pizza_size[0]+", Your fee is $"+pizza_price);
                Thread.sleep(1000);
                break;  
            }
            
            //medium
            else if (Zresponse.equalsIgnoreCase("M")){
                pizza_price = 7;
                System.out.println("You have selected "+pizza_size[1]+", Your fee is $"+pizza_price);
                Thread.sleep(1000);
                break; 
            }
            
            //large
            else if (Zresponse.equalsIgnoreCase("L")){
                pizza_price = 10;
                System.out.println("You have selected "+pizza_size[2]+", Your fee is $"+pizza_price);
                Thread.sleep(1000);
                break;  
            }
            //loop
            else{
                System.out.println("Sorry, that is not a valid option! Please try again.");  
            }
            
        }
        
        
        
        //crusts
        int x = 1;
        while (x==1){
            System.out.println("Now please select a crust. We have Deep-Dish(D), Thick-Crust(T), and Hand-Tossed(H). Select your crust by typing D for Deep-Dish, T for Thick-Crust, and H for Hand-tossed");
            String[] crusts = {"D for Deep-Dish", "T for Thick Crust", "H for Hand-tossed"};
            System.out.println("Please type a letter to select your crust:");
            String Aresponse = sc.nextLine();
            //small
            if (Aresponse.equalsIgnoreCase("D")){
                crust_price = 1;
                System.out.println("You have selected "+crusts[0]+", Your fee is $"+crust_price);
                Thread.sleep(1000);
                break;  
            }
            
            //medium
            else if (Aresponse.equalsIgnoreCase("T")){
                crust_price = 2;
                System.out.println("You have selected "+crusts[1]+", Your fee is $"+crust_price);
                Thread.sleep(1000);
                break; 
            }
            
            //large
            else if (Aresponse.equalsIgnoreCase("H")){
                crust_price = 3;
                System.out.println("You have selected "+crusts[2]+", Your fee is $"+crust_price);
                Thread.sleep(1000);
                break;  
            }
            
            //loop
            else{
                System.out.println("Sorry, that is not a valid option! Please try again.");  
            }
		
		
	    }
        
        
        //toppings
        System.out.println("Now, do you want toppings? Type Y for YES and N for NO");       
        String Bresponse = sc.nextLine();
            //yes
        if (Bresponse.equalsIgnoreCase("Y")){
            double toppings_price = 0.5;
            System.out.println("Wonderful! We have the following three toppings available: 1. Mushroom, 2. Pepperoni, 3. Onion. All are an extra $"+toppings_price+" each.");
            //mushrooms
            Thread.sleep(1000);
            System.out.println("Would you like to add Mushroom? Type Y for YES and N for NO");
            String user_response = sc.nextLine();
                //yes
            if (user_response.equalsIgnoreCase("Y")){
                mushroom_price = toppings_price;
                System.out.println("Okay! Mushroom will be added! Your aditional fee is $"+mushroom_price);
                Thread.sleep(1000);
            }
                //no
            else{
                System.out.println("Okay! No mushrooms will be added!");
                Thread.sleep(1000);
            }
            //pepperoni
            System.out.println("Would you like to add Pepperoni? Type Y for YES and N for NO");
            String customer_response = sc.nextLine();
                //yes
            if (customer_response.equalsIgnoreCase("Y")){
                pepperoni_price = toppings_price;
                System.out.println("Okay! Pepperoni will be added! Your aditional fee is $"+pepperoni_price);
                Thread.sleep(1000);
            }
                //no
            else{
                System.out.println("Okay! No pepperoni will be added!");
                Thread.sleep(1000);
            }
            //onions
            System.out.println("Would you like to add Onions? Type Y for YES and N for NO");
            String buyer_response = sc.nextLine();
                //yes
            if (buyer_response.equalsIgnoreCase("Y")){
                onion_price = toppings_price;
                System.out.println("Okay! Onions will be added! Your aditional fee is $"+onion_price);
                Thread.sleep(1000);
            }
                //no
            else{
                System.out.println("Okay! No onions will be added!");
                Thread.sleep(1000);
            }
        }
            //no
        else{
            System.out.println("Okay! No toppings will be added!");
            Thread.sleep(1000);
        }
        
        
        //tips 
        System.out.println("Now, would you like to add any tips? Type Y for YES and N for NO");
        String Xresponse = sc.nextLine();
            //yes
        if (Xresponse.equalsIgnoreCase("Y")){
            System.out.println("How much would you like to tip?");
            tips_price = sc.nextDouble();
            Thread.sleep(1000);
            System.out.println("Okay! Your tips will be added! Your aditional fee is $"+tips_price);
            Thread.sleep(1000);
        }
            //no
        else{
            System.out.println("Okay! No tips will be added!");
        }
        
        
        //total price
        Double total_price = delivery_fee + pizza_price + crust_price + mushroom_price + pepperoni_price + onion_price + tips_price;
        System.out.println("Thank you for choosing all your preferances! Your total cost is being calculated...");
        Thread.sleep(2000);
        //total price + tax
        System.out.println("Your total cost is $"+total_price+". A tax of 5% will be added, your final cost is being calculated...");
        Double final_cost = total_price + total_price/20;
        Thread.sleep(3000);
        System.out.println("Your final price is $"+final_cost);
        //payment
        int k = 1;
        while (k==1){
            System.out.println("Please pay the correct ammount below:");
            Double payment = sc.nextDouble();
            //successful
            if(payment.equals(final_cost)){
                Thread.sleep(1000);
                System.out.println("Thank you for ordering "+first_name+" "+last_name+"! Your pizza will be ready in 20 minutes!");
                break;
            }
            //loop
            else{
                System.out.println ("Sorry, that is not the correct ammount! Please try again.");
            }
        }
        
		
		
		
	//CODE ENDS HERE
	}
	}
