@FunctionalInterface
interface Square {
	int calculate(int x); 
}

public class test123 {
    public static void main(String[] args) {
        /*var a=10;
        var b=15;
        var c=a+b;
        System.out.println(c);

        var arr=new int[5];
        arr[0]=5;
        arr[1]=5;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }*/

        int a = 5;
		Square s = (int x) ->{ return  x * x;}; 

// parameter passed and return type must be same as defined in the   prototype
		int ans = s.calculate(a);
		System.out.println(ans);

        
    }
}
