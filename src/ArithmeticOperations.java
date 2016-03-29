import java.util.concurrent.ExecutionException;
import java.io.*;

public abstract class ArithmeticOperations<T extends Number>
{
    public T getNumberSum(T[] numbers)
    {
        double sum = 0.0;
            for(int i = 0; i < numbers.length; i++)
            {
                sum += numbers[i].doubleValue();
            }
        return getNumberSum(numbers);
    }
}
