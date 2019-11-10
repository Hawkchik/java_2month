package RoadMap6;

public class VectorMethods {
    public double x1, x2, y1, y2, xV, yV, xV2,yV2, vL, vL2, cos1, sum;

    public double getVectorCoordsX(double x1, double x2) {
        xV = x2 - x1;

        return xV;
    }

    public double getVectorCoordsY(double y1, double y2) {
        yV = y2 - y1;
        return yV;
    }


    public double getLength(double xV, double yV) //длина вектора
    {
        return vL = Math.sqrt(xV * xV + yV * yV);
    }


    public double scalMult (double xV, double xV2, double yV, double yV2)
    {
        return (xV * xV2 + yV * yV2);
    }

    public double getAngle (double scalMult, double vL, double vL2)
    {
        return Math.acos(scalMult / (vL * vL2));
    }

    public double cos(double scalMult, double vL, double vL2){

        return cos1 = (scalMult / (vL * vL2));
    }

    public double sum(double xV,double xV2, double yV, double yV2)
    {
        return sum =xV+xV2+yV+yV2;

    }



}




