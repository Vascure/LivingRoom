public class IfElse {
    public static void main(String[] args) {
//        On the bus- get Ticket if dog, student or old person, sonst ned


        boolean isSenior = false;
        boolean isDog = false;
        boolean isStudent = false;

        checkIfDiscount(isSenior, isStudent, isDog);
        checkIfDiscount(true, false, true);
        checkIfDiscount(false, false, true);
        checkIfDiscount(false, true, true);
        checkIfDiscount(false, false, false);
        int fiction = 0;
        int nonfiction = 1;

        String result = checkforBooks(fiction, nonfiction);
        System.out.println("Gets " + result);
        checkforBooks(2, 4);
        checkforBooks(6, 0);
        checkforBooks(1, 3);
    }
    // In a bookshop - Discount if u buy more than 2 non-fiction books and at least one fiction book


    public static void checkIfDiscount(boolean isSenior, boolean isStudent, boolean isDog) {
        if (isSenior) {
            System.out.println("Discount");
        } else if (isDog) {
            System.out.println("Discount");
        } else if (isStudent) {
            System.out.println("Discount");
        } else {
            System.out.println("No Discount");
        }
    }

    public static String checkforBooks(int fiction, int nonfiction) {

        String discount = "Discount";
        String nodiscount = "no discount";
        if (fiction > 0 && nonfiction >= 3) {
            return "Discount";
        } else {
            return "no discount";
        }
    }

}
