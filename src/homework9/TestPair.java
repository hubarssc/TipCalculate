package homework9;

public class TestPair {
    /**
     * <p>
     * Написать класс, в котором будет 2 поля и при создании экземпляра такого класса можно указать типы его полей
     * (Аналог класса Pair<T, K> в котлин)
     */
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Hello", 123);
        System.out.println(pair);
    }

    public static class Pair<T, K> {
        private T first;
        private K second;

        public Pair(T first, K second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }

        public K getSecond() {
            return second;
        }

        public void setFirst(T first) {
            this.first = first;
        }

        public void setSecond(K second) {
            this.second = second;
        }

        @Override
        public String toString() {
            return "Pair {first=" + first + ", second=" + second + "}";
        }
    }

}

