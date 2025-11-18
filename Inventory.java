class Inventory {
	public static void main(String args[]){

	// Pass Arguments 1 -> Product ID, 2 -> Quantity, 3 -> Unit Price.

        int productId = Integer.parseInt(args[0]);
        int quantity = Integer.parseInt(args[1]);
        double price = Integer.parseInt(args[2]);

	System.out.println("\n PRODUCT DETAILS ");
	System.out.println("\n Product ID : " + productId);
	System.out.println(" Quantity : " + quantity);
	System.out.println(" Price : " + price);
	System.out.println(" Total : " + (price*quantity));	
}
}
