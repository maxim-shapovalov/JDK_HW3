/*
Ќаписать класс  алькул€тор (необобщенный), который содержит обобщенные
 статические методы: sum(), multiply(), divide(), subtract().
 ѕараметры этих методов Ц два числа разного типа, над которыми должна быть произведена операци€.
 ћетоды должны возвращать результат своей работы.
 */

public class Calculate {
    public static <T extends Number, U extends Number> double sum(T x, U y){
        return x.doubleValue() + y.doubleValue();

    }
    public static <T extends Number,U extends Number> double multiply( T x,U y){
        return x.doubleValue() * y.doubleValue();

    }
    public static <T extends Number,U extends Number> double subtract(Number x,Number y){
        return x.doubleValue() - y.doubleValue();
    }
    public static <T extends Number,U extends Number> double divide(Number x, Number y){
        if(y.doubleValue() == 0){
            System.out.println("на ноль делить нельз€!");
            return Double.NaN;
        }else {
            return x.doubleValue() / y.doubleValue();
        }
    }
    public static<T extends Number,U extends Number> double calc(T x,U y,char op) {
        if (op == '+') return sum(x, y);
        else if (op == '-') return subtract(x, y);
        else if (op == '*') return multiply(x, y);
        else if (op == '/') return divide(x, y);
        else {
            System.out.println("“акой операции не существует!");
            return Double.NaN;
        }
    }

//  Ќапишите обобщенный метод compareArrays(), который принимает два массива и возвращает true,
//  если они одинаковые, и false в противном случае. ћассивы могут быть любого типа данных,
//  но должны иметь одинаковую длину и содержать элементы одного типа по парно по индексам.


    public static <T,U> boolean compareArrays(T[] arr1, U[] arr2) {
        if (arr1.length != arr2.length) {
            return false; // ћассивы имеют разную длину
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].getClass().equals(arr2[i].getClass())) {
                return false; // Ёлементы на позиции i имеют разные типы
            }
        }

        return true; // ћассивы одинаковые
    }
}
