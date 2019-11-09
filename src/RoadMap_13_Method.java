public class RoadMap_13_Method {

    public static int binarySearch(int massiv[], int b) {

        int firstIndex = 0;
        int lastIndex = massiv.length - 1;
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (massiv[middleIndex] == b) {
                return middleIndex;
            } else if (massiv[middleIndex] < b) {
                firstIndex = middleIndex + 1;
            } else if (massiv[middleIndex] > b) {
                lastIndex = middleIndex - 1;
            }
        }


        return -1;
    }
}