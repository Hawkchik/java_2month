package RoadMap10;

public  class Prostoe_method {
        int isprime(int n){
            if(n==1) // 1 - не простое число
                return 1;

            // перебираем возможные делители от 2 до sqrt(n)
            for(int d=2; d*d<=n; d++){
                // если разделилось нацело, то составное
                if(n%d==0)
                    return 2;
            }
            // если нет нетривиальных делителей, то простое
            return 1;}
    }


