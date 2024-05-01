package testday;
import java.util.*;

public class Q5cal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        char op;
        System.out.print("정수 정수 연산자를 입력해 주십시요>> ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        op = scanner.next().charAt(0);

        switch (op) {
        case '+':
            Add add = new Add();
            add.setValue(num1, num2);
            System.out.print(add.calculate());
            break;
        case '-':
            Sub sub = new Sub();
            sub.setValue(num1, num2);
            System.out.print(sub.calculate());
            break;
        case '*':
            Mul mul = new Mul();
            mul.setValue(num1, num2);
            System.out.print(mul.calculate());
            break;
        case '/':
            Div div = new Div();
            div.setValue(num1, num2);
            System.out.print(div.calculate());
            break;
        }
    }
}

// 덧셈 
class Add {
    private int a, b;

    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int calculate() {
    	System.out.println(a +"-"+b );
        return a + b;
    }
}

// 뺼셈
class Sub {
    private int a, b;

    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int calculate() {
        return a - b;
    }
}

// 곱셈
class Mul {
    private int a, b;

    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int calculate() {
        return a * b;
    }
}

// 나눗셈
class Div {
    private int a, b;

    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int calculate() {
        return a / b;
    }
}