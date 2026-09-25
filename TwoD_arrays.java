public class TwoD_arrays {
    
    public static void main(String[] args) {

        // 2D array = an array of arrays
        
        // String[][] cars = new String[3][3];

        // cars[0][0] = "Camaro";
        // cars[0][1] = "Corvette";
        // cars[0][2] = "Silverado";
        // cars[1][0] = "Mustang";
        // cars[1][1] = "Audi";
        // cars[1][2] = "BMW";
        // cars[2][0] = "Ford";
        // cars[2][1] = "Ranger";
        // cars[2][2] = "F-150";

        String[][] cars = {{"Camaro", "Corvette", "Silverado"},
                          {"Mustang", "Audi", "BMW"},
                          {"Ford", "Ranger", "F-150"}};

        for(int i = 0; i < cars.length; i++) {
            System.out.println();
            for(int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j]+" ");
            }
        }
    }
}
