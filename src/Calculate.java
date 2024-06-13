/*
�������� ����� ����������� (������������), ������� �������� ����������
 ����������� ������: sum(), multiply(), divide(), subtract().
 ��������� ���� ������� � ��� ����� ������� ����, ��� �������� ������ ���� ����������� ��������.
 ������ ������ ���������� ��������� ����� ������.
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
            System.out.println("�� ���� ������ ������!");
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
            System.out.println("����� �������� �� ����������!");
            return Double.NaN;
        }
    }

//  �������� ���������� ����� compareArrays(), ������� ��������� ��� ������� � ���������� true,
//  ���� ��� ����������, � false � ��������� ������. ������� ����� ���� ������ ���� ������,
//  �� ������ ����� ���������� ����� � ��������� �������� ������ ���� �� ����� �� ��������.


    public static <T,U> boolean compareArrays(T[] arr1, U[] arr2) {
        if (arr1.length != arr2.length) {
            return false; // ������� ����� ������ �����
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].getClass().equals(arr2[i].getClass())) {
                return false; // �������� �� ������� i ����� ������ ����
            }
        }

        return true; // ������� ����������
    }
}
