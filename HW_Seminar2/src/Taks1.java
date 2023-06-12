public class Taks1 {
    public static void parseString(String input) {

        String[] inputArray = {};
        inputArray = input.split(",");
        StringBuilder result = new StringBuilder();
        result.append("select * from students where ");
        String[] tempArray = {};
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].contains("null")) {
                System.out.println("Есть значение null - " + inputArray[i]);
                String[] nullArray2 = { "null", "1" };
                tempArray = nullArray2;

            } else {
                tempArray = inputArray[i].split(":");
            }
            if (tempArray[1] != "1") {
                for (int j = 0; j < tempArray.length - 1; j++) {
                    result.append(tempArray[0].replace("\"", "") + "=" + tempArray[1].replace("\"", "\'"));

                    result.append(" and ");

                }
            }
        }

        System.out.println(result);

    }
}
