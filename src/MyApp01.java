import com.sun.xml.internal.ws.handler.ClientSOAPHandlerTube;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyApp01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите последовательность чисел или Y для завершения:");

        for( ; ; )
        {
            String str = reader.readLine();
            int num = Integer.parseInt(str);
            System.out.println(num);

        }


        /*ArithmeticOperations<Integer> arithmeticOperations = new ArithmeticOperations();
        Integer[] a = {1,2,3,4};
        Integer b = arithmeticOperations.getNumberSum(a);
        System.out.println(b);*/
    }

}
