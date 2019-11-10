package RoadMap6;

import java.util.Scanner;


public class RoadMap6 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Double x1 = scanner.nextDouble();
        Double x2 = scanner.nextDouble();
        //1 точка
        Double y1 = scanner.nextDouble();
        Double y2 = scanner.nextDouble();
        // 2 точка
        Double x3 = scanner.nextDouble();
        Double x4 = scanner.nextDouble();
        //3 точка
        Double y3 = scanner.nextDouble();
        Double y4 = scanner.nextDouble();
        //4 точка

        GeomVector a = new GeomVector(x1, x2, y1, y2); // 1 вектор
        GeomVector b = new GeomVector(x3, x4, y3, y4); // 2 вектор

        VectorMethods vectorMethods = new VectorMethods();

        double coordsX = vectorMethods.getVectorCoordsX(x1, x2);  // Координаты Х для 1 вектора
        double coordsY = vectorMethods.getVectorCoordsY(y1, y2);  // Координаты Y для 1 вектора
        double coordsX2 = vectorMethods.getVectorCoordsX(x3, x4);  // Координаты Х для 2 вектора
        double coordsY2 = vectorMethods.getVectorCoordsY(y3, y4);  // Координаты Y для 2 вектора

        double length = vectorMethods.getLength(coordsX, coordsY); // длина 1 вектора
        double length2 = vectorMethods.getLength(coordsX2, coordsY2); // длина 2 вектора

        double scalMult = vectorMethods.scalMult(coordsX, coordsX2, coordsY, coordsY2); // Скалярное прозведение векторов

        double cos = vectorMethods.cos(scalMult, length, length2); // Косинус

        double angle = vectorMethods.getAngle(scalMult, length, length2);  // угол

        if (angle == 90) {
            System.out.println("Перпендикулярны");
        }

        double sumVector = vectorMethods.sum(coordsX, coordsX2, coordsY, coordsY2);


    }
}
