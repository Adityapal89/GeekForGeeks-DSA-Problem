// User function Template for Java
//  Implement Calculator class with all methods
class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
    
    double sum(double x, double y){
        return x+y;
    }
    
    public static void main(String[] args){
        Calculator cal = new Calculator();
        int v1 = cal.sum(5,10);
        int v2 = cal.sum(5,10,3);
        double v3 = cal.sum(15.5,3.5);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }
}
