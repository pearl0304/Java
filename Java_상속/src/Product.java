public class Product {

    int price;
    Product(int price){ //생성자 *디폴트 생성자가 없음.
        this.price=price;
    }
}

class Tv extends Product {
    Tv() {
        super(100); // 상속을 받은 자식은 상속받은 부모의 형식도 만족해야함
    }
    public String toString() {

        return "Tv";
    }
}


class iPad extends Product {
    iPad() {
        super(200); // 상속을 받은 자식은 상속받은 부모의 형식도 만족해야함
    }

    public String toString() {

        return "iPad";
    }
}


class AppleWatch extends Product {
    AppleWatch() {
        super(70); // 상속을 받은 자식은 상속받은 부모의 형식도 만족해야함
    }

    public String toString() {

        return "AppleWatch";
    }
}





