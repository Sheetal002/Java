import java.util.Scanner;
class RestaurantOrder{
    //Declaring all variables
    static String[] starters = {"S0. Paneer 65", "S1. Dry Manchurian", "S2. Tomato Soup", "S3. Ceaser Salad", "S4. Spring Rolls "};
    static String[] mainCourse = {"M0. Paneer Chilli", "M1. Thali", "M2. Fried Rice"};
    static String[] desserts = {"D0. Brownie", "D1. Vanilla Ice Cream", "D2. Fruit Salad"};
    static String[][] menu ={starters, mainCourse,desserts};
    static String[] displayMenu;
    static String[] order = new String[starters.length + mainCourse.length + desserts.length]; //array list of ordered items
    static int i = 1;  //to maintain count of ordered items
    static int additions=1; // additions choice before generating final list

    public static void main(String args[]){
        //Displaying Menu
        System.out.println("Welcome to this restaurant!");
        System.out.println("            MENU:   ");
        System.out.println();
        System.out.println("*************************");    
        System.out.println("Starter:");
        for (String element0: starters) {
            System.out.println(element0+" ");
        }
        System.out.println();
        System.out.println("Main Course:");
            for (String element1: mainCourse) {
                System.out.println(element1+" ");
                }
        System.out.println();
        System.out.println("Dessert:");
            for (String element2: desserts) {
                System.out.println(element2+" ");
                }
        System.out.println();
        System.out.println("*************************");

        Scanner scan = new Scanner(System.in);
        //Getting order while addition choice = 1
        while(additions == 1){
        System.out.println("What would you like to try?");
        int choice = scan.nextInt(); // User chooses starter or mainCourse or dessert
        String[] displayMenu = menu[choice]; 
        System.out.println("Displaying Sub Menu");
        //Re-displaying user's choice of sub menu
        for (String subMenu: displayMenu) {
            System.out.println(subMenu+" ");
        }
        System.out.println("Please type the number corresponding to your choice from the menu: ");
        int subChoice = scan.nextInt(); //Food Item of user's choice
        order[i] = displayMenu[subChoice];         
        System.out.println("Type 1 to add more: ");
        additions = scan.nextInt();        
        i++;
        }
        System.out.println("Here's your order: ");
        for (String orderElement: order) {  //displaying user's ordered list
            if (orderElement != null){
            System.out.println(orderElement+" ");
            }  }
        scan.close();
    }
    
}