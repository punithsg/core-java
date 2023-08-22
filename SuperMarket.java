class SuperMarket{

static String Chocolates[] = {"kitkat", "cadburry", "mentos", "kaccha mango", "gum on", "boomer", "perk", "5star", "justjelly", "falero","pulse", "eclairs", "candyman", "alpenlibe", "kopiko", "gone mad"	};
static String Perfumes[]= {"park avenue", "fogg", "yardley", "zudio", "axe", "Ustraa", "Wild stone", "Envy", "Denver", "cobra", "bella vita", "the man company", "villain", "dior", "gucci", "marc jacobs", "HP gold", "ramsons"};
static String Soaps[] = {"medimix", "santoor", "lux", "cinthol", "lifeboy", "dettol", "dove", "pears", "mysore sandal soap", "himalaya", "hamam", "margo","liril","patanjali", "fiama", "vivel", "olay"};
static String Snacks[] = {"haldirams", "lays", "kurkure", "parle", "max", "namkeen", "popcorn", "potato chips", "banana chips", "cheetos", "pringles", "bhujia", "salted peanuts", "khatta meetha", "bhel", "chakli"};
static String Vegetables[] = {"carrot","raddish", "drum sticks", "potato", "tomato", "onion", "brinjal", "cucumber", "beetroot", "cabbage", "cauli flower", "lemon", "bitter gaurd", "mushroom", "pumpkin"};
static String Fruits[] = {"mango", "apple", "pine apple", "avacado", "banana", "grapes", "pomegranate", "dragon fruit", "guava", "chickoo", "musk melon", "watermelon", "orange", "kiwi", "papaya", "strawberry", "jackfruit", "lychee", "peach"};
static String IceCream[] = {"Vanilla icecream","butterscotch icecream", "strawberry icecream", "mango icecream", "blueberry icecream", "chocolate icecream", "cotton candy icecream", "salted caramel icecream", "german chocolate icecream", "matcha icecream", "cherry garcia icecream", "butter pecan icecream", "chocolate chip icecream", "eskimo icecream", "lemon custard icecream", "mint chocolate chip icecream", "ube icecream" };
static String SoftDrinks[] = {"coca cola", "thumbs up", "pepsi", "frooti", "slice", "maaza", "limca", "fizz", "fanta", "mountain dew", "sprite", "7up", "mirinda", "jal jeera", "paperboat"};


public static void main(String market[]){

  getChocolates();
  getPerfumes();
  getSoaps();
  getSnacks();
  getVegetables();
  getFruits();
  getIceCream();
  getSoftDrinks();
}


	public static void getChocolates(){
		System.out.println("THE CHOCOLATES THAT ARE AVAILABLE IN THE SUPERMARKET ARE :");
		for ( int  choco=0 ; choco<Chocolates.length  ; choco++  ){
			System.out.println(Chocolates[choco]);	
		}
		System.out.println("    ");
		System.out.println("    ");
		
		System.out.println("IN THE REVERSE ORDER : ");
		System.out.println("    ");
		for( int choco=Chocolates.length-1 ; choco>=0 ; choco--){
			System.out.println(Chocolates[choco]);
		}
		System.out.println("    ");
		System.out.println("    ");

	}

	public static void getPerfumes(){
		System.out.println("THE PERFUMES THAT ARE AVAILABLE IN THE SUPERMARKET ARE :");
		for ( int perfume=0 ; perfume<Perfumes.length ; perfume++  ){
			System.out.println(Perfumes[perfume]);
		}
		System.out.println("    ");
		System.out.println("    ");
		
		System.out.println("IN THE REVERSE ORDER : ");
		System.out.println("    ");
		for(int perfume=Perfumes.length-1 ; perfume>0 ; perfume--){
			System.out.println(Perfumes[perfume]);
		}
		System.out.println("    ");
		System.out.println("    ");
 
	}



	public static void getSoaps(){
		System.out.println("THE SOAPS THAT ARE AVAILABLE IN THE SUPERMARKET ARE :");
		for ( int soap=0 ; soap<Soaps.length ; soap++ ){
			System.out.println(Soaps[soap]);
		}
		System.out.println("    ");
		System.out.println("    ");
		
		System.out.println("IN THE REVERSE ORDER : ");
		System.out.println("    ");
		for( int soap=Soaps.length-1 ; soap>=0 ; soap-- ){
			System.out.println(Soaps[soap]);
		}
		System.out.println("    ");
		System.out.println("    ");

	}
	

	public static void getSnacks(){
		System.out.println("THE SNACKS THAT ARE AVAILABLE IN THE SUPERMARKET ARE :");
		for( int snack=0; snack<Snacks.length; snack++ ){
			System.out.println(Snacks[snack]);
		}
		System.out.println("    ");
		System.out.println("    ");
		
		System.out.println("IN THE REVERSE ORDER : ");
		System.out.println("    ");
		for( int snack=Snacks.length-1 ; snack>=0 ; snack--){
			System.out.println(Snacks[snack]);
		}
		System.out.println("    ");
		System.out.println("    ");

	}
	
	public static void getVegetables(){
		System.out.println("THE VEGETABLES THAT ARE AVAILABLE IN THE SUPERMARKET ARE :");
		for( int veg=0; veg<Vegetables.length ; veg++ ){
			System.out.println(Vegetables[veg]);
		}
		System.out.println("    ");
		System.out.println("    ");
		
		System.out.println("IN THE REVERSE ORDER : ");
		System.out.println("    ");
		for( int veg=Vegetables.length-1 ; veg>=0 ; veg--){
			System.out.println(Vegetables[veg]);
		}
		System.out.println("    ");
		System.out.println("    ");

	}

	public static void getFruits(){
		System.out.println("THE FRUITS THAT ARE AVAILABLE IN THE SUPERMARKET ARE :");
		for( int fruit=0; fruit<Fruits.length ; fruit++){
			System.out.println(Fruits[fruit]);
		}
		System.out.println("    ");
		System.out.println("    ");
		
		System.out.println("IN THE REVERSE ORDER : ");
		System.out.println("    ");
		for( int fruit=Fruits.length-1 ; fruit>=0 ; fruit--){
			System.out.println(Fruits[fruit]);
		}
		System.out.println("    ");
		System.out.println("    ");

	}	

	public static void getIceCream(){
		System.out.println("THE ICECREAM THAT ARE AVAILABLE IN THE SUPERMARKET ARE :");
		for( int ice=0; ice<IceCream.length ; ice++){
			System.out.println(IceCream[ice]);
		}
		System.out.println("    ");
		System.out.println("    ");
		
		System.out.println("IN THE REVERSE ORDER : ");
		System.out.println("    ");
		for( int ice=IceCream.length-1 ; ice>=0 ; ice--){
			System.out.println(IceCream[ice]);
		}
		System.out.println("    ");
		System.out.println("    ");

	}

	public static void getSoftDrinks(){
		System.out.println("THE SOFTDRINKS THAT ARE AVAILABLE IN THE SUPERMARKET ARE :");
		for(int soft=0; soft<SoftDrinks.length ; soft++){
			System.out.println(SoftDrinks[soft]);	
		}
		System.out.println("    ");
		System.out.println("    ");

		System.out.println("IN THE REVERSE ORDER : ");
		System.out.println("    ");
		for( int soft=SoftDrinks.length-1 ; soft>=0 ; soft--){
			System.out.println(SoftDrinks[soft]);
		}	
	}	
}