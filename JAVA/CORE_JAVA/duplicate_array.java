package DAY_6_CORE_JAVA;
class dupli {
    int[] arr = new int[]{1, 2, 3, 4, 2, 7, 8, 8, 3};

    public void duplicates() {

        System.out.println("Duplicate elements in given array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println(arr[i]);
            }
        }
    }

}

    public class duplicate_array {
        public static void main(String[] args) {
            dupli d = new dupli();
            d.duplicates();

        }
    }
//THE OUTPUT OF THE PROGRAM IS
//C:\Users\coditas\.jdks\openjdk-18.0.1.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\lib\idea_rt.jar=51113:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\coditas\IdeaProjects\CORE JAVA_DAY 2\out\production\CORE JAVA_DAY 2" DAY_6_CORE_JAVA.duplicate_array
//Duplicate elements in given array:
//2
//3
//8
//
//Process finished with exit code 0